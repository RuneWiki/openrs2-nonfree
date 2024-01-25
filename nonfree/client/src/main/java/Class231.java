import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pl")
public final class Class231 {

	@OriginalMember(owner = "client!pl", name = "q", descriptor = "I")
	private int anInt6592;

	@OriginalMember(owner = "client!pl", name = "o", descriptor = "I")
	private int anInt6591;

	@OriginalMember(owner = "client!pl", name = "l", descriptor = "I")
	private int anInt6588;

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "I")
	private int anInt6578;

	@OriginalMember(owner = "client!pl", name = "m", descriptor = "I")
	private int anInt6589;

	@OriginalMember(owner = "client!pl", name = "g", descriptor = "I")
	private int anInt6584;

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "I")
	private int anInt6579;

	@OriginalMember(owner = "client!pl", name = "i", descriptor = "I")
	private int anInt6586;

	@OriginalMember(owner = "client!pl", name = "n", descriptor = "I")
	private int anInt6590;

	@OriginalMember(owner = "client!pl", name = "h", descriptor = "I")
	private int anInt6585;

	@OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class231(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInt6592 = arg0;
		this.anInt6591 = arg3 * arg3;
		this.anInt6588 = arg1;
		this.anInt6578 = arg2;
		this.anInt6589 = this.anInt6588 + arg6;
		this.anInt6584 = arg9 + this.anInt6578;
		this.anInt6579 = this.anInt6578 + arg8;
		this.anInt6586 = arg5 + this.anInt6592;
		this.anInt6590 = arg4 + this.anInt6592;
		this.anInt6585 = arg7 + this.anInt6588;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIII)Z")
	public boolean method5705(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 < this.anInt6590 || arg0 > this.anInt6586) {
			return false;
		} else if (this.anInt6589 > arg2 || arg2 > this.anInt6585) {
			return false;
		} else if (arg1 >= this.anInt6579 && arg1 <= this.anInt6584) {
			@Pc(56) int local56 = arg0 - this.anInt6592;
			@Pc(62) int local62 = arg1 - this.anInt6578;
			return this.anInt6591 > local62 * local62 + local56 * local56;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIIIIIIIIII)V")
	public void method5707(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		this.anInt6588 = arg2;
		this.anInt6591 = arg5 * arg5;
		this.anInt6592 = arg7;
		this.anInt6578 = arg1;
		this.anInt6579 = arg0 + this.anInt6578;
		this.anInt6585 = this.anInt6588 + arg6;
		this.anInt6584 = arg3 + this.anInt6578;
		this.anInt6586 = this.anInt6592 + arg8;
		this.anInt6589 = this.anInt6588 + arg9;
		this.anInt6590 = this.anInt6592 + arg4;
	}
}
