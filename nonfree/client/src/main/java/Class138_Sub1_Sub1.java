import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qp")
public final class Class138_Sub1_Sub1 extends Class138_Sub1 {

	@OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(Lclient!uq;Lclient!uq;Lclient!ar;)V")
	public Class138_Sub1_Sub1(@OriginalArg(0) Class362 arg0, @OriginalArg(1) Class362 arg1, @OriginalArg(2) Class21_Sub1_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IIBII)V")
	@Override
	protected void method6546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = super.aClass6_31.method5130();
		@Pc(27) int local27 = ((Class21_Sub1_Sub1) super.aClass21_5).anInt681 * Static474.method6315() / 10 % local7;
		super.aClass6_31.method5139(arg1 + local27 - local7, arg3, local7 + arg2 - local27, arg0);
	}
}
