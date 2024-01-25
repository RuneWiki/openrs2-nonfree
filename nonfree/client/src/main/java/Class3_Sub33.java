import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kea")
public final class Class3_Sub33 extends Class3 {

	@OriginalMember(owner = "client!kea", name = "D", descriptor = "I")
	public final int anInt4824;

	@OriginalMember(owner = "client!kea", name = "E", descriptor = "I")
	public final int anInt4825;

	@OriginalMember(owner = "client!kea", name = "w", descriptor = "I")
	private final int anInt4820;

	@OriginalMember(owner = "client!kea", name = "n", descriptor = "I")
	private final int anInt4812;

	@OriginalMember(owner = "client!kea", name = "x", descriptor = "I")
	private final int anInt4821;

	@OriginalMember(owner = "client!kea", name = "u", descriptor = "I")
	private final int anInt4819;

	@OriginalMember(owner = "client!kea", name = "A", descriptor = "I")
	public final int anInt4823;

	@OriginalMember(owner = "client!kea", name = "l", descriptor = "I")
	private final int anInt4811;

	@OriginalMember(owner = "client!kea", name = "s", descriptor = "I")
	public final int anInt4817;

	@OriginalMember(owner = "client!kea", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class3_Sub33(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt4824 = arg6;
		this.anInt4825 = arg7;
		this.anInt4820 = arg4;
		this.anInt4812 = arg2;
		this.anInt4821 = arg1;
		this.anInt4819 = arg3;
		this.anInt4823 = arg8;
		this.anInt4811 = arg0;
		this.anInt4817 = arg5;
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "([IIII)V")
	public void method4152(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		arg0[2] = this.anInt4812 + arg2 - this.anInt4824;
		arg0[1] = arg1 + this.anInt4821 - this.anInt4817;
		arg0[0] = this.anInt4811;
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(IIII)Z")
	public boolean method4153(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return arg1 == this.anInt4811 && this.anInt4821 <= arg0 && arg0 <= this.anInt4819 && arg2 >= this.anInt4812 && this.anInt4820 >= arg2;
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(III)Z")
	public boolean method4154(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 >= this.anInt4821 && arg0 <= this.anInt4819 && this.anInt4812 <= arg1 && this.anInt4820 >= arg1;
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "([IIIB)V")
	public void method4156(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0[1] = arg1 + this.anInt4817 - this.anInt4821;
		arg0[2] = arg2 + this.anInt4824 - this.anInt4812;
		arg0[0] = 0;
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(IZI)Z")
	public boolean method4160(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 >= this.anInt4817 && arg0 <= this.anInt4825 && this.anInt4824 <= arg1 && arg1 <= this.anInt4823;
	}
}
