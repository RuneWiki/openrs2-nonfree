import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ew")
public final class Class103_Sub1 extends Class103 {

	@OriginalMember(owner = "client!ew", name = "w", descriptor = "I")
	public final int anInt2617;

	@OriginalMember(owner = "client!ew", name = "s", descriptor = "I")
	public final int anInt2613;

	@OriginalMember(owner = "client!ew", name = "<init>", descriptor = "(Lclient!ps;Lclient!ft;IIIIIIIII)V")
	public Class103_Sub1(@OriginalArg(0) Class291 arg0, @OriginalArg(1) Class125 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt2617 = arg9;
		this.anInt2613 = arg10;
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(I)Lclient!lf;")
	@Override
	public Class210 method7539() {
		return Static679.aClass210_19;
	}
}
