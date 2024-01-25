import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uca")
public class Class6_Sub2 extends Class6 {

	@OriginalMember(owner = "client!uca", name = "s", descriptor = "I")
	public final int anInt4296;

	@OriginalMember(owner = "client!uca", name = "C", descriptor = "I")
	public final int anInt4302;

	@OriginalMember(owner = "client!uca", name = "y", descriptor = "I")
	public final int anInt4299;

	@OriginalMember(owner = "client!uca", name = "p", descriptor = "I")
	public final int anInt4293;

	@OriginalMember(owner = "client!uca", name = "x", descriptor = "I")
	public final int anInt4298;

	@OriginalMember(owner = "client!uca", name = "z", descriptor = "I")
	public final int anInt4300;

	@OriginalMember(owner = "client!uca", name = "<init>", descriptor = "(Lclient!kda;Lclient!cu;IIIIIIIIIIIII)V")
	public Class6_Sub2(@OriginalArg(0) Class173 arg0, @OriginalArg(1) Class60 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt4296 = arg11;
		this.anInt4302 = arg9;
		this.anInt4299 = arg10;
		this.anInt4293 = arg13;
		this.anInt4298 = arg12;
		this.anInt4300 = arg14;
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(I)Lclient!hs;")
	@Override
	public Class138 method8348() {
		return Static346.aClass138_4;
	}
}
