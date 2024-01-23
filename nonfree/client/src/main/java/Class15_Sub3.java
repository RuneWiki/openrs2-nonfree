import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hd")
public final class Class15_Sub3 extends Class15 {

	@OriginalMember(owner = "client!hd", name = "q", descriptor = "I")
	private final int anInt1688;

	@OriginalMember(owner = "client!hd", name = "A", descriptor = "I")
	private final int anInt1697;

	@OriginalMember(owner = "client!hd", name = "r", descriptor = "I")
	private final int anInt1689;

	@OriginalMember(owner = "client!hd", name = "u", descriptor = "I")
	private final int anInt1691;

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(IIIIIII)V")
	public Class15_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt1688 = arg3;
		this.anInt1697 = arg0;
		this.anInt1689 = arg2;
		this.anInt1691 = arg1;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(BII)V")
	@Override
	public void method1765(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(III)V")
	@Override
	public void method1757(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(6) int local6 = this.anInt1697 * arg1 >> 12;
		@Pc(17) int local17 = this.anInt1691 * arg0 >> 12;
		@Pc(32) int local32 = arg0 * this.anInt1688 >> 12;
		@Pc(39) int local39 = this.anInt1689 * arg1 >> 12;
		Static2.method60(local39, local6, local32, local17, super.anInt2287);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IBI)V")
	@Override
	public void method1760(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt1697 >> 12;
		@Pc(17) int local17 = this.anInt1689 * arg1 >> 12;
		@Pc(24) int local24 = this.anInt1691 * arg0 >> 12;
		@Pc(36) int local36 = arg0 * this.anInt1688 >> 12;
		Static87.method1506(super.anInt2287, super.anInt2289, local24, super.anInt2283, local10, local36, local17);
	}
}
