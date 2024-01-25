import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vs")
public final class Class110_Sub4 extends Class110 {

	@OriginalMember(owner = "client!vs", name = "g", descriptor = "I")
	private final int anInt9845;

	@OriginalMember(owner = "client!vs", name = "m", descriptor = "I")
	private final int anInt9850;

	@OriginalMember(owner = "client!vs", name = "k", descriptor = "I")
	private final int anInt9848;

	@OriginalMember(owner = "client!vs", name = "i", descriptor = "I")
	private final int anInt9847;

	@OriginalMember(owner = "client!vs", name = "<init>", descriptor = "(IIIIIII)V")
	public Class110_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt9845 = arg1;
		this.anInt9850 = arg2;
		this.anInt9848 = arg0;
		this.anInt9847 = arg3;
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(III)V")
	@Override
	public void method7735(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = this.anInt9848 * arg0 >> 12;
		@Pc(25) int local25 = this.anInt9850 * arg0 >> 12;
		@Pc(32) int local32 = arg1 * this.anInt9845 >> 12;
		@Pc(39) int local39 = this.anInt9847 * arg1 >> 12;
		Static509.method5294(local32, super.anInt9843, local25, local18, local39);
	}

	@OriginalMember(owner = "client!vs", name = "b", descriptor = "(III)V")
	@Override
	public void method7737(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt9848 >> 12;
		@Pc(25) int local25 = this.anInt9850 * arg0 >> 12;
		@Pc(32) int local32 = this.anInt9845 * arg1 >> 12;
		@Pc(39) int local39 = arg1 * this.anInt9847 >> 12;
		Static520.method7219(super.anInt9840, local10, super.anInt9842, local39, local32, local25);
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(IIB)V")
	@Override
	public void method7738(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt9848 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt9850 >> 12;
		@Pc(24) int local24 = this.anInt9845 * arg0 >> 12;
		@Pc(39) int local39 = arg0 * this.anInt9847 >> 12;
		Static172.method3060(super.anInt9842, super.anInt9843, local17, local10, local39, super.anInt9840, local24);
	}
}
