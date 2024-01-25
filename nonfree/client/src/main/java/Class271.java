import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!so")
public final class Class271 {

	@OriginalMember(owner = "client!so", name = "d", descriptor = "I")
	private int anInt7903;

	@OriginalMember(owner = "client!so", name = "r", descriptor = "I")
	private int anInt7915;

	@OriginalMember(owner = "client!so", name = "n", descriptor = "I")
	private int anInt7912;

	@OriginalMember(owner = "client!so", name = "i", descriptor = "I")
	private int anInt7908;

	@OriginalMember(owner = "client!so", name = "c", descriptor = "I")
	private int anInt7902;

	@OriginalMember(owner = "client!so", name = "k", descriptor = "I")
	private int anInt7910;

	@OriginalMember(owner = "client!so", name = "f", descriptor = "I")
	private int anInt7905;

	@OriginalMember(owner = "client!so", name = "q", descriptor = "I")
	private int anInt7914;

	@OriginalMember(owner = "client!so", name = "h", descriptor = "I")
	private int anInt7907;

	@OriginalMember(owner = "client!so", name = "j", descriptor = "I")
	private int anInt7909;

	@OriginalMember(owner = "client!so", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class271(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInt7903 = arg0;
		this.anInt7915 = arg3 * arg3;
		this.anInt7912 = arg1;
		this.anInt7908 = arg2;
		this.anInt7902 = this.anInt7908 + arg8;
		this.anInt7910 = arg6 + this.anInt7912;
		this.anInt7905 = arg4 + this.anInt7903;
		this.anInt7914 = arg5 + this.anInt7903;
		this.anInt7907 = arg7 + this.anInt7912;
		this.anInt7909 = arg9 + this.anInt7908;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IIIZ)Z")
	public boolean method6976(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt7905 > arg2 || this.anInt7914 < arg2) {
			return false;
		} else if (arg1 < this.anInt7910 || arg1 > this.anInt7907) {
			return false;
		} else if (arg0 >= this.anInt7902 && arg0 <= this.anInt7909) {
			@Pc(53) int local53 = arg2 - this.anInt7903;
			@Pc(58) int local58 = arg0 - this.anInt7908;
			return local58 * local58 + local53 * local53 < this.anInt7915;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IIIIIIIBIII)V")
	public void method6981(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		this.anInt7912 = arg0;
		this.anInt7903 = arg4;
		this.anInt7908 = arg6;
		this.anInt7915 = arg7 * arg7;
		this.anInt7905 = arg2 + this.anInt7903;
		this.anInt7902 = arg1 + this.anInt7908;
		this.anInt7914 = arg3 + this.anInt7903;
		this.anInt7910 = arg5 + this.anInt7912;
		this.anInt7909 = arg8 + this.anInt7908;
		this.anInt7907 = arg9 + this.anInt7912;
	}
}
