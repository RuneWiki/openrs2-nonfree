import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!al")
public final class Class9_Sub1 extends Class9 {

	@OriginalMember(owner = "client!al", name = "r", descriptor = "I")
	private final int anInt253;

	@OriginalMember(owner = "client!al", name = "z", descriptor = "I")
	private final int anInt260;

	@OriginalMember(owner = "client!al", name = "w", descriptor = "I")
	private final int anInt257;

	@OriginalMember(owner = "client!al", name = "s", descriptor = "I")
	private final int anInt254;

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "(IIIIII)V")
	public Class9_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt253 = arg1;
		this.anInt260 = arg3;
		this.anInt257 = arg0;
		this.anInt254 = arg2;
	}

	@OriginalMember(owner = "client!al", name = "b", descriptor = "(III)V")
	@Override
	public void method4773(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(III)V")
	@Override
	public void method4772(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method4774(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt257 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt254 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt253 >> 12;
		@Pc(37) int local37 = arg1 * this.anInt260 >> 12;
		Static60.method912(local17, local10, local24, local37, super.anInt6017);
	}
}
