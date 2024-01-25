import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class Class110_Sub1 extends Class110 {

	@OriginalMember(owner = "client!um", name = "v", descriptor = "I")
	public final int anInt4103;

	@OriginalMember(owner = "client!um", name = "x", descriptor = "I")
	public final int anInt4104;

	@OriginalMember(owner = "client!um", name = "y", descriptor = "I")
	public final int anInt4105;

	@OriginalMember(owner = "client!um", name = "u", descriptor = "I")
	public final int anInt4102;

	@OriginalMember(owner = "client!um", name = "s", descriptor = "I")
	public final int anInt4100;

	@OriginalMember(owner = "client!um", name = "q", descriptor = "I")
	public final int anInt4099;

	@OriginalMember(owner = "client!um", name = "<init>", descriptor = "(Lclient!sd;Lclient!ec;IIIIIIIIIIIII)V")
	public Class110_Sub1(@OriginalArg(0) Class309 arg0, @OriginalArg(1) Class86 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt4103 = arg13;
		this.anInt4104 = arg12;
		this.anInt4105 = arg11;
		this.anInt4102 = arg9;
		this.anInt4100 = arg14;
		this.anInt4099 = arg10;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(B)Lclient!ad;")
	@Override
	public Class6 method9087() {
		return Static454.aClass6_8;
	}
}
