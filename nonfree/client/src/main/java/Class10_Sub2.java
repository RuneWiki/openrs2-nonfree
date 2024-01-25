import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iv")
public class Class10_Sub2 extends Class10 {

	@OriginalMember(owner = "client!iv", name = "n", descriptor = "I")
	public final int anInt5650;

	@OriginalMember(owner = "client!iv", name = "q", descriptor = "I")
	public final int anInt5653;

	@OriginalMember(owner = "client!iv", name = "o", descriptor = "I")
	public final int anInt5651;

	@OriginalMember(owner = "client!iv", name = "p", descriptor = "I")
	public final int anInt5652;

	@OriginalMember(owner = "client!iv", name = "t", descriptor = "I")
	public final int anInt5656;

	@OriginalMember(owner = "client!iv", name = "m", descriptor = "I")
	public final int anInt5649;

	@OriginalMember(owner = "client!iv", name = "<init>", descriptor = "(Lclient!pf;Lclient!dg;IIIIIIIIIIIII)V")
	public Class10_Sub2(@OriginalArg(0) Class275 arg0, @OriginalArg(1) Class81 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt5650 = arg12;
		this.anInt5653 = arg14;
		this.anInt5651 = arg13;
		this.anInt5652 = arg11;
		this.anInt5656 = arg9;
		this.anInt5649 = arg10;
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(B)Lclient!gp;")
	@Override
	public Class139 method8810() {
		return Static340.aClass139_5;
	}
}
