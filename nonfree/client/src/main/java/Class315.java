import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rga")
public final class Class315 {

	@OriginalMember(owner = "client!rga", name = "n", descriptor = "I")
	private int anInt8209;

	@OriginalMember(owner = "client!rga", name = "m", descriptor = "I")
	private int anInt8212;

	@OriginalMember(owner = "client!rga", name = "g", descriptor = "I")
	private int anInt8208;

	@OriginalMember(owner = "client!rga", name = "p", descriptor = "I")
	private int anInt8217;

	@OriginalMember(owner = "client!rga", name = "k", descriptor = "I")
	public int anInt8206;

	@OriginalMember(owner = "client!rga", name = "c", descriptor = "I")
	public int anInt8210;

	@OriginalMember(owner = "client!rga", name = "h", descriptor = "I")
	public int anInt8216;

	@OriginalMember(owner = "client!rga", name = "e", descriptor = "I")
	public int anInt8218;

	@OriginalMember(owner = "client!rga", name = "l", descriptor = "I")
	public int anInt8204;

	@OriginalMember(owner = "client!rga", name = "f", descriptor = "I")
	public int anInt8213;

	@OriginalMember(owner = "client!rga", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class315(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInt8209 = arg3 * arg3;
		this.anInt8212 = arg0;
		this.anInt8208 = arg1;
		this.anInt8217 = arg2;
		this.anInt8206 = this.anInt8212 + arg4;
		this.anInt8210 = this.anInt8208 + arg7;
		this.anInt8216 = arg8 + this.anInt8217;
		this.anInt8218 = arg9 + this.anInt8217;
		this.anInt8204 = arg6 + this.anInt8208;
		this.anInt8213 = this.anInt8212 + arg5;
	}

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(IIIIIIIIIII)V")
	public void method7067(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInt8212 = arg8;
		this.anInt8209 = arg7 * arg7;
		this.anInt8208 = arg0;
		this.anInt8217 = arg3;
		this.anInt8206 = arg2 + this.anInt8212;
		this.anInt8216 = this.anInt8217 + arg4;
		this.anInt8210 = this.anInt8208 + arg6;
		this.anInt8204 = this.anInt8208 + arg5;
		this.anInt8218 = arg1 + this.anInt8217;
		this.anInt8213 = this.anInt8212 + arg9;
	}

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(IIIB)Z")
	public boolean method7069(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt8206 > arg2 || arg2 > this.anInt8213) {
			return false;
		} else if (this.anInt8204 > arg0 || this.anInt8210 < arg0) {
			return false;
		} else if (arg1 >= this.anInt8216 && arg1 <= this.anInt8218) {
			@Pc(75) int local75 = arg2 - this.anInt8212;
			@Pc(81) int local81 = arg1 - this.anInt8217;
			return this.anInt8209 > local81 * local81 + local75 * local75;
		} else {
			return false;
		}
	}
}
