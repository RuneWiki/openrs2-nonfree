import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iga")
public final class Class133_Sub1 extends Class133 {

	@OriginalMember(owner = "client!iga", name = "w", descriptor = "Lclient!mq;")
	private Class71 aClass71_7;

	@OriginalMember(owner = "client!iga", name = "<init>", descriptor = "(Lclient!gga;Lclient!gga;Lclient!lca;)V")
	public Class133_Sub1(@OriginalArg(0) Class124 arg0, @OriginalArg(1) Class124 arg1, @OriginalArg(2) Class139_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(ZIII)V")
	@Override
	protected void method7275(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		@Pc(13) int local13 = this.method7270() * super.aClass139_5.anInt11174 / 10000;
		@Pc(20) int[] local20 = new int[4];
		Static607.aClass101_15.K(local20);
		Static607.aClass101_15.KA(arg1, arg0 + 2, local13 + arg1, super.aClass139_5.anInt11179 + arg0);
		this.aClass71_7.method7701(arg1, arg0 + 2, super.aClass139_5.anInt11174, super.aClass139_5.anInt11179);
		Static607.aClass101_15.KA(local20[0], local20[1], local20[2], local20[3]);
	}

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7668() {
		return super.method7668() ? super.aClass124_98.method3627(((Class139_Sub1) super.aClass139_5).anInt6052) : false;
	}

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(ZIIB)V")
	@Override
	protected void method7269(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static607.aClass101_15.method8129(arg1 - 2, arg0, super.aClass139_5.anInt11174 + 4, super.aClass139_5.anInt11179 - -2, ((Class139_Sub1) super.aClass139_5).anInt6047, 0);
		Static607.aClass101_15.method8129(arg1 - 1, arg0 + 1, super.aClass139_5.anInt11174 + 2, super.aClass139_5.anInt11179, 0, 0);
	}

	@OriginalMember(owner = "client!iga", name = "b", descriptor = "(I)V")
	@Override
	public void method7670() {
		super.method7670();
		this.aClass71_7 = Static296.method4890(super.aClass124_98, ((Class139_Sub1) super.aClass139_5).anInt6052);
	}
}
