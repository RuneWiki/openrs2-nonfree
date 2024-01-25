import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fq")
public final class Class117 implements Interface12 {

	@OriginalMember(owner = "client!fq", name = "f", descriptor = "Lclient!f;")
	private Class39 aClass39_7;

	@OriginalMember(owner = "client!fq", name = "b", descriptor = "Lclient!mk;")
	private final Class222 aClass222_1;

	@OriginalMember(owner = "client!fq", name = "g", descriptor = "Lclient!pl;")
	private final Class259 aClass259_55;

	@OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(Lclient!pl;Lclient!mk;)V")
	public Class117(@OriginalArg(0) Class259 arg0, @OriginalArg(1) Class222 arg1) {
		this.aClass222_1 = arg1;
		this.aClass259_55 = arg0;
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7015() {
		return this.aClass259_55.method5988(this.aClass222_1.anInt6200);
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(I)V")
	@Override
	public void method7014() {
		this.aClass39_7 = Static152.method2474(this.aClass259_55, this.aClass222_1.anInt6200);
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7013() {
		@Pc(8) int local8 = Static140.anInt2937 > Static26.anInt651 ? Static140.anInt2937 : Static26.anInt651;
		@Pc(15) int local15 = Static554.anInt9119 < Static120.anInt2371 ? Static120.anInt2371 : Static554.anInt9119;
		@Pc(19) int local19 = this.aClass39_7.A();
		@Pc(23) int local23 = this.aClass39_7.ca();
		@Pc(25) int local25 = 0;
		@Pc(27) int local27 = local8;
		@Pc(33) int local33 = local8 * local23 / local19;
		@Pc(39) int local39 = (local15 - local33) / 2;
		if (local15 < local33) {
			local33 = local15;
			local39 = 0;
			local27 = local15 * local19 / local23;
			local25 = (local8 - local27) / 2;
		}
		this.aClass39_7.method7848(local25, local39, local27, local33);
	}
}
