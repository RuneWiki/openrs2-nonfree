import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jr")
public final class Class44_Sub2_Sub1 extends Class44_Sub2 {

	@OriginalMember(owner = "client!jr", name = "A", descriptor = "I")
	public int anInt2911;

	@OriginalMember(owner = "client!jr", name = "H", descriptor = "I")
	public int anInt2917;

	@OriginalMember(owner = "client!jr", name = "I", descriptor = "I")
	public int anInt2918;

	@OriginalMember(owner = "client!jr", name = "N", descriptor = "I")
	public int anInt2922;

	@OriginalMember(owner = "client!jr", name = "C", descriptor = "I")
	public int anInt2912 = -1;

	@OriginalMember(owner = "client!jr", name = "D", descriptor = "I")
	public int anInt2913 = -1;

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(BLclient!ja;)Lclient!kh;")
	@Override
	public Class20_Sub6 method5779(@OriginalArg(1) Class81 arg0) {
		@Pc(6) Class72 local6 = arg0.method2990();
		local6.method4067(super.anInt2897, super.anInt2905, super.anInt2900);
		@Pc(18) Class20_Sub6 local18 = Static208.method5776(3);
		@Pc(39) Class78 local39;
		if (this.anInt2912 != -1) {
			local39 = Static211.method3762(this.anInt2912).method3852(null, 0, 0, -1, 1024, null, arg0, this.anInt2911);
			if (local39 != null) {
				local39.method4649(local6, local18.aClass20_Sub8Array1[2], 0);
			}
		}
		if (this.anInt2913 != -1) {
			local39 = Static211.method3762(this.anInt2913).method3852(null, 0, 0, -1, 1024, null, arg0, this.anInt2918);
			if (local39 != null) {
				local39.method4649(local6, local18.aClass20_Sub8Array1[1], 0);
			}
		}
		local39 = Static211.method3762(this.anInt2917).method3852(null, 0, 0, -1, 1024, null, arg0, this.anInt2922);
		if (local39 != null) {
			local39.method4649(local6, local18.aClass20_Sub8Array1[0], 0);
		}
		return local18;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(ILclient!ja;)V")
	@Override
	public void method5775(@OriginalArg(1) Class81 arg0) {
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(ILclient!ja;II)Z")
	@Override
	public boolean method5778(@OriginalArg(0) int arg0, @OriginalArg(1) Class81 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class72 local6 = arg1.method2990();
		local6.method4067(super.anInt2897, super.anInt2905, super.anInt2900);
		@Pc(30) Class78 local30 = Static211.method3762(this.anInt2917).method3852(null, 0, 0, -1, 65536, null, arg1, this.anInt2922);
		if (local30 != null && local30.method4644(arg2, arg0, local6, true)) {
			return true;
		}
		if (this.anInt2913 != -1) {
			local30 = Static211.method3762(this.anInt2913).method3852(null, 0, 0, -1, 65536, null, arg1, this.anInt2918);
			if (local30 != null && local30.method4644(arg2, arg0, local6, true)) {
				return true;
			}
		}
		if (this.anInt2912 != -1) {
			local30 = Static211.method3762(this.anInt2912).method3852(null, 0, 0, -1, 65536, null, arg1, this.anInt2911);
			if (local30 != null && local30.method4644(arg2, arg0, local6, true)) {
				return true;
			}
		}
		return false;
	}
}
