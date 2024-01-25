import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jaa")
public final class Class159 implements Interface4 {

	@OriginalMember(owner = "client!jaa", name = "d", descriptor = "Lclient!f;")
	private Class46 aClass46_11;

	@OriginalMember(owner = "client!jaa", name = "e", descriptor = "Lclient!gr;")
	private final Class120 aClass120_1;

	@OriginalMember(owner = "client!jaa", name = "c", descriptor = "Lclient!om;")
	private final Class246 aClass246_114;

	@OriginalMember(owner = "client!jaa", name = "<init>", descriptor = "(Lclient!om;Lclient!gr;)V")
	public Class159(@OriginalArg(0) Class246 arg0, @OriginalArg(1) Class120 arg1) {
		this.aClass120_1 = arg1;
		this.aClass246_114 = arg0;
	}

	@OriginalMember(owner = "client!jaa", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7790() {
		return this.aClass246_114.method5667(this.aClass120_1.anInt3467);
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7788() {
		@Pc(8) int local8 = Static1.anInt7 < Static318.anInt5754 ? Static318.anInt5754 : Static1.anInt7;
		@Pc(19) int local19 = Static283.anInt2480 < Static447.anInt7372 ? Static447.anInt7372 : Static283.anInt2480;
		@Pc(23) int local23 = this.aClass46_11.A();
		@Pc(27) int local27 = this.aClass46_11.ca();
		@Pc(29) int local29 = 0;
		@Pc(31) int local31 = local8;
		@Pc(37) int local37 = local8 * local27 / local23;
		@Pc(44) int local44 = (local19 - local37) / 2;
		if (local37 > local19) {
			local31 = local23 * local19 / local27;
			local44 = 0;
			local37 = local19;
			local29 = (local8 - local31) / 2;
		}
		this.aClass46_11.method7616(local29, local44, local31, local37);
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(B)V")
	@Override
	public void method7789() {
		this.aClass46_11 = Static292.method4651(this.aClass246_114, this.aClass120_1.anInt3467);
	}
}
