import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pea")
public class Class215 implements Interface9 {

	@OriginalMember(owner = "client!pea", name = "k", descriptor = "Lclient!mq;")
	protected Class71 aClass71_14;

	@OriginalMember(owner = "client!pea", name = "j", descriptor = "Lclient!gga;")
	private final Class124 aClass124_73;

	@OriginalMember(owner = "client!pea", name = "g", descriptor = "Lclient!rm;")
	protected final Class226 aClass226_2;

	@OriginalMember(owner = "client!pea", name = "<init>", descriptor = "(Lclient!gga;Lclient!rm;)V")
	public Class215(@OriginalArg(0) Class124 arg0, @OriginalArg(1) Class226 arg1) {
		this.aClass124_73 = arg0;
		this.aClass226_2 = arg1;
	}

	@OriginalMember(owner = "client!pea", name = "b", descriptor = "(I)V")
	@Override
	public final void method7670() {
		this.aClass71_14 = Static296.method4890(this.aClass124_73, this.aClass226_2.anInt6813);
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(I)Z")
	@Override
	public final boolean method7668() {
		return this.aClass124_73.method3627(this.aClass226_2.anInt6813);
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7669() {
		@Pc(20) int local20 = this.aClass226_2.aClass236_7.method6431(this.aClass71_14.method7709(), Static26.anInt458) + this.aClass226_2.anInt6815;
		@Pc(35) int local35 = this.aClass226_2.aClass103_7.method3186(Static340.anInt6390, this.aClass71_14.method7711()) + this.aClass226_2.anInt6814;
		this.aClass71_14.method7703(local20, local35);
	}
}
