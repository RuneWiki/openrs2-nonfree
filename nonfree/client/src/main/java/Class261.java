import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oba")
public final class Class261 {

	@OriginalMember(owner = "client!oba", name = "h", descriptor = "I")
	private int anInt6712;

	@OriginalMember(owner = "client!oba", name = "g", descriptor = "I")
	private int anInt6711;

	@OriginalMember(owner = "client!oba", name = "b", descriptor = "I")
	private int anInt6706;

	@OriginalMember(owner = "client!oba", name = "i", descriptor = "I")
	private int anInt6713;

	@OriginalMember(owner = "client!oba", name = "m", descriptor = "I")
	public int anInt6716;

	@OriginalMember(owner = "client!oba", name = "o", descriptor = "I")
	public int anInt6718;

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "I")
	public int anInt6705;

	@OriginalMember(owner = "client!oba", name = "c", descriptor = "I")
	public int anInt6707;

	@OriginalMember(owner = "client!oba", name = "d", descriptor = "I")
	public int anInt6708;

	@OriginalMember(owner = "client!oba", name = "j", descriptor = "I")
	public int anInt6714;

	@OriginalMember(owner = "client!oba", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class261(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInt6712 = arg1;
		this.anInt6711 = arg0;
		this.anInt6706 = arg2;
		this.anInt6713 = arg3 * arg3;
		this.anInt6716 = this.anInt6712 + arg6;
		this.anInt6718 = arg9 + this.anInt6706;
		this.anInt6705 = arg8 + this.anInt6706;
		this.anInt6707 = arg5 + this.anInt6711;
		this.anInt6708 = arg7 + this.anInt6712;
		this.anInt6714 = arg4 + this.anInt6711;
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(IIIIIIIIIII)V")
	public void method5888(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		this.anInt6713 = arg2 * arg2;
		this.anInt6711 = arg8;
		this.anInt6706 = arg0;
		this.anInt6712 = arg4;
		this.anInt6705 = arg6 + this.anInt6706;
		this.anInt6718 = this.anInt6706 + arg7;
		this.anInt6714 = arg9 + this.anInt6711;
		this.anInt6708 = this.anInt6712 + arg5;
		this.anInt6707 = arg3 + this.anInt6711;
		this.anInt6716 = arg1 + this.anInt6712;
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(IBII)Z")
	public boolean method5889(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 < this.anInt6714 || this.anInt6707 < arg1) {
			return false;
		} else if (arg0 < this.anInt6716 || this.anInt6708 < arg0) {
			return false;
		} else if (arg2 >= this.anInt6705 && arg2 <= this.anInt6718) {
			@Pc(52) int local52 = arg1 - this.anInt6711;
			@Pc(58) int local58 = arg2 - this.anInt6706;
			return this.anInt6713 > local52 * local52 + local58 * local58;
		} else {
			return false;
		}
	}
}
