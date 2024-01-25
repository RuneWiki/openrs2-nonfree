import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uo")
public final class Class24_Sub4 extends Class24 {

	@OriginalMember(owner = "client!uo", name = "m", descriptor = "I")
	private final int anInt9960;

	@OriginalMember(owner = "client!uo", name = "j", descriptor = "I")
	private final int anInt9958;

	@OriginalMember(owner = "client!uo", name = "q", descriptor = "I")
	private final int anInt9964;

	@OriginalMember(owner = "client!uo", name = "i", descriptor = "I")
	private final int anInt9957;

	@OriginalMember(owner = "client!uo", name = "r", descriptor = "I")
	private final int anInt9965;

	@OriginalMember(owner = "client!uo", name = "h", descriptor = "I")
	private final int anInt9956;

	@OriginalMember(owner = "client!uo", name = "s", descriptor = "I")
	private final int anInt9966;

	@OriginalMember(owner = "client!uo", name = "p", descriptor = "I")
	private final int anInt9963;

	@OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class24_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt9960 = arg1;
		this.anInt9958 = arg4;
		this.anInt9964 = arg5;
		this.anInt9957 = arg7;
		this.anInt9965 = arg3;
		this.anInt9956 = arg0;
		this.anInt9966 = arg2;
		this.anInt9963 = arg6;
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIB)V")
	@Override
	public void method8409(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(BII)V")
	@Override
	public void method8413(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IBI)V")
	@Override
	public void method8414(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt9956 * arg0 >> 12;
		@Pc(17) int local17 = this.anInt9960 * arg1 >> 12;
		@Pc(32) int local32 = arg0 * this.anInt9966 >> 12;
		@Pc(39) int local39 = arg1 * this.anInt9965 >> 12;
		@Pc(46) int local46 = arg0 * this.anInt9958 >> 12;
		@Pc(53) int local53 = arg1 * this.anInt9964 >> 12;
		@Pc(60) int local60 = arg0 * this.anInt9963 >> 12;
		@Pc(67) int local67 = this.anInt9957 * arg1 >> 12;
		Static450.method8715(local32, super.anInt9953, local39, local46, local53, local10, local17, local60, local67);
	}
}
