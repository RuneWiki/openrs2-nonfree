import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vfa")
public final class Class338 implements Interface11 {

	@OriginalMember(owner = "client!vfa", name = "b", descriptor = "Lclient!xa;")
	private Class37 aClass37_43;

	@OriginalMember(owner = "client!vfa", name = "i", descriptor = "Lclient!dp;")
	private final Class67 aClass67_1;

	@OriginalMember(owner = "client!vfa", name = "d", descriptor = "Lclient!pe;")
	private final Class254 aClass254_132;

	@OriginalMember(owner = "client!vfa", name = "<init>", descriptor = "(Lclient!pe;Lclient!dp;)V")
	public Class338(@OriginalArg(0) Class254 arg0, @OriginalArg(1) Class67 arg1) {
		this.aClass67_1 = arg1;
		this.aClass254_132 = arg0;
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(I)V")
	@Override
	public void method8277() {
		this.aClass37_43 = Static518.method7687(this.aClass67_1.anInt2311, this.aClass254_132);
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8276() {
		@Pc(16) int local16 = Static507.anInt9382 >= Static582.anInt10234 ? Static507.anInt9382 : Static582.anInt10234;
		@Pc(23) int local23 = Static294.anInt10217 <= Static227.anInt4616 ? Static227.anInt4616 : Static294.anInt10217;
		@Pc(27) int local27 = this.aClass37_43.AA();
		@Pc(31) int local31 = this.aClass37_43.a();
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = local16;
		@Pc(41) int local41 = local16 * local31 / local27;
		@Pc(48) int local48 = (local23 - local41) / 2;
		if (local41 > local23) {
			local48 = 0;
			local35 = local23 * local27 / local31;
			local41 = local23;
			local33 = (local16 - local35) / 2;
		}
		this.aClass37_43.method7080(local33, local48, local35, local41);
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8278() {
		return this.aClass254_132.method6417(this.aClass67_1.anInt2311);
	}
}
