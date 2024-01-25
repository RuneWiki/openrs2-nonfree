import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oea")
public final class Class102_Sub1_Sub1 extends Class102_Sub1 {

	@OriginalMember(owner = "client!oea", name = "<init>", descriptor = "(Lclient!vo;Lclient!vo;Lclient!paa;)V")
	public Class102_Sub1_Sub1(@OriginalArg(0) Class348 arg0, @OriginalArg(1) Class348 arg1, @OriginalArg(2) Class50_Sub3_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(IIIII)V")
	@Override
	protected void method5810(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = super.aClass88_22.A();
		@Pc(19) int local19 = ((Class50_Sub3_Sub1) super.aClass50_5).anInt7657 * Static67.method1486() / 10 % local7;
		super.aClass88_22.method8043(local19 + arg0 - local7, arg1, local7 + arg2 - local19, arg3);
	}
}
