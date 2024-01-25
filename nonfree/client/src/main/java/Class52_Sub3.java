import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public final class Class52_Sub3 extends Class52 {

	@OriginalMember(owner = "client!tq", name = "s", descriptor = "I")
	public final int anInt8835;

	@OriginalMember(owner = "client!tq", name = "y", descriptor = "I")
	public final int anInt8840;

	@OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(Lclient!rt;Lclient!cp;IIIIIIIII)V")
	public Class52_Sub3(@OriginalArg(0) Class297 arg0, @OriginalArg(1) Class58 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt8835 = arg9;
		this.anInt8840 = arg10;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(B)Lclient!os;")
	@Override
	public Class258 method7256() {
		return Static327.aClass258_21;
	}
}
