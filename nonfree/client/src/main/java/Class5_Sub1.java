import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public final class Class5_Sub1 extends Class5 {

	@OriginalMember(owner = "client!ac", name = "l", descriptor = "Z")
	private boolean aBoolean4 = false;

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Lclient!he;)V")
	public Class5_Sub1(@OriginalArg(0) Class144_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "(I)V")
	@Override
	public void method6865() {
		if (this.aBoolean4) {
			super.aClass144_Sub1_20.method5706(1);
			super.aClass144_Sub1_20.method5772(Static20.aClass170_1);
			super.aClass144_Sub1_20.method5653(Static345.aClass287_2, Static345.aClass287_2);
			super.aClass144_Sub1_20.method5740(Static216.aClass138_5, 2);
			super.aClass144_Sub1_20.method5779(0, Static308.aClass138_4);
			super.aClass144_Sub1_20.method5778();
			super.aClass144_Sub1_20.method5643((Interface25) null);
			super.aClass144_Sub1_20.method5706(0);
			this.aBoolean4 = false;
		} else {
			super.aClass144_Sub1_20.method5779(0, Static308.aClass138_4);
		}
		super.aClass144_Sub1_20.method5653(Static345.aClass287_2, Static345.aClass287_2);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IILclient!vi;)V")
	@Override
	public void method6877(@OriginalArg(0) int arg0, @OriginalArg(2) Interface25 arg1) {
		super.aClass144_Sub1_20.method5643(arg1);
		super.aClass144_Sub1_20.method5723(arg0);
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method6867() {
		return true;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZII)V")
	@Override
	public void method6864(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZI)V")
	@Override
	public void method6878(@OriginalArg(0) boolean arg0) {
		super.aClass144_Sub1_20.method5653(Static284.aClass287_1, Static345.aClass287_2);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IZ)V")
	@Override
	public void method6873(@OriginalArg(1) boolean arg0) {
		@Pc(18) Interface20 local18 = super.aClass144_Sub1_20.method5727();
		if (local18 == null || !arg0) {
			super.aClass144_Sub1_20.method5779(0, Static627.aClass138_6);
			return;
		}
		super.aClass144_Sub1_20.method5706(1);
		super.aClass144_Sub1_20.method5643(local18);
		super.aClass144_Sub1_20.method5772(Static181.aClass170_3);
		super.aClass144_Sub1_20.method5706(1);
		super.aClass144_Sub1_20.method5653(Static284.aClass287_1, Static448.aClass287_4);
		super.aClass144_Sub1_20.method5775(2, Static225.aClass138_3, true, false);
		super.aClass144_Sub1_20.method5779(0, Static627.aClass138_6);
		@Pc(79) Class263_Sub2 local79 = super.aClass144_Sub1_20.method5724();
		local79.method7295(super.aClass144_Sub1_20.method5758());
		super.aClass144_Sub1_20.method5750(Static323.aClass199_7);
		super.aClass144_Sub1_20.method5706(0);
		this.aBoolean4 = true;
	}
}
