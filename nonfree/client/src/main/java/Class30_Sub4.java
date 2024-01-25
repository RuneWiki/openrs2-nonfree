import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uw")
public final class Class30_Sub4 extends Class30 {

	@OriginalMember(owner = "client!uw", name = "q", descriptor = "I")
	private final int anInt10000;

	@OriginalMember(owner = "client!uw", name = "r", descriptor = "I")
	private final int anInt10001;

	@OriginalMember(owner = "client!uw", name = "g", descriptor = "I")
	private final int anInt9992;

	@OriginalMember(owner = "client!uw", name = "s", descriptor = "I")
	private final int anInt10002;

	@OriginalMember(owner = "client!uw", name = "l", descriptor = "I")
	private final int anInt9996;

	@OriginalMember(owner = "client!uw", name = "j", descriptor = "I")
	private final int anInt9994;

	@OriginalMember(owner = "client!uw", name = "i", descriptor = "I")
	private final int anInt9993;

	@OriginalMember(owner = "client!uw", name = "o", descriptor = "I")
	private final int anInt9998;

	@OriginalMember(owner = "client!uw", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class30_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt10000 = arg3;
		this.anInt10001 = arg5;
		this.anInt9992 = arg6;
		this.anInt10002 = arg1;
		this.anInt9996 = arg2;
		this.anInt9994 = arg0;
		this.anInt9993 = arg7;
		this.anInt9998 = arg4;
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method7661(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt9994 * arg0 >> 12;
		@Pc(17) int local17 = this.anInt10002 * arg1 >> 12;
		@Pc(28) int local28 = arg0 * this.anInt9996 >> 12;
		@Pc(35) int local35 = arg1 * this.anInt10000 >> 12;
		@Pc(42) int local42 = arg0 * this.anInt9998 >> 12;
		@Pc(49) int local49 = this.anInt10001 * arg1 >> 12;
		@Pc(56) int local56 = arg0 * this.anInt9992 >> 12;
		@Pc(63) int local63 = arg1 * this.anInt9993 >> 12;
		Static419.method6249(local63, local42, super.anInt9988, local35, local17, local49, local56, local28, local10);
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(III)V")
	@Override
	public void method7659(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!uw", name = "b", descriptor = "(III)V")
	@Override
	public void method7660(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
