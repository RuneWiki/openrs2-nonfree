import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mi")
public final class Class112 {

	@OriginalMember(owner = "client!mi", name = "f", descriptor = "I")
	public int anInt3398;

	@OriginalMember(owner = "client!mi", name = "k", descriptor = "I")
	public int anInt3402;

	@OriginalMember(owner = "client!mi", name = "l", descriptor = "Z")
	public boolean aBoolean275 = false;

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(ZII)Lclient!hk;")
	public Class71_Sub1 method2797(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(23) Class71_Sub1 local23 = (Class71_Sub1) Static285.aClass46_41.method1074((long) (this.anInt3398 | arg1 << 16 | (arg0 ? 262144 : 0)));
		if (local23 != null) {
			return local23;
		}
		Static291.aClass84_129.method2138(this.anInt3398);
		local23 = Static1.method5(Static291.aClass84_129, this.anInt3398);
		if (local23 != null) {
			local23.method1856(Static18.anInt458, Static241.anInt4879, Static99.anInt2194);
			local23.anInt5770 = local23.anInt5766;
			local23.anInt5769 = local23.anInt5767;
			if (arg0) {
				local23.method1854();
			}
			for (@Pc(74) int local74 = 0; local74 < arg1; local74++) {
				local23.method1853();
			}
			Static285.aClass46_41.method1071(local23, (long) ((arg0 ? 262144 : 0) | arg1 << 16 | this.anInt3398));
		}
		return local23;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IILclient!wm;)V")
	public void method2798(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub26 arg1) {
		while (true) {
			@Pc(10) int local10 = arg1.method4261();
			if (local10 == 0) {
				return;
			}
			this.method2800(local10, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(ILclient!wm;II)V")
	private void method2800(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub26 arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 1) {
			this.anInt3398 = arg1.method4242();
		} else if (arg0 == 2) {
			this.anInt3402 = arg1.method4245();
		} else if (arg0 == 3) {
			this.aBoolean275 = true;
		} else if (arg0 == 4) {
			this.anInt3398 = -1;
		}
	}
}
