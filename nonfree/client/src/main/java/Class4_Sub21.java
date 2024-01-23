import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public final class Class4_Sub21 extends Class4 {

	@OriginalMember(owner = "client!mb", name = "v", descriptor = "I")
	private int anInt3203;

	@OriginalMember(owner = "client!mb", name = "k", descriptor = "I")
	public int anInt3193;

	@OriginalMember(owner = "client!mb", name = "z", descriptor = "I")
	private int anInt3206;

	@OriginalMember(owner = "client!mb", name = "l", descriptor = "I")
	public int anInt3194;

	@OriginalMember(owner = "client!mb", name = "A", descriptor = "I")
	public int anInt3207;

	@OriginalMember(owner = "client!mb", name = "u", descriptor = "I")
	private int anInt3202;

	@OriginalMember(owner = "client!mb", name = "r", descriptor = "I")
	private int anInt3200;

	@OriginalMember(owner = "client!mb", name = "C", descriptor = "I")
	public int anInt3209;

	@OriginalMember(owner = "client!mb", name = "n", descriptor = "I")
	private int anInt3196;

	@OriginalMember(owner = "client!mb", name = "H", descriptor = "I")
	private int anInt3214;

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class4_Sub21(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInt3203 = arg5;
		this.anInt3193 = arg8;
		this.anInt3206 = arg2;
		this.anInt3194 = arg7;
		this.anInt3207 = arg9;
		this.anInt3202 = arg4;
		this.anInt3200 = arg3;
		this.anInt3209 = arg6;
		this.anInt3196 = arg1;
		this.anInt3214 = arg0;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZII)[I")
	public int[] method2510(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return new int[] { this.anInt3214, this.anInt3206 + arg1 - this.anInt3209, -this.anInt3194 - -this.anInt3200 + arg0 };
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(III)Z")
	public boolean method2512(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.anInt3209 <= arg0 && this.anInt3193 >= arg0 && this.anInt3194 <= arg1 && this.anInt3207 >= arg1;
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(III)[I")
	public int[] method2515(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return new int[] { this.anInt3196, this.anInt3209 + arg0 - this.anInt3206, -this.anInt3200 - (-this.anInt3194 - arg1) };
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(III)Z")
	public boolean method2518(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anInt3206 <= arg0 && arg0 <= this.anInt3202 && arg1 >= this.anInt3200 && arg1 <= this.anInt3203;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIII)Z")
	public boolean method2520(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return this.anInt3214 == arg2 && this.anInt3206 <= arg0 && this.anInt3202 >= arg0 && this.anInt3200 <= arg1 && this.anInt3203 >= arg1;
	}
}
