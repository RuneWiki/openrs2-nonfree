import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dfa")
public final class Class10_Sub3_Sub1 extends Class10_Sub3 {

	@OriginalMember(owner = "client!dfa", name = "s", descriptor = "I")
	public int anInt2350;

	@OriginalMember(owner = "client!dfa", name = "t", descriptor = "I")
	public int anInt2351;

	@OriginalMember(owner = "client!dfa", name = "u", descriptor = "I")
	public int anInt2352;

	@OriginalMember(owner = "client!dfa", name = "A", descriptor = "I")
	public int anInt2357;

	@OriginalMember(owner = "client!dfa", name = "m", descriptor = "I")
	public int anInt2346 = -1;

	@OriginalMember(owner = "client!dfa", name = "o", descriptor = "I")
	public int anInt2348 = -1;

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(BLclient!oa;)Lclient!pe;")
	@Override
	public Class26_Sub6 method7727(@OriginalArg(1) Class66 arg0) {
		@Pc(6) Class134 local6 = arg0.method6842();
		local6.GA(super.anInt2337, super.anInt2343 - 10, super.anInt2340);
		@Pc(20) Class26_Sub6 local20 = Static292.method4579(3);
		@Pc(42) Class9 local42;
		if (this.anInt2346 != -1) {
			local42 = Static195.aClass99_1.method2798(this.anInt2346).method4921(null, arg0, 0, 2048, null, this.anInt2351, -1, 0);
			if (local42 != null) {
				local42.method4023(local6, local20.aClass26_Sub5Array1[2], 0);
			}
		}
		if (this.anInt2348 != -1) {
			local42 = Static195.aClass99_1.method2798(this.anInt2348).method4921(null, arg0, 0, 2048, null, this.anInt2357, -1, 0);
			if (local42 != null) {
				local42.method4023(local6, local20.aClass26_Sub5Array1[1], 0);
			}
		}
		local42 = Static195.aClass99_1.method2798(this.anInt2352).method4921(null, arg0, 0, 2048, null, this.anInt2350, -1, 0);
		if (local42 != null) {
			local42.method4023(local6, local20.aClass26_Sub5Array1[0], 0);
		}
		return local20;
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(BILclient!oa;I)Z")
	@Override
	public boolean method7728(@OriginalArg(1) int arg0, @OriginalArg(2) Class66 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class134 local6 = arg1.method6842();
		local6.GA(super.anInt2337, super.anInt2343, super.anInt2340);
		@Pc(31) Class9 local31 = Static195.aClass99_1.method2798(this.anInt2352).method4921(null, arg1, 0, 131072, null, this.anInt2350, -1, 0);
		if (local31 != null && local31.method4007(arg2, arg0, local6, true)) {
			return true;
		}
		if (this.anInt2348 != -1) {
			local31 = Static195.aClass99_1.method2798(this.anInt2348).method4921(null, arg1, 0, 131072, null, this.anInt2357, -1, 0);
			if (local31 != null && local31.method4007(arg2, arg0, local6, true)) {
				return true;
			}
		}
		if (this.anInt2346 != -1) {
			local31 = Static195.aClass99_1.method2798(this.anInt2346).method4921(null, arg1, 0, 131072, null, this.anInt2351, -1, 0);
			if (local31 != null && local31.method4007(arg2, arg0, local6, true)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(Lclient!oa;Z)V")
	@Override
	public void method7729(@OriginalArg(0) Class66 arg0) {
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(ILclient!oa;)Lclient!dd;")
	@Override
	public Class68 method7731(@OriginalArg(1) Class66 arg0) {
		return null;
	}
}
