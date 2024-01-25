import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eia")
public class Class92_Sub1 extends Class92 {

	@OriginalMember(owner = "client!eia", name = "t", descriptor = "I")
	public final int anInt4236;

	@OriginalMember(owner = "client!eia", name = "w", descriptor = "I")
	public final int anInt4239;

	@OriginalMember(owner = "client!eia", name = "u", descriptor = "I")
	public final int anInt4237;

	@OriginalMember(owner = "client!eia", name = "s", descriptor = "I")
	public final int anInt4235;

	@OriginalMember(owner = "client!eia", name = "p", descriptor = "I")
	public final int anInt4234;

	@OriginalMember(owner = "client!eia", name = "o", descriptor = "I")
	public final int anInt4233;

	@OriginalMember(owner = "client!eia", name = "<init>", descriptor = "(Lclient!in;Lclient!ti;IIIIIIIIIIIII)V")
	public Class92_Sub1(@OriginalArg(0) Class168 arg0, @OriginalArg(1) Class339 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt4236 = arg14;
		this.anInt4239 = arg9;
		this.anInt4237 = arg11;
		this.anInt4235 = arg12;
		this.anInt4234 = arg10;
		this.anInt4233 = arg13;
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(I)Lclient!saa;")
	@Override
	public Class310 method9078() {
		return Static334.aClass310_8;
	}
}
