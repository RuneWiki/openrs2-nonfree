import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ns")
public final class Class252 implements Interface1 {

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "Lclient!jd;")
	private Class20 aClass20_25;

	@OriginalMember(owner = "client!ns", name = "e", descriptor = "Lclient!vha;")
	private final Class369 aClass369_1;

	@OriginalMember(owner = "client!ns", name = "g", descriptor = "Lclient!wia;")
	private final Class386 aClass386_93;

	@OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(Lclient!wia;Lclient!vha;)V")
	public Class252(@OriginalArg(0) Class386 arg0, @OriginalArg(1) Class369 arg1) {
		this.aClass369_1 = arg1;
		this.aClass386_93 = arg0;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8741() {
		@Pc(24) int local24 = Static561.anInt9759 > Static258.anInt4461 ? Static561.anInt9759 : Static258.anInt4461;
		@Pc(31) int local31 = Static297.anInt5240 < Static639.anInt10685 ? Static639.anInt10685 : Static297.anInt5240;
		@Pc(35) int local35 = this.aClass20_25.method7394();
		@Pc(39) int local39 = this.aClass20_25.method7408();
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = local24;
		@Pc(49) int local49 = local39 * local24 / local35;
		@Pc(55) int local55 = (local31 - local49) / 2;
		if (local31 < local49) {
			local43 = local35 * local31 / local39;
			local55 = 0;
			local49 = local31;
			local41 = (local24 - local43) / 2;
		}
		this.aClass20_25.method7405(local41, local55, local43, local49);
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8740() {
		return this.aClass386_93.method9206(this.aClass369_1.anInt10606);
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)V")
	@Override
	public void method8739() {
		this.aClass20_25 = Static410.method6055(this.aClass386_93, this.aClass369_1.anInt10606);
	}
}
