import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static439 {

	@OriginalMember(owner = "client!pu", name = "i", descriptor = "Lclient!ek;")
	public static Class92 aClass92_2;

	@OriginalMember(owner = "client!pu", name = "f", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_130 = new Class337(73, 4);

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(I[J[Ljava/lang/Object;II)V")
	public static void method6667(@OriginalArg(1) long[] arg0, @OriginalArg(2) Object[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 <= arg3) {
			return;
		}
		@Pc(14) int local14 = (arg2 + arg3) / 2;
		@Pc(16) int local16 = arg3;
		@Pc(20) long local20 = arg0[local14];
		arg0[local14] = arg0[arg2];
		arg0[arg2] = local20;
		@Pc(34) Object local34 = arg1[local14];
		arg1[local14] = arg1[arg2];
		arg1[arg2] = local34;
		@Pc(52) int local52 = local20 == Long.MAX_VALUE ? 0 : 1;
		for (@Pc(54) int local54 = arg3; local54 < arg2; local54++) {
			if (arg0[local54] < local20 + (long) (local52 & local54)) {
				@Pc(72) long local72 = arg0[local54];
				arg0[local54] = arg0[local16];
				arg0[local16] = local72;
				@Pc(86) Object local86 = arg1[local54];
				arg1[local54] = arg1[local16];
				arg1[local16++] = local86;
			}
		}
		arg0[arg2] = arg0[local16];
		arg0[local16] = local20;
		arg1[arg2] = arg1[local16];
		arg1[local16] = local34;
		method6667(arg0, arg1, local16 - 1, arg3);
		method6667(arg0, arg1, arg2, local16 + 1);
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "([IB)Ljava/lang/String;")
	public static String method6671(@OriginalArg(0) int[] arg0) {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		@Pc(11) int local11 = Static471.anInt7942;
		for (@Pc(18) int local18 = 0; local18 < arg0.length; local18++) {
			@Pc(27) Class231 local27 = Static508.aClass139_1.method3547(arg0[local18]);
			if (local27.anInt5770 != -1) {
				@Pc(40) Class28 local40 = (Class28) Static122.aClass87_69.method1805((long) local27.anInt5770);
				if (local40 == null) {
					@Pc(48) Class131 local48 = Static649.method2888(Static441.aClass207_89, local27.anInt5770, 0);
					if (local48 != null) {
						local40 = Static213.aClass133_5.method7297(local48, true);
						Static122.aClass87_69.method1792((long) local27.anInt5770, local40);
					}
				}
				if (local40 != null) {
					Static236.aClass28Array10[local11] = local40;
					local9.append(" <img=").append(local11).append(">");
					local11++;
				}
			}
		}
		return local9.toString();
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(B)V")
	public static void method6672() {
		Static310.anInt5363 = -1;
		Static606.anInt10177 = 0;
		Static16.anInt249 = -1;
		Static511.anInt8845 = -1;
	}
}
