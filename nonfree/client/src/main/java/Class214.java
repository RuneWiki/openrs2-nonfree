import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ln")
public final class Class214 {

	@OriginalMember(owner = "client!ln", name = "o", descriptor = "I")
	private int anInt5933;

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "I")
	private int anInt5921;

	@OriginalMember(owner = "client!ln", name = "m", descriptor = "I")
	private int anInt5932;

	@OriginalMember(owner = "client!ln", name = "f", descriptor = "I")
	private int anInt5925;

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "I")
	public int anInt5920;

	@OriginalMember(owner = "client!ln", name = "k", descriptor = "I")
	public int anInt5930;

	@OriginalMember(owner = "client!ln", name = "c", descriptor = "I")
	public int anInt5922;

	@OriginalMember(owner = "client!ln", name = "d", descriptor = "I")
	public int anInt5923;

	@OriginalMember(owner = "client!ln", name = "h", descriptor = "I")
	public int anInt5927;

	@OriginalMember(owner = "client!ln", name = "p", descriptor = "I")
	public int anInt5934;

	@OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInt5933 = arg0;
		this.anInt5921 = arg1;
		this.anInt5932 = arg2;
		this.anInt5925 = arg3 * arg3;
		this.anInt5920 = this.anInt5933 + arg5;
		this.anInt5930 = this.anInt5933 + arg4;
		this.anInt5922 = arg7 + this.anInt5921;
		this.anInt5923 = arg6 + this.anInt5921;
		this.anInt5927 = this.anInt5932 + arg9;
		this.anInt5934 = this.anInt5932 + arg8;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIII)Z")
	public boolean method5031(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 < this.anInt5930 || arg0 > this.anInt5920) {
			return false;
		} else if (arg1 < this.anInt5923 || arg1 > this.anInt5922) {
			return false;
		} else if (this.anInt5934 <= arg2 && arg2 <= this.anInt5927) {
			@Pc(56) int local56 = arg0 - this.anInt5933;
			@Pc(62) int local62 = arg2 - this.anInt5932;
			return this.anInt5925 > local62 * local62 + local56 * local56;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIIIIIIIIII)V")
	public void method5033(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		this.anInt5921 = arg5;
		this.anInt5932 = arg7;
		this.anInt5925 = arg4 * arg4;
		this.anInt5933 = arg3;
		this.anInt5920 = arg0 + this.anInt5933;
		this.anInt5930 = this.anInt5933 + arg6;
		this.anInt5927 = this.anInt5932 + arg8;
		this.anInt5923 = arg1 + this.anInt5921;
		this.anInt5934 = this.anInt5932 + arg9;
		this.anInt5922 = arg2 + this.anInt5921;
	}
}
