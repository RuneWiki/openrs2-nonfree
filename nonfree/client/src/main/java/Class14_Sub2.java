import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ha")
public final class Class14_Sub2 extends Class14 {

	@OriginalMember(owner = "client!ha", name = "p", descriptor = "I")
	private final int anInt1704;

	@OriginalMember(owner = "client!ha", name = "s", descriptor = "I")
	private final int anInt1706;

	@OriginalMember(owner = "client!ha", name = "x", descriptor = "I")
	private final int anInt1710;

	@OriginalMember(owner = "client!ha", name = "y", descriptor = "I")
	private final int anInt1711;

	@OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(IIIIII)V")
	public Class14_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt1704 = arg0;
		this.anInt1706 = arg1;
		this.anInt1710 = arg2;
		this.anInt1711 = arg3;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(III)V")
	@Override
	public void method3207(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(IBI)V")
	@Override
	public void method3211(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IBI)V")
	@Override
	public void method3208(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt1704 * arg0 >> 12;
		@Pc(21) int local21 = this.anInt1710 * arg0 >> 12;
		@Pc(28) int local28 = arg1 * this.anInt1706 >> 12;
		@Pc(35) int local35 = this.anInt1711 * arg1 >> 12;
		Static153.method2746(local35, super.anInt4048, local10, local28, local21);
	}
}
