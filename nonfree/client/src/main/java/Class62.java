import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ct")
public final class Class62 implements Interface9 {

	@OriginalMember(owner = "client!ct", name = "g", descriptor = "Lclient!mq;")
	private Class71 aClass71_4;

	@OriginalMember(owner = "client!ct", name = "c", descriptor = "Lclient!vba;")
	private final Class369 aClass369_1;

	@OriginalMember(owner = "client!ct", name = "d", descriptor = "Lclient!gga;")
	private final Class124 aClass124_22;

	@OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(Lclient!gga;Lclient!vba;)V")
	public Class62(@OriginalArg(0) Class124 arg0, @OriginalArg(1) Class369 arg1) {
		this.aClass369_1 = arg1;
		this.aClass124_22 = arg0;
	}

	@OriginalMember(owner = "client!ct", name = "b", descriptor = "(I)V")
	@Override
	public void method7670() {
		this.aClass71_4 = Static296.method4890(this.aClass124_22, this.aClass369_1.anInt10837);
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7668() {
		return this.aClass124_22.method3627(this.aClass369_1.anInt10837);
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7669() {
		@Pc(20) int local20 = Static406.anInt7570 <= Static26.anInt458 ? Static26.anInt458 : Static406.anInt7570;
		@Pc(27) int local27 = Static340.anInt6390 < Static19.anInt352 ? Static19.anInt352 : Static340.anInt6390;
		@Pc(31) int local31 = this.aClass71_4.method7709();
		@Pc(35) int local35 = this.aClass71_4.method7711();
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = local20;
		@Pc(45) int local45 = local20 * local35 / local31;
		@Pc(52) int local52 = (local27 - local45) / 2;
		if (local27 < local45) {
			local39 = local27 * local31 / local35;
			local52 = 0;
			local45 = local27;
			local37 = (local20 - local39) / 2;
		}
		this.aClass71_4.method7699(local37, local52, local39, local45);
	}
}
