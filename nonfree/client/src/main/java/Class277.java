import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qt")
public final class Class277 {

	@OriginalMember(owner = "client!qt", name = "o", descriptor = "I")
	private int anInt7543;

	@OriginalMember(owner = "client!qt", name = "e", descriptor = "I")
	private int anInt7535;

	@OriginalMember(owner = "client!qt", name = "k", descriptor = "I")
	private int anInt7540;

	@OriginalMember(owner = "client!qt", name = "b", descriptor = "I")
	private int anInt7532;

	@OriginalMember(owner = "client!qt", name = "f", descriptor = "I")
	private int anInt7536;

	@OriginalMember(owner = "client!qt", name = "i", descriptor = "I")
	private int anInt7538;

	@OriginalMember(owner = "client!qt", name = "d", descriptor = "I")
	private int anInt7534;

	@OriginalMember(owner = "client!qt", name = "h", descriptor = "I")
	private int anInt7537;

	@OriginalMember(owner = "client!qt", name = "c", descriptor = "I")
	private int anInt7533;

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "I")
	private int anInt7531;

	@OriginalMember(owner = "client!qt", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class277(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInt7543 = arg3 * arg3;
		this.anInt7535 = arg0;
		this.anInt7540 = arg1;
		this.anInt7532 = arg2;
		this.anInt7536 = this.anInt7540 + arg6;
		this.anInt7538 = arg5 + this.anInt7535;
		this.anInt7534 = this.anInt7532 + arg9;
		this.anInt7537 = arg4 + this.anInt7535;
		this.anInt7533 = arg8 + this.anInt7532;
		this.anInt7531 = this.anInt7540 + arg7;
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(IIII)Z")
	public boolean method6207(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 < this.anInt7537 || this.anInt7538 < arg1) {
			return false;
		} else if (this.anInt7536 > arg0 || this.anInt7531 < arg0) {
			return false;
		} else if (arg2 >= this.anInt7533 && this.anInt7534 >= arg2) {
			@Pc(65) int local65 = arg1 - this.anInt7535;
			@Pc(71) int local71 = arg2 - this.anInt7532;
			return this.anInt7543 > local71 * local71 + local65 * local65;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(IIIBIIIIIII)V")
	public void method6208(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		this.anInt7543 = arg7 * arg7;
		this.anInt7535 = arg4;
		this.anInt7532 = arg3;
		this.anInt7540 = arg1;
		this.anInt7536 = arg6 + this.anInt7540;
		this.anInt7538 = this.anInt7535 + arg2;
		this.anInt7537 = arg9 + this.anInt7535;
		this.anInt7533 = this.anInt7532 + arg8;
		this.anInt7531 = arg0 + this.anInt7540;
		this.anInt7534 = this.anInt7532 + arg5;
	}
}
