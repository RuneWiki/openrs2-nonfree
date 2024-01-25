import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nu")
public final class Class242 {

	@OriginalMember(owner = "client!nu", name = "l", descriptor = "I")
	private int anInt6011;

	@OriginalMember(owner = "client!nu", name = "b", descriptor = "I")
	private int anInt6002;

	@OriginalMember(owner = "client!nu", name = "e", descriptor = "I")
	private int anInt6005;

	@OriginalMember(owner = "client!nu", name = "f", descriptor = "I")
	private int anInt6006;

	@OriginalMember(owner = "client!nu", name = "j", descriptor = "I")
	private int anInt6009;

	@OriginalMember(owner = "client!nu", name = "q", descriptor = "I")
	private int anInt6016;

	@OriginalMember(owner = "client!nu", name = "h", descriptor = "I")
	private int anInt6007;

	@OriginalMember(owner = "client!nu", name = "o", descriptor = "I")
	private int anInt6014;

	@OriginalMember(owner = "client!nu", name = "n", descriptor = "I")
	private int anInt6013;

	@OriginalMember(owner = "client!nu", name = "d", descriptor = "I")
	private int anInt6004;

	@OriginalMember(owner = "client!nu", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class242(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInt6011 = arg2;
		this.anInt6002 = arg1;
		this.anInt6005 = arg0;
		this.anInt6006 = arg3 * arg3;
		this.anInt6009 = this.anInt6011 + arg9;
		this.anInt6016 = this.anInt6002 + arg6;
		this.anInt6007 = this.anInt6005 + arg5;
		this.anInt6014 = arg7 + this.anInt6002;
		this.anInt6013 = this.anInt6011 + arg8;
		this.anInt6004 = arg4 + this.anInt6005;
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(IIIIIIIIZII)V")
	public void method4916(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		this.anInt6002 = arg8;
		this.anInt6011 = arg4;
		this.anInt6005 = arg9;
		this.anInt6006 = arg0 * arg0;
		this.anInt6013 = arg5 + this.anInt6011;
		this.anInt6007 = this.anInt6005 + arg1;
		this.anInt6009 = arg2 + this.anInt6011;
		this.anInt6004 = this.anInt6005 + arg6;
		this.anInt6016 = this.anInt6002 + arg3;
		this.anInt6014 = arg7 + this.anInt6002;
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(BIII)Z")
	public boolean method4920(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 < this.anInt6004 || this.anInt6007 < arg0) {
			return false;
		} else if (this.anInt6016 > arg1 || this.anInt6014 < arg1) {
			return false;
		} else if (this.anInt6013 <= arg2 && this.anInt6009 >= arg2) {
			@Pc(47) int local47 = arg0 - this.anInt6005;
			@Pc(57) int local57 = arg2 - this.anInt6011;
			return local47 * local47 + local57 * local57 < this.anInt6006;
		} else {
			return false;
		}
	}
}
