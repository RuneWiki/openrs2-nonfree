import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bfa")
public final class Class2_Sub6 extends Class2 {

	@OriginalMember(owner = "client!bfa", name = "m", descriptor = "I")
	public final int anInt818;

	@OriginalMember(owner = "client!bfa", name = "t", descriptor = "I")
	private final int anInt823;

	@OriginalMember(owner = "client!bfa", name = "l", descriptor = "I")
	public final int anInt817;

	@OriginalMember(owner = "client!bfa", name = "o", descriptor = "I")
	private final int anInt820;

	@OriginalMember(owner = "client!bfa", name = "y", descriptor = "I")
	public final int anInt827;

	@OriginalMember(owner = "client!bfa", name = "x", descriptor = "I")
	private final int anInt826;

	@OriginalMember(owner = "client!bfa", name = "n", descriptor = "I")
	private final int anInt819;

	@OriginalMember(owner = "client!bfa", name = "k", descriptor = "I")
	private final int anInt816;

	@OriginalMember(owner = "client!bfa", name = "u", descriptor = "I")
	public final int anInt824;

	@OriginalMember(owner = "client!bfa", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class2_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt818 = arg6;
		this.anInt823 = arg1;
		this.anInt817 = arg7;
		this.anInt820 = arg4;
		this.anInt827 = arg8;
		this.anInt826 = arg0;
		this.anInt819 = arg3;
		this.anInt816 = arg2;
		this.anInt824 = arg5;
	}

	@OriginalMember(owner = "client!bfa", name = "b", descriptor = "(III)Z")
	public boolean method895(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 >= this.anInt824 && arg1 <= this.anInt817 && this.anInt818 <= arg0 && arg0 <= this.anInt827;
	}

	@OriginalMember(owner = "client!bfa", name = "c", descriptor = "(III)Z")
	public boolean method896(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 >= this.anInt823 && this.anInt819 >= arg0 && this.anInt816 <= arg1 && arg1 <= this.anInt820;
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "([IBII)V")
	public void method897(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		arg0[2] = arg2 + this.anInt818 - this.anInt816;
		arg0[1] = arg1 + this.anInt824 - this.anInt823;
		arg0[0] = 0;
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(ZIII)Z")
	public boolean method898(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return arg2 == this.anInt826 && this.anInt823 <= arg0 && this.anInt819 >= arg0 && arg1 >= this.anInt816 && this.anInt820 >= arg1;
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(I[III)V")
	public void method899(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		arg1[0] = this.anInt826;
		arg1[1] = this.anInt823 + arg0 - this.anInt824;
		arg1[2] = this.anInt816 + arg2 - this.anInt818;
	}
}
