import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!e")
public final class Class43_Sub2 extends Class43 {

	@OriginalMember(owner = "client!e", name = "n", descriptor = "I")
	private final int anInt1734;

	@OriginalMember(owner = "client!e", name = "r", descriptor = "I")
	private final int anInt1738;

	@OriginalMember(owner = "client!e", name = "p", descriptor = "I")
	private final int anInt1736;

	@OriginalMember(owner = "client!e", name = "k", descriptor = "I")
	private final int anInt1732;

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "(IIIIII)V")
	public Class43_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt1734 = arg3;
		this.anInt1738 = arg1;
		this.anInt1736 = arg2;
		this.anInt1732 = arg0;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(ZII)V")
	@Override
	public void method2017(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt1732 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt1736 >> 12;
		@Pc(24) int local24 = arg0 * this.anInt1738 >> 12;
		@Pc(31) int local31 = this.anInt1734 * arg0 >> 12;
		Static176.method3283(local10, local17, local24, local31, super.anInt2475);
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(BII)V")
	@Override
	public void method2013(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method2016(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
