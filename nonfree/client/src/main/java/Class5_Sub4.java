import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mc")
public final class Class5_Sub4 extends Class5 {

	@OriginalMember(owner = "client!mc", name = "r", descriptor = "I")
	private final int anInt2791;

	@OriginalMember(owner = "client!mc", name = "G", descriptor = "I")
	private final int anInt2800;

	@OriginalMember(owner = "client!mc", name = "p", descriptor = "I")
	private final int anInt2789;

	@OriginalMember(owner = "client!mc", name = "w", descriptor = "I")
	private final int anInt2795;

	@OriginalMember(owner = "client!mc", name = "q", descriptor = "I")
	private final int anInt2790;

	@OriginalMember(owner = "client!mc", name = "t", descriptor = "I")
	private final int anInt2793;

	@OriginalMember(owner = "client!mc", name = "y", descriptor = "I")
	private final int anInt2796;

	@OriginalMember(owner = "client!mc", name = "u", descriptor = "I")
	private final int anInt2794;

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class5_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt2791 = arg7;
		this.anInt2800 = arg1;
		this.anInt2789 = arg6;
		this.anInt2795 = arg4;
		this.anInt2790 = arg2;
		this.anInt2793 = arg5;
		this.anInt2796 = arg0;
		this.anInt2794 = arg3;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(III)V")
	@Override
	public void method2102(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(BII)V")
	@Override
	public void method2105(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = this.anInt2800 * arg0 >> 12;
		@Pc(18) int local18 = this.anInt2796 * arg1 >> 12;
		@Pc(25) int local25 = arg1 * this.anInt2795 >> 12;
		@Pc(32) int local32 = this.anInt2794 * arg0 >> 12;
		@Pc(43) int local43 = this.anInt2790 * arg1 >> 12;
		@Pc(50) int local50 = arg0 * this.anInt2791 >> 12;
		@Pc(57) int local57 = this.anInt2793 * arg0 >> 12;
		@Pc(64) int local64 = this.anInt2789 * arg1 >> 12;
		Static133.method2535(local32, local64, local43, local57, local50, local25, super.anInt2786, local18, local11);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(BII)V")
	@Override
	public void method2104(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
