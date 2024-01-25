import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class Class58_Sub2 extends Class58 {

	@OriginalMember(owner = "client!no", name = "t", descriptor = "I")
	public final int anInt9130;

	@OriginalMember(owner = "client!no", name = "v", descriptor = "I")
	public final int anInt9124;

	@OriginalMember(owner = "client!no", name = "s", descriptor = "I")
	public final int anInt9129;

	@OriginalMember(owner = "client!no", name = "q", descriptor = "I")
	public final int anInt9126;

	@OriginalMember(owner = "client!no", name = "A", descriptor = "I")
	public final int anInt9125;

	@OriginalMember(owner = "client!no", name = "u", descriptor = "I")
	public final int anInt9131;

	@OriginalMember(owner = "client!no", name = "<init>", descriptor = "(Lclient!rj;Lclient!mq;IIIIIIIIIIIII)V")
	public Class58_Sub2(@OriginalArg(0) Class318 arg0, @OriginalArg(1) Class238 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt9130 = arg11;
		this.anInt9124 = arg14;
		this.anInt9129 = arg10;
		this.anInt9126 = arg12;
		this.anInt9125 = arg13;
		this.anInt9131 = arg9;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(I)Lclient!uu;")
	@Override
	public Class369 method8734() {
		return Static172.aClass369_7;
	}
}
