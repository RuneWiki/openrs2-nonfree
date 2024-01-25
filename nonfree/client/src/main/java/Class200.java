import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kn")
public final class Class200 {

	@OriginalMember(owner = "client!kn", name = "n", descriptor = "I")
	private int anInt5114;

	@OriginalMember(owner = "client!kn", name = "j", descriptor = "I")
	private int anInt5110;

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "I")
	private int anInt5102;

	@OriginalMember(owner = "client!kn", name = "i", descriptor = "I")
	private int anInt5109;

	@OriginalMember(owner = "client!kn", name = "k", descriptor = "I")
	public int anInt5111;

	@OriginalMember(owner = "client!kn", name = "l", descriptor = "I")
	public int anInt5112;

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "I")
	public int anInt5101;

	@OriginalMember(owner = "client!kn", name = "d", descriptor = "I")
	public int anInt5104;

	@OriginalMember(owner = "client!kn", name = "p", descriptor = "I")
	public int anInt5115;

	@OriginalMember(owner = "client!kn", name = "f", descriptor = "I")
	public int anInt5106;

	@OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInt5114 = arg0;
		this.anInt5110 = arg3 * arg3;
		this.anInt5102 = arg1;
		this.anInt5109 = arg2;
		this.anInt5111 = arg6 + this.anInt5102;
		this.anInt5112 = arg9 + this.anInt5109;
		this.anInt5101 = this.anInt5114 + arg4;
		this.anInt5104 = this.anInt5114 + arg5;
		this.anInt5115 = this.anInt5102 + arg7;
		this.anInt5106 = arg8 + this.anInt5109;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIIBIIIIIII)V")
	public void method4583(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		this.anInt5109 = arg5;
		this.anInt5102 = arg7;
		this.anInt5110 = arg9 * arg9;
		this.anInt5114 = arg2;
		this.anInt5104 = arg6 + this.anInt5114;
		this.anInt5101 = arg0 + this.anInt5114;
		this.anInt5112 = this.anInt5109 + arg4;
		this.anInt5111 = arg3 + this.anInt5102;
		this.anInt5115 = this.anInt5102 + arg1;
		this.anInt5106 = this.anInt5109 + arg8;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIIB)Z")
	public boolean method4584(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 < this.anInt5101 || this.anInt5104 < arg1) {
			return false;
		} else if (this.anInt5111 > arg0 || this.anInt5115 < arg0) {
			return false;
		} else if (arg2 >= this.anInt5106 && this.anInt5112 >= arg2) {
			@Pc(60) int local60 = arg1 - this.anInt5114;
			@Pc(66) int local66 = arg2 - this.anInt5109;
			return local60 * local60 + local66 * local66 < this.anInt5110;
		} else {
			return false;
		}
	}
}
