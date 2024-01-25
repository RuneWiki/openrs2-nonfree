import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public final class Class11_Sub4 extends Class11 {

	@OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Lclient!ig;)V")
	public Class11_Sub4(@OriginalArg(0) Class47_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "()Z")
	@Override
	public boolean method4747() {
		return true;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lclient!ee;)V")
	@Override
	public void method4746(@OriginalArg(0) Class52 arg0) {
		this.aClass47_Sub2_33.method2772(arg0);
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(Z)V")
	@Override
	public void method4749(@OriginalArg(0) boolean arg0) {
		this.aClass47_Sub2_33.method2766(true);
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Z)V")
	@Override
	public void method4748(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(I)V")
	@Override
	public void method4750(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "()V")
	@Override
	public void method4751() {
		this.aClass47_Sub2_33.method2766(false);
	}
}
