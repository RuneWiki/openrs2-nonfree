import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nga")
public final class Class190_Sub1_Sub1 extends Class190_Sub1 {

	@OriginalMember(owner = "client!nga", name = "<init>", descriptor = "(Lclient!gj;Lclient!gj;Lclient!mea;)V")
	public Class190_Sub1_Sub1(@OriginalArg(0) Class143 arg0, @OriginalArg(1) Class143 arg1, @OriginalArg(2) Class84_Sub1_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(BIIII)V")
	@Override
	protected void method5688(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = super.aClass102_27.method6951();
		@Pc(19) int local19 = ((Class84_Sub1_Sub1) super.aClass84_5).anInt6460 * Static555.method7592() / 10 % local7;
		super.aClass102_27.method6949(local19 + arg1 - local7, arg3, arg0 + local7 - local19, arg2);
	}
}
