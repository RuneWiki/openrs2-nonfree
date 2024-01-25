import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!bm", name = "mb", descriptor = "Lclient!vga;")
	public static Class364 aClass364_1;

	@OriginalMember(owner = "client!bm", name = "nb", descriptor = "I")
	public static int anInt1279;

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(ILclient!nd;)V")
	public static void method1195(@OriginalArg(1) Class238 arg0) {
		Static265.anInt4974 = 0;
		Static69.anInt1872 = 0;
		Static518.aClass19_9 = new Class19();
		Static148.aClass16_Sub6_Sub1_Sub1Array1 = new Class16_Sub6_Sub1_Sub1[1024];
		Static629.aClass16_Sub7Array1 = new Class16_Sub7[Static290.anIntArray332[Static626.anInt10188] + 1];
		Static141.anInt2982 = 0;
		Static545.anInt8787 = 0;
		Static201.method3466(arg0);
		Static334.method5083(arg0);
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(BLjava/awt/Canvas;IILclient!d;)Lclient!ha;")
	public static Class13 method1196(@OriginalArg(1) Canvas arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Interface2 arg3) {
		return new Class13_Sub1(arg0, arg3, arg2, arg1);
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "([BIIBIII)Z")
	public static boolean method1201(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4) {
		@Pc(7) int local7 = arg4 % 8;
		@Pc(17) int local17;
		if (local7 == 0) {
			local17 = 0;
		} else {
			local17 = 8 - local7;
		}
		@Pc(29) int local29 = -((arg2 + 8 - 1) / 8);
		@Pc(38) int local38 = -((arg4 + 8 - 1) / 8);
		for (@Pc(48) int local48 = local29; local48 < 0; local48++) {
			for (@Pc(51) int local51 = local38; local51 < 0; local51++) {
				if (arg0[arg3] == 0) {
					return true;
				}
				arg3 += 8;
			}
			arg3 -= local17;
			if (arg0[arg3 - 1] == 0) {
				return true;
			}
			arg3 += arg1;
		}
		return false;
	}
}
