import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public final class Class96_Sub2 extends Class96 {

	@OriginalMember(owner = "client!oh", name = "l", descriptor = "I")
	public final int anInt6965;

	@OriginalMember(owner = "client!oh", name = "m", descriptor = "I")
	public final int anInt6966;

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Lclient!le;Lclient!qj;IIIIIIIII)V")
	public Class96_Sub2(@OriginalArg(0) Class204 arg0, @OriginalArg(1) Class288 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt6965 = arg10;
		this.anInt6966 = arg9;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)Lclient!mha;")
	@Override
	public Class228 method8022() {
		return Static509.aClass228_9;
	}
}
