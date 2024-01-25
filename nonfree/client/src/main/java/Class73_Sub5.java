import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kt")
public final class Class73_Sub5 extends Class73 {

	@OriginalMember(owner = "client!kt", name = "q", descriptor = "Z")
	private boolean aBoolean374 = false;

	@OriginalMember(owner = "client!kt", name = "<init>", descriptor = "(Lclient!bda;)V")
	public Class73_Sub5(@OriginalArg(0) Class4_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7561(@OriginalArg(1) boolean arg0) {
		super.aClass4_Sub2_19.method7270(Static428.aClass246_3, Static459.aClass246_5);
	}

	@OriginalMember(owner = "client!kt", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7569() {
		return true;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7567(@OriginalArg(1) boolean arg0) {
		@Pc(10) Interface11 local10 = super.aClass4_Sub2_19.method7353();
		if (local10 == null || !arg0) {
			super.aClass4_Sub2_19.method7330(Static503.aClass27_3, 0);
			return;
		}
		super.aClass4_Sub2_19.method7339(1);
		super.aClass4_Sub2_19.method7316(local10);
		super.aClass4_Sub2_19.method7248(Static145.aClass31_3);
		super.aClass4_Sub2_19.method7339(1);
		super.aClass4_Sub2_19.method7270(Static428.aClass246_3, Static449.aClass246_4);
		super.aClass4_Sub2_19.method7351(true, false, 2, Static226.aClass27_1);
		super.aClass4_Sub2_19.method7330(Static503.aClass27_3, 0);
		@Pc(71) Class128_Sub3 local71 = super.aClass4_Sub2_19.method7349();
		local71.method6889(super.aClass4_Sub2_19.method7337());
		super.aClass4_Sub2_19.method7272(Static470.aClass107_7);
		super.aClass4_Sub2_19.method7339(0);
		this.aBoolean374 = true;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(ILclient!hv;I)V")
	@Override
	public void method7568(@OriginalArg(0) int arg0, @OriginalArg(1) Interface8 arg1) {
		super.aClass4_Sub2_19.method7316(arg1);
		super.aClass4_Sub2_19.method7279(arg0);
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(Z)V")
	@Override
	public void method7562() {
		if (this.aBoolean374) {
			super.aClass4_Sub2_19.method7339(1);
			super.aClass4_Sub2_19.method7248(Static318.aClass31_4);
			super.aClass4_Sub2_19.method7270(Static459.aClass246_5, Static459.aClass246_5);
			super.aClass4_Sub2_19.method7277(2, Static319.aClass27_4);
			super.aClass4_Sub2_19.method7330(Static360.aClass27_5, 0);
			super.aClass4_Sub2_19.method7290();
			super.aClass4_Sub2_19.method7316(null);
			super.aClass4_Sub2_19.method7339(0);
			this.aBoolean374 = false;
		} else {
			super.aClass4_Sub2_19.method7330(Static360.aClass27_5, 0);
		}
		super.aClass4_Sub2_19.method7270(Static459.aClass246_5, Static459.aClass246_5);
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(III)V")
	@Override
	public void method7566(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
