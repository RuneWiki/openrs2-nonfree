import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public final class Class87_Sub2 extends Class87 {

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(Lclient!ic;)V")
	public Class87_Sub2(@OriginalArg(0) Class48_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
	@Override
	public void method5871(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "()V")
	@Override
	public void method5874() {
		this.aClass48_Sub2_39.method2604(false);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!vd;)V")
	@Override
	public void method5870(@OriginalArg(0) Class81 arg0) {
		this.aClass48_Sub2_39.method2573(arg0);
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(Z)V")
	@Override
	public void method5875(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Z)V")
	@Override
	public void method5872(@OriginalArg(0) boolean arg0) {
		this.aClass48_Sub2_39.method2604(true);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "()Z")
	@Override
	public boolean method5873() {
		return true;
	}
}
