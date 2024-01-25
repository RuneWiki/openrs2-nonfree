import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static241 {

	@OriginalMember(owner = "client!pi", name = "n", descriptor = "Lclient!sd;")
	public static Class6_Sub12_Sub3 aClass6_Sub12_Sub3_6;

	@OriginalMember(owner = "client!pi", name = "s", descriptor = "[I")
	public static int[] anIntArray669;

	@OriginalMember(owner = "client!pi", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString274 = "Unable to find ";

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!qo;I)I")
	public static int method5339(@OriginalArg(0) Class44_Sub4_Sub4_Sub1 arg0) {
		@Pc(13) int local13 = arg0.anInt4891;
		@Pc(17) Class128 local17 = arg0.method4716();
		if (arg0.aBoolean358) {
			local13 = arg0.anInt4908;
		} else if (local17.anInt3379 == arg0.anInt5116 || arg0.anInt5116 == local17.anInt3393 || arg0.anInt5116 == local17.anInt3410 || local17.anInt3395 == arg0.anInt5116) {
			local13 = arg0.anInt4890;
		} else if (arg0.anInt5116 == local17.anInt3400 || local17.anInt3411 == arg0.anInt5116 || arg0.anInt5116 == local17.anInt3383 || local17.anInt3374 == arg0.anInt5116) {
			local13 = arg0.anInt4917;
		}
		return local13;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(BI)Lclient!ej;")
	public static Class61 method5342(@OriginalArg(1) int arg0) {
		@Pc(5) Class70 local5 = Static340.aClass70_20;
		@Pc(16) Class61 local16;
		synchronized (Static340.aClass70_20) {
			local16 = (Class61) Static340.aClass70_20.method1396((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(43) byte[] local43 = Static340.aClass53_27.method1033(Static319.method5326(arg0), Static283.method4853(arg0));
		local16 = new Class61();
		if (local43 != null) {
			local16.method1272(new Class6_Sub10(local43));
		}
		@Pc(58) Class70 local58 = Static340.aClass70_20;
		synchronized (Static340.aClass70_20) {
			Static340.aClass70_20.method1406(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(II[Lclient!mb;)V")
	public static void method5343(@OriginalArg(0) int arg0, @OriginalArg(2) Class132[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
			@Pc(9) Class132 local9 = arg1[local3];
			if (local9 != null) {
				if (local9.anInt3524 == 0) {
					if (local9.aClass132Array2 != null) {
						method5343(arg0, local9.aClass132Array2);
					}
					@Pc(30) Class6_Sub30 local30 = (Class6_Sub30) Static197.aClass108_30.method2900((long) local9.anInt3551);
					if (local30 != null) {
						Static296.method5396(local30.anInt4313, arg0);
					}
				}
				@Pc(46) Class6_Sub15 local46;
				if (arg0 == 0 && local9.anObjectArray23 != null) {
					local46 = new Class6_Sub15();
					local46.anObjectArray2 = local9.anObjectArray23;
					local46.aClass132_5 = local9;
					Static140.method2654(local46);
				}
				if (arg0 == 1 && local9.anObjectArray27 != null) {
					if (local9.anInt3555 >= 0) {
						@Pc(71) Class132 local71 = Static249.method4316(local9.anInt3551);
						if (local71 == null || local71.aClass132Array2 == null || local9.anInt3555 >= local71.aClass132Array2.length || local71.aClass132Array2[local9.anInt3555] != local9) {
							continue;
						}
					}
					local46 = new Class6_Sub15();
					local46.aClass132_5 = local9;
					local46.anObjectArray2 = local9.anObjectArray27;
					Static140.method2654(local46);
				}
			}
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)V")
	public static void method5351() {
		Static290.method4952(25);
		Static85.method1434();
		System.gc();
	}
}
