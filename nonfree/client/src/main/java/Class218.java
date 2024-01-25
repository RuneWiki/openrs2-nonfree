import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nk")
public final class Class218 {

	@OriginalMember(owner = "client!nk", name = "t", descriptor = "I")
	private int anInt6263;

	@OriginalMember(owner = "client!nk", name = "h", descriptor = "I")
	private int anInt6251;

	@OriginalMember(owner = "client!nk", name = "e", descriptor = "I")
	private int anInt6248;

	@OriginalMember(owner = "client!nk", name = "l", descriptor = "I")
	private int anInt6255;

	@OriginalMember(owner = "client!nk", name = "k", descriptor = "I")
	private int anInt6254;

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "I")
	private int anInt6246;

	@OriginalMember(owner = "client!nk", name = "f", descriptor = "I")
	private int anInt6249;

	@OriginalMember(owner = "client!nk", name = "o", descriptor = "I")
	private int anInt6258;

	@OriginalMember(owner = "client!nk", name = "s", descriptor = "I")
	private int anInt6262;

	@OriginalMember(owner = "client!nk", name = "j", descriptor = "I")
	private int anInt6253;

	@OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class218(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInt6263 = arg3 * arg3;
		this.anInt6251 = arg0;
		this.anInt6248 = arg1;
		this.anInt6255 = arg2;
		this.anInt6254 = arg4 + this.anInt6251;
		this.anInt6246 = this.anInt6255 + arg9;
		this.anInt6249 = this.anInt6255 + arg8;
		this.anInt6258 = this.anInt6248 + arg7;
		this.anInt6262 = arg5 + this.anInt6251;
		this.anInt6253 = this.anInt6248 + arg6;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIII)Z")
	public boolean method5242(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt6254 > arg1 || this.anInt6262 < arg1) {
			return false;
		} else if (arg0 < this.anInt6253 || this.anInt6258 < arg0) {
			return false;
		} else if (arg2 >= this.anInt6249 && this.anInt6246 >= arg2) {
			@Pc(60) int local60 = arg1 - this.anInt6251;
			@Pc(65) int local65 = arg2 - this.anInt6255;
			return local65 * local65 + local60 * local60 < this.anInt6263;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(BIIIIIIIIII)V")
	public void method5246(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		this.anInt6263 = arg2 * arg2;
		this.anInt6255 = arg6;
		this.anInt6248 = arg8;
		this.anInt6251 = arg1;
		this.anInt6249 = this.anInt6255 + arg5;
		this.anInt6262 = this.anInt6251 + arg0;
		this.anInt6246 = this.anInt6255 + arg3;
		this.anInt6258 = arg9 + this.anInt6248;
		this.anInt6254 = arg4 + this.anInt6251;
		this.anInt6253 = this.anInt6248 + arg7;
	}
}
