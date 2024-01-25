import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public final class Class96_Sub3 extends Class96 {

	@OriginalMember(owner = "client!uc", name = "o", descriptor = "I")
	public final int anInt9365;

	@OriginalMember(owner = "client!uc", name = "l", descriptor = "I")
	public final int anInt9363;

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Lclient!le;Lclient!qj;IIIIIIIIII)V")
	public Class96_Sub3(@OriginalArg(0) Class204 arg0, @OriginalArg(1) Class288 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt9365 = arg10;
		this.anInt9363 = arg11;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)Lclient!mha;")
	@Override
	public Class228 method8022() {
		return Static274.aClass228_12;
	}
}
