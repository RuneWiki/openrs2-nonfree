import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vv")
public final class Class6_Sub3 extends Class6 {

	@OriginalMember(owner = "client!vv", name = "w", descriptor = "I")
	public final int anInt10348;

	@OriginalMember(owner = "client!vv", name = "p", descriptor = "I")
	public final int anInt10343;

	@OriginalMember(owner = "client!vv", name = "<init>", descriptor = "(Lclient!kda;Lclient!cu;IIIIIIIIII)V")
	public Class6_Sub3(@OriginalArg(0) Class173 arg0, @OriginalArg(1) Class60 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt10348 = arg11;
		this.anInt10343 = arg10;
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(I)Lclient!hs;")
	@Override
	public Class138 method8348() {
		return Static641.aClass138_10;
	}
}
