import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nda")
public final class Class246 implements Interface10 {

	@OriginalMember(owner = "client!nda", name = "e", descriptor = "Lclient!rg;")
	private final Class310 aClass310_84;

	@OriginalMember(owner = "client!nda", name = "<init>", descriptor = "(Lclient!rg;)V")
	public Class246(@OriginalArg(0) Class310 arg0) {
		this.aClass310_84 = arg0;
	}

	@OriginalMember(owner = "client!nda", name = "b", descriptor = "(B)Lclient!kh;")
	@Override
	public Class202 method6098() {
		return Static314.aClass202_1;
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(B)I")
	@Override
	public int method6097() {
		return this.aClass310_84.method7784() ? 100 : this.aClass310_84.method7775((byte) -44);
	}
}
