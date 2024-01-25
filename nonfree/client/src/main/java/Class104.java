import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public class Class104 implements Interface7 {

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "Lclient!xa;")
	protected Class58 aClass58_42;

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "Lclient!pfa;")
	private final Class251 aClass251_107;

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "Lclient!oaa;")
	protected final Class230 aClass230_2;

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Lclient!pfa;Lclient!oaa;)V")
	public Class104(@OriginalArg(0) Class251 arg0, @OriginalArg(1) Class230 arg1) {
		this.aClass251_107 = arg0;
		this.aClass230_2 = arg1;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V")
	@Override
	public final void method7570() {
		this.aClass58_42 = Static588.method1984(this.aClass251_107, this.aClass230_2.anInt7385);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7571() {
		@Pc(22) int local22 = this.aClass230_2.aClass319_13.method7077(Static592.anInt9585, this.aClass58_42.AA()) + this.aClass230_2.anInt7384;
		@Pc(37) int local37 = this.aClass230_2.aClass247_13.method5723(Static579.anInt9514, this.aClass58_42.a()) + this.aClass230_2.anInt7381;
		this.aClass58_42.method7666(local22, local37);
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)Z")
	@Override
	public final boolean method7572() {
		return this.aClass251_107.method5782(this.aClass230_2.anInt7385);
	}
}
