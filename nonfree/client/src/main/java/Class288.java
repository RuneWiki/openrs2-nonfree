import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rba")
public final class Class288 implements Interface13 {

	@OriginalMember(owner = "client!rba", name = "g", descriptor = "Lclient!td;")
	private Class24 aClass24_28;

	@OriginalMember(owner = "client!rba", name = "d", descriptor = "Lclient!la;")
	private final Class196 aClass196_101;

	@OriginalMember(owner = "client!rba", name = "f", descriptor = "Lclient!fk;")
	private final Class112 aClass112_1;

	@OriginalMember(owner = "client!rba", name = "<init>", descriptor = "(Lclient!la;Lclient!fk;)V")
	public Class288(@OriginalArg(0) Class196 arg0, @OriginalArg(1) Class112 arg1) {
		this.aClass196_101 = arg0;
		this.aClass112_1 = arg1;
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(B)V")
	@Override
	public void method8396() {
		this.aClass24_28 = Static128.method2506(this.aClass196_101, this.aClass112_1.anInt3121);
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8398() {
		return this.aClass196_101.method5111(this.aClass112_1.anInt3121);
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8397() {
		@Pc(12) int local12 = Static109.anInt2357 > Static612.anInt9912 ? Static109.anInt2357 : Static612.anInt9912;
		@Pc(19) int local19 = Static330.anInt6165 > Static90.anInt2181 ? Static330.anInt6165 : Static90.anInt2181;
		@Pc(23) int local23 = this.aClass24_28.method8576();
		@Pc(27) int local27 = this.aClass24_28.method8573();
		@Pc(29) int local29 = 0;
		@Pc(31) int local31 = local12;
		@Pc(37) int local37 = local12 * local27 / local23;
		@Pc(43) int local43 = (local19 - local37) / 2;
		if (local19 < local37) {
			local37 = local19;
			local43 = 0;
			local31 = local23 * local19 / local27;
			local29 = (local12 - local31) / 2;
		}
		this.aClass24_28.method8564(local29, local43, local31, local37);
	}
}
