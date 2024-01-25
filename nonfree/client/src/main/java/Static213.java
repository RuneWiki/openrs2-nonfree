import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!hga", name = "b", descriptor = "Lclient!bt;")
	public static final Class43 aClass43_6 = new Class43();

	@OriginalMember(owner = "client!hga", name = "g", descriptor = "F")
	public static float aFloat21 = 0.0F;

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(III)Z")
	public static boolean method3108(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!hga", name = "b", descriptor = "(I)I")
	public static int method3109() {
		return Static353.anInt6019 == 1 ? Static554.anInt9288 : Static308.anInt5228;
	}

	@OriginalMember(owner = "client!hga", name = "c", descriptor = "(I)V")
	public static void method3110() {
		if (Static131.anInt2291 == 0) {
			return;
		}
		try {
			if (++Static102.anInt1887 > 2000) {
				if (Static163.aClass170_1 != null) {
					Static163.aClass170_1.method8770();
					Static163.aClass170_1 = null;
				}
				if (Static35.anInt855 >= 2) {
					Static400.anInt6735 = -5;
					Static131.anInt2291 = 0;
					return;
				}
				Static305.aClass354_2.method8303();
				Static131.anInt2291 = 1;
				Static35.anInt855++;
				Static102.anInt1887 = 0;
			}
			if (Static131.anInt2291 == 1) {
				Static523.aClass103_8 = Static305.aClass354_2.method8301(Static569.aClass380_6);
				Static131.anInt2291 = 2;
			}
			if (Static131.anInt2291 == 2) {
				if (Static523.aClass103_8.anInt2541 == 2) {
					throw new IOException();
				}
				if (Static523.aClass103_8.anInt2541 != 1) {
					return;
				}
				Static163.aClass170_1 = Static173.method2467((Socket) Static523.aClass103_8.anObject9);
				Static523.aClass103_8 = null;
				Static356.method5157();
				Static131.anInt2291 = 4;
			}
			if (Static131.anInt2291 == 4 && Static163.aClass170_1.method8769(1)) {
				Static163.aClass170_1.method8776(0, Static204.aClass6_Sub23_Sub1_1.aByteArray101, 1);
				@Pc(111) int local111 = Static204.aClass6_Sub23_Sub1_1.aByteArray101[0] & 0xFF;
				Static400.anInt6735 = local111;
				Static131.anInt2291 = 0;
				Static163.aClass170_1.method8770();
				Static163.aClass170_1 = null;
			}
		} catch (@Pc(129) IOException local129) {
			if (Static163.aClass170_1 != null) {
				Static163.aClass170_1.method8770();
				Static163.aClass170_1 = null;
			}
			if (Static35.anInt855 < 2) {
				Static305.aClass354_2.method8303();
				Static102.anInt1887 = 0;
				Static35.anInt855++;
				Static131.anInt2291 = 1;
			} else {
				Static400.anInt6735 = -4;
				Static131.anInt2291 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!hga", name = "b", descriptor = "(III)V")
	public static void method3111(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class6_Sub4_Sub18 local8 = Static565.method7924(0L, 15);
		local8.method7976();
		local8.anInt9463 = arg1;
		local8.anInt9466 = arg0;
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(Lclient!ha;III)V")
	public static void method3112(@OriginalArg(0) Class132 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static128.aClass283ArrayArray1 = new Class283[arg2][arg1];
		Static83.aClass132_3 = arg0;
		if (Static392.anIntArray117 != null) {
			Static459.aClass25_2 = Static11.method411(Static392.anIntArray117[3], Static392.anIntArray117[1], Static392.anIntArray117[4], Static392.anIntArray117[5], Static392.anIntArray117[2], Static392.anIntArray117[0]);
		}
		Static508.aClass283_36 = new Class283();
		Static23.method580();
	}
}
