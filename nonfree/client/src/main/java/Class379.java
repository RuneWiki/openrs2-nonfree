import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wg")
public final class Class379 {

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "I")
	private int anInt10290;

	@OriginalMember(owner = "client!wg", name = "d", descriptor = "I")
	private int anInt10292;

	@OriginalMember(owner = "client!wg", name = "i", descriptor = "I")
	private int anInt10297;

	@OriginalMember(owner = "client!wg", name = "o", descriptor = "I")
	private int anInt10302;

	@OriginalMember(owner = "client!wg", name = "h", descriptor = "I")
	public int anInt10296;

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "I")
	public int anInt10291;

	@OriginalMember(owner = "client!wg", name = "j", descriptor = "I")
	public int anInt10298;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "I")
	public int anInt10289;

	@OriginalMember(owner = "client!wg", name = "m", descriptor = "I")
	public int anInt10300;

	@OriginalMember(owner = "client!wg", name = "g", descriptor = "I")
	public int anInt10295;

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class379(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInt10290 = arg0;
		this.anInt10292 = arg1;
		this.anInt10297 = arg3 * arg3;
		this.anInt10302 = arg2;
		this.anInt10296 = arg6 + this.anInt10292;
		this.anInt10291 = arg9 + this.anInt10302;
		this.anInt10298 = arg8 + this.anInt10302;
		this.anInt10289 = arg7 + this.anInt10292;
		this.anInt10300 = this.anInt10290 + arg4;
		this.anInt10295 = arg5 + this.anInt10290;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIIIIIIBI)V")
	public void method8750(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9) {
		this.anInt10297 = arg8 * arg8;
		this.anInt10302 = arg2;
		this.anInt10290 = arg5;
		this.anInt10292 = arg1;
		this.anInt10300 = this.anInt10290 + arg3;
		this.anInt10289 = arg6 + this.anInt10292;
		this.anInt10296 = this.anInt10292 + arg9;
		this.anInt10291 = arg4 + this.anInt10302;
		this.anInt10295 = this.anInt10290 + arg7;
		this.anInt10298 = arg0 + this.anInt10302;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIZ)Z")
	public boolean method8751(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt10300 > arg1 || this.anInt10295 < arg1) {
			return false;
		} else if (this.anInt10296 > arg2 || arg2 > this.anInt10289) {
			return false;
		} else if (arg0 >= this.anInt10298 && this.anInt10291 >= arg0) {
			@Pc(61) int local61 = arg1 - this.anInt10290;
			@Pc(67) int local67 = arg0 - this.anInt10302;
			return local67 * local67 + local61 * local61 < this.anInt10297;
		} else {
			return false;
		}
	}
}
