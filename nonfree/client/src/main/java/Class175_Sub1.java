import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public class Class175_Sub1 extends Class175 {

	@OriginalMember(owner = "client!jp", name = "C", descriptor = "I")
	public final int anInt9486;

	@OriginalMember(owner = "client!jp", name = "x", descriptor = "I")
	public final int anInt9481;

	@OriginalMember(owner = "client!jp", name = "y", descriptor = "I")
	public final int anInt9482;

	@OriginalMember(owner = "client!jp", name = "A", descriptor = "I")
	public final int anInt9484;

	@OriginalMember(owner = "client!jp", name = "B", descriptor = "I")
	public final int anInt9485;

	@OriginalMember(owner = "client!jp", name = "t", descriptor = "I")
	public final int anInt9478;

	@OriginalMember(owner = "client!jp", name = "<init>", descriptor = "(Lclient!tl;Lclient!fn;IIIIIIIIIIIII)V")
	public Class175_Sub1(@OriginalArg(0) Class314 arg0, @OriginalArg(1) Class103 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt9486 = arg13;
		this.anInt9481 = arg14;
		this.anInt9482 = arg9;
		this.anInt9484 = arg11;
		this.anInt9485 = arg10;
		this.anInt9478 = arg12;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(I)Lclient!tca;")
	@Override
	public Class307 method7827() {
		return Static478.aClass307_15;
	}
}
