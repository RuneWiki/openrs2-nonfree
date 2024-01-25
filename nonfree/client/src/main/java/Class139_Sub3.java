import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!us")
public final class Class139_Sub3 extends Class139 {

	@OriginalMember(owner = "client!us", name = "x", descriptor = "Lclient!fia;")
	private Class45 aClass45_33;

	@OriginalMember(owner = "client!us", name = "<init>", descriptor = "(Lclient!rg;Lclient!rg;Lclient!tka;)V")
	public Class139_Sub3(@OriginalArg(0) Class310 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class132_Sub3 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(ZIIZ)V")
	@Override
	protected void method8823(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static103.aClass144_3.method6923(arg1 - 2, arg0, super.aClass132_5.anInt9737 + 4, super.aClass132_5.anInt9742 + 2, ((Class132_Sub3) super.aClass132_5).anInt9756, 0);
		Static103.aClass144_3.method6923(arg1 - 1, arg0 + 1, super.aClass132_5.anInt9737 + 2, super.aClass132_5.anInt9742, 0, 0);
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8820() {
		return super.method8820() ? super.aClass310_123.method7785(((Class132_Sub3) super.aClass132_5).anInt9755) : false;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(B)V")
	@Override
	public void method8821() {
		super.method8821();
		this.aClass45_33 = Static411.method6195(super.aClass310_123, ((Class132_Sub3) super.aClass132_5).anInt9755);
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IIZI)V")
	@Override
	protected void method8824(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(21) int local21 = this.method8826() * super.aClass132_5.anInt9737 / 10000;
		@Pc(24) int[] local24 = new int[4];
		Static103.aClass144_3.K(local24);
		Static103.aClass144_3.KA(arg0, arg1 + 2, arg0 + local21, super.aClass132_5.anInt9742 + arg1);
		this.aClass45_33.method7500(arg0, arg1 + 2, super.aClass132_5.anInt9737, super.aClass132_5.anInt9742);
		Static103.aClass144_3.KA(local24[0], local24[1], local24[2], local24[3]);
	}
}
