import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tu")
public final class Class139_Sub1_Sub1 extends Class139_Sub1 {

	@OriginalMember(owner = "client!tu", name = "<init>", descriptor = "(Lclient!rg;Lclient!rg;Lclient!lq;)V")
	public Class139_Sub1_Sub1(@OriginalArg(0) Class310 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class132_Sub1_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "(IIIII)V")
	@Override
	protected void method8476(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7 = super.aClass45_26.method7508();
		@Pc(19) int local19 = ((Class132_Sub1_Sub1) super.aClass132_5).anInt6143 * Static33.method571() / 10 % local7;
		super.aClass45_26.method7500(arg3 + local19 - local7, arg1, local7 + arg2 - local19, arg0);
	}
}
