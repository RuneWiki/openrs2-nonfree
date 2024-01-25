import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lk")
public final class Class78_Sub3_Sub1 extends Class78_Sub3 {

	@OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(Lclient!aj;Lclient!aj;Lclient!fl;)V")
	public Class78_Sub3_Sub1(@OriginalArg(0) Class15 arg0, @OriginalArg(1) Class15 arg1, @OriginalArg(2) Class106_Sub1_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IZIII)V")
	@Override
	protected void method5196(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = super.aClass33_23.method7645();
		@Pc(19) int local19 = ((Class106_Sub1_Sub1) super.aClass106_5).anInt3395 * Static373.method5405() / 10 % local7;
		super.aClass33_23.method7663(arg2 + local19 - local7, arg1, local7 + arg0 - local19, arg3);
	}
}
