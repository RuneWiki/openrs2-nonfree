import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public final class Class216 implements Interface10 {

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "Lclient!rg;")
	private final Class310 aClass310_66;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "Ljava/lang/String;")
	private final String aString75;

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(Lclient!rg;Ljava/lang/String;)V")
	public Class216(@OriginalArg(0) Class310 arg0, @OriginalArg(1) String arg1) {
		this.aClass310_66 = arg0;
		this.aString75 = arg1;
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(B)Lclient!kh;")
	@Override
	public Class202 method6098() {
		return Static314.aClass202_2;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)I")
	@Override
	public int method6097() {
		return this.aClass310_66.method7780(this.aString75) ? 100 : 0;
	}
}
