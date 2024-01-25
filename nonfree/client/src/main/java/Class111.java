import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fq")
public class Class111 implements Interface19 {

	@OriginalMember(owner = "client!fq", name = "g", descriptor = "Lclient!xa;")
	protected Class71 aClass71_40;

	@OriginalMember(owner = "client!fq", name = "f", descriptor = "Lclient!pj;")
	private final Class248 aClass248_60;

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "Lclient!ni;")
	protected final Class210 aClass210_2;

	@OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(Lclient!pj;Lclient!ni;)V")
	public Class111(@OriginalArg(0) Class248 arg0, @OriginalArg(1) Class210 arg1) {
		this.aClass248_60 = arg0;
		this.aClass210_2 = arg1;
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(I)V")
	@Override
	public final void method6770() {
		this.aClass71_40 = Static535.method7285(this.aClass248_60.method5795(this.aClass210_2.anInt6224));
		this.method6771();
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(IZ)V")
	@Override
	public void method6771() {
		@Pc(20) int local20 = this.aClass210_2.aClass114_9.method2576(this.aClass71_40.AA(), Static168.anInt3084) + this.aClass210_2.anInt6225;
		@Pc(34) int local34 = this.aClass210_2.aClass72_8.method1433(Static112.anInt1892, this.aClass71_40.a()) + this.aClass210_2.anInt6227;
		this.aClass71_40.method7775(local20, local34);
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(B)Z")
	@Override
	public final boolean method6772() {
		return this.aClass248_60.method5804(this.aClass210_2.anInt6224);
	}
}
