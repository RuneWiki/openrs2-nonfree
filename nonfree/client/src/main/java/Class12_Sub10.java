import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pv")
public final class Class12_Sub10 extends Class12 {

	@OriginalMember(owner = "client!pv", name = "x", descriptor = "F")
	private float aFloat149 = 0.0F;

	@OriginalMember(owner = "client!pv", name = "v", descriptor = "Lclient!j;")
	private final Class157 aClass157_5;

	@OriginalMember(owner = "client!pv", name = "<init>", descriptor = "(Lclient!cf;Lclient!j;)V")
	public Class12_Sub10(@OriginalArg(0) Class43_Sub1 arg0, @OriginalArg(1) Class157 arg1) {
		super(arg0);
		this.aClass157_5 = arg1;
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(BILclient!hw;)V")
	@Override
	public void method6840(@OriginalArg(1) int arg0, @OriginalArg(2) Interface11 arg1) {
		super.aClass43_Sub1_21.method4298(arg1);
	}

	@OriginalMember(owner = "client!pv", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method6846() {
		return this.aClass157_5.method3970();
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(ZB)V")
	@Override
	public void method6836(@OriginalArg(0) boolean arg0) {
		super.aClass43_Sub1_21.method4253(Static106.aClass37_2, Static587.aClass37_5);
	}

	@OriginalMember(owner = "client!pv", name = "b", descriptor = "(I)V")
	@Override
	public void method6842() {
		super.aClass43_Sub1_21.method4238(1);
		super.aClass43_Sub1_21.method4253(Static106.aClass37_2, Static106.aClass37_2);
		super.aClass43_Sub1_21.method4251(0, Static74.aClass252_1);
		super.aClass43_Sub1_21.method4241(0, Static74.aClass252_1);
		super.aClass43_Sub1_21.method4289(1);
		super.aClass43_Sub1_21.method4298(null);
		super.aClass43_Sub1_21.method4238(0);
		super.aClass43_Sub1_21.method4241(0, Static74.aClass252_1);
	}

	@OriginalMember(owner = "client!pv", name = "b", descriptor = "(ZB)V")
	@Override
	public void method6838(@OriginalArg(0) boolean arg0) {
		super.aClass43_Sub1_21.method4238(1);
		super.aClass43_Sub1_21.method4253(Static581.aClass37_4, Static587.aClass37_5);
		super.aClass43_Sub1_21.method4268(Static74.aClass252_1, true, false, 0);
		super.aClass43_Sub1_21.method4241(0, Static165.aClass252_3);
		super.aClass43_Sub1_21.method4289(0);
		super.aClass43_Sub1_21.method4238(0);
		super.aClass43_Sub1_21.method4266(-16777216);
		super.aClass43_Sub1_21.method4241(0, Static88.aClass252_2);
		this.method6844();
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(III)V")
	@Override
	public void method6845(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		super.aClass43_Sub1_21.method4238(1);
		if ((arg0 & 0x80) != 0) {
			super.aClass43_Sub1_21.method4298(null);
		} else if ((arg1 & 0x1) == 1) {
			if (this.aClass157_5.aBoolean343) {
				this.aFloat149 = (float) (super.aClass43_Sub1_21.anInt4808 % 4000) / 4000.0F;
				super.aClass43_Sub1_21.method4298(this.aClass157_5.anInterface9_2);
			} else {
				@Pc(66) int local66 = super.aClass43_Sub1_21.anInt4808 % 4000 * 16 / 4000;
				super.aClass43_Sub1_21.method4298(this.aClass157_5.anInterface10Array1[local66]);
			}
		} else if (this.aClass157_5.aBoolean343) {
			super.aClass43_Sub1_21.method4298(this.aClass157_5.anInterface9_2);
		} else {
			super.aClass43_Sub1_21.method4298(this.aClass157_5.anInterface10Array1[0]);
		}
		super.aClass43_Sub1_21.method4238(0);
	}

	@OriginalMember(owner = "client!pv", name = "c", descriptor = "(I)V")
	@Override
	public void method6844() {
		if (super.aClass43_Sub1_21.method4174() != 0) {
			return;
		}
		@Pc(9) Class109_Sub3 local9 = super.aClass43_Sub1_21.method4293();
		super.aClass43_Sub1_21.method4238(1);
		@Pc(19) Class109_Sub3 local19 = super.aClass43_Sub1_21.method4264();
		local19.M(local9);
		local19.method7106(0.125F, 1.0F, 0.125F);
		local19.method7113(0.0F, this.aFloat149, 0.0F);
		super.aClass43_Sub1_21.method4296(Static534.aClass174_31);
		super.aClass43_Sub1_21.method4238(0);
	}
}
