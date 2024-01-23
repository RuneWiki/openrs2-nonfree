import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public final class Class8_Sub6 extends Class8 {

	@OriginalMember(owner = "client!bm", name = "G", descriptor = "I")
	private int anInt704;

	@OriginalMember(owner = "client!bm", name = "o", descriptor = "I")
	public int anInt688;

	@OriginalMember(owner = "client!bm", name = "M", descriptor = "I")
	private int anInt708;

	@OriginalMember(owner = "client!bm", name = "v", descriptor = "I")
	private int anInt695;

	@OriginalMember(owner = "client!bm", name = "C", descriptor = "I")
	public int anInt700;

	@OriginalMember(owner = "client!bm", name = "p", descriptor = "I")
	private int anInt689;

	@OriginalMember(owner = "client!bm", name = "x", descriptor = "I")
	public int anInt697;

	@OriginalMember(owner = "client!bm", name = "B", descriptor = "I")
	private int anInt699;

	@OriginalMember(owner = "client!bm", name = "t", descriptor = "I")
	private int anInt693;

	@OriginalMember(owner = "client!bm", name = "F", descriptor = "I")
	public int anInt703;

	@OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class8_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInt704 = arg3;
		this.anInt688 = arg6;
		this.anInt708 = arg4;
		this.anInt695 = arg5;
		this.anInt700 = arg8;
		this.anInt689 = arg1;
		this.anInt697 = arg9;
		this.anInt699 = arg2;
		this.anInt693 = arg0;
		this.anInt703 = arg7;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIBI)Z")
	public boolean method470(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return this.anInt693 == arg0 && arg1 >= this.anInt699 && this.anInt708 >= arg1 && this.anInt704 <= arg2 && arg2 <= this.anInt695;
	}

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(III)Z")
	public boolean method473(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 >= this.anInt688 && this.anInt700 >= arg1 && arg0 >= this.anInt703 && arg0 <= this.anInt697;
	}

	@OriginalMember(owner = "client!bm", name = "c", descriptor = "(III)Z")
	public boolean method475(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 >= this.anInt699 && this.anInt708 >= arg1 && this.anInt704 <= arg0 && arg0 <= this.anInt695;
	}

	@OriginalMember(owner = "client!bm", name = "d", descriptor = "(III)[I")
	public int[] method476(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return new int[] { this.anInt693, arg1 + this.anInt699 - this.anInt688, arg0 + this.anInt704 + -this.anInt703 };
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(BII)[I")
	public int[] method478(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return new int[] { this.anInt689, this.anInt688 + arg1 - this.anInt699, arg0 + -this.anInt704 + this.anInt703 };
	}
}
