import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ho")
public final class Class148 implements Interface1 {

	@OriginalMember(owner = "client!ho", name = "e", descriptor = "Lclient!da;")
	private Class38 aClass38_4;

	@OriginalMember(owner = "client!ho", name = "d", descriptor = "Lclient!om;")
	private final Class263 aClass263_1;

	@OriginalMember(owner = "client!ho", name = "g", descriptor = "Lclient!wia;")
	private final Class386 aClass386_54;

	@OriginalMember(owner = "client!ho", name = "f", descriptor = "Lclient!wia;")
	private final Class386 aClass386_53;

	@OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(Lclient!wia;Lclient!wia;Lclient!om;)V")
	public Class148(@OriginalArg(0) Class386 arg0, @OriginalArg(1) Class386 arg1, @OriginalArg(2) Class263 arg2) {
		this.aClass263_1 = arg2;
		this.aClass386_54 = arg1;
		this.aClass386_53 = arg0;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8740() {
		@Pc(10) boolean local10 = true;
		if (!this.aClass386_53.method9206(this.aClass263_1.anInt7715)) {
			local10 = false;
		}
		if (!this.aClass386_54.method9206(this.aClass263_1.anInt7715)) {
			local10 = false;
		}
		return local10;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(I)V")
	@Override
	public void method8739() {
		@Pc(19) Class158 local19 = Static527.method7557(this.aClass386_54, this.aClass263_1.anInt7715);
		this.aClass38_4 = Static677.aClass137_47.method7870(local19, Static688.method8616(this.aClass386_53, this.aClass263_1.anInt7715));
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8741() {
		@Pc(24) int local24 = this.aClass263_1.aClass168_11.method3716(this.aClass263_1.anInt7725, Static258.anInt4461) + this.aClass263_1.anInt7720;
		@Pc(39) int local39 = this.aClass263_1.aClass339_11.method8222(this.aClass263_1.anInt7723, Static297.anInt5240) + this.aClass263_1.anInt7719;
		this.aClass38_4.method8994(0, (Class20[]) null, this.aClass263_1.anInt7721, this.aClass263_1.anInt7725, local39, this.aClass263_1.anInt7718, this.aClass263_1.anInt7717, this.aClass263_1.aString77, this.aClass263_1.anInt7723, (int[]) null, local24, 0, this.aClass263_1.anInt7713, (Class1) null, this.aClass263_1.anInt7724);
	}
}
