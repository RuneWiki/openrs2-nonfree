import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public final class Class15_Sub2 extends Class15 {

	@OriginalMember(owner = "client!dc", name = "A", descriptor = "I")
	private final int anInt891;

	@OriginalMember(owner = "client!dc", name = "D", descriptor = "I")
	private final int anInt894;

	@OriginalMember(owner = "client!dc", name = "x", descriptor = "I")
	private final int anInt888;

	@OriginalMember(owner = "client!dc", name = "C", descriptor = "I")
	private final int anInt893;

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(IIIIII)V")
	public Class15_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt891 = arg0;
		this.anInt894 = arg2;
		this.anInt888 = arg1;
		this.anInt893 = arg3;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IBI)V")
	@Override
	public void method1760(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(BII)V")
	@Override
	public void method1765(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt894 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt891 >> 12;
		@Pc(28) int local28 = this.anInt888 * arg0 >> 12;
		@Pc(35) int local35 = arg0 * this.anInt893 >> 12;
		Static80.method1383(local17, super.anInt2283, local10, local35, local28);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(III)V")
	@Override
	public void method1757(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
