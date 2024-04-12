import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!jd", name = "S", descriptor = "[Lclient!fc;")
	public static Class2_Sub2_Sub2_Sub2[] aClass2_Sub2_Sub2_Sub2Array9;

	@OriginalMember(owner = "client!jd", name = "W", descriptor = "[Lclient!qb;")
	public static Class2_Sub2_Sub2_Sub3[] aClass2_Sub2_Sub2_Sub3Array14;

	@OriginalMember(owner = "client!jd", name = "X", descriptor = "I")
	public static int anInt2259;

	@OriginalMember(owner = "client!jd", name = "bb", descriptor = "I")
	public static int anInt2262;

	@OriginalMember(owner = "client!jd", name = "f", descriptor = "(I)V", line = 3)
	public static void method1530() {
		if (Class41.aClass30_1 != null) {
			@Pc(12) Class30 local12 = Class41.aClass30_1;
			synchronized (Class41.aClass30_1) {
				Class41.aClass30_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!jd", name = "g", descriptor = "(I)V", line = 20)
	public static void method1531() {
		aClass2_Sub2_Sub2_Sub2Array9 = null;
		Class2_Sub2_Sub12.aClass40_655 = null;
		Class2_Sub2_Sub12.aClass40_654 = null;
		aClass2_Sub2_Sub2_Sub3Array14 = null;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "([BIII)Z", line = 41)
	public static boolean method1532(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) boolean local11 = true;
		@Pc(13) int local13 = -1;
		@Pc(18) Class2_Sub3 local18 = new Class2_Sub3(arg0);
		label67: while (true) {
			@Pc(22) int local22 = local18.method1698();
			if (local22 == 0) {
				return local11;
			}
			@Pc(29) int local29 = 0;
			local13 += local22;
			@Pc(35) boolean local35 = false;
			while (true) {
				@Pc(72) int local72;
				@Pc(96) Class2_Sub2_Sub10 local96;
				do {
					@Pc(66) int local66;
					@Pc(77) int local77;
					do {
						do {
							do {
								do {
									@Pc(41) int local41;
									while (local35) {
										local41 = local18.method1698();
										if (local41 == 0) {
											continue label67;
										}
										local18.method1708();
									}
									local41 = local18.method1698();
									if (local41 == 0) {
										continue label67;
									}
									local29 += local41 - 1;
									@Pc(56) int local56 = local29 & 0x3F;
									@Pc(62) int local62 = local29 >> 6 & 0x3F;
									local66 = local62 + arg1;
									local72 = local18.method1708() >> 2;
									local77 = local56 + arg2;
								} while (local66 <= 0);
							} while (local77 <= 0);
						} while (local66 >= 103);
					} while (local77 >= 103);
					local96 = Static83.method1470(local13);
				} while (local72 == 22 && Class1.aBoolean2 && local96.anInt1054 == 0 && !local96.aBoolean76);
				if (!local96.method773()) {
					Class38.anInt1667++;
					local11 = false;
				}
				local35 = true;
			}
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIII)I", line = 148)
	public static int method1534(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) int local13 = 256 - arg1;
		return (arg1 * (arg2 & 0xFF00FF) + (arg0 & 0xFF00FF) * local13 & 0xFF00FF00) + ((arg0 & 0xFF00) * local13 + ((arg2 & 0xFF00) * arg1) & 0xFF0000) >> 8;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IILclient!ad;IBZI)V", line = 165)
	public static void method1535(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(6) long local6 = (long) ((arg5 << 16) + arg0);
		@Pc(16) Class2_Sub2_Sub9 local16 = (Class2_Sub2_Sub9) Class58.aClass6_6.method190(local6);
		if (local16 != null) {
			return;
		}
		local16 = (Class2_Sub2_Sub9) Class45.aClass6_5.method190(local6);
		if (local16 != null) {
			return;
		}
		local16 = (Class2_Sub2_Sub9) Class64.aClass6_7.method190(local6);
		if (local16 == null) {
			if (!arg4) {
				local16 = (Class2_Sub2_Sub9) Class23.aClass6_2.method190(local6);
				if (local16 != null) {
					return;
				}
			}
			local16 = new Class2_Sub2_Sub9();
			local16.aClass5_Sub1_9 = arg1;
			local16.anInt1013 = arg2;
			local16.aByte2 = arg3;
			if (arg4) {
				Class58.aClass6_6.method195(local16, local6);
				Class3.anInt34++;
			} else {
				Class42.aClass41_1.method1201(local16);
				Class64.aClass6_7.method195(local16, local6);
				Class2_Sub2_Sub11.anInt1077++;
			}
		} else if (arg4) {
			local16.method1637();
			Class58.aClass6_6.method195(local16, local6);
			Class3.anInt34++;
			Class2_Sub2_Sub11.anInt1077--;
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lclient!o;Lclient!o;B)V", line = 276)
	public static void method1537(@OriginalArg(0) Class40 arg0, @OriginalArg(1) Class40 arg1) {
		Class2_Sub2_Sub12_Sub5.aClass40_592 = arg0;
		Class2_Sub2_Sub12_Sub5.aClass40_589 = arg1;
	}
}
