import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vda")
public final class Class22_Sub8 extends Class22 {

	@OriginalMember(owner = "client!vda", name = "k", descriptor = "Z")
	private boolean aBoolean713 = false;

	@OriginalMember(owner = "client!vda", name = "<init>", descriptor = "(Lclient!kea;)V")
	public Class22_Sub8(@OriginalArg(0) Class14_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(BILclient!gl;)V")
	@Override
	public void method7645(@OriginalArg(1) int arg0, @OriginalArg(2) Interface10 arg1) {
		super.aClass14_Sub2_20.method7034(arg1);
		super.aClass14_Sub2_20.method7011(arg0);
	}

	@OriginalMember(owner = "client!vda", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7647() {
		return true;
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7642(@OriginalArg(1) boolean arg0) {
		super.aClass14_Sub2_20.method6935(Static568.aClass228_14, Static41.aClass228_10);
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7646(@OriginalArg(0) boolean arg0) {
		@Pc(8) Interface19 local8 = super.aClass14_Sub2_20.method7015();
		if (local8 == null || !arg0) {
			super.aClass14_Sub2_20.method6968(Static89.aClass138_1, 0);
			return;
		}
		super.aClass14_Sub2_20.method6954(1);
		super.aClass14_Sub2_20.method7034(local8);
		super.aClass14_Sub2_20.method6946(Static338.aClass215_3);
		super.aClass14_Sub2_20.method6954(1);
		super.aClass14_Sub2_20.method6935(Static568.aClass228_14, Static581.aClass228_15);
		super.aClass14_Sub2_20.method6996(true, Static457.aClass138_4, false, 2);
		super.aClass14_Sub2_20.method6968(Static89.aClass138_1, 0);
		@Pc(67) Class54_Sub3 local67 = super.aClass14_Sub2_20.method7020();
		local67.method5449(super.aClass14_Sub2_20.method6940());
		super.aClass14_Sub2_20.method7023(Static483.aClass280_8);
		super.aClass14_Sub2_20.method6954(0);
		this.aBoolean713 = true;
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(I)V")
	@Override
	public void method7643() {
		if (this.aBoolean713) {
			super.aClass14_Sub2_20.method6954(1);
			super.aClass14_Sub2_20.method6946(Static458.aClass215_4);
			super.aClass14_Sub2_20.method6935(Static41.aClass228_10, Static41.aClass228_10);
			super.aClass14_Sub2_20.method6912(Static113.aClass138_2, 2);
			super.aClass14_Sub2_20.method6968(Static185.aClass138_3, 0);
			super.aClass14_Sub2_20.method7002();
			super.aClass14_Sub2_20.method7034(null);
			super.aClass14_Sub2_20.method6954(0);
			this.aBoolean713 = false;
		} else {
			super.aClass14_Sub2_20.method6968(Static185.aClass138_3, 0);
		}
		super.aClass14_Sub2_20.method6935(Static41.aClass228_10, Static41.aClass228_10);
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(III)V")
	@Override
	public void method7654(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
