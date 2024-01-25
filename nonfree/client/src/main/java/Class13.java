import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aha")
public class Class13 implements Interface21 {

	@OriginalMember(owner = "client!aha", name = "c", descriptor = "Lclient!pga;")
	protected Class32 aClass32_14;

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "Lclient!vd;")
	private final Class353 aClass353_54;

	@OriginalMember(owner = "client!aha", name = "e", descriptor = "Lclient!jv;")
	protected final Class167 aClass167_2;

	@OriginalMember(owner = "client!aha", name = "<init>", descriptor = "(Lclient!vd;Lclient!jv;)V")
	public Class13(@OriginalArg(0) Class353 arg0, @OriginalArg(1) Class167 arg1) {
		this.aClass353_54 = arg0;
		this.aClass167_2 = arg1;
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(I)Z")
	@Override
	public final boolean method7901() {
		return this.aClass353_54.method8401(this.aClass167_2.anInt6590);
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7903() {
		@Pc(21) int local21 = this.aClass167_2.aClass238_11.method6456(Static507.anInt8741, this.aClass32_14.method5080()) + this.aClass167_2.anInt6595;
		@Pc(35) int local35 = this.aClass167_2.aClass79_16.method2054(this.aClass32_14.method5079(), Static106.anInt2101) + this.aClass167_2.anInt6589;
		this.aClass32_14.method5071(local21, local35);
	}

	@OriginalMember(owner = "client!aha", name = "b", descriptor = "(I)V")
	@Override
	public final void method7902() {
		this.aClass32_14 = Static293.method5063(this.aClass167_2.anInt6590, this.aClass353_54);
	}
}
