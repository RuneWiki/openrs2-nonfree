import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wf")
public final class Class88_Sub3 extends Class88 {

	@OriginalMember(owner = "client!wf", name = "v", descriptor = "Lclient!xa;")
	private Class37 aClass37_44;

	@OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(Lclient!pe;Lclient!pe;Lclient!u;)V")
	public Class88_Sub3(@OriginalArg(0) Class254 arg0, @OriginalArg(1) Class254 arg1, @OriginalArg(2) Class260_Sub3 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZIII)V")
	@Override
	protected void method8280(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		@Pc(21) int local21 = this.method8279() * super.aClass260_5.anInt9475 / 10000;
		@Pc(24) int[] local24 = new int[4];
		Static546.aClass15_16.A(local24);
		Static546.aClass15_16.ca(arg1, arg0 + 2, local21 + arg1, arg0 + super.aClass260_5.anInt9476);
		this.aClass37_44.method7083(arg1, arg0 + 2, super.aClass260_5.anInt9475, super.aClass260_5.anInt9476);
		Static546.aClass15_16.ca(local24[0], local24[1], local24[2], local24[3]);
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IZIB)V")
	@Override
	protected void method8282(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static546.aClass15_16.method5334(arg1 - 2, arg0, super.aClass260_5.anInt9475 + 4, super.aClass260_5.anInt9476 - -2, ((Class260_Sub3) super.aClass260_5).anInt9480, 0);
		Static546.aClass15_16.method5334(arg1 - 1, arg0 + 1, super.aClass260_5.anInt9475 + 2, super.aClass260_5.anInt9476, 0, 0);
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8278() {
		return super.method8278() ? super.aClass254_138.method6417(((Class260_Sub3) super.aClass260_5).anInt9482) : false;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V")
	@Override
	public void method8277() {
		super.method8277();
		this.aClass37_44 = Static518.method7687(((Class260_Sub3) super.aClass260_5).anInt9482, super.aClass254_138);
	}
}
