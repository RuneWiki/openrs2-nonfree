import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ou")
public final class Class110_Sub3 extends Class110 {

	@OriginalMember(owner = "client!ou", name = "q", descriptor = "I")
	public final int anInt7744;

	@OriginalMember(owner = "client!ou", name = "w", descriptor = "I")
	public final int anInt7748;

	@OriginalMember(owner = "client!ou", name = "<init>", descriptor = "(Lclient!sd;Lclient!ec;IIIIIIIII)V")
	public Class110_Sub3(@OriginalArg(0) Class309 arg0, @OriginalArg(1) Class86 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt7744 = arg10;
		this.anInt7748 = arg9;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(B)Lclient!ad;")
	@Override
	public Class6 method9087() {
		return Static66.aClass6_12;
	}
}
