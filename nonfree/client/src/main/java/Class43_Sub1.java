import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!caa")
public final class Class43_Sub1 extends Class43 {

	@OriginalMember(owner = "client!caa", name = "q", descriptor = "I")
	private final int anInt931;

	@OriginalMember(owner = "client!caa", name = "r", descriptor = "I")
	private final int anInt932;

	@OriginalMember(owner = "client!caa", name = "u", descriptor = "I")
	private final int anInt934;

	@OriginalMember(owner = "client!caa", name = "l", descriptor = "I")
	private final int anInt926;

	@OriginalMember(owner = "client!caa", name = "<init>", descriptor = "(IIIIIII)V")
	public Class43_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt931 = arg2;
		this.anInt932 = arg1;
		this.anInt934 = arg0;
		this.anInt926 = arg3;
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(III)V")
	@Override
	public void method7275(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(IBI)V")
	@Override
	public void method7274(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = arg1 * this.anInt934 >> 12;
		@Pc(25) int local25 = this.anInt931 * arg1 >> 12;
		@Pc(32) int local32 = arg0 * this.anInt932 >> 12;
		@Pc(39) int local39 = arg0 * this.anInt926 >> 12;
		Static155.method2240(local39, local25, local18, super.anInt8896, local32);
	}

	@OriginalMember(owner = "client!caa", name = "b", descriptor = "(III)V")
	@Override
	public void method7276(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt934 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt931 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt932 >> 12;
		@Pc(31) int local31 = arg1 * this.anInt926 >> 12;
		Static149.method2187(super.anInt8894, local31, super.anInt8896, local24, super.anInt8895, local10, local17);
	}
}
