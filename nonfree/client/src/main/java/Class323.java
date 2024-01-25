import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sba")
public final class Class323 {

	@OriginalMember(owner = "client!sba", name = "l", descriptor = "I")
	private int anInt8827;

	@OriginalMember(owner = "client!sba", name = "n", descriptor = "I")
	private int anInt8833;

	@OriginalMember(owner = "client!sba", name = "f", descriptor = "I")
	private int anInt8828;

	@OriginalMember(owner = "client!sba", name = "h", descriptor = "I")
	private int anInt8823;

	@OriginalMember(owner = "client!sba", name = "o", descriptor = "I")
	public int anInt8822;

	@OriginalMember(owner = "client!sba", name = "i", descriptor = "I")
	public int anInt8830;

	@OriginalMember(owner = "client!sba", name = "g", descriptor = "I")
	public int anInt8824;

	@OriginalMember(owner = "client!sba", name = "m", descriptor = "I")
	public int anInt8832;

	@OriginalMember(owner = "client!sba", name = "b", descriptor = "I")
	public int anInt8825;

	@OriginalMember(owner = "client!sba", name = "e", descriptor = "I")
	public int anInt8831;

	@OriginalMember(owner = "client!sba", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class323(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInt8827 = arg3 * arg3;
		this.anInt8833 = arg2;
		this.anInt8828 = arg0;
		this.anInt8823 = arg1;
		this.anInt8822 = arg8 + this.anInt8833;
		this.anInt8830 = arg9 + this.anInt8833;
		this.anInt8824 = arg5 + this.anInt8828;
		this.anInt8832 = arg4 + this.anInt8828;
		this.anInt8825 = arg6 + this.anInt8823;
		this.anInt8831 = arg7 + this.anInt8823;
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(BIII)Z")
	public boolean method7722(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 < this.anInt8832 || this.anInt8824 < arg0) {
			return false;
		} else if (this.anInt8825 > arg2 || this.anInt8831 < arg2) {
			return false;
		} else if (arg1 >= this.anInt8822 && arg1 <= this.anInt8830) {
			@Pc(71) int local71 = arg0 - this.anInt8828;
			@Pc(77) int local77 = arg1 - this.anInt8833;
			return local71 * local71 + local77 * local77 < this.anInt8827;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(IIIIIIIIIII)V")
	public void method7724(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9) {
		this.anInt8828 = arg8;
		this.anInt8827 = arg3 * arg3;
		this.anInt8823 = arg9;
		this.anInt8833 = arg6;
		this.anInt8822 = arg7 + this.anInt8833;
		this.anInt8831 = arg5 + this.anInt8823;
		this.anInt8832 = this.anInt8828 + arg4;
		this.anInt8830 = arg2 + this.anInt8833;
		this.anInt8825 = arg1 + this.anInt8823;
		this.anInt8824 = this.anInt8828 + arg0;
	}
}
