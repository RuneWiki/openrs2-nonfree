import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class Class18_Sub3 extends Class18 {

	@OriginalMember(owner = "client!vj", name = "x", descriptor = "I")
	public final int anInt6657;

	@OriginalMember(owner = "client!vj", name = "q", descriptor = "I")
	public final int anInt6652;

	@OriginalMember(owner = "client!vj", name = "v", descriptor = "I")
	public final int anInt6656;

	@OriginalMember(owner = "client!vj", name = "m", descriptor = "I")
	public final int anInt6648;

	@OriginalMember(owner = "client!vj", name = "o", descriptor = "I")
	public final int anInt6650;

	@OriginalMember(owner = "client!vj", name = "l", descriptor = "I")
	public final int anInt6647;

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(Lclient!tl;Lclient!pd;IIIIIIIIIIIII)V")
	public Class18_Sub3(@OriginalArg(0) Class319 arg0, @OriginalArg(1) Class247 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt6657 = arg14;
		this.anInt6652 = arg11;
		this.anInt6656 = arg13;
		this.anInt6648 = arg12;
		this.anInt6650 = arg10;
		this.anInt6647 = arg9;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)Lclient!jd;")
	@Override
	public Class153 method6332() {
		return Static582.aClass153_14;
	}
}
