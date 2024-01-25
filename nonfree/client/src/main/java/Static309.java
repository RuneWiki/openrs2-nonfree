import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static309 {

	@OriginalMember(owner = "client!pd", name = "R", descriptor = "J")
	public static long aLong273 = 0L;

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lclient!ar;BIIII)V")
	public static void method4439(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0.anInt349 == -1 && arg0.anIntArray36 == null) {
			return;
		}
		@Pc(15) int local15 = 0;
		@Pc(23) int local23 = Static434.aClass165_Sub1_1.anInt4202 * arg0.anInt337 >> 8;
		if (arg0.anInt350 < arg2) {
			local15 = arg2 - arg0.anInt350;
		} else if (arg2 < arg0.anInt345) {
			local15 = arg0.anInt345 - arg2;
		}
		if (arg0.anInt340 < arg4) {
			local15 += arg4 - arg0.anInt340;
		} else if (arg4 < arg0.anInt348) {
			local15 += arg0.anInt348 - arg4;
		}
		if (arg0.anInt344 == 0 || arg0.anInt344 < local15 - 64 || Static434.aClass165_Sub1_1.anInt4202 == 0 || arg0.anInt347 != arg1) {
			if (arg0.aClass2_Sub8_Sub4_2 != null) {
				Static414.aClass2_Sub8_Sub1_2.method1041(arg0.aClass2_Sub8_Sub4_2);
				arg0.aClass2_Sub8_Sub4_2 = null;
			}
			if (arg0.aClass2_Sub8_Sub4_1 != null) {
				Static414.aClass2_Sub8_Sub1_2.method1041(arg0.aClass2_Sub8_Sub4_1);
				arg0.aClass2_Sub8_Sub4_1 = null;
			}
			return;
		}
		local15 -= 64;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(155) int local155 = local23 * (arg0.anInt344 - local15) / arg0.anInt344;
		if (arg0.aClass2_Sub8_Sub4_2 != null) {
			arg0.aClass2_Sub8_Sub4_2.method5308(local155);
		} else if (arg0.anInt349 >= 0) {
			@Pc(167) Class149 local167 = Static469.method3064(Static199.aClass171_46, arg0.anInt349, 0);
			if (local167 != null) {
				@Pc(174) Class2_Sub14_Sub1 local174 = local167.method3063().method3133(Static378.aClass148_5);
				@Pc(179) Class2_Sub8_Sub4 local179 = Static473.method5301(local174, local155);
				local179.method5298(-1);
				Static414.aClass2_Sub8_Sub1_2.method1039(local179);
				arg0.aClass2_Sub8_Sub4_2 = local179;
			}
		}
		if (arg0.aClass2_Sub8_Sub4_1 != null) {
			arg0.aClass2_Sub8_Sub4_1.method5308(local155);
			if (arg0.aClass2_Sub8_Sub4_1.method6258()) {
				return;
			}
			arg0.aClass2_Sub8_Sub4_1 = null;
		} else if (arg0.anIntArray36 != null && (arg0.anInt342 -= arg3) <= 0) {
			@Pc(219) int local219 = (int) ((double) arg0.anIntArray36.length * Math.random());
			@Pc(227) Class149 local227 = Static469.method3064(Static199.aClass171_46, arg0.anIntArray36[local219], 0);
			if (local227 != null) {
				@Pc(234) Class2_Sub14_Sub1 local234 = local227.method3063().method3133(Static378.aClass148_5);
				@Pc(239) Class2_Sub8_Sub4 local239 = Static473.method5301(local234, local155);
				local239.method5298(0);
				Static414.aClass2_Sub8_Sub1_2.method1039(local239);
				arg0.aClass2_Sub8_Sub4_1 = local239;
				arg0.anInt342 = arg0.anInt339 + (int) ((double) (arg0.anInt351 - arg0.anInt339) * Math.random());
				return;
			}
		}
	}
}
