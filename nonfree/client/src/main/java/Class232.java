import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mg")
public final class Class232 {

	@OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
	private int anInt7040;

	@OriginalMember(owner = "client!mg", name = "g", descriptor = "I")
	private int anInt7041;

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "I")
	private int anInt7038;

	@OriginalMember(owner = "client!mg", name = "l", descriptor = "I")
	private int anInt7046;

	@OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
	public int anInt7039;

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "I")
	public int anInt7036;

	@OriginalMember(owner = "client!mg", name = "h", descriptor = "I")
	public int anInt7042;

	@OriginalMember(owner = "client!mg", name = "i", descriptor = "I")
	public int anInt7043;

	@OriginalMember(owner = "client!mg", name = "j", descriptor = "I")
	public int anInt7044;

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "I")
	public int anInt7037;

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class232(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInt7040 = arg1;
		this.anInt7041 = arg2;
		this.anInt7038 = arg0;
		this.anInt7046 = arg3 * arg3;
		this.anInt7039 = this.anInt7038 + arg4;
		this.anInt7036 = this.anInt7040 + arg6;
		this.anInt7042 = arg7 + this.anInt7040;
		this.anInt7043 = this.anInt7041 + arg9;
		this.anInt7044 = this.anInt7038 + arg5;
		this.anInt7037 = this.anInt7041 + arg8;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(BIIIIIIIIII)V")
	public void method6318(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		this.anInt7046 = arg1 * arg1;
		this.anInt7041 = arg4;
		this.anInt7040 = arg3;
		this.anInt7038 = arg6;
		this.anInt7036 = this.anInt7040 + arg8;
		this.anInt7043 = arg5 + this.anInt7041;
		this.anInt7044 = arg2 + this.anInt7038;
		this.anInt7039 = arg0 + this.anInt7038;
		this.anInt7042 = this.anInt7040 + arg9;
		this.anInt7037 = arg7 + this.anInt7041;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIII)Z")
	public boolean method6320(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 < this.anInt7039 || arg2 > this.anInt7044) {
			return false;
		} else if (arg0 < this.anInt7036 || this.anInt7042 < arg0) {
			return false;
		} else if (this.anInt7037 <= arg1 && this.anInt7043 >= arg1) {
			@Pc(55) int local55 = arg2 - this.anInt7038;
			@Pc(61) int local61 = arg1 - this.anInt7041;
			return local61 * local61 + local55 * local55 < this.anInt7046;
		} else {
			return false;
		}
	}
}
