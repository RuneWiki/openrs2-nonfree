import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ao")
public class Class14 implements Interface11 {

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "Lclient!xa;")
	protected Class37 aClass37_29;

	@OriginalMember(owner = "client!ao", name = "g", descriptor = "Lclient!pe;")
	private final Class254 aClass254_85;

	@OriginalMember(owner = "client!ao", name = "f", descriptor = "Lclient!rm;")
	protected final Class284 aClass284_2;

	@OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(Lclient!pe;Lclient!rm;)V")
	public Class14(@OriginalArg(0) Class254 arg0, @OriginalArg(1) Class284 arg1) {
		this.aClass254_85 = arg0;
		this.aClass284_2 = arg1;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)V")
	@Override
	public final void method8277() {
		this.aClass37_29 = Static518.method7687(this.aClass284_2.anInt9597, this.aClass254_85);
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(B)Z")
	@Override
	public final boolean method8278() {
		return this.aClass254_85.method6417(this.aClass284_2.anInt9597);
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8276() {
		@Pc(24) int local24 = this.aClass284_2.aClass100_12.method2801(Static507.anInt9382, this.aClass37_29.AA()) + this.aClass284_2.anInt9596;
		@Pc(39) int local39 = this.aClass284_2.aClass237_12.method6027(this.aClass37_29.a(), Static227.anInt4616) + this.aClass284_2.anInt9598;
		this.aClass37_29.method7076(local24, local39);
	}
}
