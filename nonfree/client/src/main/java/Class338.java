import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tja")
public final class Class338 {

	@OriginalMember(owner = "client!tja", name = "n", descriptor = "I")
	private int anInt9481;

	@OriginalMember(owner = "client!tja", name = "g", descriptor = "I")
	private int anInt9475;

	@OriginalMember(owner = "client!tja", name = "l", descriptor = "I")
	private int anInt9479;

	@OriginalMember(owner = "client!tja", name = "m", descriptor = "I")
	private int anInt9480;

	@OriginalMember(owner = "client!tja", name = "c", descriptor = "I")
	public int anInt9471;

	@OriginalMember(owner = "client!tja", name = "i", descriptor = "I")
	public int anInt9477;

	@OriginalMember(owner = "client!tja", name = "b", descriptor = "I")
	public int anInt9470;

	@OriginalMember(owner = "client!tja", name = "f", descriptor = "I")
	public int anInt9474;

	@OriginalMember(owner = "client!tja", name = "o", descriptor = "I")
	public int anInt9482;

	@OriginalMember(owner = "client!tja", name = "k", descriptor = "I")
	public int anInt9478;

	@OriginalMember(owner = "client!tja", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class338(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInt9481 = arg0;
		this.anInt9475 = arg3 * arg3;
		this.anInt9479 = arg1;
		this.anInt9480 = arg2;
		this.anInt9471 = arg5 + this.anInt9481;
		this.anInt9477 = arg6 + this.anInt9479;
		this.anInt9470 = arg9 + this.anInt9480;
		this.anInt9474 = arg4 + this.anInt9481;
		this.anInt9482 = this.anInt9480 + arg8;
		this.anInt9478 = arg7 + this.anInt9479;
	}

	@OriginalMember(owner = "client!tja", name = "a", descriptor = "(IIIIIIIIIII)V")
	public void method7980(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		this.anInt9480 = arg0;
		this.anInt9479 = arg2;
		this.anInt9475 = arg7 * arg7;
		this.anInt9481 = arg9;
		this.anInt9478 = this.anInt9479 + arg4;
		this.anInt9471 = arg8 + this.anInt9481;
		this.anInt9482 = this.anInt9480 + arg3;
		this.anInt9470 = arg6 + this.anInt9480;
		this.anInt9477 = this.anInt9479 + arg5;
		this.anInt9474 = this.anInt9481 + arg1;
	}

	@OriginalMember(owner = "client!tja", name = "a", descriptor = "(IIIB)Z")
	public boolean method7982(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 < this.anInt9474 || this.anInt9471 < arg0) {
			return false;
		} else if (arg2 < this.anInt9477 || this.anInt9478 < arg2) {
			return false;
		} else if (arg1 >= this.anInt9482 && this.anInt9470 >= arg1) {
			@Pc(51) int local51 = arg0 - this.anInt9481;
			@Pc(63) int local63 = arg1 - this.anInt9480;
			return this.anInt9475 > local51 * local51 + local63 * local63;
		} else {
			return false;
		}
	}
}
