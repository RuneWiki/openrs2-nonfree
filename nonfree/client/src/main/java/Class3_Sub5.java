import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public final class Class3_Sub5 extends Class3 {

	@OriginalMember(owner = "client!ch", name = "w", descriptor = "I")
	private int anInt659;

	@OriginalMember(owner = "client!ch", name = "x", descriptor = "I")
	private int anInt660;

	@OriginalMember(owner = "client!ch", name = "D", descriptor = "I")
	private int anInt665;

	@OriginalMember(owner = "client!ch", name = "t", descriptor = "I")
	private int anInt656;

	@OriginalMember(owner = "client!ch", name = "s", descriptor = "I")
	public int anInt655;

	@OriginalMember(owner = "client!ch", name = "H", descriptor = "I")
	public int anInt669;

	@OriginalMember(owner = "client!ch", name = "E", descriptor = "I")
	public int anInt666;

	@OriginalMember(owner = "client!ch", name = "q", descriptor = "I")
	public int anInt653;

	@OriginalMember(owner = "client!ch", name = "v", descriptor = "I")
	private int anInt658;

	@OriginalMember(owner = "client!ch", name = "C", descriptor = "I")
	private int anInt664;

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class3_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInt659 = arg5;
		this.anInt660 = arg3;
		this.anInt665 = arg1;
		this.anInt656 = arg0;
		this.anInt655 = arg6;
		this.anInt669 = arg8;
		this.anInt666 = arg7;
		this.anInt653 = arg9;
		this.anInt658 = arg2;
		this.anInt664 = arg4;
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(III)Z")
	public boolean method549(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.anInt655 <= arg1 && arg1 <= this.anInt669 && this.anInt666 <= arg0 && arg0 <= this.anInt653;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZII)Z")
	public boolean method550(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.anInt658 <= arg0 && arg0 <= this.anInt664 && this.anInt660 <= arg1 && arg1 <= this.anInt659;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "([IIZI)V")
	public void method553(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		arg0[0] = this.anInt665;
		arg0[2] = this.anInt666 + arg2 - this.anInt660;
		arg0[1] = this.anInt655 + arg1 - this.anInt658;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IBII)Z")
	public boolean method556(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return this.anInt656 == arg0 && arg1 >= this.anInt658 && arg1 <= this.anInt664 && arg2 >= this.anInt660 && arg2 <= this.anInt659;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(II[IB)V")
	public void method557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		arg2[0] = this.anInt656;
		arg2[1] = arg0 + this.anInt658 - this.anInt655;
		arg2[2] = this.anInt660 + arg1 - this.anInt666;
	}
}
