import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bca")
public final class Class21_Sub2 extends Class21 {

	@OriginalMember(owner = "client!bca", name = "s", descriptor = "I")
	public final int anInt717;

	@OriginalMember(owner = "client!bca", name = "o", descriptor = "I")
	public final int anInt715;

	@OriginalMember(owner = "client!bca", name = "<init>", descriptor = "(Lclient!qk;Lclient!kr;IIIIIIIIII)V")
	public Class21_Sub2(@OriginalArg(0) Class304 arg0, @OriginalArg(1) Class216 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt717 = arg10;
		this.anInt715 = arg11;
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(I)Lclient!wv;")
	@Override
	public Class409 method7832() {
		return Static228.aClass409_13;
	}
}
