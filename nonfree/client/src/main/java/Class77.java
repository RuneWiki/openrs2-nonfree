import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dg")
public final class Class77 {

	@OriginalMember(owner = "client!dg", name = "d", descriptor = "I")
	private int anInt2168;

	@OriginalMember(owner = "client!dg", name = "h", descriptor = "I")
	private int anInt2171;

	@OriginalMember(owner = "client!dg", name = "n", descriptor = "I")
	private int anInt2177;

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "I")
	private int anInt2167;

	@OriginalMember(owner = "client!dg", name = "k", descriptor = "I")
	public int anInt2174;

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "I")
	public int anInt2166;

	@OriginalMember(owner = "client!dg", name = "m", descriptor = "I")
	public int anInt2176;

	@OriginalMember(owner = "client!dg", name = "i", descriptor = "I")
	public int anInt2172;

	@OriginalMember(owner = "client!dg", name = "f", descriptor = "I")
	public int anInt2169;

	@OriginalMember(owner = "client!dg", name = "j", descriptor = "I")
	public int anInt2173;

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class77(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInt2168 = arg3 * arg3;
		this.anInt2171 = arg2;
		this.anInt2177 = arg0;
		this.anInt2167 = arg1;
		this.anInt2174 = arg7 + this.anInt2167;
		this.anInt2166 = arg5 + this.anInt2177;
		this.anInt2176 = arg6 + this.anInt2167;
		this.anInt2172 = arg4 + this.anInt2177;
		this.anInt2169 = this.anInt2171 + arg9;
		this.anInt2173 = this.anInt2171 + arg8;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIIIIIIII)V")
	public void method2020(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		this.anInt2171 = arg0;
		this.anInt2168 = arg3 * arg3;
		this.anInt2177 = arg7;
		this.anInt2167 = arg9;
		this.anInt2172 = arg1 + this.anInt2177;
		this.anInt2173 = arg5 + this.anInt2171;
		this.anInt2176 = arg8 + this.anInt2167;
		this.anInt2166 = this.anInt2177 + arg2;
		this.anInt2169 = arg4 + this.anInt2171;
		this.anInt2174 = arg6 + this.anInt2167;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIII)Z")
	public boolean method2022(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (this.anInt2172 > arg2 || this.anInt2166 < arg2) {
			return false;
		} else if (this.anInt2176 > arg1 || this.anInt2174 < arg1) {
			return false;
		} else if (arg0 >= this.anInt2173 && this.anInt2169 >= arg0) {
			@Pc(55) int local55 = arg2 - this.anInt2177;
			@Pc(67) int local67 = arg0 - this.anInt2171;
			return local55 * local55 + local67 * local67 < this.anInt2168;
		} else {
			return false;
		}
	}
}
