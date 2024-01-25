import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static328 {

	@OriginalMember(owner = "client!ni", name = "f", descriptor = "[[B")
	public static byte[][] aByteArrayArray17;

	@OriginalMember(owner = "client!ni", name = "h", descriptor = "I")
	public static int anInt6268;

	@OriginalMember(owner = "client!ni", name = "e", descriptor = "Lclient!fea;")
	public static final Class87 aClass87_5 = new Class87();

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lclient!rt;Z)V")
	public static void method5242(@OriginalArg(0) Class3_Sub27 arg0) {
		@Pc(8) byte[] local8 = new byte[24];
		if (Static340.aClass196_6 != null) {
			@Pc(20) int local20;
			try {
				Static340.aClass196_6.method5081(0L);
				Static340.aClass196_6.method5080(local8);
				for (local20 = 0; local20 < 24 && local8[local20] == 0; local20++) {
				}
				if (local20 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(44) Exception local44) {
				for (local20 = 0; local20 < 24; local20++) {
					local8[local20] = -1;
				}
			}
		}
		arg0.method7569(24, local8);
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(JB)V")
	public static void method5243(@OriginalArg(0) long arg0) {
		Static515.aClass3_Sub27_Sub1_2.anInt9191 = 0;
		Static515.aClass3_Sub27_Sub1_2.method7576(Static538.aClass42_8.anInt1132);
		Static515.aClass3_Sub27_Sub1_2.method7577(arg0);
		Static515.aClass3_Sub27_Sub1_2.method7576(Static193.anInt7803);
		Static490.anInt8722 = 0;
		Static138.anInt2797 = 0;
		Static496.anInt8742 = 1;
		Static417.anInt7805 = -3;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(II)V")
	public static void method5244(@OriginalArg(1) int arg0) {
		Static531.anInt9235 = -1;
		Static152.anInt3124 = -1;
		Static256.anInt5191 = arg0;
		Static374.method5885();
	}
}
