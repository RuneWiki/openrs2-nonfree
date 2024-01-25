import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bf")
public final class Class29 implements Interface14 {

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "Lclient!cw;")
	private Class61 aClass61_1;

	@OriginalMember(owner = "client!bf", name = "g", descriptor = "Lclient!si;")
	private final Class318 aClass318_1;

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "Lclient!wu;")
	private final Class380 aClass380_13;

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Lclient!wu;Lclient!si;)V")
	public Class29(@OriginalArg(0) Class380 arg0, @OriginalArg(1) Class318 arg1) {
		this.aClass318_1 = arg1;
		this.aClass380_13 = arg0;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8643() {
		@Pc(20) int local20 = Static511.anInt8548 <= Static66.anInt10099 ? Static66.anInt10099 : Static511.anInt8548;
		@Pc(27) int local27 = Static364.anInt5763 < Static153.anInt2747 ? Static153.anInt2747 : Static364.anInt5763;
		@Pc(31) int local31 = this.aClass61_1.method6446();
		@Pc(35) int local35 = this.aClass61_1.method6438();
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = local20;
		@Pc(45) int local45 = local20 * local35 / local31;
		@Pc(52) int local52 = (local27 - local45) / 2;
		if (local45 > local27) {
			local52 = 0;
			local45 = local27;
			local39 = local31 * local27 / local35;
			local37 = (local20 - local39) / 2;
		}
		this.aClass61_1.method6430(local37, local52, local39, local45);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8642() {
		return this.aClass380_13.method8638(this.aClass318_1.anInt8616);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)V")
	@Override
	public void method8644() {
		this.aClass61_1 = Static87.method1309(this.aClass318_1.anInt8616, this.aClass380_13);
	}
}
