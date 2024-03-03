import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public final class Class33_Sub3 extends Class33 {

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(Lclient!bf;)V", line = 3)
	public Class33_Sub3(@OriginalArg(0) Class19_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "()Z", line = 7)
	@Override
	public boolean method5712() {
		return true;
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(Z)V", line = 14)
	@Override
	public void method5715(@OriginalArg(0) boolean arg0) {
		this.aClass19_Sub1_35.method800(true);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V", line = 20)
	@Override
	public void method5713(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Z)V", line = 22)
	@Override
	public void method5714(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!kq;)V", line = 25)
	@Override
	public void method5711(@OriginalArg(0) Class8 arg0) {
		this.aClass19_Sub1_35.method848(arg0);
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "()V", line = 32)
	@Override
	public void method5716() {
		this.aClass19_Sub1_35.method800(false);
	}
}
