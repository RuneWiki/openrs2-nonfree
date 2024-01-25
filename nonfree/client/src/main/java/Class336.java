import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ug")
public final class Class336 implements Interface20 {

	@OriginalMember(owner = "client!ug", name = "d", descriptor = "Lclient!kr;")
	private Class20 aClass20_33;

	@OriginalMember(owner = "client!ug", name = "j", descriptor = "Lclient!rp;")
	private final Class299 aClass299_1;

	@OriginalMember(owner = "client!ug", name = "k", descriptor = "Lclient!eq;")
	private final Class97 aClass97_138;

	@OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(Lclient!eq;Lclient!rp;)V")
	public Class336(@OriginalArg(0) Class97 arg0, @OriginalArg(1) Class299 arg1) {
		this.aClass299_1 = arg1;
		this.aClass97_138 = arg0;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8022() {
		@Pc(8) int local8 = Static386.anInt6961 >= Static571.anInt9399 ? Static386.anInt6961 : Static571.anInt9399;
		@Pc(19) int local19 = Static135.anInt3053 >= Static585.anInt9606 ? Static135.anInt3053 : Static585.anInt9606;
		@Pc(23) int local23 = this.aClass20_33.method4588();
		@Pc(27) int local27 = this.aClass20_33.method4576();
		@Pc(29) int local29 = 0;
		@Pc(31) int local31 = local8;
		@Pc(37) int local37 = local27 * local8 / local23;
		@Pc(44) int local44 = (local19 - local37) / 2;
		if (local37 > local19) {
			local31 = local23 * local19 / local27;
			local37 = local19;
			local44 = 0;
			local29 = (local8 - local31) / 2;
		}
		this.aClass20_33.method4583(local29, local44, local31, local37);
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8023() {
		return this.aClass97_138.method2564(this.aClass299_1.anInt8419);
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V")
	@Override
	public void method8024() {
		this.aClass20_33 = Static385.method5796(this.aClass97_138, this.aClass299_1.anInt8419);
	}
}
