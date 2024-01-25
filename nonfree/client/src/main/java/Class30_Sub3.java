import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sq")
public final class Class30_Sub3 extends Class30 {

	@OriginalMember(owner = "client!sq", name = "t", descriptor = "Lclient!ufa;")
	private Class4 aClass4_29;

	@OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(Lclient!ni;Lclient!ni;Lclient!tu;)V")
	public Class30_Sub3(@OriginalArg(0) Class223 arg0, @OriginalArg(1) Class223 arg1, @OriginalArg(2) Class109_Sub2 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIBZ)V")
	@Override
	protected void method7537(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static467.aClass5_13.method6142(arg1 - 2, arg0, super.aClass109_5.anInt9913 + 4, super.aClass109_5.anInt9904 - -2, ((Class109_Sub2) super.aClass109_5).anInt9605, 0);
		Static467.aClass5_13.method6142(arg1 - 1, arg0 - -1, super.aClass109_5.anInt9913 + 2, super.aClass109_5.anInt9904, 0, 0);
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7993() {
		return super.method7993() ? super.aClass223_124.method5951(((Class109_Sub2) super.aClass109_5).anInt9600) : false;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(B)V")
	@Override
	public void method7992() {
		super.method7992();
		this.aClass4_29 = Static100.method2419(((Class109_Sub2) super.aClass109_5).anInt9600, super.aClass223_124);
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIIZ)V")
	@Override
	protected void method7542(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = this.method7540() * super.aClass109_5.anInt9913 / 10000;
		@Pc(18) int[] local18 = new int[4];
		Static467.aClass5_13.K(local18);
		Static467.aClass5_13.KA(arg1, arg0 + 2, arg1 + local15, arg0 + super.aClass109_5.anInt9904);
		this.aClass4_29.method7701(arg1, arg0 + 2, super.aClass109_5.anInt9913, super.aClass109_5.anInt9904);
		Static467.aClass5_13.KA(local18[0], local18[1], local18[2], local18[3]);
	}
}
