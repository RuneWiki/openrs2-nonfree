import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hea")
public final class Class138 implements Interface24 {

	@OriginalMember(owner = "client!hea", name = "c", descriptor = "Lclient!ho;")
	private Class9 aClass9_22;

	@OriginalMember(owner = "client!hea", name = "g", descriptor = "Lclient!hq;")
	private final Class149 aClass149_1;

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "Lclient!ae;")
	private final Class8 aClass8_58;

	@OriginalMember(owner = "client!hea", name = "<init>", descriptor = "(Lclient!ae;Lclient!hq;)V")
	public Class138(@OriginalArg(0) Class8 arg0, @OriginalArg(1) Class149 arg1) {
		this.aClass149_1 = arg1;
		this.aClass8_58 = arg0;
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8706() {
		@Pc(23) int local23 = Static365.anInt6242 >= Static449.anInt7506 ? Static365.anInt6242 : Static449.anInt7506;
		@Pc(30) int local30 = Static348.anInt5935 <= Static335.anInt5755 ? Static335.anInt5755 : Static348.anInt5935;
		@Pc(34) int local34 = this.aClass9_22.method8937();
		@Pc(38) int local38 = this.aClass9_22.method8930();
		@Pc(40) int local40 = 0;
		@Pc(42) int local42 = local23;
		@Pc(48) int local48 = local38 * local23 / local34;
		@Pc(55) int local55 = (local30 - local48) / 2;
		if (local48 > local30) {
			local48 = local30;
			local55 = 0;
			local42 = local30 * local34 / local38;
			local40 = (local23 - local42) / 2;
		}
		this.aClass9_22.method8936(local40, local55, local42, local48);
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8704() {
		return this.aClass8_58.method273(this.aClass149_1.anInt3838);
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(I)V")
	@Override
	public void method8705() {
		this.aClass9_22 = Static215.method3139(this.aClass149_1.anInt3838, this.aClass8_58);
	}
}
