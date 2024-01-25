import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public abstract class Class6_Sub1 extends Class6 {

	@OriginalMember(owner = "client!mj", name = "h", descriptor = "I")
	protected final int anInt5382;

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "I")
	protected int anInt5378;

	@OriginalMember(owner = "client!mj", name = "d", descriptor = "I")
	public final int anInt5379;

	@OriginalMember(owner = "client!mj", name = "e", descriptor = "I")
	protected int anInt5380;

	@OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(IIII)V")
	protected Class6_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5382 = arg1;
		this.anInt5378 = arg0;
		this.anInt5379 = arg3;
		this.anInt5380 = arg2;
	}
}
