import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class43_Sub4 extends Class43 {

	@OriginalMember(owner = "client!ub", name = "m", descriptor = "I")
	private final int anInt5752;

	@OriginalMember(owner = "client!ub", name = "v", descriptor = "I")
	private final int anInt5760;

	@OriginalMember(owner = "client!ub", name = "l", descriptor = "I")
	private final int anInt5751;

	@OriginalMember(owner = "client!ub", name = "p", descriptor = "I")
	private final int anInt5755;

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(IIIIIII)V")
	public Class43_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt5752 = arg3;
		this.anInt5760 = arg0;
		this.anInt5751 = arg1;
		this.anInt5755 = arg2;
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(III)V")
	@Override
	public void method4940(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = arg0 * this.anInt5760 >> 12;
		@Pc(22) int local22 = this.anInt5755 * arg0 >> 12;
		@Pc(29) int local29 = this.anInt5751 * arg1 >> 12;
		@Pc(36) int local36 = arg1 * this.anInt5752 >> 12;
		Static233.method3203(super.anInt5747, super.anInt5750, local29, super.anInt5743, local15, local22, local36);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(III)V")
	@Override
	public void method4935(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(BII)V")
	@Override
	public void method4938(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt5760 >> 12;
		@Pc(17) int local17 = this.anInt5755 * arg1 >> 12;
		@Pc(24) int local24 = this.anInt5751 * arg0 >> 12;
		@Pc(39) int local39 = arg0 * this.anInt5752 >> 12;
		Static144.method2174(local10, local17, super.anInt5747, local24, local39);
	}
}
