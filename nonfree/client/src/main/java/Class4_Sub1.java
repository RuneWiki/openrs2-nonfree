import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public final class Class4_Sub1 extends Class4 {

	@OriginalMember(owner = "client!ac", name = "y", descriptor = "I")
	private final int anInt78;

	@OriginalMember(owner = "client!ac", name = "t", descriptor = "I")
	private final int anInt75;

	@OriginalMember(owner = "client!ac", name = "x", descriptor = "I")
	private final int anInt77;

	@OriginalMember(owner = "client!ac", name = "z", descriptor = "I")
	private final int anInt79;

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(IIIIIII)V")
	public Class4_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt78 = arg2;
		this.anInt75 = arg3;
		this.anInt77 = arg1;
		this.anInt79 = arg0;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method2415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) int local15 = this.anInt75 * arg1 >> 12;
		@Pc(22) int local22 = arg1 * this.anInt77 >> 12;
		@Pc(29) int local29 = this.anInt78 * arg0 >> 12;
		@Pc(36) int local36 = arg0 * this.anInt79 >> 12;
		Static157.method3025(local15, local36, local29, super.anInt3072, local22);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IBI)V")
	@Override
	public void method2411(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = this.anInt79 * arg1 >> 12;
		@Pc(22) int local22 = this.anInt78 * arg1 >> 12;
		@Pc(29) int local29 = this.anInt77 * arg0 >> 12;
		@Pc(36) int local36 = arg0 * this.anInt75 >> 12;
		Static181.method3379(local22, local15, local29, super.anInt3069, super.anInt3072, super.anInt3067, local36);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(BII)V")
	@Override
	public void method2413(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
