import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gfa")
public final class Class109 implements Interface7 {

	@OriginalMember(owner = "client!gfa", name = "e", descriptor = "Lclient!xa;")
	private Class58 aClass58_21;

	@OriginalMember(owner = "client!gfa", name = "b", descriptor = "Lclient!re;")
	private final Class285 aClass285_1;

	@OriginalMember(owner = "client!gfa", name = "d", descriptor = "Lclient!pfa;")
	private final Class251 aClass251_49;

	@OriginalMember(owner = "client!gfa", name = "<init>", descriptor = "(Lclient!pfa;Lclient!re;)V")
	public Class109(@OriginalArg(0) Class251 arg0, @OriginalArg(1) Class285 arg1) {
		this.aClass285_1 = arg1;
		this.aClass251_49 = arg0;
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(I)V")
	@Override
	public void method7570() {
		this.aClass58_21 = Static588.method1984(this.aClass251_49, this.aClass285_1.anInt7740);
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7571() {
		@Pc(12) int local12 = Static592.anInt9585 >= Static240.anInt4852 ? Static592.anInt9585 : Static240.anInt4852;
		@Pc(19) int local19 = Static196.anInt4059 > Static579.anInt9514 ? Static196.anInt4059 : Static579.anInt9514;
		@Pc(23) int local23 = this.aClass58_21.AA();
		@Pc(27) int local27 = this.aClass58_21.a();
		@Pc(29) int local29 = 0;
		@Pc(31) int local31 = local12;
		@Pc(37) int local37 = local27 * local12 / local23;
		@Pc(44) int local44 = (local19 - local37) / 2;
		if (local19 < local37) {
			local31 = local23 * local19 / local27;
			local44 = 0;
			local37 = local19;
			local29 = (local12 - local31) / 2;
		}
		this.aClass58_21.method7657(local29, local44, local31, local37);
	}

	@OriginalMember(owner = "client!gfa", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7572() {
		return this.aClass251_49.method5782(this.aClass285_1.anInt7740);
	}
}
