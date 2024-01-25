import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static280 {

	@OriginalMember(owner = "client!nj", name = "h", descriptor = "Lclient!um;")
	public static Class243 aClass243_153;

	@OriginalMember(owner = "client!nj", name = "f", descriptor = "Lclient!mo;")
	public static final Class163 aClass163_7 = new Class163(12, 6);

	@OriginalMember(owner = "client!nj", name = "g", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_111 = new Class129(57, 0);

	@OriginalMember(owner = "client!nj", name = "i", descriptor = "Z")
	public static boolean aBoolean287 = false;

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lclient!ta;IIILclient!o;ILclient!fi;I)V")
	public static void method3468(@OriginalArg(0) Class97 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class49 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class76 arg5, @OriginalArg(7) int arg6) {
		if (arg3 == null) {
			return;
		}
		@Pc(16) int local16;
		if (Static449.anInt7379 == 4) {
			local16 = (int) Static99.aFloat33 & 0x3FFF;
		} else {
			local16 = Static65.anInt5018 + (int) Static99.aFloat33 & 0x3FFF;
		}
		@Pc(37) int local37 = Math.max(arg5.anInt2127 / 2, arg5.anInt2106 / 2) + 10;
		@Pc(45) int local45 = arg6 * arg6 + arg1 * arg1;
		if (local45 > local37 * local37) {
			return;
		}
		@Pc(59) int local59 = Class30.anIntArray38[local16];
		@Pc(68) int local68 = Class30.anIntArray37[local16];
		if (Static449.anInt7379 != 4) {
			local59 = local59 * 256 / (Static430.anInt7181 + 256);
			local68 = local68 * 256 / (Static430.anInt7181 + 256);
		}
		@Pc(97) int local97 = arg6 * local59 + arg1 * local68 >> 15;
		@Pc(108) int local108 = arg6 * local68 - local59 * arg1 >> 15;
		arg3.method5790(local97 + arg4 + arg5.anInt2127 / 2 - arg3.RA() / 2, -local108 + (arg2 - -(arg5.anInt2106 / 2)) - arg3.Q() / 2, arg0, arg4, arg2);
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)Z")
	public static boolean method3471() {
		try {
			return Static162.method2295();
		} catch (@Pc(17) IOException local17) {
			Static152.method2174();
			return true;
		} catch (@Pc(22) Exception local22) {
			@Pc(80) String local80 = "T2 - " + (Static445.aClass129_65 == null ? -1 : Static445.aClass129_65.method2698()) + "," + (Static304.aClass129_129 == null ? -1 : Static304.aClass129_129.method2698()) + "," + (Static285.aClass129_114 == null ? -1 : Static285.aClass129_114.method2698()) + " - " + Static128.anInt2223 + "," + (Static220.aClass2_Sub1_Sub3_Sub2_1.anIntArray434[0] + Static31.anInt618) + "," + (Static220.aClass2_Sub1_Sub3_Sub2_1.anIntArray433[0] + Static226.anInt3768) + " - ";
			for (@Pc(82) int local82 = 0; local82 < Static128.anInt2223 && local82 < 50; local82++) {
				local80 = local80 + Static76.aClass5_Sub15_Sub2_1.aByteArray93[local82] + ",";
			}
			Static206.method2769(local80, local22);
			Static165.method2317(false);
			return true;
		}
	}
}
