import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rm")
public final class Class106_Sub3 extends Class106 {

	@OriginalMember(owner = "client!rm", name = "o", descriptor = "Lclient!hu;")
	private Class21 aClass21_29;

	@OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(Lclient!oh;Lclient!oh;Lclient!vv;)V")
	public Class106_Sub3(@OriginalArg(0) Class237 arg0, @OriginalArg(1) Class237 arg1, @OriginalArg(2) Class6_Sub3 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)V")
	@Override
	public void method8624() {
		super.method8624();
		this.aClass21_29 = Static269.method4648(super.aClass237_120, ((Class6_Sub3) super.aClass6_5).anInt10348);
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(ZIII)V")
	@Override
	protected void method7194(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static171.aClass16_5.method6106(arg1 - 2, arg0, super.aClass6_5.anInt10335 + 4, super.aClass6_5.anInt10336 + 2, ((Class6_Sub3) super.aClass6_5).anInt10343, 0);
		Static171.aClass16_5.method6106(arg1 - 1, arg0 + 1, super.aClass6_5.anInt10335 + 2, super.aClass6_5.anInt10336, 0, 0);
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(ZIIZ)V")
	@Override
	protected void method7195(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17 = this.method7191() * super.aClass6_5.anInt10335 / 10000;
		@Pc(20) int[] local20 = new int[4];
		Static171.aClass16_5.K(local20);
		Static171.aClass16_5.KA(arg0, arg1 + 2, arg0 - -local17, super.aClass6_5.anInt10336 + arg1);
		this.aClass21_29.method5789(arg0, arg1 + 2, super.aClass6_5.anInt10335, super.aClass6_5.anInt10336);
		Static171.aClass16_5.KA(local20[0], local20[1], local20[2], local20[3]);
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8623() {
		return super.method8623() ? super.aClass237_120.method6296(((Class6_Sub3) super.aClass6_5).anInt10348) : false;
	}
}
