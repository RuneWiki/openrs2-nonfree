import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hn")
public final class Class133 implements Interface24 {

	@OriginalMember(owner = "client!hn", name = "c", descriptor = "Lclient!f;")
	private Class14 aClass14_12;

	@OriginalMember(owner = "client!hn", name = "j", descriptor = "Lclient!kh;")
	private final Class180 aClass180_1;

	@OriginalMember(owner = "client!hn", name = "h", descriptor = "Lclient!tf;")
	private final Class322 aClass322_77;

	@OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(Lclient!tf;Lclient!kh;)V")
	public Class133(@OriginalArg(0) Class322 arg0, @OriginalArg(1) Class180 arg1) {
		this.aClass180_1 = arg1;
		this.aClass322_77 = arg0;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(ZI)V")
	@Override
	public void method6873() {
		@Pc(23) int local23 = Static40.anInt758 <= Static245.anInt4333 ? Static245.anInt4333 : Static40.anInt758;
		@Pc(34) int local34 = Static308.anInt5171 <= Static66.anInt1531 ? Static66.anInt1531 : Static308.anInt5171;
		@Pc(38) int local38 = this.aClass14_12.A();
		@Pc(42) int local42 = this.aClass14_12.ca();
		@Pc(44) int local44 = 0;
		@Pc(46) int local46 = local23;
		@Pc(52) int local52 = local42 * local23 / local38;
		@Pc(59) int local59 = (local34 - local52) / 2;
		if (local52 > local34) {
			local46 = local38 * local34 / local42;
			local52 = local34;
			local59 = 0;
			local44 = (local23 - local46) / 2;
		}
		this.aClass14_12.method7681(local44, local59, local46, local52);
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)V")
	@Override
	public void method6872() {
		this.aClass14_12 = Static249.method3865(this.aClass180_1.anInt4852, this.aClass322_77);
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6871() {
		return this.aClass322_77.method6797(this.aClass180_1.anInt4852);
	}
}
