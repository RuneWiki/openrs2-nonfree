import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class Class21_Sub3 extends Class21 {

	@OriginalMember(owner = "client!sf", name = "v", descriptor = "I")
	public final int anInt3470;

	@OriginalMember(owner = "client!sf", name = "w", descriptor = "I")
	public final int anInt3476;

	@OriginalMember(owner = "client!sf", name = "u", descriptor = "I")
	public final int anInt3473;

	@OriginalMember(owner = "client!sf", name = "p", descriptor = "I")
	public final int anInt3477;

	@OriginalMember(owner = "client!sf", name = "y", descriptor = "I")
	public final int anInt3475;

	@OriginalMember(owner = "client!sf", name = "s", descriptor = "I")
	public final int anInt3474;

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Lclient!qk;Lclient!kr;IIIIIIIIIIIII)V")
	public Class21_Sub3(@OriginalArg(0) Class304 arg0, @OriginalArg(1) Class216 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt3470 = arg10;
		this.anInt3476 = arg9;
		this.anInt3473 = arg14;
		this.anInt3477 = arg11;
		this.anInt3475 = arg13;
		this.anInt3474 = arg12;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)Lclient!wv;")
	@Override
	public Class409 method7832() {
		return Static454.aClass409_12;
	}
}
