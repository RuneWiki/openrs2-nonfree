import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mh")
public class Class232 implements Interface13 {

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "Lclient!qda;")
	protected Class59 aClass59_21;

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "Lclient!cb;")
	private final Class50 aClass50_105;

	@OriginalMember(owner = "client!mh", name = "k", descriptor = "Lclient!wu;")
	protected final Class76 aClass76_2;

	@OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(Lclient!cb;Lclient!wu;)V")
	public Class232(@OriginalArg(0) Class50 arg0, @OriginalArg(1) Class76 arg1) {
		this.aClass50_105 = arg0;
		this.aClass76_2 = arg1;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Z)V")
	@Override
	public final void method8562() {
		this.aClass59_21 = Static231.method799(this.aClass76_2.anInt1746, this.aClass50_105);
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(B)Z")
	@Override
	public final boolean method8563() {
		return this.aClass50_105.method897(this.aClass76_2.anInt1746);
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8561() {
		@Pc(27) int local27 = this.aClass76_2.aClass112_4.method2278(Static345.anInt6198, this.aClass59_21.method8053()) + this.aClass76_2.anInt1747;
		@Pc(41) int local41 = this.aClass76_2.aClass4_4.method49(Static427.anInt10577, this.aClass59_21.method8064()) + this.aClass76_2.anInt1745;
		this.aClass59_21.method8057(local27, local41);
	}
}
