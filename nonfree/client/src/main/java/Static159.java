import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!ld", name = "I", descriptor = "Lclient!ek;")
	public static Class42 aClass42_44;

	@OriginalMember(owner = "client!ld", name = "T", descriptor = "I")
	public static int anInt3553;

	@OriginalMember(owner = "client!ld", name = "Q", descriptor = "Lclient!g;")
	public static Class56 aClass56_17 = null;

	@OriginalMember(owner = "client!ld", name = "U", descriptor = "Lclient!sf;")
	public static Class157 aClass157_30 = new Class157(100);

	@OriginalMember(owner = "client!ld", name = "V", descriptor = "I")
	public static int anInt3554 = 0;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(JZ)V")
	public static void method2930(@OriginalArg(0) long arg0) {
		Static211.aClass2_Sub16_Sub1_2.anInt2789 = 0;
		Static211.aClass2_Sub16_Sub1_2.method2168(21);
		Static211.aClass2_Sub16_Sub1_2.method2144(arg0);
		Static92.anInt2207 = 0;
		Static195.anInt6028 = -3;
		Static259.anInt5132 = 1;
		Static194.anInt4084 = 0;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ZIIIII)V")
	public static void method2931(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg0 - arg4;
		@Pc(15) int local15 = arg1 - arg2;
		if (local15 == 0) {
			if (local10 != 0) {
				Static108.method1845(arg2, arg4, arg0, arg3);
			}
		} else if (local10 == 0) {
			Static233.method4741(arg1, arg4, arg3, arg2);
		} else {
			@Pc(46) int local46 = (local10 << 12) / local15;
			@Pc(55) int local55 = arg4 - (local46 * arg2 >> 12);
			@Pc(72) int local72;
			@Pc(70) int local70;
			if (Static53.anInt1319 > arg1) {
				local70 = local55 + (local46 * Static53.anInt1319 >> 12);
				local72 = Static53.anInt1319;
			} else if (Static81.anInt1915 >= arg1) {
				local70 = arg0;
				local72 = arg1;
			} else {
				local70 = (Static81.anInt1915 * local46 >> 12) + local55;
				local72 = Static81.anInt1915;
			}
			@Pc(106) int local106;
			@Pc(114) int local114;
			if (Static53.anInt1319 > arg2) {
				local106 = Static53.anInt1319;
				local114 = (local46 * Static53.anInt1319 >> 12) + local55;
			} else if (Static81.anInt1915 >= arg2) {
				local106 = arg2;
				local114 = arg4;
			} else {
				local106 = Static81.anInt1915;
				local114 = (local46 * Static81.anInt1915 >> 12) + local55;
			}
			if (Static148.anInt3245 > local114) {
				local106 = (Static148.anInt3245 - local55 << 12) / local46;
				local114 = Static148.anInt3245;
			} else if (local114 > Static166.anInt3675) {
				local114 = Static166.anInt3675;
				local106 = (Static166.anInt3675 - local55 << 12) / local46;
			}
			if (Static148.anInt3245 > local70) {
				local72 = (Static148.anInt3245 - local55 << 12) / local46;
				local70 = Static148.anInt3245;
			} else if (Static166.anInt3675 < local70) {
				local70 = Static166.anInt3675;
				local72 = (Static166.anInt3675 - local55 << 12) / local46;
			}
			Static88.method1568(arg3, local72, local106, local114, local70);
		}
	}

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "(B)V")
	public static void method2932() {
		while (true) {
			if (Static91.aClass2_Sub16_Sub1_1.method2201(Static218.anInt4451) >= 11) {
				@Pc(18) int local18 = Static91.aClass2_Sub16_Sub1_1.method2202(11);
				if (local18 != 2047) {
					@Pc(25) boolean local25 = false;
					if (Static188.aClass15_Sub2_Sub2Array41[local18] == null) {
						Static188.aClass15_Sub2_Sub2Array41[local18] = new Class15_Sub2_Sub2();
						if (Static59.aClass2_Sub16Array1[local18] != null) {
							Static188.aClass15_Sub2_Sub2Array41[local18].method4301(local18, Static59.aClass2_Sub16Array1[local18]);
						}
						local25 = true;
					}
					Static246.anIntArray479[Static191.anInt4008++] = local18;
					@Pc(66) Class15_Sub2_Sub2 local66 = Static188.aClass15_Sub2_Sub2Array41[local18];
					local66.anInt5378 = Static268.anInt5236;
					@Pc(74) int local74 = Static91.aClass2_Sub16_Sub1_1.method2202(5);
					@Pc(79) int local79 = Static91.aClass2_Sub16_Sub1_1.method2202(1);
					if (local74 > 15) {
						local74 -= 32;
					}
					if (local79 == 1) {
						Static132.anIntArray303[Static222.anInt4523++] = local18;
					}
					@Pc(104) int local104 = Static75.anIntArray158[Static91.aClass2_Sub16_Sub1_1.method2202(3)];
					if (local25) {
						local66.anInt5313 = local66.anInt5373 = local104;
					}
					@Pc(117) int local117 = Static91.aClass2_Sub16_Sub1_1.method2202(5);
					if (local117 > 15) {
						local117 -= 32;
					}
					@Pc(128) int local128 = Static91.aClass2_Sub16_Sub1_1.method2202(1);
					local66.method4305(local128 == 1, Static22.aClass15_Sub2_Sub2_1.anIntArray518[0] + local74, Static22.aClass15_Sub2_Sub2_1.anIntArray516[0] + local117);
					continue;
				}
			}
			Static91.aClass2_Sub16_Sub1_1.method2205();
			return;
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!ek;I)I")
	public static int method2933(@OriginalArg(0) Class42 arg0) {
		@Pc(1) int local1 = 0;
		if (arg0.method1253(Static123.anInt2867)) {
			local1++;
		}
		if (arg0.method1253(Static50.anInt1263)) {
			local1++;
		}
		if (arg0.method1253(Static193.anInt4039)) {
			local1++;
		}
		if (arg0.method1253(Static214.anInt4371)) {
			local1++;
		}
		if (arg0.method1253(Static217.anInt4437)) {
			local1++;
		}
		if (arg0.method1253(Static184.anInt3966)) {
			local1++;
		}
		if (arg0.method1253(Static222.anInt4533)) {
			local1++;
		}
		if (arg0.method1253(Static182.anInt6010)) {
			local1++;
		}
		if (arg0.method1253(Static284.anInt5620)) {
			local1++;
		}
		if (arg0.method1253(Static233.anInt6040)) {
			local1++;
		}
		if (arg0.method1253(Static5.anInt4797)) {
			local1++;
		}
		if (arg0.method1253(Static101.anInt2396)) {
			local1++;
		}
		if (arg0.method1253(Static161.anInt3591)) {
			local1++;
		}
		if (arg0.method1253(Static14.anInt284)) {
			local1++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!aj;I)Z")
	public static boolean method2934(@OriginalArg(0) Class10 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean18) {
			return false;
		} else if (!arg0.method157()) {
			return false;
		} else if (Static64.aClass101_2.method2867((long) arg0.anInt167) == null) {
			return Static311.aClass101_27.method2867((long) arg0.anInt155) == null;
		} else {
			return false;
		}
	}
}
