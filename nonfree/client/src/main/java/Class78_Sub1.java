import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dp")
public final class Class78_Sub1 extends Class78 {

	@OriginalMember(owner = "client!dp", name = "q", descriptor = "Lclient!vr;")
	private Class33 aClass33_4;

	@OriginalMember(owner = "client!dp", name = "<init>", descriptor = "(Lclient!aj;Lclient!aj;Lclient!k;)V")
	public Class78_Sub1(@OriginalArg(0) Class15 arg0, @OriginalArg(1) Class15 arg1, @OriginalArg(2) Class106_Sub2 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(IZII)V")
	@Override
	protected void method5191(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		@Pc(13) int local13 = this.method5193() * super.aClass106_5.anInt5840 / 10000;
		@Pc(25) int[] local25 = new int[4];
		Static674.aClass13_22.K(local25);
		Static674.aClass13_22.KA(arg1, arg0 + 2, local13 + arg1, super.aClass106_5.anInt5834 + arg0);
		this.aClass33_4.method7663(arg1, arg0 + 2, super.aClass106_5.anInt5840, super.aClass106_5.anInt5834);
		Static674.aClass13_22.KA(local25[0], local25[1], local25[2], local25[3]);
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(ZBII)V")
	@Override
	protected void method5195(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		Static674.aClass13_22.method8511(arg0 - 2, arg1, super.aClass106_5.anInt5840 + 4, super.aClass106_5.anInt5834 - -2, ((Class106_Sub2) super.aClass106_5).anInt4971, 0);
		Static674.aClass13_22.method8511(arg0 - 1, arg1 + 1, super.aClass106_5.anInt5840 + 2, super.aClass106_5.anInt5834, 0, 0);
	}

	@OriginalMember(owner = "client!dp", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7759() {
		return super.method7759() ? super.aClass15_93.method526(((Class106_Sub2) super.aClass106_5).anInt4967) : false;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(I)V")
	@Override
	public void method7758() {
		super.method7758();
		this.aClass33_4 = Static343.method5151(super.aClass15_93, ((Class106_Sub2) super.aClass106_5).anInt4967);
	}
}
