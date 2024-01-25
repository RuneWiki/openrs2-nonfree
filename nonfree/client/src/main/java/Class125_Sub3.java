import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uca")
public final class Class125_Sub3 extends Class125 {

	@OriginalMember(owner = "client!uca", name = "l", descriptor = "I")
	private final int anInt9617;

	@OriginalMember(owner = "client!uca", name = "i", descriptor = "I")
	private final int anInt9621;

	@OriginalMember(owner = "client!uca", name = "n", descriptor = "I")
	private final int anInt9620;

	@OriginalMember(owner = "client!uca", name = "o", descriptor = "I")
	private final int anInt9615;

	@OriginalMember(owner = "client!uca", name = "<init>", descriptor = "(IIIIIII)V")
	public Class125_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt9617 = arg3;
		this.anInt9621 = arg1;
		this.anInt9620 = arg2;
		this.anInt9615 = arg0;
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(ZII)V")
	@Override
	public void method8244(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(IIB)V")
	@Override
	public void method8245(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt9615 * arg0 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt9620 >> 12;
		@Pc(29) int local29 = arg1 * this.anInt9621 >> 12;
		@Pc(36) int local36 = this.anInt9617 * arg1 >> 12;
		Static93.method1469(local29, super.anInt9674, local10, local17, super.anInt9675, super.anInt9673, local36);
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(III)V")
	@Override
	public void method8246(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt9615 * arg0 >> 12;
		@Pc(17) int local17 = this.anInt9620 * arg0 >> 12;
		@Pc(24) int local24 = this.anInt9621 * arg1 >> 12;
		@Pc(31) int local31 = this.anInt9617 * arg1 >> 12;
		Static681.method9217(local10, super.anInt9674, local24, local31, local17);
	}
}
