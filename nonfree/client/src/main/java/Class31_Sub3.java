import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tf")
public final class Class31_Sub3 extends Class31 {

	@OriginalMember(owner = "client!tf", name = "p", descriptor = "Lclient!it;")
	private Class28 aClass28_31;

	@OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(Lclient!la;Lclient!la;Lclient!wda;)V")
	public Class31_Sub3(@OriginalArg(0) Class207 arg0, @OriginalArg(1) Class207 arg1, @OriginalArg(2) Class119_Sub3 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V")
	@Override
	public void method8111() {
		super.method8111();
		this.aClass28_31 = Static124.method1879(super.aClass207_110, ((Class119_Sub3) super.aClass119_5).anInt10378);
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IBIZ)V")
	@Override
	protected void method7900(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(20) int local20 = this.method7897() * super.aClass119_5.anInt10371 / 10000;
		@Pc(23) int[] local23 = new int[4];
		Static213.aClass133_5.K(local23);
		Static213.aClass133_5.KA(arg0, arg1 + 2, local20 + arg0, arg1 + super.aClass119_5.anInt10373);
		this.aClass28_31.method4047(arg0, arg1 + 2, super.aClass119_5.anInt10371, super.aClass119_5.anInt10373);
		Static213.aClass133_5.KA(local23[0], local23[1], local23[2], local23[3]);
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8109() {
		return super.method8109() ? super.aClass207_110.method4678(((Class119_Sub3) super.aClass119_5).anInt10378) : false;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(ZIZI)V")
	@Override
	protected void method7899(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		Static213.aClass133_5.method7279(arg0 - 2, arg1, super.aClass119_5.anInt10371 + 4, super.aClass119_5.anInt10373 + 2, ((Class119_Sub3) super.aClass119_5).anInt10381, 0);
		Static213.aClass133_5.method7279(arg0 - 1, arg1 + 1, super.aClass119_5.anInt10371 + 2, super.aClass119_5.anInt10373, 0, 0);
	}
}
