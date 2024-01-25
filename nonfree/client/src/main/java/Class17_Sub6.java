import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public final class Class17_Sub6 extends Class17 {

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Lclient!sq;)V")
	public Class17_Sub6(@OriginalArg(0) Class46_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V")
	@Override
	public void method5300(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Z)V")
	@Override
	public void method5297(@OriginalArg(0) boolean arg0) {
		this.aClass46_Sub2_37.method5214(true);
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(Z)V")
	@Override
	public void method5301(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "()V")
	@Override
	public void method5299() {
		this.aClass46_Sub2_37.method5214(false);
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!od;)V")
	@Override
	public void method5302(@OriginalArg(0) Class8 arg0) {
		this.aClass46_Sub2_37.method5251(arg0);
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "()Z")
	@Override
	public boolean method5298() {
		return true;
	}
}
