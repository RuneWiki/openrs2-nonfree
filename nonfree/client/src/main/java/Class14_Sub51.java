import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public final class Class14_Sub51 extends Class14 {

	@OriginalMember(owner = "client!vh", name = "y", descriptor = "I")
	private final int anInt10605;

	@OriginalMember(owner = "client!vh", name = "m", descriptor = "I")
	public final int anInt10600;

	@OriginalMember(owner = "client!vh", name = "A", descriptor = "I")
	private final int anInt10609;

	@OriginalMember(owner = "client!vh", name = "u", descriptor = "I")
	public final int anInt10612;

	@OriginalMember(owner = "client!vh", name = "s", descriptor = "I")
	private final int anInt10615;

	@OriginalMember(owner = "client!vh", name = "C", descriptor = "I")
	private final int anInt10604;

	@OriginalMember(owner = "client!vh", name = "z", descriptor = "I")
	public final int anInt10603;

	@OriginalMember(owner = "client!vh", name = "q", descriptor = "I")
	public final int anInt10607;

	@OriginalMember(owner = "client!vh", name = "t", descriptor = "I")
	private final int anInt10614;

	@OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class14_Sub51(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt10605 = arg4;
		this.anInt10600 = arg7;
		this.anInt10609 = arg2;
		this.anInt10612 = arg6;
		this.anInt10615 = arg1;
		this.anInt10604 = arg0;
		this.anInt10603 = arg8;
		this.anInt10607 = arg5;
		this.anInt10614 = arg3;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "([IZII)V")
	public void method9063(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		arg0[2] = this.anInt10612 + arg2 - this.anInt10609;
		arg0[0] = 0;
		arg0[1] = arg1 + this.anInt10607 - this.anInt10615;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(BII)Z")
	public boolean method9064(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 >= this.anInt10615 && this.anInt10614 >= arg0 && arg1 >= this.anInt10609 && arg1 <= this.anInt10605;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(III[I)V")
	public void method9068(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		arg2[1] = this.anInt10615 + arg0 - this.anInt10607;
		arg2[2] = arg1 + this.anInt10609 - this.anInt10612;
		arg2[0] = this.anInt10604;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIII)Z")
	public boolean method9069(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return this.anInt10604 == arg0 && arg2 >= this.anInt10615 && arg2 <= this.anInt10614 && this.anInt10609 <= arg1 && arg1 <= this.anInt10605;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIB)Z")
	public boolean method9070(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 >= this.anInt10607 && this.anInt10600 >= arg1 && this.anInt10612 <= arg0 && this.anInt10603 >= arg0;
	}
}
