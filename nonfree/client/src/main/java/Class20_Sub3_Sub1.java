import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cg")
public final class Class20_Sub3_Sub1 extends Class20_Sub3 {

	@OriginalMember(owner = "client!cg", name = "v", descriptor = "I")
	public int anInt1466;

	@OriginalMember(owner = "client!cg", name = "x", descriptor = "I")
	public int anInt1468;

	@OriginalMember(owner = "client!cg", name = "y", descriptor = "I")
	public int anInt1469;

	@OriginalMember(owner = "client!cg", name = "G", descriptor = "I")
	public int anInt1477;

	@OriginalMember(owner = "client!cg", name = "w", descriptor = "I")
	public int anInt1467 = -1;

	@OriginalMember(owner = "client!cg", name = "C", descriptor = "I")
	public int anInt1473 = -1;

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method8030(@OriginalArg(1) Class4 arg0) {
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(ILclient!qa;)Lclient!so;")
	@Override
	public Class271 method8031(@OriginalArg(1) Class4 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "(ILclient!qa;)Lclient!oj;")
	@Override
	public Class46_Sub6 method8039(@OriginalArg(1) Class4 arg0) {
		@Pc(6) Class128 local6 = arg0.method7165();
		local6.oa(super.anInt1461, super.anInt1457, super.anInt1459);
		@Pc(18) Class46_Sub6 local18 = Static490.method7528(3);
		@Pc(39) Class97 local39;
		if (this.anInt1473 != -1) {
			local39 = Static181.aClass316_1.method8107(this.anInt1473).method4981(2048, -1, null, null, 0, 0, arg0, this.anInt1469);
			if (local39 != null) {
				local39.method6773(local6, local18.aClass46_Sub1Array1[2], 0);
			}
		}
		if (this.anInt1467 != -1) {
			local39 = Static181.aClass316_1.method8107(this.anInt1467).method4981(2048, -1, null, null, 0, 0, arg0, this.anInt1477);
			if (local39 != null) {
				local39.method6773(local6, local18.aClass46_Sub1Array1[1], 0);
			}
		}
		local39 = Static181.aClass316_1.method8107(this.anInt1466).method4981(2048, -1, null, null, 0, 0, arg0, this.anInt1468);
		if (local39 != null) {
			local39.method6773(local6, local18.aClass46_Sub1Array1[0], 0);
		}
		return local18;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(ILclient!qa;II)Z")
	@Override
	public boolean method8037(@OriginalArg(1) Class4 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class128 local11 = arg0.method7165();
		local11.oa(super.anInt1461, super.anInt1457, super.anInt1459);
		@Pc(36) Class97 local36 = Static181.aClass316_1.method8107(this.anInt1466).method4981(131072, -1, null, null, 0, 0, arg0, this.anInt1468);
		if (local36 != null && local36.method6785(arg1, arg2, local11, true)) {
			return true;
		}
		if (this.anInt1467 != -1) {
			local36 = Static181.aClass316_1.method8107(this.anInt1467).method4981(131072, -1, null, null, 0, 0, arg0, this.anInt1477);
			if (local36 != null && local36.method6785(arg1, arg2, local11, true)) {
				return true;
			}
		}
		if (this.anInt1473 != -1) {
			local36 = Static181.aClass316_1.method8107(this.anInt1473).method4981(131072, -1, null, null, 0, 0, arg0, this.anInt1469);
			if (local36 != null && local36.method6785(arg1, arg2, local11, true)) {
				return true;
			}
		}
		return false;
	}
}
