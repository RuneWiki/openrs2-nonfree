import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jg")
public class Class158 implements Interface1 {

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "Lclient!f;")
	protected Class73 aClass73_35;

	@OriginalMember(owner = "client!jg", name = "f", descriptor = "Lclient!ri;")
	private final Class284 aClass284_108;

	@OriginalMember(owner = "client!jg", name = "g", descriptor = "Lclient!pg;")
	protected final Class46 aClass46_2;

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(Lclient!ri;Lclient!pg;)V")
	public Class158(@OriginalArg(0) Class284 arg0, @OriginalArg(1) Class46 arg1) {
		this.aClass284_108 = arg0;
		this.aClass46_2 = arg1;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7699() {
		@Pc(24) int local24 = this.aClass46_2.aClass154_7.method3814(this.aClass73_35.A(), Static333.anInt6024) + this.aClass46_2.anInt1459;
		@Pc(39) int local39 = this.aClass46_2.aClass201_5.method4868(this.aClass73_35.ca(), Static473.anInt8221) + this.aClass46_2.anInt1460;
		this.aClass73_35.method7957(local24, local39);
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)Z")
	@Override
	public final boolean method7701() {
		return this.aClass284_108.method6347(this.aClass46_2.anInt1466);
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V")
	@Override
	public final void method7700() {
		this.aClass73_35 = Static581.method7907(this.aClass46_2.anInt1466, this.aClass284_108);
	}
}
