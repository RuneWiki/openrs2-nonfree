import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uk")
public final class Class344 implements Interface1 {

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "Lclient!mi;")
	private Class46 aClass46_29;

	@OriginalMember(owner = "client!uk", name = "h", descriptor = "Lclient!in;")
	private final Class157 aClass157_288;

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "Lclient!nfa;")
	private final Class220 aClass220_1;

	@OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Lclient!in;Lclient!nfa;)V")
	public Class344(@OriginalArg(0) Class157 arg0, @OriginalArg(1) Class220 arg1) {
		this.aClass157_288 = arg0;
		this.aClass220_1 = arg1;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)V")
	@Override
	public void method9231() {
		this.aClass46_29 = Static166.method3585(this.aClass220_1.anInt7334, this.aClass157_288);
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(BZ)V")
	@Override
	public void method9233() {
		@Pc(19) int local19 = Static81.anInt2497 > Static326.anInt6591 ? Static81.anInt2497 : Static326.anInt6591;
		@Pc(30) int local30 = Static467.anInt8715 < Static423.anInt7984 ? Static423.anInt7984 : Static467.anInt8715;
		@Pc(34) int local34 = this.aClass46_29.method6205();
		@Pc(38) int local38 = this.aClass46_29.method6219();
		@Pc(40) int local40 = 0;
		@Pc(42) int local42 = local19;
		@Pc(48) int local48 = local19 * local38 / local34;
		@Pc(55) int local55 = (local30 - local48) / 2;
		if (local30 < local48) {
			local48 = local30;
			local42 = local30 * local34 / local38;
			local55 = 0;
			local40 = (local19 - local42) / 2;
		}
		this.aClass46_29.method6212(local40, local55, local42, local48);
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method9232() {
		return this.aClass157_288.method4575(this.aClass220_1.anInt7334);
	}
}
