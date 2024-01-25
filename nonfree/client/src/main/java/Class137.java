import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hk")
public class Class137 implements Interface6 {

	@OriginalMember(owner = "client!hk", name = "f", descriptor = "Lclient!f;")
	protected Class5 aClass5_23;

	@OriginalMember(owner = "client!hk", name = "j", descriptor = "Lclient!hfa;")
	protected final Class132 aClass132_2;

	@OriginalMember(owner = "client!hk", name = "o", descriptor = "Lclient!sea;")
	private final Class308 aClass308_126;

	@OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(Lclient!sea;Lclient!hfa;)V")
	public Class137(@OriginalArg(0) Class308 arg0, @OriginalArg(1) Class132 arg1) {
		this.aClass132_2 = arg1;
		this.aClass308_126 = arg0;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)V")
	@Override
	public final void method7888() {
		this.aClass5_23 = Static375.method5452(this.aClass132_2.anInt6606, this.aClass308_126);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(B)Z")
	@Override
	public final boolean method7886() {
		return this.aClass308_126.method6538(this.aClass132_2.anInt6606);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7887() {
		@Pc(15) int local15 = this.aClass132_2.aClass259_9.method5515(this.aClass5_23.A(), Static318.anInt5819) + this.aClass132_2.anInt6604;
		@Pc(30) int local30 = this.aClass132_2.aClass216_10.method4653(this.aClass5_23.ca(), Static192.anInt3766) + this.aClass132_2.anInt6610;
		this.aClass5_23.method7795(local15, local30);
	}
}
