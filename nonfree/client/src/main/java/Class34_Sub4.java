import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nh")
public final class Class34_Sub4 extends Class34 {

	@OriginalMember(owner = "client!nh", name = "n", descriptor = "Z")
	private boolean aBoolean453 = false;

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Lclient!gj;)V")
	public Class34_Sub4(@OriginalArg(0) Class90_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!nh", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method7276() {
		return true;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!ek;IB)V")
	@Override
	public void method7277(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) int arg1) {
		super.aClass90_Sub3_19.method7624(arg0);
		super.aClass90_Sub3_19.method7620(arg1);
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(IZ)V")
	@Override
	public void method7271(@OriginalArg(1) boolean arg0) {
		super.aClass90_Sub3_19.method7570(Static547.aClass214_5, Static140.aClass214_2);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(III)V")
	@Override
	public void method7275(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Z)V")
	@Override
	public void method7282() {
		if (this.aBoolean453) {
			super.aClass90_Sub3_19.method7609(1);
			super.aClass90_Sub3_19.method7655(Static386.aClass168_3);
			super.aClass90_Sub3_19.method7570(Static547.aClass214_5, Static547.aClass214_5);
			super.aClass90_Sub3_19.method7540(2, Static20.aClass150_1);
			super.aClass90_Sub3_19.method7630(Static393.aClass150_6, 0);
			super.aClass90_Sub3_19.method7576();
			super.aClass90_Sub3_19.method7624(null);
			super.aClass90_Sub3_19.method7609(0);
			this.aBoolean453 = false;
		} else {
			super.aClass90_Sub3_19.method7630(Static393.aClass150_6, 0);
		}
		super.aClass90_Sub3_19.method7570(Static547.aClass214_5, Static547.aClass214_5);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7269(@OriginalArg(1) boolean arg0) {
		@Pc(12) Interface10 local12 = super.aClass90_Sub3_19.method7661();
		if (local12 == null || !arg0) {
			super.aClass90_Sub3_19.method7630(Static412.aClass150_8, 0);
			return;
		}
		super.aClass90_Sub3_19.method7609(1);
		super.aClass90_Sub3_19.method7624(local12);
		super.aClass90_Sub3_19.method7655(Static240.aClass168_2);
		super.aClass90_Sub3_19.method7609(1);
		super.aClass90_Sub3_19.method7570(Static458.aClass214_3, Static140.aClass214_2);
		super.aClass90_Sub3_19.method7557(false, Static422.aClass150_7, true, 2);
		super.aClass90_Sub3_19.method7630(Static412.aClass150_8, 0);
		@Pc(72) Class93_Sub3 local72 = super.aClass90_Sub3_19.method7585();
		local72.method3775(super.aClass90_Sub3_19.method7568());
		super.aClass90_Sub3_19.method7580(Static524.aClass172_8);
		super.aClass90_Sub3_19.method7609(0);
		this.aBoolean453 = true;
	}
}
