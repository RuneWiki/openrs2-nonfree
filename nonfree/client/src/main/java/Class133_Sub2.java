import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mu")
public final class Class133_Sub2 extends Class133 {

	@OriginalMember(owner = "client!mu", name = "<init>", descriptor = "(Lclient!gga;Lclient!gga;Lclient!wb;)V")
	public Class133_Sub2(@OriginalArg(0) Class124 arg0, @OriginalArg(1) Class124 arg1, @OriginalArg(2) Class139_Sub3 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(ZIII)V")
	@Override
	protected void method7275(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		@Pc(13) int local13 = this.method7270() * super.aClass139_5.anInt11174 / 10000;
		Static607.aClass101_15.aa(arg1, arg0 + 2, local13, super.aClass139_5.anInt11179 - 2, ((Class139_Sub3) super.aClass139_5).anInt11182, 0);
		Static607.aClass101_15.aa(arg1 + local13, arg0 + 2, super.aClass139_5.anInt11174 - local13, super.aClass139_5.anInt11179 + -2, 0, 0);
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(ZIIB)V")
	@Override
	protected void method7269(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static607.aClass101_15.method8129(arg1 - 2, arg0, super.aClass139_5.anInt11174 + 4, super.aClass139_5.anInt11179 + 2, ((Class139_Sub3) super.aClass139_5).anInt11185, 0);
		Static607.aClass101_15.method8129(arg1 - 1, arg0 + 1, super.aClass139_5.anInt11174 + 2, super.aClass139_5.anInt11179, 0, 0);
	}
}
