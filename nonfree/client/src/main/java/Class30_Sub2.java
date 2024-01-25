import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public final class Class30_Sub2 extends Class30 {

	@OriginalMember(owner = "client!d", name = "<init>", descriptor = "(Lclient!nm;)V")
	public Class30_Sub2(@OriginalArg(0) Class164_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(Z)V")
	@Override
	public void method4846(@OriginalArg(0) boolean arg0) {
		this.aClass164_Sub1_39.method3593(true);
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "()Z")
	@Override
	public boolean method4843() {
		return true;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!ap;)V")
	@Override
	public void method4847(@OriginalArg(0) Class15 arg0) {
		this.aClass164_Sub1_39.method3603(arg0);
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Z)V")
	@Override
	public void method4844(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V")
	@Override
	public void method4845(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "()V")
	@Override
	public void method4842() {
		this.aClass164_Sub1_39.method3593(false);
	}
}
