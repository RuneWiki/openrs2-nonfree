import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rn")
public final class Class305 {

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "I")
	private int anInt9050;

	@OriginalMember(owner = "client!rn", name = "n", descriptor = "I")
	private int anInt9059;

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "I")
	private int anInt9049;

	@OriginalMember(owner = "client!rn", name = "d", descriptor = "I")
	private int anInt9052;

	@OriginalMember(owner = "client!rn", name = "i", descriptor = "I")
	public int anInt9056;

	@OriginalMember(owner = "client!rn", name = "k", descriptor = "I")
	public int anInt9057;

	@OriginalMember(owner = "client!rn", name = "o", descriptor = "I")
	public int anInt9060;

	@OriginalMember(owner = "client!rn", name = "g", descriptor = "I")
	public int anInt9055;

	@OriginalMember(owner = "client!rn", name = "f", descriptor = "I")
	public int anInt9054;

	@OriginalMember(owner = "client!rn", name = "m", descriptor = "I")
	public int anInt9058;

	@OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class305(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInt9050 = arg1;
		this.anInt9059 = arg3 * arg3;
		this.anInt9049 = arg2;
		this.anInt9052 = arg0;
		this.anInt9056 = arg4 + this.anInt9052;
		this.anInt9057 = arg6 + this.anInt9050;
		this.anInt9060 = arg9 + this.anInt9049;
		this.anInt9055 = arg8 + this.anInt9049;
		this.anInt9054 = arg7 + this.anInt9050;
		this.anInt9058 = arg5 + this.anInt9052;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(BIII)Z")
	public boolean method7487(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (this.anInt9056 > arg2 || arg2 > this.anInt9058) {
			return false;
		} else if (arg0 < this.anInt9057 || arg0 > this.anInt9054) {
			return false;
		} else if (this.anInt9055 <= arg1 && this.anInt9060 >= arg1) {
			@Pc(47) int local47 = arg2 - this.anInt9052;
			@Pc(53) int local53 = arg1 - this.anInt9049;
			return this.anInt9059 > local53 * local53 + local47 * local47;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(IIIIZIIIIII)V")
	public void method7489(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		this.anInt9052 = arg6;
		this.anInt9049 = arg4;
		this.anInt9059 = arg8 * arg8;
		this.anInt9050 = arg5;
		this.anInt9054 = this.anInt9050 + arg9;
		this.anInt9056 = arg0 + this.anInt9052;
		this.anInt9057 = arg3 + this.anInt9050;
		this.anInt9058 = this.anInt9052 + arg2;
		this.anInt9055 = arg7 + this.anInt9049;
		this.anInt9060 = this.anInt9049 + arg1;
	}
}
