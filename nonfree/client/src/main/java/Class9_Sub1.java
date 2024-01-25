import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class Class9_Sub1 extends Class9 {

	@OriginalMember(owner = "client!tm", name = "u", descriptor = "I")
	public final int anInt407;

	@OriginalMember(owner = "client!tm", name = "w", descriptor = "I")
	public final int anInt409;

	@OriginalMember(owner = "client!tm", name = "n", descriptor = "I")
	public final int anInt400;

	@OriginalMember(owner = "client!tm", name = "q", descriptor = "I")
	public final int anInt403;

	@OriginalMember(owner = "client!tm", name = "z", descriptor = "I")
	public final int anInt411;

	@OriginalMember(owner = "client!tm", name = "r", descriptor = "I")
	public final int anInt404;

	@OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(Lclient!ct;Lclient!rc;IIIIIIIIIIIII)V")
	public Class9_Sub1(@OriginalArg(0) Class62 arg0, @OriginalArg(1) Class279 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt407 = arg9;
		this.anInt409 = arg10;
		this.anInt400 = arg12;
		this.anInt403 = arg11;
		this.anInt411 = arg14;
		this.anInt404 = arg13;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)Lclient!wea;")
	@Override
	public Class357 method7127() {
		return Static362.aClass357_9;
	}
}
