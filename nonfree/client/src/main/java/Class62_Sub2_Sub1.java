import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ha")
public final class Class62_Sub2_Sub1 extends Class62_Sub2 {

	@OriginalMember(owner = "client!ha", name = "C", descriptor = "I")
	public int anInt2536;

	@OriginalMember(owner = "client!ha", name = "D", descriptor = "I")
	public int anInt2537;

	@OriginalMember(owner = "client!ha", name = "I", descriptor = "I")
	public int anInt2541;

	@OriginalMember(owner = "client!ha", name = "L", descriptor = "I")
	public int anInt2544;

	@OriginalMember(owner = "client!ha", name = "y", descriptor = "I")
	public int anInt2533 = -1;

	@OriginalMember(owner = "client!ha", name = "x", descriptor = "I")
	public int anInt2532 = -1;

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(BLclient!ae;)Lclient!jg;")
	@Override
	public Class55_Sub3 method5568(@OriginalArg(1) Class4 arg0) {
		@Pc(6) Class133 local6 = arg0.method4244();
		local6.method4324(super.anInt2524, super.anInt2529, super.anInt2527);
		@Pc(18) Class55_Sub3 local18 = Static241.method4172(3);
		@Pc(39) Class7 local39;
		if (this.anInt2532 != -1) {
			local39 = Static282.method5080(this.anInt2532).method5867(null, -1, this.anInt2544, 0, 1024, null, 0, arg0);
			if (local39 != null) {
				local39.method1441(local6, local18.aClass55_Sub4Array1[2], 0);
			}
		}
		if (this.anInt2533 != -1) {
			local39 = Static282.method5080(this.anInt2533).method5867(null, -1, this.anInt2541, 0, 1024, null, 0, arg0);
			if (local39 != null) {
				local39.method1441(local6, local18.aClass55_Sub4Array1[1], 0);
			}
		}
		local39 = Static282.method5080(this.anInt2537).method5867(null, -1, this.anInt2536, 0, 1024, null, 0, arg0);
		if (local39 != null) {
			local39.method1441(local6, local18.aClass55_Sub4Array1[0], 0);
		}
		return local18;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILclient!ae;II)Z")
	@Override
	public boolean method5565(@OriginalArg(0) int arg0, @OriginalArg(1) Class4 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class133 local6 = arg1.method4244();
		local6.method4324(super.anInt2524, super.anInt2529, super.anInt2527);
		@Pc(32) Class7 local32 = Static282.method5080(this.anInt2537).method5867(null, -1, this.anInt2536, 0, 65536, null, 0, arg1);
		if (local32 != null && local32.method1407(arg0, arg2, local6, true)) {
			return true;
		}
		if (this.anInt2533 != -1) {
			local32 = Static282.method5080(this.anInt2533).method5867(null, -1, this.anInt2541, 0, 65536, null, 0, arg1);
			if (local32 != null && local32.method1407(arg0, arg2, local6, true)) {
				return true;
			}
		}
		if (this.anInt2532 != -1) {
			local32 = Static282.method5080(this.anInt2532).method5867(null, -1, this.anInt2544, 0, 65536, null, 0, arg1);
			if (local32 != null && local32.method1407(arg0, arg2, local6, true)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!ae;B)V")
	@Override
	public void method5567(@OriginalArg(0) Class4 arg0) {
	}
}
