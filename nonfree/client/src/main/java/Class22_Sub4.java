import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public final class Class22_Sub4 extends Class22 {

	@OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Lclient!hj;)V")
	public Class22_Sub4(@OriginalArg(0) Class2_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lclient!nj;)V")
	@Override
	public void method5718(@OriginalArg(0) Class18 arg0) {
		this.aClass2_Sub1_41.method2376(arg0);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V")
	@Override
	public void method5714(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "()Z")
	@Override
	public boolean method5719() {
		return true;
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(Z)V")
	@Override
	public void method5716(@OriginalArg(0) boolean arg0) {
		this.aClass2_Sub1_41.method2355(true);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Z)V")
	@Override
	public void method5715(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "()V")
	@Override
	public void method5717() {
		this.aClass2_Sub1_41.method2355(false);
	}
}
