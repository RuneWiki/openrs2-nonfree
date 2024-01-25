import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!il")
public final class Class128_Sub3 extends Class128 {

	@OriginalMember(owner = "client!il", name = "s", descriptor = "Lclient!pu;")
	private Class50 aClass50_24;

	@OriginalMember(owner = "client!il", name = "<init>", descriptor = "(Lclient!wm;Lclient!wm;Lclient!bp;)V")
	public Class128_Sub3(@OriginalArg(0) Class390 arg0, @OriginalArg(1) Class390 arg1, @OriginalArg(2) Class10_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7887() {
		return super.method7887() ? super.aClass390_62.method8905(((Class10_Sub1) super.aClass10_5).anInt804) : false;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IZZI)V")
	@Override
	protected void method4084(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		@Pc(17) int local17 = this.method4085() * super.aClass10_5.anInt10594 / 10000;
		@Pc(20) int[] local20 = new int[4];
		Static208.aClass65_7.K(local20);
		Static208.aClass65_7.KA(arg0, arg1 + 2, local17 + arg0, super.aClass10_5.anInt10595 + arg1);
		this.aClass50_24.method5989(arg0, arg1 + 2, super.aClass10_5.anInt10594, super.aClass10_5.anInt10595);
		Static208.aClass65_7.KA(local20[0], local20[1], local20[2], local20[3]);
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIZ)V")
	@Override
	protected void method4081(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static208.aClass65_7.method6895(arg0 - 2, arg1, super.aClass10_5.anInt10594 + 4, super.aClass10_5.anInt10595 + 2, ((Class10_Sub1) super.aClass10_5).anInt803, 0);
		Static208.aClass65_7.method6895(arg0 - 1, arg1 - -1, super.aClass10_5.anInt10594 + 2, super.aClass10_5.anInt10595, 0, 0);
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(I)V")
	@Override
	public void method7888() {
		super.method7888();
		this.aClass50_24 = Static144.method2605(super.aClass390_62, ((Class10_Sub1) super.aClass10_5).anInt804);
	}
}
