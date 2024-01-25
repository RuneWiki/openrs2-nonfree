import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public final class Class54_Sub6 extends Class54 {

	@OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(Lclient!ge;)V")
	public Class54_Sub6(@OriginalArg(0) Class81_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "()V")
	@Override
	public void method5298() {
		this.aClass81_Sub1_37.method1951(false);
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(Lclient!mo;)V")
	@Override
	public void method5296(@OriginalArg(0) Class28 arg0) {
		this.aClass81_Sub1_37.method2022(arg0);
	}

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "(Z)V")
	@Override
	public void method5299(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "()Z")
	@Override
	public boolean method5295() {
		return true;
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(I)V")
	@Override
	public void method5300(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(Z)V")
	@Override
	public void method5297(@OriginalArg(0) boolean arg0) {
		this.aClass81_Sub1_37.method1951(true);
	}
}
