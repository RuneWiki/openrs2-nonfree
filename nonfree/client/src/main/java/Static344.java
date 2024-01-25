import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static344 {

	@OriginalMember(owner = "client!wd", name = "l", descriptor = "Lclient!wo;")
	public static Class216 aClass216_96;

	@OriginalMember(owner = "client!wd", name = "m", descriptor = "[[I")
	public static int[][] anIntArrayArray65;

	@OriginalMember(owner = "client!wd", name = "p", descriptor = "Lclient!lk;")
	public static Class126 aClass126_3;

	@OriginalMember(owner = "client!wd", name = "s", descriptor = "[I")
	public static int[] anIntArray525;

	@OriginalMember(owner = "client!wd", name = "q", descriptor = "Lclient!wp;")
	public static final Class217 aClass217_9 = new Class217();

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIBII)V")
	public static void method5516(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(13) int local13 = arg4 * arg4;
		@Pc(17) int local17 = arg1 * arg1;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg1 << 1;
		@Pc(39) int local39 = local13 * (1 - local29) + local21;
		@Pc(48) int local48 = local17 - (local29 - 1) * local25;
		@Pc(52) int local52 = local13 << 2;
		@Pc(56) int local56 = local17 << 2;
		@Pc(64) int local64 = local21 * 3;
		@Pc(79) int local79 = ((arg1 << 1) - 3) * local25;
		@Pc(85) int local85 = local56;
		Static39.method919(arg2, anIntArrayArray65[arg0], arg3 + arg4, arg3 - arg4);
		@Pc(103) int local103 = local52 * (arg1 - 1);
		while (local9 > 0) {
			if (local39 < 0) {
				while (local39 < 0) {
					local39 += local64;
					local48 += local85;
					local85 += local56;
					local64 += local56;
					local7++;
				}
			}
			if (local48 < 0) {
				local39 += local64;
				local48 += local85;
				local7++;
				local85 += local56;
				local64 += local56;
			}
			local48 += -local79;
			local39 += -local103;
			local9--;
			local79 -= local52;
			local103 -= local52;
			@Pc(170) int local170 = arg0 - local9;
			@Pc(174) int local174 = arg0 + local9;
			@Pc(178) int local178 = local7 + arg3;
			@Pc(182) int local182 = arg3 - local7;
			Static39.method919(arg2, anIntArrayArray65[local170], local178, local182);
			Static39.method919(arg2, anIntArrayArray65[local174], local178, local182);
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method5517(@OriginalArg(0) String arg0) {
		if (Static263.aStringArray56 == null) {
			Static208.method3955();
		}
		@Pc(14) String[] local14 = Static309.method5164('\n', arg0);
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			for (@Pc(20) int local20 = Static178.anInt3855; local20 > 0; local20--) {
				Static263.aStringArray56[local20] = Static263.aStringArray56[local20 - 1];
			}
			Static263.aStringArray56[0] = local14[local16];
			if (Static178.anInt3855 < Static263.aStringArray56.length - 1) {
				if (Static234.anInt4773 > 0) {
					Static234.anInt4773++;
				}
				Static178.anInt3855++;
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "(I)V")
	public static void method5519() {
		Static37.aClass1_Sub1_Sub1_1.method41();
		Static33.anInt1108 = 1;
		Static70.aClass216_23 = null;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "([SZ)[S")
	public static short[] method5520(@OriginalArg(0) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(16) short[] local16 = new short[arg0.length];
			Static361.method1331(arg0, 0, local16, 0, arg0.length);
			return local16;
		}
	}
}
