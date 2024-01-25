import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public class Class324 implements Interface1 {

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "Lclient!jd;")
	protected Class20 aClass20_34;

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "Lclient!lw;")
	protected final Class53 aClass53_2;

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "Lclient!wia;")
	private final Class386 aClass386_117;

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lclient!wia;Lclient!lw;)V")
	public Class324(@OriginalArg(0) Class386 arg0, @OriginalArg(1) Class53 arg1) {
		this.aClass53_2 = arg1;
		this.aClass386_117 = arg0;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
	@Override
	public final void method8739() {
		this.aClass20_34 = Static410.method6055(this.aClass386_117, this.aClass53_2.anInt1559);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)Z")
	@Override
	public final boolean method8740() {
		return this.aClass386_117.method9206(this.aClass53_2.anInt1559);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8741() {
		@Pc(19) int local19 = this.aClass53_2.aClass168_3.method3716(this.aClass20_34.method7394(), Static258.anInt4461) + this.aClass53_2.anInt1556;
		@Pc(34) int local34 = this.aClass53_2.aClass339_2.method8222(this.aClass20_34.method7408(), Static297.anInt5240) + this.aClass53_2.anInt1560;
		this.aClass20_34.method7399(local19, local34);
	}
}
