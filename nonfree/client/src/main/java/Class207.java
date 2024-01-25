import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kw")
public final class Class207 implements Interface11 {

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "Lclient!la;")
	private final Class208 aClass208_71;

	@OriginalMember(owner = "client!kw", name = "<init>", descriptor = "(Lclient!la;)V")
	public Class207(@OriginalArg(0) Class208 arg0) {
		this.aClass208_71 = arg0;
	}

	@OriginalMember(owner = "client!kw", name = "b", descriptor = "(I)I")
	@Override
	public int method9042() {
		return this.aClass208_71.method4983() ? 100 : this.aClass208_71.method4993();
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(I)Lclient!ud;")
	@Override
	public Class342 method9043() {
		return Static593.aClass342_1;
	}
}
