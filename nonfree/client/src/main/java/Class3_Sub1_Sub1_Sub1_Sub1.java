import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public final class Class3_Sub1_Sub1_Sub1_Sub1 extends Class3_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "client!ka", name = "Xc", descriptor = "Lclient!td;")
	public Class3_Sub1_Sub17 aClass3_Sub1_Sub17_1;

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "(B)Lclient!hc;")
	@Override
	public Class3_Sub1_Sub1_Sub4 method1920() {
		if (this.aClass3_Sub1_Sub17_1 == null) {
			return null;
		}
		@Pc(22) Class3_Sub1_Sub6 local22 = super.anInt2320 != -1 && super.anInt2318 == 0 ? Static67.method1107(super.anInt2320) : null;
		@Pc(40) Class3_Sub1_Sub6 local40 = super.anInt2295 == -1 || super.anInt2291 == super.anInt2295 && local22 != null ? null : Static67.method1107(super.anInt2295);
		@Pc(51) Class3_Sub1_Sub1_Sub4 local51 = this.aClass3_Sub1_Sub17_1.method1680(super.anInt2339, local22, local40, super.anInt2298);
		if (local51 == null) {
			return null;
		}
		local51.method776();
		super.anInt2296 = local51.anInt2808;
		if (super.anInt2335 != -1 && super.anInt2338 != -1) {
			@Pc(86) Class3_Sub1_Sub1_Sub4 local86 = Static47.method827(super.anInt2335).method1484(super.anInt2338);
			if (local86 != null) {
				local86.method786(0, -super.anInt2323, 0);
				@Pc(106) Class3_Sub1_Sub1_Sub4[] local106 = new Class3_Sub1_Sub1_Sub4[] { local51, local86 };
				local51 = new Class3_Sub1_Sub1_Sub4(local106, 2, true);
			}
		}
		if (this.aClass3_Sub1_Sub17_1.anInt2516 == 1) {
			local51.aBoolean78 = true;
		}
		return local51;
	}

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method1552() {
		return this.aClass3_Sub1_Sub17_1 != null;
	}
}
