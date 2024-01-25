import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class Class104_Sub2 extends Class104 {

	@OriginalMember(owner = "client!in", name = "y", descriptor = "I")
	public final int anInt4414;

	@OriginalMember(owner = "client!in", name = "r", descriptor = "I")
	public final int anInt4413;

	@OriginalMember(owner = "client!in", name = "o", descriptor = "I")
	public final int anInt4411;

	@OriginalMember(owner = "client!in", name = "q", descriptor = "I")
	public final int anInt4412;

	@OriginalMember(owner = "client!in", name = "v", descriptor = "I")
	public final int anInt4410;

	@OriginalMember(owner = "client!in", name = "s", descriptor = "I")
	public final int anInt4409;

	@OriginalMember(owner = "client!in", name = "<init>", descriptor = "(Lclient!lea;Lclient!taa;IIIIIIIIIIIII)V")
	public Class104_Sub2(@OriginalArg(0) Class223 arg0, @OriginalArg(1) Class352 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt4414 = arg13;
		this.anInt4413 = arg11;
		this.anInt4411 = arg12;
		this.anInt4412 = arg14;
		this.anInt4410 = arg10;
		this.anInt4409 = arg9;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(I)Lclient!vf;")
	@Override
	public Class390 method7510() {
		return Static624.aClass390_10;
	}
}
