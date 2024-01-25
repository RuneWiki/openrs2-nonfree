import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public final class Class7_Sub2 extends Class7 {

	@OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(Lclient!fu;)V")
	public Class7_Sub2(@OriginalArg(0) Class63_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "()Z")
	@Override
	public boolean method5473() {
		return true;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lclient!tp;)V")
	@Override
	public void method5475(@OriginalArg(0) Class20 arg0) {
		this.aClass63_Sub2_41.method2068(arg0);
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "()V")
	@Override
	public void method5472() {
		this.aClass63_Sub2_41.method2079(false);
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)V")
	@Override
	public void method5474(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Z)V")
	@Override
	public void method5471(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(Z)V")
	@Override
	public void method5476(@OriginalArg(0) boolean arg0) {
		this.aClass63_Sub2_41.method2079(true);
	}
}
