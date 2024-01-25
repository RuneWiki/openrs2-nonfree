import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public final class Class5_Sub1 extends Class5 {

	@OriginalMember(owner = "client!ac", name = "p", descriptor = "I")
	private final int anInt43;

	@OriginalMember(owner = "client!ac", name = "m", descriptor = "I")
	private final int anInt40;

	@OriginalMember(owner = "client!ac", name = "r", descriptor = "I")
	private final int anInt45;

	@OriginalMember(owner = "client!ac", name = "u", descriptor = "I")
	private final int anInt46;

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(IIIIII)V")
	public Class5_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt43 = arg3;
		this.anInt40 = arg0;
		this.anInt45 = arg2;
		this.anInt46 = arg1;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIB)V")
	@Override
	public void method6417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) int local15 = this.anInt40 * arg1 >> 12;
		@Pc(22) int local22 = arg1 * this.anInt45 >> 12;
		@Pc(29) int local29 = this.anInt46 * arg0 >> 12;
		@Pc(36) int local36 = this.anInt43 * arg0 >> 12;
		Static236.method4343(local36, super.anInt7728, local22, local15, local29);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method6414(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(III)V")
	@Override
	public void method6416(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
