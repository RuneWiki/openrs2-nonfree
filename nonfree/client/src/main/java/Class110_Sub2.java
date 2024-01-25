import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public final class Class110_Sub2 extends Class110 {

	@OriginalMember(owner = "client!kh", name = "q", descriptor = "I")
	public final int anInt6190;

	@OriginalMember(owner = "client!kh", name = "s", descriptor = "I")
	public final int anInt6192;

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Lclient!sd;Lclient!ec;IIIIIIIIII)V")
	public Class110_Sub2(@OriginalArg(0) Class309 arg0, @OriginalArg(1) Class86 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt6190 = arg10;
		this.anInt6192 = arg11;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)Lclient!ad;")
	@Override
	public Class6 method9087() {
		return Static70.aClass6_2;
	}
}
