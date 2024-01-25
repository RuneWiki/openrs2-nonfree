import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public final class Class92_Sub2 extends Class92 {

	@OriginalMember(owner = "client!no", name = "s", descriptor = "I")
	public final int anInt7414;

	@OriginalMember(owner = "client!no", name = "u", descriptor = "I")
	public final int anInt7416;

	@OriginalMember(owner = "client!no", name = "<init>", descriptor = "(Lclient!in;Lclient!ti;IIIIIIIIII)V")
	public Class92_Sub2(@OriginalArg(0) Class168 arg0, @OriginalArg(1) Class339 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt7414 = arg10;
		this.anInt7416 = arg11;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(I)Lclient!saa;")
	@Override
	public Class310 method9078() {
		return Static79.aClass310_2;
	}
}
