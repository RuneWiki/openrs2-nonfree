import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dm")
public final class Class12_Sub2 extends Class12 {

	@OriginalMember(owner = "client!dm", name = "x", descriptor = "Z")
	private boolean aBoolean193 = false;

	@OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(Lclient!cf;)V")
	public Class12_Sub2(@OriginalArg(0) Class43_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "(ZB)V")
	@Override
	public void method6838(@OriginalArg(0) boolean arg0) {
		@Pc(15) Interface20 local15 = super.aClass43_Sub1_21.method4302();
		if (local15 == null || !arg0) {
			super.aClass43_Sub1_21.method4241(0, Static525.aClass252_4);
			return;
		}
		super.aClass43_Sub1_21.method4238(1);
		super.aClass43_Sub1_21.method4298(local15);
		super.aClass43_Sub1_21.method4297(Static390.aClass307_4);
		super.aClass43_Sub1_21.method4238(1);
		super.aClass43_Sub1_21.method4253(Static474.aClass37_3, Static587.aClass37_5);
		super.aClass43_Sub1_21.method4268(Static165.aClass252_3, true, false, 2);
		super.aClass43_Sub1_21.method4241(0, Static525.aClass252_4);
		@Pc(68) Class109_Sub3 local68 = super.aClass43_Sub1_21.method4264();
		local68.method7104(super.aClass43_Sub1_21.method4277());
		super.aClass43_Sub1_21.method4296(Static233.aClass174_24);
		super.aClass43_Sub1_21.method4238(0);
		this.aBoolean193 = true;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(III)V")
	@Override
	public void method6845(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "(I)V")
	@Override
	public void method6842() {
		if (this.aBoolean193) {
			super.aClass43_Sub1_21.method4238(1);
			super.aClass43_Sub1_21.method4297(Static54.aClass307_2);
			super.aClass43_Sub1_21.method4253(Static106.aClass37_2, Static106.aClass37_2);
			super.aClass43_Sub1_21.method4251(2, Static88.aClass252_2);
			super.aClass43_Sub1_21.method4241(0, Static74.aClass252_1);
			super.aClass43_Sub1_21.method4235();
			super.aClass43_Sub1_21.method4298(null);
			super.aClass43_Sub1_21.method4238(0);
			this.aBoolean193 = false;
		} else {
			super.aClass43_Sub1_21.method4241(0, Static74.aClass252_1);
		}
		super.aClass43_Sub1_21.method4253(Static106.aClass37_2, Static106.aClass37_2);
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(ZB)V")
	@Override
	public void method6836(@OriginalArg(0) boolean arg0) {
		super.aClass43_Sub1_21.method4253(Static106.aClass37_2, Static587.aClass37_5);
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(BILclient!hw;)V")
	@Override
	public void method6840(@OriginalArg(1) int arg0, @OriginalArg(2) Interface11 arg1) {
		super.aClass43_Sub1_21.method4298(arg1);
		super.aClass43_Sub1_21.method4183(arg0);
	}

	@OriginalMember(owner = "client!dm", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method6846() {
		return true;
	}
}
