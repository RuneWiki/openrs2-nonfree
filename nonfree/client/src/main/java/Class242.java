import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public final class Class242 implements Interface17 {

	@OriginalMember(owner = "client!oh", name = "g", descriptor = "Lclient!ni;")
	private final Class223 aClass223_88;

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Lclient!ni;)V")
	public Class242(@OriginalArg(0) Class223 arg0) {
		this.aClass223_88 = arg0;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)Lclient!mk;")
	@Override
	public Class206 method6325() {
		return Static354.aClass206_2;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)I")
	@Override
	public int method6326() {
		return this.aClass223_88.method5939() ? 100 : this.aClass223_88.method5971();
	}
}
