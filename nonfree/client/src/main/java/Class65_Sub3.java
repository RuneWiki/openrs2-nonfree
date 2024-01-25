import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public final class Class65_Sub3 extends Class65 {

	@OriginalMember(owner = "client!re", name = "r", descriptor = "I")
	private final int anInt5062;

	@OriginalMember(owner = "client!re", name = "q", descriptor = "I")
	private final int anInt5061;

	@OriginalMember(owner = "client!re", name = "s", descriptor = "I")
	private final int anInt5063;

	@OriginalMember(owner = "client!re", name = "n", descriptor = "I")
	private final int anInt5058;

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "(IIIIIII)V")
	public Class65_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt5062 = arg1;
		this.anInt5061 = arg0;
		this.anInt5063 = arg2;
		this.anInt5058 = arg3;
	}

	@OriginalMember(owner = "client!re", name = "c", descriptor = "(III)V")
	@Override
	public void method4777(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt5061 >> 12;
		@Pc(23) int local23 = arg1 * this.anInt5063 >> 12;
		@Pc(30) int local30 = arg0 * this.anInt5062 >> 12;
		@Pc(37) int local37 = arg0 * this.anInt5058 >> 12;
		Static130.method2559(super.anInt5512, super.anInt5514, local37, local10, local23, local30);
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(III)V")
	@Override
	public void method4776(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = this.anInt5061 * arg1 >> 12;
		@Pc(21) int local21 = this.anInt5063 * arg1 >> 12;
		@Pc(28) int local28 = this.anInt5062 * arg0 >> 12;
		@Pc(35) int local35 = arg0 * this.anInt5058 >> 12;
		Static315.method4663(local21, local14, local28, local35, super.anInt5511);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(III)V")
	@Override
	public void method4775(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(18) int local18 = arg0 * this.anInt5061 >> 12;
		@Pc(25) int local25 = this.anInt5063 * arg0 >> 12;
		@Pc(32) int local32 = this.anInt5062 * arg1 >> 12;
		@Pc(39) int local39 = arg1 * this.anInt5058 >> 12;
		Static28.method499(super.anInt5511, local25, super.anInt5514, local39, local32, super.anInt5512, local18);
	}
}
