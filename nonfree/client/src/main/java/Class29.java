import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bm")
public final class Class29 {

	@OriginalMember(owner = "client!bm", name = "p", descriptor = "[B")
	public static final byte[] aByteArray8;

	@OriginalMember(owner = "client!bm", name = "f", descriptor = "I")
	private int anInt989;

	@OriginalMember(owner = "client!bm", name = "e", descriptor = "I")
	private int anInt988;

	@OriginalMember(owner = "client!bm", name = "n", descriptor = "I")
	private int anInt997;

	@OriginalMember(owner = "client!bm", name = "h", descriptor = "I")
	private int anInt991;

	@OriginalMember(owner = "client!bm", name = "k", descriptor = "I")
	private int anInt994;

	@OriginalMember(owner = "client!bm", name = "q", descriptor = "I")
	private int anInt999;

	@OriginalMember(owner = "client!bm", name = "i", descriptor = "I")
	private int anInt992;

	@OriginalMember(owner = "client!bm", name = "m", descriptor = "I")
	private int anInt996;

	@OriginalMember(owner = "client!bm", name = "l", descriptor = "I")
	private int anInt995;

	@OriginalMember(owner = "client!bm", name = "d", descriptor = "I")
	private int anInt987;

	static {
		@Pc(7) int local7 = 0;
		aByteArray8 = new byte[32896];
		for (@Pc(12) int local12 = 0; local12 < 256; local12++) {
			for (@Pc(15) int local15 = 0; local15 <= local12; local15++) {
				aByteArray8[local7++] = (byte) (255.0D / Math.sqrt((double) ((float) (local15 * local15 + local12 * local12 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class29(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInt989 = arg1;
		this.anInt988 = arg2;
		this.anInt997 = arg3 * arg3;
		this.anInt991 = arg0;
		this.anInt994 = this.anInt989 + arg6;
		this.anInt999 = arg9 + this.anInt988;
		this.anInt992 = this.anInt991 + arg4;
		this.anInt996 = arg8 + this.anInt988;
		this.anInt995 = arg7 + this.anInt989;
		this.anInt987 = this.anInt991 + arg5;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIIIIIIIII)V")
	public void method771(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		this.anInt988 = arg3;
		this.anInt997 = arg9 * arg9;
		this.anInt991 = arg2;
		this.anInt989 = arg4;
		this.anInt995 = this.anInt989 + arg1;
		this.anInt999 = arg7 + this.anInt988;
		this.anInt994 = this.anInt989 + arg5;
		this.anInt996 = arg6 + this.anInt988;
		this.anInt987 = arg8 + this.anInt991;
		this.anInt992 = arg0 + this.anInt991;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(BIII)Z")
	public boolean method773(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (this.anInt992 > arg1 || arg1 > this.anInt987) {
			return false;
		} else if (arg2 < this.anInt994 || arg2 > this.anInt995) {
			return false;
		} else if (this.anInt996 <= arg0 && arg0 <= this.anInt999) {
			@Pc(51) int local51 = arg1 - this.anInt991;
			@Pc(57) int local57 = arg0 - this.anInt988;
			return this.anInt997 > local51 * local51 + local57 * local57;
		} else {
			return false;
		}
	}
}
