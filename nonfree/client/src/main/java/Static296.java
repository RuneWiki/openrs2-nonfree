import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!og", name = "q", descriptor = "I")
	public static int anInt5114;

	@OriginalMember(owner = "client!og", name = "F", descriptor = "[[I")
	public static int[][] anIntArrayArray42;

	@OriginalMember(owner = "client!og", name = "u", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray32 = new String[200];

	@OriginalMember(owner = "client!og", name = "v", descriptor = "Ljava/lang/String;")
	public static String aString56 = null;

	@OriginalMember(owner = "client!og", name = "w", descriptor = "[I")
	public static final int[] anIntArray328 = new int[50];

	@OriginalMember(owner = "client!og", name = "x", descriptor = "Lclient!ga;")
	public static Class82 aClass82_16 = null;

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(B)V")
	public static void method4218() {
		Static132.aClass167_4.MA(((float) Static39.aClass79_Sub1_1.anInt2153 * 0.1F + 0.7F) * Static438.aFloat35);
		Static132.aClass167_4.la(Static189.anInt3449, Static77.aFloat23, Static53.aFloat12, (float) (Static246.anInt4232 << 0), (float) (Static372.anInt6318 << 0), (float) (Static18.anInt306 << 0));
		Static132.aClass167_4.method5982(Static150.aClass139_3);
	}

	@OriginalMember(owner = "client!og", name = "c", descriptor = "(Z)V")
	public static void method4219() {
		@Pc(7) int local7 = Static271.anInt4534;
		@Pc(9) int[] local9 = Static215.anIntArray267;
		for (@Pc(16) int local16 = 0; local16 < local7; local16++) {
			@Pc(24) Class1_Sub2_Sub6_Sub2 local24 = Static216.aClass1_Sub2_Sub6_Sub2Array1[local9[local16]];
			if (local24 != null && local24.anInt7619 > 0) {
				local24.anInt7619--;
				if (local24.anInt7619 == 0) {
					local24.aString68 = null;
				}
			}
		}
		for (@Pc(54) int local54 = 0; local54 < Static379.anInt6398; local54++) {
			@Pc(61) long local61 = (long) Static198.anIntArray225[local54];
			@Pc(67) Class3_Sub40 local67 = (Class3_Sub40) Static63.aClass140_37.method3490(local61);
			if (local67 != null) {
				@Pc(72) Class1_Sub2_Sub6_Sub1 local72 = local67.aClass1_Sub2_Sub6_Sub1_2;
				if (local72.anInt7619 > 0) {
					local72.anInt7619--;
					if (local72.anInt7619 == 0) {
						local72.aString68 = null;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIIIZ)V")
	public static void method4220(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		if (arg0 < 1) {
			arg0 = 1;
		}
		if (arg3 < 1) {
			arg3 = 1;
		}
		@Pc(23) int local23 = arg3 - 334;
		if (local23 < 0) {
			local23 = 0;
		} else if (local23 > 100) {
			local23 = 100;
		}
		@Pc(46) int local46 = Static108.aShort19 + (Static366.aShort89 - Static108.aShort19) * local23 / 100;
		if (local46 < Static62.aShort13) {
			local46 = Static62.aShort13;
		} else if (Static284.aShort65 < local46) {
			local46 = Static284.aShort65;
		}
		@Pc(68) int local68 = arg3 * 512 * local46 / (arg0 * 334);
		@Pc(98) int local98;
		@Pc(104) int local104;
		@Pc(73) short local73;
		if (local68 < Static462.aShort111) {
			local73 = Static462.aShort111;
			local46 = local73 * 334 * arg0 / (arg3 * 512);
			if (local46 > Static284.aShort65) {
				local46 = Static284.aShort65;
				local98 = arg3 * 512 * local46 / (local73 * 334);
				local104 = (arg0 - local98) / 2;
				if (arg4) {
					Static413.aClass167_11.H();
					Static413.aClass167_11.method5951(arg3, arg1, -16777216, arg2, local104);
					Static413.aClass167_11.method5951(arg3, arg1, -16777216, arg0 + arg2 - local104, local104);
				}
				arg2 += local104;
				arg0 -= local104 * 2;
			}
		} else if (local68 > Static123.aShort21) {
			local73 = Static123.aShort21;
			local46 = arg0 * local73 * 334 / (arg3 * 512);
			if (Static62.aShort13 > local46) {
				local46 = Static62.aShort13;
				local98 = local73 * 334 * arg0 / (local46 * 512);
				local104 = (arg3 - local98) / 2;
				if (arg4) {
					Static413.aClass167_11.H();
					Static413.aClass167_11.method5951(local104, arg1, -16777216, arg2, arg0);
					Static413.aClass167_11.method5951(local104, arg1 + arg3 - local104, -16777216, arg2, arg0);
				}
				arg1 += local104;
				arg3 -= local104 * 2;
			}
		}
		Static360.anInt6141 = (short) arg3;
		Static388.anInt6529 = arg1;
		Static72.anInt1324 = (short) arg0;
		Static365.anInt6193 = arg2;
		Static54.anInt1061 = local46 * arg3 / 334;
	}
}
