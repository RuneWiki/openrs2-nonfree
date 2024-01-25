import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gp")
public final class Class26_Sub2 extends Class26 {

	@OriginalMember(owner = "client!gp", name = "y", descriptor = "I")
	private final int anInt2695;

	@OriginalMember(owner = "client!gp", name = "x", descriptor = "I")
	private final int anInt2694;

	@OriginalMember(owner = "client!gp", name = "w", descriptor = "I")
	private final int anInt2693;

	@OriginalMember(owner = "client!gp", name = "v", descriptor = "I")
	private final int anInt2692;

	@OriginalMember(owner = "client!gp", name = "r", descriptor = "I")
	private final int anInt2689;

	@OriginalMember(owner = "client!gp", name = "s", descriptor = "I")
	private final int anInt2690;

	@OriginalMember(owner = "client!gp", name = "l", descriptor = "I")
	private final int anInt2683;

	@OriginalMember(owner = "client!gp", name = "t", descriptor = "I")
	private final int anInt2691;

	static {
		new Class159("You are not currently in a clan channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes pas dans un canal de clan.", "No momento você não está em um canal de clã.");
		Math.sqrt(8192.0D);
	}

	@OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class26_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt2695 = arg0;
		this.anInt2694 = arg1;
		this.anInt2693 = arg2;
		this.anInt2692 = arg3;
		this.anInt2689 = arg5;
		this.anInt2690 = arg7;
		this.anInt2683 = arg6;
		this.anInt2691 = arg4;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(III)V")
	@Override
	public void method5411(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt2695 >> 12;
		@Pc(17) int local17 = this.anInt2694 * arg0 >> 12;
		@Pc(32) int local32 = this.anInt2693 * arg1 >> 12;
		@Pc(39) int local39 = this.anInt2692 * arg0 >> 12;
		@Pc(46) int local46 = arg1 * this.anInt2691 >> 12;
		@Pc(53) int local53 = arg0 * this.anInt2689 >> 12;
		@Pc(60) int local60 = arg1 * this.anInt2683 >> 12;
		@Pc(67) int local67 = this.anInt2690 * arg0 >> 12;
		Static244.method4314(super.anInt6415, local17, local53, local60, local67, local32, local39, local46, local10);
	}

	@OriginalMember(owner = "client!gp", name = "c", descriptor = "(III)V")
	@Override
	public void method5417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "(III)V")
	@Override
	public void method5412(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
