import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public class Class157 implements Interface23 {

	@OriginalMember(owner = "client!sb", name = "m", descriptor = "Lclient!xa;")
	protected Class13 aClass13_15;

	@OriginalMember(owner = "client!sb", name = "i", descriptor = "Lclient!bi;")
	private final Class31 aClass31_46;

	@OriginalMember(owner = "client!sb", name = "k", descriptor = "Lclient!ica;")
	protected final Class156 aClass156_2;

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lclient!bi;Lclient!ica;)V")
	public Class157(@OriginalArg(0) Class31 arg0, @OriginalArg(1) Class156 arg1) {
		this.aClass31_46 = arg0;
		this.aClass156_2 = arg1;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7805() {
		@Pc(19) int local19 = this.aClass156_2.aClass297_8.method6544(this.aClass13_15.AA(), Static9.anInt8933) + this.aClass156_2.anInt5679;
		@Pc(33) int local33 = this.aClass156_2.aClass58_9.method1299(this.aClass13_15.a(), Static576.anInt9547) + this.aClass156_2.anInt5680;
		this.aClass13_15.method8019(local19, local33);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V")
	@Override
	public final void method7804() {
		this.aClass13_15 = Static484.method7810(this.aClass31_46, this.aClass156_2.anInt5678);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)Z")
	@Override
	public final boolean method7806() {
		return this.aClass31_46.method679(this.aClass156_2.anInt5678);
	}
}
