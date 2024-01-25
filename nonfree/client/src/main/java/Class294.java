import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rb")
public class Class294 implements Interface14 {

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "Lclient!cw;")
	protected Class61 aClass61_35;

	@OriginalMember(owner = "client!rb", name = "f", descriptor = "Lclient!wu;")
	private final Class380 aClass380_137;

	@OriginalMember(owner = "client!rb", name = "j", descriptor = "Lclient!qba;")
	protected final Class102 aClass102_2;

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(Lclient!wu;Lclient!qba;)V")
	public Class294(@OriginalArg(0) Class380 arg0, @OriginalArg(1) Class102 arg1) {
		this.aClass380_137 = arg0;
		this.aClass102_2 = arg1;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8643() {
		@Pc(20) int local20 = this.aClass102_2.aClass361_5.method8101(Static66.anInt10099, this.aClass61_35.method6446()) + this.aClass102_2.anInt2636;
		@Pc(34) int local34 = this.aClass102_2.aClass306_6.method6899(this.aClass61_35.method6438(), Static364.anInt5763) + this.aClass102_2.anInt2633;
		this.aClass61_35.method6431(local20, local34);
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)Z")
	@Override
	public final boolean method8642() {
		return this.aClass380_137.method8638(this.aClass102_2.anInt2634);
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)V")
	@Override
	public final void method8644() {
		this.aClass61_35 = Static87.method1309(this.aClass102_2.anInt2634, this.aClass380_137);
	}
}
