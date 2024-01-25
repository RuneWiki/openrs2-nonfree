import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ep")
public final class Class3_Sub4_Sub1 extends Class3_Sub4 {

	@OriginalMember(owner = "client!ep", name = "t", descriptor = "I")
	public int anInt2179;

	@OriginalMember(owner = "client!ep", name = "u", descriptor = "I")
	public int anInt2180;

	@OriginalMember(owner = "client!ep", name = "w", descriptor = "I")
	public int anInt2182;

	@OriginalMember(owner = "client!ep", name = "z", descriptor = "I")
	public int anInt2185;

	@OriginalMember(owner = "client!ep", name = "x", descriptor = "I")
	public int anInt2183 = -1;

	@OriginalMember(owner = "client!ep", name = "p", descriptor = "I")
	public int anInt2175 = -1;

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "(Lclient!eq;Z)Lclient!gl;")
	@Override
	public Class57_Sub2 method5936(@OriginalArg(0) Class66 arg0) {
		@Pc(14) Class5 local14 = arg0.method5064();
		local14.method3846(super.anInt2174, super.anInt2168, super.anInt2173);
		@Pc(26) Class57_Sub2 local26 = Static291.method4377(3);
		@Pc(48) Class224 local48;
		if (this.anInt2175 != -1) {
			local48 = Static380.aClass231_2.method5648(this.anInt2175).method72(2048, -1, null, 0, this.anInt2180, arg0, null, 0);
			if (local48 != null) {
				local48.method5798(local14, local26.aClass57_Sub5Array1[2], 0);
			}
		}
		if (this.anInt2183 != -1) {
			local48 = Static380.aClass231_2.method5648(this.anInt2183).method72(2048, -1, null, 0, this.anInt2185, arg0, null, 0);
			if (local48 != null) {
				local48.method5798(local14, local26.aClass57_Sub5Array1[1], 0);
			}
		}
		local48 = Static380.aClass231_2.method5648(this.anInt2182).method72(2048, -1, null, 0, this.anInt2179, arg0, null, 0);
		if (local48 != null) {
			local48.method5798(local14, local26.aClass57_Sub5Array1[0], 0);
		}
		return local26;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(ILclient!eq;BI)Z")
	@Override
	public boolean method5939(@OriginalArg(0) int arg0, @OriginalArg(1) Class66 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class5 local6 = arg1.method5064();
		local6.method3846(super.anInt2174, super.anInt2168, super.anInt2173);
		@Pc(39) Class224 local39 = Static380.aClass231_2.method5648(this.anInt2182).method72(131072, -1, null, 0, this.anInt2179, arg1, null, 0);
		if (local39 != null && local39.method5836(arg0, arg2, local6, true)) {
			return true;
		}
		if (this.anInt2183 != -1) {
			local39 = Static380.aClass231_2.method5648(this.anInt2183).method72(131072, -1, null, 0, this.anInt2185, arg1, null, 0);
			if (local39 != null && local39.method5836(arg0, arg2, local6, true)) {
				return true;
			}
		}
		if (this.anInt2175 != -1) {
			local39 = Static380.aClass231_2.method5648(this.anInt2175).method72(131072, -1, null, 0, this.anInt2180, arg1, null, 0);
			if (local39 != null && local39.method5836(arg0, arg2, local6, true)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lclient!eq;I)V")
	@Override
	public void method5937(@OriginalArg(0) Class66 arg0) {
	}
}
