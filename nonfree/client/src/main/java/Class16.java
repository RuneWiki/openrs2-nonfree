import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ao")
public class Class16 implements Interface16 {

	@OriginalMember(owner = "client!ao", name = "n", descriptor = "Lclient!f;")
	protected Class38 aClass38_18;

	@OriginalMember(owner = "client!ao", name = "l", descriptor = "Lclient!mv;")
	private final Class229 aClass229_56;

	@OriginalMember(owner = "client!ao", name = "j", descriptor = "Lclient!ru;")
	protected final Class213 aClass213_2;

	@OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(Lclient!mv;Lclient!ru;)V")
	public Class16(@OriginalArg(0) Class229 arg0, @OriginalArg(1) Class213 arg1) {
		this.aClass229_56 = arg0;
		this.aClass213_2 = arg1;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7259() {
		@Pc(16) int local16 = this.aClass213_2.aClass322_7.method6534(Static14.anInt330, this.aClass38_18.A()) + this.aClass213_2.anInt5119;
		@Pc(31) int local31 = this.aClass213_2.aClass347_7.method7305(Static370.anInt6187, this.aClass38_18.ca()) + this.aClass213_2.anInt5118;
		this.aClass38_18.method7463(local16, local31);
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(B)Z")
	@Override
	public final boolean method7257() {
		return this.aClass229_56.method4954(this.aClass213_2.anInt5124);
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)V")
	@Override
	public final void method7258() {
		this.aClass38_18 = Static214.method2618(this.aClass229_56, this.aClass213_2.anInt5124);
	}
}
