import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!bg", name = "rb", descriptor = "Lclient!cb;")
	public static Class13_Sub1 aClass13_Sub1_5;

	@OriginalMember(owner = "client!bg", name = "L", descriptor = "Lclient!sd;")
	public static Class73 aClass73_270 = Static122.method531("Der Anmelde)2Server ist offline)3");

	@OriginalMember(owner = "client!bg", name = "cb", descriptor = "[I")
	public static int[] anIntArray27 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!bg", name = "lb", descriptor = "Lclient!sd;")
	private static Class73 aClass73_271 = Static122.method531("red:");

	@OriginalMember(owner = "client!bg", name = "mb", descriptor = "Lclient!vd;")
	public static Class83 aClass83_5 = null;

	@OriginalMember(owner = "client!bg", name = "wb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_272 = Static122.method531("Null");

	@OriginalMember(owner = "client!bg", name = "Cb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_273 = aClass73_271;

	@OriginalMember(owner = "client!bg", name = "Eb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_274 = aClass73_271;

	@OriginalMember(owner = "client!bg", name = "k", descriptor = "(I)V")
	public static void method295() {
		aClass73_273 = null;
		aClass83_5 = null;
		aClass73_270 = null;
		anIntArray27 = null;
		aClass73_272 = null;
		aClass73_274 = null;
		aClass73_271 = null;
		aClass13_Sub1_5 = null;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IB)I")
	public static int method296(@OriginalArg(0) int arg0) {
		@Pc(14) int local14 = (arg0 & 0x55555555) + ((arg0 & 0xAAAAAAAB) >>> 1);
		@Pc(25) int local25 = (local14 & 0x33333333) + (local14 >>> 2 & 0x73333333);
		@Pc(33) int local33 = local25 + (local25 >>> 4) & 0xF0F0F0F;
		@Pc(46) int local46 = local33 + (local33 >>> 8);
		@Pc(52) int local52 = local46 + (local46 >>> 16);
		return local52 & 0xFF;
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(B)V")
	public static void method297() {
		Static2.anInt13 = 0;
		Static181.anInt3975 = 0;
		Static74.method1288();
		Static120.method2091();
		Static63.method1127();
		Static173.method2693();
		@Pc(34) int local34;
		for (@Pc(28) int local28 = 0; local28 < Static2.anInt13; local28++) {
			local34 = Static149.anIntArray364[local28];
			if (Static44.anInt1024 != Static162.aClass3_Sub1_Sub4_Sub7_Sub1Array1[local34].anInt3177) {
				Static162.aClass3_Sub1_Sub4_Sub7_Sub1Array1[local34] = null;
			}
		}
		if (Static17.anInt3783 != Static159.aClass3_Sub12_Sub1_4.anInt1793) {
			throw new RuntimeException("gpp1 pos:" + Static159.aClass3_Sub12_Sub1_4.anInt1793 + " psize:" + Static17.anInt3783);
		}
		for (local34 = 0; local34 < Static6.anInt158; local34++) {
			if (Static162.aClass3_Sub1_Sub4_Sub7_Sub1Array1[Static47.anIntArray184[local34]] == null) {
				throw new RuntimeException("gpp2 pos:" + local34 + " size:" + Static6.anInt158);
			}
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lclient!sd;Lclient!f;Lclient!sd;I)Lclient!kf;")
	public static Class3_Sub1_Sub3_Sub3 method298(@OriginalArg(0) Class73 arg0, @OriginalArg(1) Class13 arg1, @OriginalArg(2) Class73 arg2) {
		@Pc(12) int local12 = arg1.method359(arg2);
		@Pc(22) int local22 = arg1.method358(local12, arg0);
		return Static123.method2099(local12, arg1, local22);
	}

	@OriginalMember(owner = "client!bg", name = "l", descriptor = "(I)V")
	public static void method299() {
		Static60.method1104(aClass83_5);
		Static163.anInt3133++;
		if (Static104.aBoolean157 && Static85.aBoolean128) {
			@Pc(26) int local26 = Static37.anInt899;
			@Pc(28) int local28 = Static5.anInt107;
			local26 -= Static32.anInt821;
			local28 -= Static37.anInt898;
			@Pc(39) int local39 = aClass83_5.anInt3737;
			if (Static111.anInt2709 > local26) {
				local26 = Static111.anInt2709;
			}
			if (local28 < Static22.anInt590) {
				local28 = Static22.anInt590;
			}
			if (aClass83_5.anInt3670 + local26 > Static111.anInt2709 + Static58.aClass83_8.anInt3670) {
				local26 = Static111.anInt2709 + Static58.aClass83_8.anInt3670 - aClass83_5.anInt3670;
			}
			@Pc(80) int local80 = local26 - Static180.anInt3936;
			@Pc(88) int local88 = Static58.aClass83_8.anInt3728 + local26 - Static111.anInt2709;
			if (local28 + aClass83_5.anInt3708 > Static58.aClass83_8.anInt3708 + Static22.anInt590) {
				local28 = Static58.aClass83_8.anInt3708 + Static22.anInt590 - aClass83_5.anInt3708;
			}
			@Pc(123) int local123 = Static58.aClass83_8.anInt3689 + local28 - Static22.anInt590;
			@Pc(128) int local128 = local28 - Static95.anInt2109;
			if (aClass83_5.anInt3669 < Static163.anInt3133 && (local39 < local80 || local80 < -local39 || local128 > local39 || local128 < -local39)) {
				Static173.aBoolean262 = true;
			}
			@Pc(161) Class3_Sub17 local161;
			if (aClass83_5.anObjectArray13 != null && Static173.aBoolean262) {
				local161 = new Class3_Sub17();
				local161.anInt2864 = local123;
				local161.anObjectArray3 = aClass83_5.anObjectArray13;
				local161.aClass83_13 = aClass83_5;
				local161.anInt2863 = local88;
				Static148.method2418(local161);
			}
			if (Static45.anInt1056 == 0) {
				if (Static173.aBoolean262) {
					if (aClass83_5.anObjectArray20 != null) {
						local161 = new Class3_Sub17();
						local161.aClass83_12 = Static14.aClass83_4;
						local161.anInt2863 = local88;
						local161.aClass83_13 = aClass83_5;
						local161.anInt2864 = local123;
						local161.anObjectArray3 = aClass83_5.anObjectArray20;
						Static148.method2418(local161);
					}
					if (Static14.aClass83_4 != null && Static166.method2618(aClass83_5) != null) {
						Static139.aClass3_Sub12_Sub1_3.method1400(243);
						Static139.aClass3_Sub12_Sub1_3.method1393(Static14.aClass83_4.anInt3676);
						Static139.aClass3_Sub12_Sub1_3.method1357(aClass83_5.anInt3676);
						Static139.aClass3_Sub12_Sub1_3.method1361(aClass83_5.anInt3677);
						Static139.aClass3_Sub12_Sub1_3.method1361(Static14.aClass83_4.anInt3677);
					}
				} else if ((Static127.anInt605 == 1 || Static156.method2509(Static142.anInt3262 - 1)) && Static142.anInt3262 > 2) {
					Static175.method2699();
				} else if (Static142.anInt3262 > 0) {
					Static74.method1286(Static142.anInt3262 - 1);
				}
				aClass83_5 = null;
			}
		} else if (Static163.anInt3133 > 1) {
			aClass83_5 = null;
		}
	}
}
