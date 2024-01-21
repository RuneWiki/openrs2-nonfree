import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!pc", name = "Z", descriptor = "[Lclient!sf;")
	public static Class1_Sub1_Sub1_Sub6[] aClass1_Sub1_Sub1_Sub6Array1 = new Class1_Sub1_Sub1_Sub6[4];

	@OriginalMember(owner = "client!pc", name = "ab", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1215 = Static169.method2903(")1");

	@OriginalMember(owner = "client!pc", name = "ub", descriptor = "Lclient!ed;")
	private static Class23 aClass23_1219 = Static169.method2903("white:");

	@OriginalMember(owner = "client!pc", name = "cb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1216 = aClass23_1219;

	@OriginalMember(owner = "client!pc", name = "db", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1217 = Static169.method2903("jlv");

	@OriginalMember(owner = "client!pc", name = "pb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1218 = aClass23_1219;

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(II)Z")
	public static boolean method2224(@OriginalArg(1) int arg0) {
		return (arg0 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "(Z)V")
	public static void method2227() {
		aClass23_1216 = null;
		aClass23_1219 = null;
		aClass23_1215 = null;
		aClass1_Sub1_Sub1_Sub6Array1 = null;
		aClass23_1218 = null;
		aClass23_1217 = null;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!pb;I)V")
	public static void method2228(@OriginalArg(0) Class1_Sub17 arg0) {
		@Pc(9) int local9 = 0;
		if (arg0.anInt3221 == 0) {
			local9 = Static123.aClass80_1.method2664(arg0.anInt3225, arg0.anInt3231, arg0.anInt3228);
		}
		if (arg0.anInt3221 == 1) {
			local9 = Static123.aClass80_1.method2678(arg0.anInt3225, arg0.anInt3231, arg0.anInt3228);
		}
		if (arg0.anInt3221 == 2) {
			local9 = Static123.aClass80_1.method2688(arg0.anInt3225, arg0.anInt3231, arg0.anInt3228);
		}
		if (arg0.anInt3221 == 3) {
			local9 = Static123.aClass80_1.method2687(arg0.anInt3225, arg0.anInt3231, arg0.anInt3228);
		}
		@Pc(64) int local64 = -1;
		@Pc(66) int local66 = 0;
		@Pc(68) int local68 = 0;
		if (local9 != 0) {
			@Pc(80) int local80 = Static123.aClass80_1.method2676(arg0.anInt3225, arg0.anInt3231, arg0.anInt3228, local9);
			local68 = local80 >> 6 & 0x3;
			local66 = local80 & 0x1F;
			local64 = local9 >> 14 & 0x7FFF;
		}
		arg0.anInt3218 = local66;
		arg0.anInt3230 = local68;
		arg0.anInt3220 = local64;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZI)V")
	public static void method2229(@OriginalArg(1) int arg0) {
		Static155.anInt3808 = 1000 / arg0;
	}
}
