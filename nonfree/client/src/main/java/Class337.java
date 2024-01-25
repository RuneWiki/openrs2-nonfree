import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tja")
public final class Class337 implements Interface21 {

	@OriginalMember(owner = "client!tja", name = "d", descriptor = "Lclient!pu;")
	private Class50 aClass50_35;

	@OriginalMember(owner = "client!tja", name = "a", descriptor = "Lclient!wm;")
	private final Class390 aClass390_115;

	@OriginalMember(owner = "client!tja", name = "c", descriptor = "Lclient!ln;")
	private final Class218 aClass218_1;

	@OriginalMember(owner = "client!tja", name = "<init>", descriptor = "(Lclient!wm;Lclient!ln;)V")
	public Class337(@OriginalArg(0) Class390 arg0, @OriginalArg(1) Class218 arg1) {
		this.aClass390_115 = arg0;
		this.aClass218_1 = arg1;
	}

	@OriginalMember(owner = "client!tja", name = "b", descriptor = "(I)V")
	@Override
	public void method7888() {
		this.aClass50_35 = Static144.method2605(this.aClass390_115, this.aClass218_1.anInt6359);
	}

	@OriginalMember(owner = "client!tja", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7887() {
		return this.aClass390_115.method8905(this.aClass218_1.anInt6359);
	}

	@OriginalMember(owner = "client!tja", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7886() {
		@Pc(12) int local12 = Static32.anInt510 <= Static613.anInt10005 ? Static613.anInt10005 : Static32.anInt510;
		@Pc(19) int local19 = Static10.anInt152 >= Static79.anInt1140 ? Static10.anInt152 : Static79.anInt1140;
		@Pc(23) int local23 = this.aClass50_35.method6003();
		@Pc(27) int local27 = this.aClass50_35.method6010();
		@Pc(29) int local29 = 0;
		@Pc(31) int local31 = local12;
		@Pc(37) int local37 = local12 * local27 / local23;
		@Pc(43) int local43 = (local19 - local37) / 2;
		if (local19 < local37) {
			local31 = local23 * local19 / local27;
			local37 = local19;
			local43 = 0;
			local29 = (local12 - local31) / 2;
		}
		this.aClass50_35.method6008(local29, local43, local31, local37);
	}
}
