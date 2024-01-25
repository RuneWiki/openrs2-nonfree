import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eh")
public final class Class93 {

	@OriginalMember(owner = "client!eh", name = "d", descriptor = "I")
	private int anInt2724;

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "I")
	private int anInt2722;

	@OriginalMember(owner = "client!eh", name = "l", descriptor = "I")
	private int anInt2732;

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "I")
	private int anInt2721;

	@OriginalMember(owner = "client!eh", name = "g", descriptor = "I")
	private int anInt2727;

	@OriginalMember(owner = "client!eh", name = "f", descriptor = "I")
	private int anInt2726;

	@OriginalMember(owner = "client!eh", name = "j", descriptor = "I")
	private int anInt2730;

	@OriginalMember(owner = "client!eh", name = "m", descriptor = "I")
	private int anInt2733;

	@OriginalMember(owner = "client!eh", name = "e", descriptor = "I")
	private int anInt2725;

	@OriginalMember(owner = "client!eh", name = "n", descriptor = "I")
	private int anInt2734;

	@OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class93(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInt2724 = arg0;
		this.anInt2722 = arg2;
		this.anInt2732 = arg1;
		this.anInt2721 = arg3 * arg3;
		this.anInt2727 = this.anInt2722 + arg9;
		this.anInt2726 = arg8 + this.anInt2722;
		this.anInt2730 = this.anInt2732 + arg6;
		this.anInt2733 = arg4 + this.anInt2724;
		this.anInt2725 = arg5 + this.anInt2724;
		this.anInt2734 = this.anInt2732 + arg7;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIIIIIIIII)V")
	public void method2180(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		this.anInt2732 = arg6;
		this.anInt2721 = arg8 * arg8;
		this.anInt2722 = arg5;
		this.anInt2724 = arg4;
		this.anInt2734 = arg2 + this.anInt2732;
		this.anInt2726 = this.anInt2722 + arg7;
		this.anInt2730 = this.anInt2732 + arg0;
		this.anInt2727 = arg9 + this.anInt2722;
		this.anInt2733 = arg1 + this.anInt2724;
		this.anInt2725 = arg3 + this.anInt2724;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIII)Z")
	public boolean method2181(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 < this.anInt2733 || this.anInt2725 < arg1) {
			return false;
		} else if (arg2 < this.anInt2730 || this.anInt2734 < arg2) {
			return false;
		} else if (this.anInt2726 <= arg0 && this.anInt2727 >= arg0) {
			@Pc(58) int local58 = arg1 - this.anInt2724;
			@Pc(64) int local64 = arg0 - this.anInt2722;
			return local58 * local58 + local64 * local64 < this.anInt2721;
		} else {
			return false;
		}
	}
}
