import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public final class Class103_Sub3 extends Class103 {

	@OriginalMember(owner = "client!ta", name = "q", descriptor = "I")
	public final int anInt8654;

	@OriginalMember(owner = "client!ta", name = "t", descriptor = "I")
	public final int anInt8657;

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Lclient!ps;Lclient!ft;IIIIIIIIII)V")
	public Class103_Sub3(@OriginalArg(0) Class291 arg0, @OriginalArg(1) Class125 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt8654 = arg10;
		this.anInt8657 = arg11;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)Lclient!lf;")
	@Override
	public Class210 method7539() {
		return Static537.aClass210_16;
	}
}
