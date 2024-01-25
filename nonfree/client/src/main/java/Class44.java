import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bv")
public final class Class44 implements Interface16 {

	@OriginalMember(owner = "client!bv", name = "h", descriptor = "Lclient!f;")
	private Class38 aClass38_6;

	@OriginalMember(owner = "client!bv", name = "b", descriptor = "Lclient!ub;")
	private final Class333 aClass333_1;

	@OriginalMember(owner = "client!bv", name = "e", descriptor = "Lclient!mv;")
	private final Class229 aClass229_13;

	@OriginalMember(owner = "client!bv", name = "<init>", descriptor = "(Lclient!mv;Lclient!ub;)V")
	public Class44(@OriginalArg(0) Class229 arg0, @OriginalArg(1) Class333 arg1) {
		this.aClass333_1 = arg1;
		this.aClass229_13 = arg0;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7257() {
		return this.aClass229_13.method4954(this.aClass333_1.anInt8454);
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7259() {
		@Pc(17) int local17 = Static172.anInt2621 > Static14.anInt330 ? Static172.anInt2621 : Static14.anInt330;
		@Pc(28) int local28 = Static370.anInt6187 >= Static187.anInt8962 ? Static370.anInt6187 : Static187.anInt8962;
		@Pc(32) int local32 = this.aClass38_6.A();
		@Pc(36) int local36 = this.aClass38_6.ca();
		@Pc(38) int local38 = 0;
		@Pc(40) int local40 = local17;
		@Pc(46) int local46 = local36 * local17 / local32;
		@Pc(52) int local52 = (local28 - local46) / 2;
		if (local28 < local46) {
			local40 = local32 * local28 / local36;
			local46 = local28;
			local52 = 0;
			local38 = (local17 - local40) / 2;
		}
		this.aClass38_6.method7466(local38, local52, local40, local46);
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(I)V")
	@Override
	public void method7258() {
		this.aClass38_6 = Static214.method2618(this.aClass229_13, this.aClass333_1.anInt8454);
	}
}
