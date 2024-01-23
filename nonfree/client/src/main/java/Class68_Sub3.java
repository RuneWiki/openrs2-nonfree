import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rh")
public final class Class68_Sub3 extends Class68 {

	@OriginalMember(owner = "client!rh", name = "q", descriptor = "I")
	private int anInt5018;

	@OriginalMember(owner = "client!rh", name = "n", descriptor = "I")
	private int anInt5015;

	@OriginalMember(owner = "client!rh", name = "z", descriptor = "I")
	private int anInt5025;

	@OriginalMember(owner = "client!rh", name = "v", descriptor = "I")
	private int anInt5021;

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(IIIIIII)V")
	public Class68_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt5018 = arg0;
		this.anInt5015 = arg3;
		this.anInt5025 = arg1;
		this.anInt5021 = arg2;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIB)V")
	@Override
	public void method4687(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(18) int local18 = arg0 * this.anInt5018 >> 12;
		@Pc(25) int local25 = this.anInt5015 * arg1 >> 12;
		@Pc(32) int local32 = arg0 * this.anInt5021 >> 12;
		@Pc(39) int local39 = this.anInt5025 * arg1 >> 12;
		Static212.method3735(local32, local18, this.anInt6057, this.anInt6056, local39, local25, this.anInt6058);
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IBI)V")
	@Override
	public void method4686(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = this.anInt5021 * arg1 >> 12;
		@Pc(23) int local23 = this.anInt5018 * arg1 >> 12;
		@Pc(30) int local30 = arg0 * this.anInt5025 >> 12;
		@Pc(37) int local37 = this.anInt5015 * arg0 >> 12;
		Static158.method2961(local37, this.anInt6056, local30, local23, local16);
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(III)V")
	@Override
	public void method4690(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
