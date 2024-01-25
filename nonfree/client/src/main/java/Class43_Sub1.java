import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cq")
public final class Class43_Sub1 extends Class43 {

	@OriginalMember(owner = "client!cq", name = "r", descriptor = "I")
	private final int anInt1200;

	@OriginalMember(owner = "client!cq", name = "i", descriptor = "I")
	private final int anInt1193;

	@OriginalMember(owner = "client!cq", name = "s", descriptor = "I")
	private final int anInt1201;

	@OriginalMember(owner = "client!cq", name = "o", descriptor = "I")
	private final int anInt1197;

	@OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(IIIIIII)V")
	public Class43_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt1200 = arg1;
		this.anInt1193 = arg3;
		this.anInt1201 = arg0;
		this.anInt1197 = arg2;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method2016(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt1201 * arg0 >> 12;
		@Pc(21) int local21 = arg0 * this.anInt1197 >> 12;
		@Pc(28) int local28 = arg1 * this.anInt1200 >> 12;
		@Pc(35) int local35 = this.anInt1193 * arg1 >> 12;
		Static331.method5343(super.anInt2474, local35, super.anInt2476, local21, local28, super.anInt2475, local10);
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(ZII)V")
	@Override
	public void method2017(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt1201 >> 12;
		@Pc(25) int local25 = this.anInt1197 * arg1 >> 12;
		@Pc(32) int local32 = arg0 * this.anInt1200 >> 12;
		@Pc(39) int local39 = arg0 * this.anInt1193 >> 12;
		Static374.method5936(super.anInt2474, local10, local39, local32, local25, super.anInt2475);
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(BII)V")
	@Override
	public void method2013(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17 = this.anInt1201 * arg0 >> 12;
		@Pc(24) int local24 = arg0 * this.anInt1197 >> 12;
		@Pc(31) int local31 = arg1 * this.anInt1200 >> 12;
		@Pc(38) int local38 = this.anInt1193 * arg1 >> 12;
		Static350.method5579(local38, super.anInt2476, local17, local24, local31);
	}
}
