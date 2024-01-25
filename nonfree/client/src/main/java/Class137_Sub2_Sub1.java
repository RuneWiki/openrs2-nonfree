import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qr")
public final class Class137_Sub2_Sub1 extends Class137_Sub2 {

	@OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(Lclient!mv;Lclient!mv;Lclient!vt;)V")
	public Class137_Sub2_Sub1(@OriginalArg(0) Class229 arg0, @OriginalArg(1) Class229 arg1, @OriginalArg(2) Class153_Sub2_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(IIIII)V")
	@Override
	protected void method5834(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11 = super.aClass38_32.A();
		@Pc(23) int local23 = ((Class153_Sub2_Sub1) super.aClass153_5).anInt9328 * Static494.method6327() / 10 % local11;
		super.aClass38_32.method7457(local23 + arg2 - local11, arg1, arg0 + local11 - local23, arg3);
	}
}
