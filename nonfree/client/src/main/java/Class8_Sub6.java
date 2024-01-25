import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public final class Class8_Sub6 extends Class8 {

	@OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(Lclient!qi;)V")
	public Class8_Sub6(@OriginalArg(0) Class82_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(Z)V")
	@Override
	public void method4896(@OriginalArg(0) boolean arg0) {
		this.aClass82_Sub2_34.method4615(true);
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "()Z")
	@Override
	public boolean method4892() {
		return true;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V")
	@Override
	public void method4895(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "()V")
	@Override
	public void method4893() {
		this.aClass82_Sub2_34.method4615(false);
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lclient!et;)V")
	@Override
	public void method4894(@OriginalArg(0) Class7 arg0) {
		this.aClass82_Sub2_34.method4614(arg0);
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(Z)V")
	@Override
	public void method4891(@OriginalArg(0) boolean arg0) {
	}
}
