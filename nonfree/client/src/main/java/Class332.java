import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ufa")
public final class Class332 {

	@OriginalMember(owner = "client!ufa", name = "m", descriptor = "I")
	private int anInt9668;

	@OriginalMember(owner = "client!ufa", name = "d", descriptor = "I")
	private int anInt9660;

	@OriginalMember(owner = "client!ufa", name = "c", descriptor = "I")
	private int anInt9659;

	@OriginalMember(owner = "client!ufa", name = "n", descriptor = "I")
	private int anInt9669;

	@OriginalMember(owner = "client!ufa", name = "g", descriptor = "I")
	public int anInt9663;

	@OriginalMember(owner = "client!ufa", name = "f", descriptor = "I")
	public int anInt9662;

	@OriginalMember(owner = "client!ufa", name = "j", descriptor = "I")
	public int anInt9666;

	@OriginalMember(owner = "client!ufa", name = "b", descriptor = "I")
	public int anInt9658;

	@OriginalMember(owner = "client!ufa", name = "i", descriptor = "I")
	public int anInt9665;

	@OriginalMember(owner = "client!ufa", name = "h", descriptor = "I")
	public int anInt9664;

	@OriginalMember(owner = "client!ufa", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class332(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInt9668 = arg1;
		this.anInt9660 = arg2;
		this.anInt9659 = arg3 * arg3;
		this.anInt9669 = arg0;
		this.anInt9663 = arg4 + this.anInt9669;
		this.anInt9662 = arg6 + this.anInt9668;
		this.anInt9666 = this.anInt9660 + arg8;
		this.anInt9658 = this.anInt9668 + arg7;
		this.anInt9665 = arg5 + this.anInt9669;
		this.anInt9664 = arg9 + this.anInt9660;
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(IIIIIIIIIII)V")
	public void method7990(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		this.anInt9669 = arg3;
		this.anInt9660 = arg6;
		this.anInt9668 = arg7;
		this.anInt9659 = arg5 * arg5;
		this.anInt9664 = this.anInt9660 + arg1;
		this.anInt9663 = arg8 + this.anInt9669;
		this.anInt9658 = arg0 + this.anInt9668;
		this.anInt9665 = arg4 + this.anInt9669;
		this.anInt9662 = arg9 + this.anInt9668;
		this.anInt9666 = arg2 + this.anInt9660;
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(IIII)Z")
	public boolean method7993(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 < this.anInt9663 || arg2 > this.anInt9665) {
			return false;
		} else if (arg0 < this.anInt9662 || this.anInt9658 < arg0) {
			return false;
		} else if (this.anInt9666 <= arg1 && this.anInt9664 >= arg1) {
			@Pc(55) int local55 = arg2 - this.anInt9669;
			@Pc(60) int local60 = arg1 - this.anInt9660;
			return this.anInt9659 > local55 * local55 + local60 * local60;
		} else {
			return false;
		}
	}
}
