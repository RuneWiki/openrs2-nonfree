import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public final class Class29_Sub4 extends Class29 {

	@OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(Lclient!h;)V")
	public Class29_Sub4(@OriginalArg(0) Class32_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ms", name = "b", descriptor = "()V")
	@Override
	public void method5175() {
		this.aClass32_Sub2_39.method2309(false);
	}

	@OriginalMember(owner = "client!ms", name = "b", descriptor = "(Z)V")
	@Override
	public void method5173(@OriginalArg(0) boolean arg0) {
		this.aClass32_Sub2_39.method2309(true);
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(Lclient!sd;)V")
	@Override
	public void method5174(@OriginalArg(0) Class20 arg0) {
		this.aClass32_Sub2_39.method2287(arg0);
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(I)V")
	@Override
	public void method5176(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "()Z")
	@Override
	public boolean method5171() {
		return true;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(Z)V")
	@Override
	public void method5172(@OriginalArg(0) boolean arg0) {
	}
}
