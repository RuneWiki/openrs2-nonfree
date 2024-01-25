import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dp")
public final class Class4_Sub4_Sub1 extends Class4_Sub4 {

	@OriginalMember(owner = "client!dp", name = "n", descriptor = "I")
	public int anInt1813;

	@OriginalMember(owner = "client!dp", name = "o", descriptor = "I")
	public int anInt1814;

	@OriginalMember(owner = "client!dp", name = "r", descriptor = "I")
	public int anInt1817;

	@OriginalMember(owner = "client!dp", name = "A", descriptor = "I")
	public int anInt1824;

	@OriginalMember(owner = "client!dp", name = "q", descriptor = "I")
	public int anInt1816 = -1;

	@OriginalMember(owner = "client!dp", name = "y", descriptor = "I")
	public int anInt1823 = -1;

	@OriginalMember(owner = "client!dp", name = "b", descriptor = "(Lclient!oa;I)Lclient!qt;")
	@Override
	public Class277 method7781(@OriginalArg(0) Class14 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!dp", name = "b", descriptor = "(Lclient!oa;B)V")
	@Override
	public void method7786(@OriginalArg(0) Class14 arg0) {
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(BILclient!oa;I)Z")
	@Override
	public boolean method7784(@OriginalArg(1) int arg0, @OriginalArg(2) Class14 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class54 local6 = arg1.method6851();
		local6.GA(super.anInt1810, super.anInt1806, super.anInt1808);
		@Pc(39) Class20 local39 = Static444.aClass322_2.method7141(this.anInt1814).method5536(this.anInt1813, null, 0, 0, null, -1, 131072, arg1);
		if (local39 != null && local39.method7266(arg2, arg0, local6, true)) {
			return true;
		}
		if (this.anInt1816 != -1) {
			local39 = Static444.aClass322_2.method7141(this.anInt1816).method5536(this.anInt1824, null, 0, 0, null, -1, 131072, arg1);
			if (local39 != null && local39.method7266(arg2, arg0, local6, true)) {
				return true;
			}
		}
		if (this.anInt1823 != -1) {
			local39 = Static444.aClass322_2.method7141(this.anInt1823).method5536(this.anInt1817, null, 0, 0, null, -1, 131072, arg1);
			if (local39 != null && local39.method7266(arg2, arg0, local6, true)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(ILclient!oa;)Lclient!ww;")
	@Override
	public Class98_Sub8 method7788(@OriginalArg(1) Class14 arg0) {
		@Pc(6) Class54 local6 = arg0.method6851();
		local6.GA(super.anInt1810, super.anInt1806 - 10, super.anInt1808);
		@Pc(20) Class98_Sub8 local20 = Static348.method5326(3);
		@Pc(46) Class20 local46;
		if (this.anInt1823 != -1) {
			local46 = Static444.aClass322_2.method7141(this.anInt1823).method5536(this.anInt1817, null, 0, 0, null, -1, 2048, arg0);
			if (local46 != null) {
				local46.method7256(local6, local20.aClass98_Sub5Array1[2], 0);
			}
		}
		if (this.anInt1816 != -1) {
			local46 = Static444.aClass322_2.method7141(this.anInt1816).method5536(this.anInt1824, null, 0, 0, null, -1, 2048, arg0);
			if (local46 != null) {
				local46.method7256(local6, local20.aClass98_Sub5Array1[1], 0);
			}
		}
		local46 = Static444.aClass322_2.method7141(this.anInt1814).method5536(this.anInt1813, null, 0, 0, null, -1, 2048, arg0);
		if (local46 != null) {
			local46.method7256(local6, local20.aClass98_Sub5Array1[0], 0);
		}
		return local20;
	}
}
