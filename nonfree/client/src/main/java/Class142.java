import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hw")
public final class Class142 {

	@OriginalMember(owner = "client!hw", name = "e", descriptor = "I")
	private int anInt4998;

	@OriginalMember(owner = "client!hw", name = "n", descriptor = "I")
	private int anInt5006;

	@OriginalMember(owner = "client!hw", name = "b", descriptor = "I")
	private int anInt4996;

	@OriginalMember(owner = "client!hw", name = "f", descriptor = "I")
	private int anInt4999;

	@OriginalMember(owner = "client!hw", name = "i", descriptor = "I")
	private int anInt5002;

	@OriginalMember(owner = "client!hw", name = "c", descriptor = "I")
	private int anInt4997;

	@OriginalMember(owner = "client!hw", name = "m", descriptor = "I")
	private int anInt5005;

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "I")
	private int anInt4995;

	@OriginalMember(owner = "client!hw", name = "p", descriptor = "I")
	private int anInt5008;

	@OriginalMember(owner = "client!hw", name = "o", descriptor = "I")
	private int anInt5007;

	@OriginalMember(owner = "client!hw", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class142(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInt4998 = arg2;
		this.anInt5006 = arg1;
		this.anInt4996 = arg3 * arg3;
		this.anInt4999 = arg0;
		this.anInt5002 = this.anInt4998 + arg8;
		this.anInt4997 = arg7 + this.anInt5006;
		this.anInt5005 = arg6 + this.anInt5006;
		this.anInt4995 = arg9 + this.anInt4998;
		this.anInt5008 = arg5 + this.anInt4999;
		this.anInt5007 = this.anInt4999 + arg4;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(IIBIIIIIIII)V")
	public void method4300(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		this.anInt4999 = arg2;
		this.anInt5006 = arg8;
		this.anInt4996 = arg3 * arg3;
		this.anInt4998 = arg4;
		this.anInt4995 = arg6 + this.anInt4998;
		this.anInt5002 = this.anInt4998 + arg7;
		this.anInt5008 = this.anInt4999 + arg9;
		this.anInt5007 = arg5 + this.anInt4999;
		this.anInt5005 = arg1 + this.anInt5006;
		this.anInt4997 = this.anInt5006 + arg0;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(IIII)Z")
	public boolean method4301(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (this.anInt5007 > arg2 || this.anInt5008 < arg2) {
			return false;
		} else if (arg1 < this.anInt5005 || arg1 > this.anInt4997) {
			return false;
		} else if (arg0 >= this.anInt5002 && arg0 <= this.anInt4995) {
			@Pc(58) int local58 = arg2 - this.anInt4999;
			@Pc(64) int local64 = arg0 - this.anInt4998;
			return this.anInt4996 > local58 * local58 + local64 * local64;
		} else {
			return false;
		}
	}
}
