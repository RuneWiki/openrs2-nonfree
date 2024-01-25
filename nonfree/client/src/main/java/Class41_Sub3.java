import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public final class Class41_Sub3 extends Class41 {

	@OriginalMember(owner = "client!fa", name = "v", descriptor = "I")
	public final int anInt3543;

	@OriginalMember(owner = "client!fa", name = "w", descriptor = "I")
	public final int anInt3544;

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(Lclient!gq;Lclient!kfa;IIIIIIIIII)V")
	public Class41_Sub3(@OriginalArg(0) Class117 arg0, @OriginalArg(1) Class178 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt3543 = arg10;
		this.anInt3544 = arg11;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Z)Lclient!qi;")
	@Override
	public Class275 method8059() {
		return Static216.aClass275_3;
	}
}
