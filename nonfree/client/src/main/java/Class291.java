import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public final class Class291 implements Interface19 {

	@OriginalMember(owner = "client!s", name = "a", descriptor = "Lclient!pe;")
	private final Class254 aClass254_119;

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "(Lclient!pe;)V")
	public Class291(@OriginalArg(0) Class254 arg0) {
		this.aClass254_119 = arg0;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(I)Lclient!ev;")
	@Override
	public Class92 method8137() {
		return Static126.aClass92_1;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Z)I")
	@Override
	public int method8138() {
		return this.aClass254_119.method6412() ? 100 : this.aClass254_119.method6404();
	}
}
