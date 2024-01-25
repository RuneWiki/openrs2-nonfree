import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oia")
public final class Class243 {

	@OriginalMember(owner = "client!oia", name = "d", descriptor = "I")
	private int anInt7495;

	@OriginalMember(owner = "client!oia", name = "n", descriptor = "I")
	private int anInt7505;

	@OriginalMember(owner = "client!oia", name = "l", descriptor = "I")
	private int anInt7503;

	@OriginalMember(owner = "client!oia", name = "c", descriptor = "I")
	private int anInt7494;

	@OriginalMember(owner = "client!oia", name = "h", descriptor = "I")
	public int anInt7499;

	@OriginalMember(owner = "client!oia", name = "j", descriptor = "I")
	public int anInt7501;

	@OriginalMember(owner = "client!oia", name = "b", descriptor = "I")
	public int anInt7493;

	@OriginalMember(owner = "client!oia", name = "i", descriptor = "I")
	public int anInt7500;

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "I")
	public int anInt7492;

	@OriginalMember(owner = "client!oia", name = "f", descriptor = "I")
	public int anInt7497;

	@OriginalMember(owner = "client!oia", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class243(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInt7495 = arg0;
		this.anInt7505 = arg2;
		this.anInt7503 = arg3 * arg3;
		this.anInt7494 = arg1;
		this.anInt7499 = this.anInt7494 + arg6;
		this.anInt7501 = arg8 + this.anInt7505;
		this.anInt7493 = this.anInt7505 + arg9;
		this.anInt7500 = this.anInt7495 + arg5;
		this.anInt7492 = arg7 + this.anInt7494;
		this.anInt7497 = arg4 + this.anInt7495;
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(IIIIIIIIIII)V")
	public void method6335(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		this.anInt7495 = arg0;
		this.anInt7503 = arg2 * arg2;
		this.anInt7494 = arg9;
		this.anInt7505 = arg5;
		this.anInt7492 = arg8 + this.anInt7494;
		this.anInt7500 = this.anInt7495 + arg1;
		this.anInt7499 = arg3 + this.anInt7494;
		this.anInt7501 = arg7 + this.anInt7505;
		this.anInt7497 = this.anInt7495 + arg4;
		this.anInt7493 = this.anInt7505 + arg6;
	}

	@OriginalMember(owner = "client!oia", name = "b", descriptor = "(IIII)Z")
	public boolean method6338(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt7497 > arg0 || arg0 > this.anInt7500) {
			return false;
		} else if (arg1 < this.anInt7499 || arg1 > this.anInt7492) {
			return false;
		} else if (this.anInt7501 <= arg2 && arg2 <= this.anInt7493) {
			@Pc(69) int local69 = arg0 - this.anInt7495;
			@Pc(75) int local75 = arg2 - this.anInt7505;
			return local69 * local69 + local75 * local75 < this.anInt7503;
		} else {
			return false;
		}
	}
}
