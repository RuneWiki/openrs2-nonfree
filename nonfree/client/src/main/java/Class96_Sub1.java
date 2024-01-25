import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eja")
public class Class96_Sub1 extends Class96 {

	@OriginalMember(owner = "client!eja", name = "m", descriptor = "I")
	public final int anInt6334;

	@OriginalMember(owner = "client!eja", name = "w", descriptor = "I")
	public final int anInt6344;

	@OriginalMember(owner = "client!eja", name = "n", descriptor = "I")
	public final int anInt6335;

	@OriginalMember(owner = "client!eja", name = "p", descriptor = "I")
	public final int anInt6337;

	@OriginalMember(owner = "client!eja", name = "t", descriptor = "I")
	public final int anInt6341;

	@OriginalMember(owner = "client!eja", name = "v", descriptor = "I")
	public final int anInt6343;

	@OriginalMember(owner = "client!eja", name = "<init>", descriptor = "(Lclient!le;Lclient!qj;IIIIIIIIIIIII)V")
	public Class96_Sub1(@OriginalArg(0) Class204 arg0, @OriginalArg(1) Class288 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt6334 = arg14;
		this.anInt6344 = arg12;
		this.anInt6335 = arg13;
		this.anInt6337 = arg11;
		this.anInt6341 = arg9;
		this.anInt6343 = arg10;
	}

	@OriginalMember(owner = "client!eja", name = "a", descriptor = "(B)Lclient!mha;")
	@Override
	public Class228 method8022() {
		return Static408.aClass228_7;
	}
}
