import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class Class153_Sub2 extends Class153 {

	@OriginalMember(owner = "client!pc", name = "m", descriptor = "I")
	public final int anInt9319;

	@OriginalMember(owner = "client!pc", name = "l", descriptor = "I")
	public final int anInt9318;

	@OriginalMember(owner = "client!pc", name = "o", descriptor = "I")
	public final int anInt9321;

	@OriginalMember(owner = "client!pc", name = "p", descriptor = "I")
	public final int anInt9322;

	@OriginalMember(owner = "client!pc", name = "w", descriptor = "I")
	public final int anInt9326;

	@OriginalMember(owner = "client!pc", name = "n", descriptor = "I")
	public final int anInt9320;

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Lclient!tca;Lclient!vea;IIIIIIIIIIIII)V")
	public Class153_Sub2(@OriginalArg(0) Class322 arg0, @OriginalArg(1) Class347 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt9319 = arg11;
		this.anInt9318 = arg12;
		this.anInt9321 = arg14;
		this.anInt9322 = arg13;
		this.anInt9326 = arg9;
		this.anInt9320 = arg10;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)Lclient!mh;")
	@Override
	public Class225 method7443() {
		return Static190.aClass225_11;
	}
}
