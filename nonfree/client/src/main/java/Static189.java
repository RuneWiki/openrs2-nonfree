import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "I")
	public static int anInt6147;

	@OriginalMember(owner = "client!ma", name = "g", descriptor = "Lclient!al;")
	public static final Class11 aClass11_134 = new Class11(64);

	@OriginalMember(owner = "client!ma", name = "h", descriptor = "I")
	public static int anInt6153 = 0;

	@OriginalMember(owner = "client!ma", name = "i", descriptor = "Lclient!he;")
	public static final Class83 aClass83_5 = new Class83();

	@OriginalMember(owner = "client!ma", name = "j", descriptor = "Lclient!er;")
	public static final Class56 aClass56_13 = new Class56();

	@OriginalMember(owner = "client!ma", name = "k", descriptor = "Lclient!al;")
	public static Class11 aClass11_135 = new Class11(128);

	@OriginalMember(owner = "client!ma", name = "l", descriptor = "[Z")
	public static final boolean[] aBooleanArray24 = new boolean[5];

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIIIIILclient!ne;)V")
	public static void method5488(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class146 arg6) {
		if (Static154.aBoolean213) {
			Static265.anInt5044 = 32;
		} else {
			Static265.anInt5044 = 0;
		}
		Static154.aBoolean213 = false;
		@Pc(122) int local122;
		if (Static199.anInt4021 != 0) {
			if (arg0 <= arg1 && arg1 < arg0 + 16 && arg4 >= arg3 && arg3 + 16 > arg4) {
				arg6.anInt4128 -= 4;
				Static166.method3295(arg6);
			} else if (arg0 <= arg1 && arg1 < arg0 + 16 && arg4 >= arg3 + arg2 - 16 && arg4 < arg2 + arg3) {
				arg6.anInt4128 += 4;
				Static166.method3295(arg6);
			} else if (arg1 >= arg0 - Static265.anInt5044 && Static265.anInt5044 + arg0 + 16 > arg1 && arg4 >= arg3 + 16 && arg3 + arg2 - 16 > arg4) {
				local122 = (arg2 - 32) * arg2 / arg5;
				if (local122 < 8) {
					local122 = 8;
				}
				@Pc(139) int local139 = arg4 - arg3 - local122 / 2 - 16;
				@Pc(146) int local146 = arg2 - local122 - 32;
				arg6.anInt4128 = local139 * (arg5 - arg2) / local146;
				Static166.method3295(arg6);
				Static154.aBoolean213 = true;
			}
		}
		if (Static5.anInt4507 == 0) {
			return;
		}
		local122 = arg6.anInt4133;
		if (arg1 >= arg0 - local122 && arg3 <= arg4 && arg0 + 16 > arg1 && arg2 + arg3 >= arg4) {
			arg6.anInt4128 += Static5.anInt4507 * 45;
			Static166.method3295(arg6);
			return;
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Z)V")
	public static void method5490() {
		@Pc(7) Class110 local7 = null;
		try {
			@Pc(11) Class205 local11 = Static105.aClass15_2.method283();
			while (local11.anInt6370 == 0) {
				Static15.method5425(1L);
			}
			if (local11.anInt6370 == 1) {
				local7 = (Class110) local11.anObject7;
				@Pc(46) Class14_Sub4 local46 = new Class14_Sub4(Static142.anInt3017 * 6 + 3);
				local46.method2538(1);
				local46.method2509(Static142.anInt3017);
				for (@Pc(56) int local56 = 0; local56 < Static30.anIntArray45.length; local56++) {
					if (Static120.aBooleanArray12[local56]) {
						local46.method2509(local56);
						local46.method2541(Static30.anIntArray45[local56]);
					}
				}
				local7.method3080(local46.anInt2637, 0, local46.aByteArray74);
			}
		} catch (@Pc(91) Exception local91) {
		}
		try {
			if (local7 != null) {
				local7.method3079();
			}
		} catch (@Pc(98) Exception local98) {
		}
		Static26.aLong17 = Static168.method3300();
		Static8.aBoolean8 = false;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(BLclient!mo;)V")
	public static void method5491(@OriginalArg(1) Class143 arg0) {
		Static22.anInt450 = 0;
		Static30.anInt717 = 0;
		Static292.aClass126_7 = new Class126();
		Static138.aClass1_Sub1_Sub1_Sub1Array1 = new Class1_Sub1_Sub1_Sub1[1024];
		Static67.method1661(arg0);
		Static106.method2292(arg0);
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(ZIII)V")
	public static void method5492(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class14_Sub2_Sub13 local14 = Static1.method5711(9, arg0);
		local14.method3540();
		local14.anInt3808 = arg1;
		local14.anInt3805 = arg2;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(B)V")
	public static void method5493() {
		Static249.anInt4820 = 0;
		Static69.anInt1671 = 0;
		Static123.anInt5900 = 0;
		Static267.anInt5096 = 0;
	}
}
