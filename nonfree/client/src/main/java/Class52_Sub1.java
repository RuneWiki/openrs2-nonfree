import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class Class52_Sub1 extends Class52 {

	@OriginalMember(owner = "client!cf", name = "r", descriptor = "I")
	public final int anInt5408;

	@OriginalMember(owner = "client!cf", name = "s", descriptor = "I")
	public final int anInt5409;

	@OriginalMember(owner = "client!cf", name = "v", descriptor = "I")
	public final int anInt5412;

	@OriginalMember(owner = "client!cf", name = "p", descriptor = "I")
	public final int anInt5407;

	@OriginalMember(owner = "client!cf", name = "n", descriptor = "I")
	public final int anInt5405;

	@OriginalMember(owner = "client!cf", name = "o", descriptor = "I")
	public final int anInt5406;

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Lclient!rt;Lclient!cp;IIIIIIIIIIIII)V")
	public Class52_Sub1(@OriginalArg(0) Class297 arg0, @OriginalArg(1) Class58 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt5408 = arg9;
		this.anInt5409 = arg10;
		this.anInt5412 = arg14;
		this.anInt5407 = arg13;
		this.anInt5405 = arg12;
		this.anInt5406 = arg11;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)Lclient!os;")
	@Override
	public Class258 method7256() {
		return Static583.aClass258_22;
	}
}
