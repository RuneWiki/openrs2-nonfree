import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ria")
public final class Class290 {

	@OriginalMember(owner = "client!ria", name = "j", descriptor = "I")
	private int anInt8559;

	@OriginalMember(owner = "client!ria", name = "f", descriptor = "I")
	private int anInt8555;

	@OriginalMember(owner = "client!ria", name = "p", descriptor = "I")
	private int anInt8565;

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "I")
	private int anInt8551;

	@OriginalMember(owner = "client!ria", name = "e", descriptor = "I")
	public int anInt8554;

	@OriginalMember(owner = "client!ria", name = "i", descriptor = "I")
	public int anInt8558;

	@OriginalMember(owner = "client!ria", name = "g", descriptor = "I")
	public int anInt8556;

	@OriginalMember(owner = "client!ria", name = "c", descriptor = "I")
	public int anInt8553;

	@OriginalMember(owner = "client!ria", name = "n", descriptor = "I")
	public int anInt8563;

	@OriginalMember(owner = "client!ria", name = "l", descriptor = "I")
	public int anInt8561;

	@OriginalMember(owner = "client!ria", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class290(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInt8559 = arg0;
		this.anInt8555 = arg3 * arg3;
		this.anInt8565 = arg2;
		this.anInt8551 = arg1;
		this.anInt8554 = this.anInt8551 + arg7;
		this.anInt8558 = this.anInt8565 + arg8;
		this.anInt8556 = this.anInt8551 + arg6;
		this.anInt8553 = arg5 + this.anInt8559;
		this.anInt8563 = this.anInt8565 + arg9;
		this.anInt8561 = arg4 + this.anInt8559;
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(IIIZ)Z")
	public boolean method7383(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt8561 > arg1 || arg1 > this.anInt8553) {
			return false;
		} else if (this.anInt8556 > arg0 || arg0 > this.anInt8554) {
			return false;
		} else if (this.anInt8558 <= arg2 && arg2 <= this.anInt8563) {
			@Pc(56) int local56 = arg1 - this.anInt8559;
			@Pc(62) int local62 = arg2 - this.anInt8565;
			return this.anInt8555 > local62 * local62 + local56 * local56;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(IIIIIZIIIII)V")
	public void method7386(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		this.anInt8555 = arg0 * arg0;
		this.anInt8565 = arg9;
		this.anInt8551 = arg8;
		this.anInt8559 = arg2;
		this.anInt8556 = arg6 + this.anInt8551;
		this.anInt8553 = arg3 + this.anInt8559;
		this.anInt8554 = this.anInt8551 + arg1;
		this.anInt8558 = arg7 + this.anInt8565;
		this.anInt8563 = arg4 + this.anInt8565;
		this.anInt8561 = arg5 + this.anInt8559;
	}
}
