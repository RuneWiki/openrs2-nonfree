import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public final class Class86_Sub4 extends Class86 {

	@OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(Lclient!mi;)V")
	public Class86_Sub4(@OriginalArg(0) Class155_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "(Z)V")
	@Override
	public void method5362(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)V")
	@Override
	public void method5359(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "()V")
	@Override
	public void method5361() {
		this.aClass155_Sub1_39.method3583(false);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "()Z")
	@Override
	public boolean method5358() {
		return true;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!bl;)V")
	@Override
	public void method5357(@OriginalArg(0) Class30 arg0) {
		this.aClass155_Sub1_39.method3585(arg0);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Z)V")
	@Override
	public void method5360(@OriginalArg(0) boolean arg0) {
		this.aClass155_Sub1_39.method3583(true);
	}
}
