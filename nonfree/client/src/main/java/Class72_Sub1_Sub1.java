import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lw")
public final class Class72_Sub1_Sub1 extends Class72_Sub1 {

	@OriginalMember(owner = "client!lw", name = "<init>", descriptor = "(Lclient!pu;Lclient!pu;Lclient!hc;)V")
	public Class72_Sub1_Sub1(@OriginalArg(0) Class270 arg0, @OriginalArg(1) Class270 arg1, @OriginalArg(2) Class54_Sub2_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(IIIII)V")
	@Override
	protected void method4325(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) int local12 = super.aClass22_32.A();
		@Pc(24) int local24 = ((Class54_Sub2_Sub1) super.aClass54_5).anInt3240 * Static490.method6641() / 10 % local12;
		super.aClass22_32.method7657(arg2 + local24 - local12, arg0, local12 + arg1 - local24, arg3);
	}
}
