import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uk")
public final class Class373 implements Interface14 {

	@OriginalMember(owner = "client!uk", name = "d", descriptor = "Lclient!bka;")
	private Class9 aClass9_34;

	@OriginalMember(owner = "client!uk", name = "f", descriptor = "Lclient!lb;")
	private final Class221 aClass221_156;

	@OriginalMember(owner = "client!uk", name = "g", descriptor = "Lclient!iaa;")
	private final Class164 aClass164_1;

	@OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Lclient!lb;Lclient!iaa;)V")
	public Class373(@OriginalArg(0) Class221 arg0, @OriginalArg(1) Class164 arg1) {
		this.aClass221_156 = arg0;
		this.aClass164_1 = arg1;
	}

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8744() {
		return this.aClass221_156.method5068(this.aClass164_1.anInt4803);
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8743() {
		@Pc(11) int local11 = Static347.anInt2639 < Static575.anInt9435 ? Static575.anInt9435 : Static347.anInt2639;
		@Pc(19) int local19 = Static272.anInt5005 <= Static426.anInt7511 ? Static426.anInt7511 : Static272.anInt5005;
		@Pc(23) int local23 = this.aClass9_34.method8619();
		@Pc(27) int local27 = this.aClass9_34.method8613();
		@Pc(29) int local29 = 0;
		@Pc(31) int local31 = local11;
		@Pc(37) int local37 = local27 * local11 / local23;
		@Pc(44) int local44 = (local19 - local37) / 2;
		if (local37 > local19) {
			local31 = local19 * local23 / local27;
			local44 = 0;
			local37 = local19;
			local29 = (local11 - local31) / 2;
		}
		this.aClass9_34.method8620(local29, local44, local31, local37);
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)V")
	@Override
	public void method8745() {
		this.aClass9_34 = Static307.method4661(this.aClass221_156, this.aClass164_1.anInt4803);
	}
}
