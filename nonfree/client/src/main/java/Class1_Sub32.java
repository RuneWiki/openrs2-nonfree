import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public final class Class1_Sub32 extends Class1 {

	@OriginalMember(owner = "client!ud", name = "G", descriptor = "I")
	public int anInt5754;

	@OriginalMember(owner = "client!ud", name = "t", descriptor = "I")
	private int anInt5743;

	@OriginalMember(owner = "client!ud", name = "A", descriptor = "I")
	private int anInt5749;

	@OriginalMember(owner = "client!ud", name = "u", descriptor = "I")
	public int anInt5744;

	@OriginalMember(owner = "client!ud", name = "I", descriptor = "I")
	public int anInt5756;

	@OriginalMember(owner = "client!ud", name = "y", descriptor = "I")
	private int anInt5747;

	@OriginalMember(owner = "client!ud", name = "s", descriptor = "I")
	private int anInt5742;

	@OriginalMember(owner = "client!ud", name = "z", descriptor = "I")
	private int anInt5748;

	@OriginalMember(owner = "client!ud", name = "K", descriptor = "I")
	private int anInt5757;

	@OriginalMember(owner = "client!ud", name = "H", descriptor = "I")
	public int anInt5755;

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class1_Sub32(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInt5754 = arg7;
		this.anInt5743 = arg0;
		this.anInt5749 = arg1;
		this.anInt5744 = arg9;
		this.anInt5756 = arg6;
		this.anInt5747 = arg5;
		this.anInt5742 = arg4;
		this.anInt5748 = arg2;
		this.anInt5757 = arg3;
		this.anInt5755 = arg8;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZIII)Z")
	public boolean method4481(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return arg0 == this.anInt5743 && this.anInt5748 <= arg1 && this.anInt5742 >= arg1 && this.anInt5757 <= arg2 && arg2 <= this.anInt5747;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(BII)Z")
	public boolean method4482(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.anInt5748 <= arg0 && arg0 <= this.anInt5742 && this.anInt5757 <= arg1 && this.anInt5747 >= arg1;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(III)Z")
	public boolean method4483(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.anInt5756 <= arg1 && this.anInt5755 >= arg1 && arg0 >= this.anInt5754 && this.anInt5744 >= arg0;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IZI)[I")
	public int[] method4485(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return new int[] { this.anInt5749, this.anInt5756 + arg1 - this.anInt5748, arg0 - -this.anInt5754 + -this.anInt5757 };
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZII)[I")
	public int[] method4487(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return new int[] { this.anInt5743, arg1 + this.anInt5748 - this.anInt5756, arg0 - -this.anInt5757 + -this.anInt5754 };
	}
}
