import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fba")
public final class Class25_Sub2 extends Class25 {

	@OriginalMember(owner = "client!fba", name = "t", descriptor = "[Lclient!bl;")
	private static final Class45[] aClass45Array1 = new Class45[32];

	static {
		@Pc(104) Class45[] local104 = Static454.method6683();
		for (@Pc(106) int local106 = 0; local106 < local104.length; local106++) {
			aClass45Array1[local104[local106].anInt829] = local104[local106];
		}
	}

	@OriginalMember(owner = "client!fba", name = "<init>", descriptor = "(Lclient!la;Lclient!la;Lclient!ega;)V")
	public Class25_Sub2(@OriginalArg(0) Class208 arg0, @OriginalArg(1) Class208 arg1, @OriginalArg(2) Class31_Sub2 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(ZIZI)V")
	@Override
	protected void method7938(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		@Pc(18) int local18 = this.method7936() * super.aClass31_5.anInt9301 / 10000;
		Static457.aClass57_11.aa(arg0, arg1 + 2, local18, super.aClass31_5.anInt9302 - 2, ((Class31_Sub2) super.aClass31_5).anInt2252, 0);
		Static457.aClass57_11.aa(local18 + arg0, arg1 + 2, super.aClass31_5.anInt9301 - local18, super.aClass31_5.anInt9302 + -2, 0, 0);
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(ZIBI)V")
	@Override
	protected void method7937(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		Static457.aClass57_11.method7681(arg0 - 2, arg1, super.aClass31_5.anInt9301 + 4, super.aClass31_5.anInt9302 + 2, ((Class31_Sub2) super.aClass31_5).anInt2251, 0);
		Static457.aClass57_11.method7681(arg0 - 1, arg1 + 1, super.aClass31_5.anInt9301 + 2, super.aClass31_5.anInt9302, 0, 0);
	}
}
