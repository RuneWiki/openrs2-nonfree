import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kw")
public final class Class56_Sub6 extends Class56 {

	@OriginalMember(owner = "client!kw", name = "D", descriptor = "Z")
	private boolean aBoolean420 = false;

	@OriginalMember(owner = "client!kw", name = "<init>", descriptor = "(Lclient!en;)V")
	public Class56_Sub6(@OriginalArg(0) Class100_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7172() {
		return true;
	}

	@OriginalMember(owner = "client!kw", name = "d", descriptor = "(I)V")
	@Override
	public void method7183() {
		if (this.aBoolean420) {
			super.aClass100_Sub1_23.method4860(1);
			super.aClass100_Sub1_23.method4855(Static3.aClass280_1);
			super.aClass100_Sub1_23.method4797(Static458.aClass236_4, Static458.aClass236_4);
			super.aClass100_Sub1_23.method4883(2, Static224.aClass119_18);
			super.aClass100_Sub1_23.method4816(0, Static325.aClass119_44);
			super.aClass100_Sub1_23.method4804();
			super.aClass100_Sub1_23.method4876(null);
			super.aClass100_Sub1_23.method4860(0);
			this.aBoolean420 = false;
		} else {
			super.aClass100_Sub1_23.method4816(0, Static325.aClass119_44);
		}
		super.aClass100_Sub1_23.method4797(Static458.aClass236_4, Static458.aClass236_4);
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7174(@OriginalArg(1) boolean arg0) {
		@Pc(16) Interface20 local16 = super.aClass100_Sub1_23.method4845();
		if (local16 == null || !arg0) {
			super.aClass100_Sub1_23.method4816(0, Static113.aClass119_11);
			return;
		}
		super.aClass100_Sub1_23.method4860(1);
		super.aClass100_Sub1_23.method4876(local16);
		super.aClass100_Sub1_23.method4855(Static267.aClass280_2);
		super.aClass100_Sub1_23.method4860(1);
		super.aClass100_Sub1_23.method4797(Static583.aClass236_5, Static291.aClass236_2);
		super.aClass100_Sub1_23.method4875(false, Static48.aClass119_5, 2, true);
		super.aClass100_Sub1_23.method4816(0, Static113.aClass119_11);
		@Pc(65) Class68_Sub2 local65 = super.aClass100_Sub1_23.method4818();
		local65.method5098(super.aClass100_Sub1_23.method4880());
		super.aClass100_Sub1_23.method4758(Static65.aClass190_2);
		super.aClass100_Sub1_23.method4860(0);
		this.aBoolean420 = true;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7171(@OriginalArg(1) boolean arg0) {
		super.aClass100_Sub1_23.method4797(Static458.aClass236_4, Static291.aClass236_2);
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIB)V")
	@Override
	public void method7182(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(IILclient!hfa;)V")
	@Override
	public void method7178(@OriginalArg(0) int arg0, @OriginalArg(2) Interface10 arg1) {
		super.aClass100_Sub1_23.method4876(arg1);
		super.aClass100_Sub1_23.method4872(arg0);
	}
}
