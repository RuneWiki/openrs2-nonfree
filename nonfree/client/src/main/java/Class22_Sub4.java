import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public final class Class22_Sub4 extends Class22 {

	@OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(Lclient!tb;)V")
	public Class22_Sub4(@OriginalArg(0) Class129_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(Lclient!ue;)V")
	@Override
	public void method4343(@OriginalArg(0) Class56 arg0) {
		this.aClass129_Sub2_32.method5084(arg0);
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(Z)V")
	@Override
	public void method4338(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "()Z")
	@Override
	public boolean method4341() {
		return true;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(I)V")
	@Override
	public void method4339(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "(Z)V")
	@Override
	public void method4340(@OriginalArg(0) boolean arg0) {
		this.aClass129_Sub2_32.method5052(true);
	}

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "()V")
	@Override
	public void method4342() {
		this.aClass129_Sub2_32.method5052(false);
	}
}
