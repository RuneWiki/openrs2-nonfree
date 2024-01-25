import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jba")
public final class Class182 implements Interface10 {

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "Lclient!rg;")
	private final Class310 aClass310_60;

	@OriginalMember(owner = "client!jba", name = "d", descriptor = "Ljava/lang/String;")
	private final String aString70;

	@OriginalMember(owner = "client!jba", name = "<init>", descriptor = "(Lclient!rg;Ljava/lang/String;)V")
	public Class182(@OriginalArg(0) Class310 arg0, @OriginalArg(1) String arg1) {
		this.aClass310_60 = arg0;
		this.aString70 = arg1;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(B)I")
	@Override
	public int method6097() {
		return this.aClass310_60.method7783(this.aString70) ? 100 : this.aClass310_60.method7792(this.aString70);
	}

	@OriginalMember(owner = "client!jba", name = "b", descriptor = "(B)Lclient!kh;")
	@Override
	public Class202 method6098() {
		return Static314.aClass202_3;
	}
}
