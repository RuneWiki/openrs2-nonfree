import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dw")
public class Class89 implements Interface5 {

	@OriginalMember(owner = "client!dw", name = "m", descriptor = "Lclient!hk;")
	protected Class155 aClass155_31;

	@OriginalMember(owner = "client!dw", name = "i", descriptor = "Lclient!nga;")
	protected final Class91 aClass91_2;

	@OriginalMember(owner = "client!dw", name = "c", descriptor = "Lclient!gda;")
	private final Class126 aClass126_268;

	@OriginalMember(owner = "client!dw", name = "<init>", descriptor = "(Lclient!gda;Lclient!nga;)V")
	public Class89(@OriginalArg(0) Class126 arg0, @OriginalArg(1) Class91 arg1) {
		this.aClass91_2 = arg1;
		this.aClass126_268 = arg0;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8562() {
		@Pc(25) int local25 = this.aClass91_2.aClass189_4.method4461(Static592.anInt9548, this.aClass155_31.method7206()) + this.aClass91_2.anInt1884;
		@Pc(39) int local39 = this.aClass91_2.aClass346_3.method7688(this.aClass155_31.method7209(), Static401.anInt6745) + this.aClass91_2.anInt1883;
		this.aClass155_31.method7202(local25, local39);
	}

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "(B)V")
	@Override
	public final void method8563() {
		this.aClass155_31 = Static489.method6886(this.aClass126_268, this.aClass91_2.anInt1881);
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(B)Z")
	@Override
	public final boolean method8564() {
		return this.aClass126_268.method3077(this.aClass91_2.anInt1881);
	}
}
