import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ab", name = "m", descriptor = "[[[Lclient!eg;")
	private static Class1_Sub11[][][] aClass1_Sub11ArrayArrayArray1;

	@OriginalMember(owner = "client!ab", name = "i", descriptor = "[I")
	public static int[] anIntArray12 = new int[1000];

	@OriginalMember(owner = "client!ab", name = "k", descriptor = "[I")
	public static int[] anIntArray14 = new int[32];

	@OriginalMember(owner = "client!ab", name = "l", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar1 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILclient!pa;BI)Lclient!vf;")
	public static Class1_Sub1_Sub8 method48(@OriginalArg(1) Class86 arg0, @OriginalArg(3) int arg1) {
		return Static139.method2305(arg0, arg1) ? Static114.method1851() : null;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)Lclient!hc;")
	public static Class47 method49() {
		try {
			return (Class47) Class.forName("Class47_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(17) Throwable local17) {
			return null;
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(B[SI[Lclient!hh;I)V")
	public static void method50(@OriginalArg(1) short[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class50[] arg2, @OriginalArg(4) int arg3) {
		if (arg1 <= arg3) {
			return;
		}
		@Pc(10) int local10 = (arg1 + arg3) / 2;
		@Pc(12) int local12 = arg3;
		@Pc(16) Class50 local16 = arg2[local10];
		arg2[local10] = arg2[arg1];
		arg2[arg1] = local16;
		@Pc(30) short local30 = arg0[local10];
		arg0[local10] = arg0[arg1];
		arg0[arg1] = local30;
		for (@Pc(42) int local42 = arg3; local42 < arg1; local42++) {
			if (local16 == null || arg2[local42] != null && (local42 & 0x1) > arg2[local42].method1220(local16)) {
				@Pc(64) Class50 local64 = arg2[local42];
				arg2[local42] = arg2[local12];
				arg2[local12] = local64;
				@Pc(78) short local78 = arg0[local42];
				arg0[local42] = arg0[local12];
				arg0[local12++] = local78;
			}
		}
		arg2[arg1] = arg2[local12];
		arg2[local12] = local16;
		arg0[arg1] = arg0[local12];
		arg0[local12] = local30;
		method50(arg0, local12 - 1, arg2, arg3);
		method50(arg0, arg1, arg2, local12 + 1);
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(BIIII)V")
	public static void method51(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(12) int local12 = -arg3;
		@Pc(14) int local14 = -1;
		@Pc(32) int local32 = Static92.method1433(Static131.anInt2713, arg2 + arg3, Static135.anInt2790);
		@Pc(41) int local41 = Static92.method1433(Static131.anInt2713, arg2 - arg3, Static135.anInt2790);
		Static107.method1641(local41, arg0, Static139.anIntArrayArray21[arg1], local32);
		while (local7 < local9) {
			local14 += 2;
			local12 += local14;
			@Pc(73) int local73;
			@Pc(77) int local77;
			@Pc(91) int local91;
			@Pc(100) int local100;
			if (local12 > 0) {
				local9--;
				local12 -= local9 << 1;
				local73 = arg1 - local9;
				local77 = local9 + arg1;
				if (Static49.anInt1030 <= local77 && Static177.anInt3701 >= local73) {
					local91 = Static92.method1433(Static131.anInt2713, local7 + arg2, Static135.anInt2790);
					local100 = Static92.method1433(Static131.anInt2713, arg2 - local7, Static135.anInt2790);
					if (local77 <= Static177.anInt3701) {
						Static107.method1641(local100, arg0, Static139.anIntArrayArray21[local77], local91);
					}
					if (local73 >= Static49.anInt1030) {
						Static107.method1641(local100, arg0, Static139.anIntArrayArray21[local73], local91);
					}
				}
			}
			local7++;
			local73 = arg1 - local7;
			local77 = arg1 + local7;
			if (Static49.anInt1030 <= local77 && Static177.anInt3701 >= local73) {
				local91 = Static92.method1433(Static131.anInt2713, arg2 + local9, Static135.anInt2790);
				local100 = Static92.method1433(Static131.anInt2713, arg2 - local9, Static135.anInt2790);
				if (Static177.anInt3701 >= local77) {
					Static107.method1641(local100, arg0, Static139.anIntArrayArray21[local77], local91);
				}
				if (local73 >= Static49.anInt1030) {
					Static107.method1641(local100, arg0, Static139.anIntArrayArray21[local73], local91);
				}
			}
		}
	}
}
