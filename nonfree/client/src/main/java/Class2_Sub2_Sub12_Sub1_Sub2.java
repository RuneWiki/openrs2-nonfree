import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class2_Sub2_Sub12_Sub1_Sub2 extends Class2_Sub2_Sub12_Sub1 {

	@OriginalMember(owner = "client!ua", name = "Fc", descriptor = "I")
	public static int anInt2328 = 0;

	@OriginalMember(owner = "client!ua", name = "Lc", descriptor = "I")
	public static int anInt2333 = 0;

	@OriginalMember(owner = "client!ua", name = "Tc", descriptor = "Z")
	public static boolean aBoolean173 = false;

	@OriginalMember(owner = "client!ua", name = "Nc", descriptor = "[I")
	public static int[] anIntArray497 = new int[50];

	@OriginalMember(owner = "client!ua", name = "Uc", descriptor = "Lclient!o;")
	public static Class40 aClass40_661 = Static12.method257("titlebutton");

	@OriginalMember(owner = "client!ua", name = "Hc", descriptor = "Lclient!od;")
	public static Class44 aClass44_8 = new Class44();

	@OriginalMember(owner = "client!ua", name = "Yc", descriptor = "Lclient!o;")
	public static Class40 aClass40_663 = Static12.method257("mapfunction");

	@OriginalMember(owner = "client!ua", name = "Xc", descriptor = "Lclient!o;")
	public static Class40 aClass40_662 = Static12.method257("as it was used to break our rules");

	@OriginalMember(owner = "client!ua", name = "Zc", descriptor = "I")
	public static int anInt2340 = -1;

	@OriginalMember(owner = "client!ua", name = "bd", descriptor = "I")
	public static int anInt2342 = 0;

	@OriginalMember(owner = "client!ua", name = "Rc", descriptor = "Lclient!gb;")
	public Class2_Sub2_Sub7 aClass2_Sub2_Sub7_1;

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "(B)Lclient!ne;", line = 8)
	@Override
	protected Class2_Sub2_Sub12_Sub4 method1533() {
		if (this.aClass2_Sub2_Sub7_1 == null) {
			return null;
		}
		@Pc(28) Class2_Sub2_Sub6 local28 = super.anInt2307 != -1 && super.anInt2313 == 0 ? Static57.method1042(super.anInt2307) : null;
		@Pc(50) Class2_Sub2_Sub6 local50 = super.anInt2318 == -1 || super.anInt2318 == super.anInt2290 && local28 != null ? null : Static57.method1042(super.anInt2318);
		@Pc(61) Class2_Sub2_Sub12_Sub4 local61 = this.aClass2_Sub2_Sub7_1.method605(local28, local50, super.anInt2316, super.anInt2295);
		if (local61 == null) {
			return null;
		}
		local61.method1135();
		super.anInt2310 = local61.anInt2265;
		if (super.anInt2302 != -1 && super.anInt2291 != -1) {
			@Pc(89) Class2_Sub2_Sub12_Sub4 local89 = Static5.method116(super.anInt2302).method501(super.anInt2291);
			if (local89 != null) {
				local89.method1137(0, -super.anInt2289, 0);
				@Pc(109) Class2_Sub2_Sub12_Sub4[] local109 = new Class2_Sub2_Sub12_Sub4[] { local61, local89 };
				local61 = new Class2_Sub2_Sub12_Sub4(local109, 2, true);
			}
		}
		if (this.aClass2_Sub2_Sub7_1.anInt758 == 1) {
			local61.aBoolean139 = true;
		}
		return local61;
	}

	@OriginalMember(owner = "client!ua", name = "l", descriptor = "(I)Z", line = 1229)
	@Override
	public boolean method1544() {
		return this.aClass2_Sub2_Sub7_1 != null;
	}
}
