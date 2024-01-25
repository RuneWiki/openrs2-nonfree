import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static242 {

	@OriginalMember(owner = "client!od", name = "L", descriptor = "Lclient!rn;")
	public static Class18 aClass18_20;

	@OriginalMember(owner = "client!od", name = "C", descriptor = "[I")
	public static final int[] anIntArray933 = new int[2048];

	@OriginalMember(owner = "client!od", name = "E", descriptor = "Lclient!ae;")
	public static Class4 aClass4_22 = null;

	@OriginalMember(owner = "client!od", name = "G", descriptor = "Z")
	public static volatile boolean aBoolean363 = true;

	@OriginalMember(owner = "client!od", name = "K", descriptor = "[Lclient!nc;")
	public static final Class2_Sub10_Sub12[] aClass2_Sub10_Sub12Array6 = new Class2_Sub10_Sub12[14];

	@OriginalMember(owner = "client!od", name = "d", descriptor = "(I)V")
	public static void method4236() {
		Static216.method3597(Static48.aClass11_17);
		Static372.aClass2_Sub16_Sub2_4.method5358(0);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(BZ)V")
	public static void method4238(@OriginalArg(1) boolean arg0) {
		Static97.method1939(Static362.anInt6102, Static253.anInt4467, Static234.anInt4158, arg0);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(BIIII)V")
	public static void method4239(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(15) int local15 = arg0;
		@Pc(18) int local18 = -arg0;
		@Pc(20) int local20 = -1;
		@Pc(28) int local28 = Static93.method1862(arg2 + arg0, Static235.anInt4193, Static243.anInt4326);
		@Pc(36) int local36 = Static93.method1862(arg2 - arg0, Static235.anInt4193, Static243.anInt4326);
		Static315.method4662(local28, Static15.anIntArrayArray1[arg3], local36, arg1);
		while (local7 < local15) {
			local20 += 2;
			local18 += local20;
			@Pc(65) int local65;
			@Pc(69) int local69;
			@Pc(83) int local83;
			@Pc(92) int local92;
			if (local18 > 0) {
				local15--;
				local18 -= local15 << 1;
				local65 = arg3 - local15;
				local69 = local15 + arg3;
				if (local69 >= Static138.anInt932 && Static40.anInt818 >= local65) {
					local83 = Static93.method1862(local7 + arg2, Static235.anInt4193, Static243.anInt4326);
					local92 = Static93.method1862(arg2 - local7, Static235.anInt4193, Static243.anInt4326);
					if (Static40.anInt818 >= local69) {
						Static315.method4662(local83, Static15.anIntArrayArray1[local69], local92, arg1);
					}
					if (local65 >= Static138.anInt932) {
						Static315.method4662(local83, Static15.anIntArrayArray1[local65], local92, arg1);
					}
				}
			}
			local7++;
			local65 = arg3 - local7;
			local69 = arg3 + local7;
			if (local69 >= Static138.anInt932 && local65 <= Static40.anInt818) {
				local83 = Static93.method1862(arg2 + local15, Static235.anInt4193, Static243.anInt4326);
				local92 = Static93.method1862(arg2 - local15, Static235.anInt4193, Static243.anInt4326);
				if (local69 <= Static40.anInt818) {
					Static315.method4662(local83, Static15.anIntArrayArray1[local69], local92, arg1);
				}
				if (local65 >= Static138.anInt932) {
					Static315.method4662(local83, Static15.anIntArrayArray1[local65], local92, arg1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "f", descriptor = "(I)Lclient!ml;")
	public static Class138_Sub1 method4240() {
		Static131.anInt2697 = 0;
		return Static12.method254();
	}

	@OriginalMember(owner = "client!od", name = "h", descriptor = "(I)Lclient!id;")
	public static Class2_Sub23 method4242() {
		if (Static338.aClass30_23 == null || Static21.aClass83_1 == null) {
			return null;
		}
		for (@Pc(21) Class2_Sub23 local21 = (Class2_Sub23) Static21.aClass83_1.method2277(); local21 != null; local21 = (Class2_Sub23) Static21.aClass83_1.method2277()) {
			@Pc(29) Class243 local29 = Static338.aClass226_3.method4913(local21.anInt2801);
			if (local29 != null && local29.aBoolean452 && local29.method5525(Static338.anInterface8_2)) {
				return local21;
			}
		}
		return null;
	}
}
