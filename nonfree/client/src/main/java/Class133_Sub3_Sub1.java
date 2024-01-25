import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pba")
public final class Class133_Sub3_Sub1 extends Class133_Sub3 {

	@OriginalMember(owner = "client!pba", name = "<init>", descriptor = "(Lclient!gga;Lclient!gga;Lclient!po;)V")
	public Class133_Sub3_Sub1(@OriginalArg(0) Class124 arg0, @OriginalArg(1) Class124 arg1, @OriginalArg(2) Class139_Sub2_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(IIIII)V")
	@Override
	protected void method7278(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = super.aClass71_27.method7709();
		@Pc(19) int local19 = ((Class139_Sub2_Sub1) super.aClass139_5).anInt8371 * Static335.method5522() / 10 % local7;
		super.aClass71_27.method7701(arg2 + local19 - local7, arg0, arg3 + local7 - local19, arg1);
	}
}
