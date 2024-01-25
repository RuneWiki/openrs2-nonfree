import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aaa", name = "d", descriptor = "I")
	public static int anInt5;

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(IIII)I")
	public static int method24(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 / arg2;
		@Pc(13) int local13 = arg2 - 1 & arg0;
		@Pc(23) int local23 = arg1 / arg2;
		@Pc(29) int local29 = arg2 - 1 & arg1;
		@Pc(34) int local34 = Static576.method8074(local23, local7);
		@Pc(41) int local41 = Static576.method8074(local23, local7 + 1);
		@Pc(48) int local48 = Static576.method8074(local23 + 1, local7);
		@Pc(57) int local57 = Static576.method8074(local23 + 1, local7 + 1);
		@Pc(64) int local64 = Static489.method7193(local34, local13, local41, arg2);
		@Pc(71) int local71 = Static489.method7193(local48, local13, local57, arg2);
		return Static489.method7193(local64, local29, local71, arg2);
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(I[B)[B")
	public static byte[] method27(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class3_Sub9 local8 = new Class3_Sub9(arg0);
		@Pc(12) int local12 = local8.method5633();
		@Pc(18) int local18 = local8.method5585();
		if (local18 < 0 || Static61.anInt1088 != 0 && local18 > Static61.anInt1088) {
			throw new RuntimeException();
		} else if (local12 == 0) {
			@Pc(93) byte[] local93 = new byte[local18];
			local8.method5577(0, local18, local93);
			return local93;
		} else {
			@Pc(41) int local41 = local8.method5585();
			if (local41 < 0 || Static61.anInt1088 != 0 && local41 > Static61.anInt1088) {
				throw new RuntimeException();
			}
			@Pc(61) byte[] local61 = new byte[local41];
			if (local12 == 1) {
				Static385.method6028(local61, local41, arg0, local18);
			} else {
				@Pc(66) Class73 local66 = Static639.aClass73_1;
				synchronized (Static639.aClass73_1) {
					Static639.aClass73_1.method1727(local61, local8);
				}
			}
			return local61;
		}
	}

	@OriginalMember(owner = "client!aaa", name = "c", descriptor = "(I)I")
	public static int method28() {
		if ((double) Static598.aFloat68 == 3.0D) {
			return 37;
		} else if ((double) Static598.aFloat68 == 4.0D) {
			return 50;
		} else if ((double) Static598.aFloat68 == 6.0D) {
			return 75;
		} else if ((double) Static598.aFloat68 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(IIJ)Ljava/lang/String;")
	public static String method31(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1) {
		Static334.method5409(arg1);
		@Pc(10) int local10 = Static116.aCalendar1.get(5);
		@Pc(14) int local14 = Static116.aCalendar1.get(2);
		@Pc(18) int local18 = Static116.aCalendar1.get(1);
		return arg0 == 3 ? Static177.method2937(arg1, arg0) : Integer.toString(local10 / 10) + local10 % 10 + "-" + Static644.aStringArrayArray2[arg0][local14] + "-" + local18;
	}
}
