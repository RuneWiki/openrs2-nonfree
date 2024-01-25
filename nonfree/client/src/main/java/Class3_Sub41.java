import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public final class Class3_Sub41 extends Class3 {

	@OriginalMember(owner = "client!oo", name = "s", descriptor = "I")
	private final int anInt7504;

	@OriginalMember(owner = "client!oo", name = "k", descriptor = "I")
	private final int anInt7496;

	@OriginalMember(owner = "client!oo", name = "x", descriptor = "I")
	public final int anInt7509;

	@OriginalMember(owner = "client!oo", name = "u", descriptor = "I")
	public final int anInt7506;

	@OriginalMember(owner = "client!oo", name = "g", descriptor = "I")
	public final int anInt7492;

	@OriginalMember(owner = "client!oo", name = "w", descriptor = "I")
	public final int anInt7508;

	@OriginalMember(owner = "client!oo", name = "h", descriptor = "I")
	private final int anInt7493;

	@OriginalMember(owner = "client!oo", name = "n", descriptor = "I")
	private final int anInt7499;

	@OriginalMember(owner = "client!oo", name = "r", descriptor = "I")
	private final int anInt7503;

	@OriginalMember(owner = "client!oo", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class3_Sub41(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt7504 = arg0;
		this.anInt7496 = arg4;
		this.anInt7509 = arg5;
		this.anInt7506 = arg6;
		this.anInt7492 = arg8;
		this.anInt7508 = arg7;
		this.anInt7493 = arg1;
		this.anInt7499 = arg2;
		this.anInt7503 = arg3;
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(III)Z")
	public boolean method6502(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 >= this.anInt7493 && this.anInt7503 >= arg0 && this.anInt7499 <= arg1 && arg1 <= this.anInt7496;
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "([IIIB)V")
	public void method6503(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0[0] = 0;
		arg0[1] = arg2 + this.anInt7509 - this.anInt7493;
		arg0[2] = arg1 + this.anInt7506 - this.anInt7499;
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(III[I)V")
	public void method6504(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		arg2[2] = arg1 + this.anInt7499 - this.anInt7506;
		arg2[1] = arg0 + this.anInt7493 - this.anInt7509;
		arg2[0] = this.anInt7504;
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(IBI)Z")
	public boolean method6506(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg1 >= this.anInt7509 && this.anInt7508 >= arg1 && arg0 >= this.anInt7506 && this.anInt7492 >= arg0;
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(IIIB)Z")
	public boolean method6507(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return this.anInt7504 == arg2 && arg0 >= this.anInt7493 && arg0 <= this.anInt7503 && arg1 >= this.anInt7499 && arg1 <= this.anInt7496;
	}
}
