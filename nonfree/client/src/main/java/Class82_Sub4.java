import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pca")
public final class Class82_Sub4 extends Class82 {

	@OriginalMember(owner = "client!pca", name = "n", descriptor = "I")
	private final int anInt6525;

	@OriginalMember(owner = "client!pca", name = "o", descriptor = "I")
	private final int anInt6526;

	@OriginalMember(owner = "client!pca", name = "r", descriptor = "I")
	private final int anInt6529;

	@OriginalMember(owner = "client!pca", name = "q", descriptor = "I")
	private final int anInt6528;

	@OriginalMember(owner = "client!pca", name = "m", descriptor = "I")
	private final int anInt6524;

	@OriginalMember(owner = "client!pca", name = "v", descriptor = "I")
	private final int anInt6532;

	@OriginalMember(owner = "client!pca", name = "t", descriptor = "I")
	private final int anInt6531;

	@OriginalMember(owner = "client!pca", name = "z", descriptor = "I")
	private final int anInt6536;

	@OriginalMember(owner = "client!pca", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class82_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt6525 = arg5;
		this.anInt6526 = arg1;
		this.anInt6529 = arg4;
		this.anInt6528 = arg2;
		this.anInt6524 = arg3;
		this.anInt6532 = arg6;
		this.anInt6531 = arg0;
		this.anInt6536 = arg7;
	}

	@OriginalMember(owner = "client!pca", name = "b", descriptor = "(III)V")
	@Override
	public void method5660(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = arg1 * this.anInt6531 >> 12;
		@Pc(22) int local22 = arg0 * this.anInt6526 >> 12;
		@Pc(29) int local29 = this.anInt6528 * arg1 >> 12;
		@Pc(36) int local36 = arg0 * this.anInt6524 >> 12;
		@Pc(43) int local43 = this.anInt6529 * arg1 >> 12;
		@Pc(50) int local50 = arg0 * this.anInt6525 >> 12;
		@Pc(57) int local57 = arg1 * this.anInt6532 >> 12;
		@Pc(64) int local64 = arg0 * this.anInt6536 >> 12;
		Static344.method5544(local64, local29, local50, local22, local43, super.anInt6516, local57, local36, local15);
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(BII)V")
	@Override
	public void method5659(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(IBI)V")
	@Override
	public void method5661(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
