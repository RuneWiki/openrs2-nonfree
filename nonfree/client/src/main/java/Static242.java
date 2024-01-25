import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static242 {

	@OriginalMember(owner = "client!kba", name = "j", descriptor = "[I")
	public static final int[] anIntArray448 = new int[14];

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(B)V")
	public static void method4200() {
		for (@Pc(20) Class3_Sub10_Sub17 local20 = (Class3_Sub10_Sub17) Static422.aClass71_65.method2089(); local20 != null; local20 = (Class3_Sub10_Sub17) Static422.aClass71_65.method2086()) {
			@Pc(25) Class6_Sub1_Sub1 local25 = local20.aClass6_Sub1_Sub1_1;
			if (local25.aBoolean140) {
				local20.method7820();
				local25.method1811();
			} else if (local25.anInt1928 <= Static223.anInt4829) {
				local25.method1809(Static276.anInt5695);
				if (local25.aBoolean140) {
					local20.method7820();
				} else {
					Static483.method7135(local25, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(Lclient!rt;I)V")
	public static void method4202(@OriginalArg(0) Class3_Sub27 arg0) {
		@Pc(9) int local9 = arg0.method7547();
		Static442.aClass308Array1 = new Class308[local9];
		for (@Pc(14) int local14 = 0; local14 < local9; local14++) {
			Static442.aClass308Array1[local14] = new Class308();
			Static442.aClass308Array1[local14].anInt9014 = arg0.method7547();
			Static442.aClass308Array1[local14].aString84 = arg0.method7572();
		}
		Static32.anInt850 = arg0.method7547();
		Static205.anInt4555 = arg0.method7547();
		Static267.anInt5563 = arg0.method7547();
		Static246.aClass68_Sub1Array1 = new Class68_Sub1[Static205.anInt4555 + 1 - Static32.anInt850];
		for (@Pc(73) int local73 = 0; local73 < Static267.anInt5563; local73++) {
			@Pc(79) int local79 = arg0.method7547();
			@Pc(87) Class68_Sub1 local87 = Static246.aClass68_Sub1Array1[local79] = new Class68_Sub1();
			local87.anInt2089 = arg0.method7548();
			local87.anInt2091 = arg0.method7549();
			local87.anInt2093 = Static32.anInt850 + local79;
			local87.aString23 = arg0.method7572();
			local87.aString24 = arg0.method7572();
		}
		Static50.anInt1127 = arg0.method7549();
		Static276.aBoolean366 = true;
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(IIIIII)V")
	public static void method4204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static190.anInt4314 <= arg2 && Static145.anInt2941 >= arg1 && Static269.anInt5577 <= arg3 && Static81.anInt1788 >= arg0) {
			Static272.method4733(arg1, arg4, arg0, arg2, arg3);
		} else {
			Static238.method4169(arg1, arg3, arg4, arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(ZBLjava/lang/Object;)[B")
	public static byte[] method4205(@OriginalArg(0) boolean arg0, @OriginalArg(2) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg1;
			return arg0 ? Static61.method1233(local13) : local13;
		} else if (arg1 instanceof Class21) {
			@Pc(27) Class21 local27 = (Class21) arg1;
			return local27.method6753();
		} else {
			throw new IllegalArgumentException();
		}
	}
}
