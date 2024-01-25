import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public final class Class255 implements Interface2 {

	@OriginalMember(owner = "client!oi", name = "g", descriptor = "Lclient!mv;")
	private final Class229 aClass229_91;

	@OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Lclient!mv;)V")
	public Class255(@OriginalArg(0) Class229 arg0) {
		this.aClass229_91 = arg0;
	}

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "(B)Lclient!bl;")
	@Override
	public Class36 method6248() {
		return Static43.aClass36_2;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(B)I")
	@Override
	public int method6247() {
		return this.aClass229_91.method4983() ? 100 : this.aClass229_91.method4976();
	}
}
