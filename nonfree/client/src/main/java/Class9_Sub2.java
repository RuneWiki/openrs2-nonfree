import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public final class Class9_Sub2 extends Class9 {

	@OriginalMember(owner = "client!bw", name = "r", descriptor = "I")
	public final int anInt1173;

	@OriginalMember(owner = "client!bw", name = "o", descriptor = "I")
	public final int anInt1171;

	@OriginalMember(owner = "client!bw", name = "<init>", descriptor = "(Lclient!ct;Lclient!rc;IIIIIIIIII)V")
	public Class9_Sub2(@OriginalArg(0) Class62 arg0, @OriginalArg(1) Class279 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt1173 = arg10;
		this.anInt1171 = arg11;
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(I)Lclient!wea;")
	@Override
	public Class357 method7127() {
		return Static543.aClass357_13;
	}
}
