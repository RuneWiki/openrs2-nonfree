import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hja")
public class Class84_Sub1 extends Class84 {

	@OriginalMember(owner = "client!hja", name = "w", descriptor = "I")
	public final int anInt6452;

	@OriginalMember(owner = "client!hja", name = "u", descriptor = "I")
	public final int anInt6450;

	@OriginalMember(owner = "client!hja", name = "t", descriptor = "I")
	public final int anInt6449;

	@OriginalMember(owner = "client!hja", name = "E", descriptor = "I")
	public final int anInt6458;

	@OriginalMember(owner = "client!hja", name = "x", descriptor = "I")
	public final int anInt6453;

	@OriginalMember(owner = "client!hja", name = "v", descriptor = "I")
	public final int anInt6451;

	@OriginalMember(owner = "client!hja", name = "<init>", descriptor = "(Lclient!eaa;Lclient!cq;IIIIIIIIIIIII)V")
	public Class84_Sub1(@OriginalArg(0) Class92 arg0, @OriginalArg(1) Class65 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt6452 = arg14;
		this.anInt6450 = arg10;
		this.anInt6449 = arg12;
		this.anInt6458 = arg9;
		this.anInt6453 = arg13;
		this.anInt6451 = arg11;
	}

	@OriginalMember(owner = "client!hja", name = "a", descriptor = "(I)Lclient!aca;")
	@Override
	public Class6 method8749() {
		return Static387.aClass6_22;
	}
}
