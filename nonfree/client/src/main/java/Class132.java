import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jea")
public class Class132 implements Interface14 {

	@OriginalMember(owner = "client!jea", name = "g", descriptor = "Lclient!bka;")
	protected Class9 aClass9_8;

	@OriginalMember(owner = "client!jea", name = "h", descriptor = "Lclient!vk;")
	protected final Class14 aClass14_2;

	@OriginalMember(owner = "client!jea", name = "f", descriptor = "Lclient!lb;")
	private final Class221 aClass221_62;

	@OriginalMember(owner = "client!jea", name = "<init>", descriptor = "(Lclient!lb;Lclient!vk;)V")
	public Class132(@OriginalArg(0) Class221 arg0, @OriginalArg(1) Class14 arg1) {
		this.aClass14_2 = arg1;
		this.aClass221_62 = arg0;
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(I)V")
	@Override
	public final void method8745() {
		this.aClass9_8 = Static307.method4661(this.aClass221_62, this.aClass14_2.anInt354);
	}

	@OriginalMember(owner = "client!jea", name = "b", descriptor = "(I)Z")
	@Override
	public final boolean method8744() {
		return this.aClass221_62.method5068(this.aClass14_2.anInt354);
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8743() {
		@Pc(16) int local16 = this.aClass14_2.aClass304_2.method7463(this.aClass9_8.method8619(), Static347.anInt2639) + this.aClass14_2.anInt357;
		@Pc(30) int local30 = this.aClass14_2.aClass216_2.method5030(Static426.anInt7511, this.aClass9_8.method8613()) + this.aClass14_2.anInt359;
		this.aClass9_8.method8617(local16, local30);
	}
}
