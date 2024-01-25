import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qk")
public final class Class1_Sub5_Sub1 extends Class1_Sub5 {

	@OriginalMember(owner = "client!qk", name = "p", descriptor = "I")
	public int anInt5676;

	@OriginalMember(owner = "client!qk", name = "t", descriptor = "I")
	public int anInt5680;

	@OriginalMember(owner = "client!qk", name = "w", descriptor = "I")
	public int anInt5683;

	@OriginalMember(owner = "client!qk", name = "x", descriptor = "I")
	public int anInt5684;

	@OriginalMember(owner = "client!qk", name = "s", descriptor = "I")
	public int anInt5679 = -1;

	@OriginalMember(owner = "client!qk", name = "u", descriptor = "I")
	public int anInt5681 = -1;

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(ZLclient!qa;)V")
	@Override
	public void method6241(@OriginalArg(1) Class167 arg0) {
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILclient!qa;)Lclient!ou;")
	@Override
	public Class23_Sub5 method6242(@OriginalArg(1) Class167 arg0) {
		@Pc(6) Class11 local6 = arg0.method5989();
		local6.C(super.anInt5674, super.anInt5671, super.anInt5669);
		@Pc(18) Class23_Sub5 local18 = Static217.method1031(3);
		@Pc(40) Class108 local40;
		if (this.anInt5681 != -1) {
			local40 = Static158.aClass272_1.method6283(this.anInt5681).method4982(0, null, this.anInt5683, -1, null, 2048, 0, arg0);
			if (local40 != null) {
				local40.method4931(local6, local18.aClass23_Sub6Array1[2], 0);
			}
		}
		if (this.anInt5679 != -1) {
			local40 = Static158.aClass272_1.method6283(this.anInt5679).method4982(0, null, this.anInt5680, -1, null, 2048, 0, arg0);
			if (local40 != null) {
				local40.method4931(local6, local18.aClass23_Sub6Array1[1], 0);
			}
		}
		local40 = Static158.aClass272_1.method6283(this.anInt5684).method4982(0, null, this.anInt5676, -1, null, 2048, 0, arg0);
		if (local40 != null) {
			local40.method4931(local6, local18.aClass23_Sub6Array1[0], 0);
		}
		return local18;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(BIILclient!qa;)Z")
	@Override
	public boolean method6245(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class167 arg2) {
		@Pc(13) Class11 local13 = arg2.method5989();
		local13.C(super.anInt5674, super.anInt5671, super.anInt5669);
		@Pc(38) Class108 local38 = Static158.aClass272_1.method6283(this.anInt5684).method4982(0, null, this.anInt5676, -1, null, 131072, 0, arg2);
		if (local38 != null && local38.method4937(arg1, arg0, local13, true)) {
			return true;
		}
		if (this.anInt5679 != -1) {
			local38 = Static158.aClass272_1.method6283(this.anInt5679).method4982(0, null, this.anInt5680, -1, null, 131072, 0, arg2);
			if (local38 != null && local38.method4937(arg1, arg0, local13, true)) {
				return true;
			}
		}
		if (this.anInt5681 != -1) {
			local38 = Static158.aClass272_1.method6283(this.anInt5681).method4982(0, null, this.anInt5683, -1, null, 131072, 0, arg2);
			if (local38 != null && local38.method4937(arg1, arg0, local13, true)) {
				return true;
			}
		}
		return false;
	}
}
