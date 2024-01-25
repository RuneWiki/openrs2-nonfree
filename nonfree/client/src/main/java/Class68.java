import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dfa")
public final class Class68 {

	@OriginalMember(owner = "client!dfa", name = "j", descriptor = "I")
	private int anInt2177;

	@OriginalMember(owner = "client!dfa", name = "k", descriptor = "I")
	private int anInt2179;

	@OriginalMember(owner = "client!dfa", name = "g", descriptor = "I")
	private int anInt2186;

	@OriginalMember(owner = "client!dfa", name = "q", descriptor = "I")
	private int anInt2190;

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "I")
	public int anInt2189;

	@OriginalMember(owner = "client!dfa", name = "p", descriptor = "I")
	public int anInt2184;

	@OriginalMember(owner = "client!dfa", name = "f", descriptor = "I")
	public int anInt2180;

	@OriginalMember(owner = "client!dfa", name = "e", descriptor = "I")
	public int anInt2182;

	@OriginalMember(owner = "client!dfa", name = "m", descriptor = "I")
	public int anInt2178;

	@OriginalMember(owner = "client!dfa", name = "d", descriptor = "I")
	public int anInt2188;

	@OriginalMember(owner = "client!dfa", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class68(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInt2177 = arg2;
		this.anInt2179 = arg3 * arg3;
		this.anInt2186 = arg0;
		this.anInt2190 = arg1;
		this.anInt2189 = this.anInt2190 + arg7;
		this.anInt2184 = arg5 + this.anInt2186;
		this.anInt2180 = arg6 + this.anInt2190;
		this.anInt2182 = arg8 + this.anInt2177;
		this.anInt2178 = this.anInt2177 + arg9;
		this.anInt2188 = arg4 + this.anInt2186;
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IIIIIIIIIII)V")
	public void method1956(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		this.anInt2177 = arg0;
		this.anInt2179 = arg9 * arg9;
		this.anInt2186 = arg2;
		this.anInt2190 = arg5;
		this.anInt2188 = this.anInt2186 + arg1;
		this.anInt2184 = arg7 + this.anInt2186;
		this.anInt2189 = this.anInt2190 + arg8;
		this.anInt2178 = arg6 + this.anInt2177;
		this.anInt2180 = this.anInt2190 + arg3;
		this.anInt2182 = arg4 + this.anInt2177;
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IIII)Z")
	public boolean method1957(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (this.anInt2188 > arg0 || this.anInt2184 < arg0) {
			return false;
		} else if (arg2 < this.anInt2180 || arg2 > this.anInt2189) {
			return false;
		} else if (arg1 >= this.anInt2182 && this.anInt2178 >= arg1) {
			@Pc(60) int local60 = arg0 - this.anInt2186;
			@Pc(74) int local74 = arg1 - this.anInt2177;
			return local74 * local74 + local60 * local60 < this.anInt2179;
		} else {
			return false;
		}
	}
}
