import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eja")
public final class Class94_Sub1 extends Class94 {

	@OriginalMember(owner = "client!eja", name = "w", descriptor = "Lclient!jd;")
	private Class20 aClass20_5;

	@OriginalMember(owner = "client!eja", name = "<init>", descriptor = "(Lclient!wia;Lclient!wia;Lclient!no;)V")
	public Class94_Sub1(@OriginalArg(0) Class386 arg0, @OriginalArg(1) Class386 arg1, @OriginalArg(2) Class92_Sub2 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!eja", name = "a", descriptor = "(IBIZ)V")
	@Override
	protected void method8743(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(20) int local20 = this.method8744() * super.aClass92_5.anInt10903 / 10000;
		@Pc(23) int[] local23 = new int[4];
		Static677.aClass137_47.K(local23);
		Static677.aClass137_47.KA(arg0, arg1 + 2, local20 + arg0, arg1 + super.aClass92_5.anInt10907);
		this.aClass20_5.method7414(arg0, arg1 + 2, super.aClass92_5.anInt10903, super.aClass92_5.anInt10907);
		Static677.aClass137_47.KA(local23[0], local23[1], local23[2], local23[3]);
	}

	@OriginalMember(owner = "client!eja", name = "a", descriptor = "(IIIZ)V")
	@Override
	protected void method8745(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static677.aClass137_47.method7927(arg1 - 2, arg0, super.aClass92_5.anInt10903 + 4, super.aClass92_5.anInt10907 - -2, ((Class92_Sub2) super.aClass92_5).anInt7414, 0);
		Static677.aClass137_47.method7927(arg1 - 1, arg0 + 1, super.aClass92_5.anInt10903 + 2, super.aClass92_5.anInt10907, 0, 0);
	}

	@OriginalMember(owner = "client!eja", name = "a", descriptor = "(I)V")
	@Override
	public void method8739() {
		super.method8739();
		this.aClass20_5 = Static410.method6055(super.aClass386_130, ((Class92_Sub2) super.aClass92_5).anInt7416);
	}

	@OriginalMember(owner = "client!eja", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8740() {
		return super.method8740() ? super.aClass386_130.method9206(((Class92_Sub2) super.aClass92_5).anInt7416) : false;
	}
}
