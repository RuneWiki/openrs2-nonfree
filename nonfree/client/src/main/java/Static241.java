import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static241 {

	@OriginalMember(owner = "client!iia", name = "O", descriptor = "[I")
	public static int[] anIntArray264;

	@OriginalMember(owner = "client!iia", name = "H", descriptor = "Lclient!cj;")
	public static final Class54 aClass54_5 = new Class54();

	@OriginalMember(owner = "client!iia", name = "N", descriptor = "[I")
	public static final int[] anIntArray263 = new int[1000];

	@OriginalMember(owner = "client!iia", name = "c", descriptor = "(II)Z")
	public static boolean method4067(@OriginalArg(1) int arg0) {
		return arg0 == 44 || arg0 == 5 || arg0 == 1002 || arg0 == 21 || arg0 == 2;
	}

	@OriginalMember(owner = "client!iia", name = "d", descriptor = "(B)V")
	public static void method4068() {
		if (Static187.anInt3550 == 0) {
			return;
		}
		try {
			if (++Static560.anInt9308 > 2000) {
				if (Static547.aClass197_1 != null) {
					Static547.aClass197_1.method5188();
					Static547.aClass197_1 = null;
				}
				if (Static469.anInt8027 >= 2) {
					Static32.anInt482 = -5;
					Static187.anInt3550 = 0;
					return;
				}
				Static627.aClass157_6.method3977();
				Static469.anInt8027++;
				Static560.anInt9308 = 0;
				Static187.anInt3550 = 1;
			}
			if (Static187.anInt3550 == 1) {
				Static64.aClass174_1 = Static627.aClass157_6.method3979(Static48.aClass298_12);
				Static187.anInt3550 = 2;
			}
			if (Static187.anInt3550 == 2) {
				if (Static64.aClass174_1.anInt5121 == 2) {
					throw new IOException();
				}
				if (Static64.aClass174_1.anInt5121 != 1) {
					return;
				}
				Static547.aClass197_1 = Static92.method1554((Socket) Static64.aClass174_1.anObject12);
				Static64.aClass174_1 = null;
				Static263.method4385();
				Static187.anInt3550 = 4;
			}
			if (Static187.anInt3550 == 4 && Static547.aClass197_1.method5195(1)) {
				Static547.aClass197_1.method5194(Static47.aClass3_Sub9_Sub2_1.aByteArray51, 1, 0);
				@Pc(118) int local118 = Static47.aClass3_Sub9_Sub2_1.aByteArray51[0] & 0xFF;
				Static187.anInt3550 = 0;
				Static32.anInt482 = local118;
				Static547.aClass197_1.method5188();
				Static547.aClass197_1 = null;
			}
		} catch (@Pc(129) IOException local129) {
			if (Static547.aClass197_1 != null) {
				Static547.aClass197_1.method5188();
				Static547.aClass197_1 = null;
			}
			if (Static469.anInt8027 >= 2) {
				Static187.anInt3550 = 0;
				Static32.anInt482 = -4;
			} else {
				Static627.aClass157_6.method3977();
				Static469.anInt8027++;
				Static560.anInt9308 = 0;
				Static187.anInt3550 = 1;
			}
		}
	}

	@OriginalMember(owner = "client!iia", name = "c", descriptor = "(I)V")
	public static void method4069() {
		Static64.aClass136_15.method3142();
	}
}
