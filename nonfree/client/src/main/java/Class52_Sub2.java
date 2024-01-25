import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public final class Class52_Sub2 extends Class52 {

	@OriginalMember(owner = "client!kr", name = "q", descriptor = "I")
	public final int anInt5262;

	@OriginalMember(owner = "client!kr", name = "o", descriptor = "I")
	public final int anInt5260;

	@OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(Lclient!rt;Lclient!cp;IIIIIIIIII)V")
	public Class52_Sub2(@OriginalArg(0) Class297 arg0, @OriginalArg(1) Class58 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt5262 = arg10;
		this.anInt5260 = arg11;
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(B)Lclient!os;")
	@Override
	public Class258 method7256() {
		return Static367.aClass258_20;
	}
}
