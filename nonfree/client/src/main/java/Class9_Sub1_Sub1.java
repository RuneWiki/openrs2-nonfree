import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aea")
public final class Class9_Sub1_Sub1 extends Class9_Sub1 {

	@OriginalMember(owner = "client!aea", name = "D", descriptor = "I")
	public final int anInt414;

	@OriginalMember(owner = "client!aea", name = "<init>", descriptor = "(Lclient!ct;Lclient!rc;IIIIIIIIIIIIII)V")
	public Class9_Sub1_Sub1(@OriginalArg(0) Class62 arg0, @OriginalArg(1) Class279 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14);
		this.anInt414 = arg15;
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(I)Lclient!wea;")
	@Override
	public Class357 method7127() {
		return Static185.aClass357_14;
	}
}
