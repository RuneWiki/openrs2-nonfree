import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Class316 {

	@OriginalMember(owner = "client!tb", name = "g", descriptor = "I")
	private int anInt8927;

	@OriginalMember(owner = "client!tb", name = "h", descriptor = "I")
	private int anInt8928;

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "I")
	private int anInt8923;

	@OriginalMember(owner = "client!tb", name = "o", descriptor = "I")
	private int anInt8933;

	@OriginalMember(owner = "client!tb", name = "p", descriptor = "I")
	private int anInt8934;

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "I")
	private int anInt8922;

	@OriginalMember(owner = "client!tb", name = "l", descriptor = "I")
	private int anInt8931;

	@OriginalMember(owner = "client!tb", name = "f", descriptor = "I")
	private int anInt8926;

	@OriginalMember(owner = "client!tb", name = "e", descriptor = "I")
	private int anInt8925;

	@OriginalMember(owner = "client!tb", name = "j", descriptor = "I")
	private int anInt8929;

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class316(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInt8927 = arg2;
		this.anInt8928 = arg0;
		this.anInt8923 = arg1;
		this.anInt8933 = arg3 * arg3;
		this.anInt8934 = this.anInt8928 + arg5;
		this.anInt8922 = arg4 + this.anInt8928;
		this.anInt8931 = arg8 + this.anInt8927;
		this.anInt8926 = arg6 + this.anInt8923;
		this.anInt8925 = arg7 + this.anInt8923;
		this.anInt8929 = arg9 + this.anInt8927;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IBII)Z")
	public boolean method7473(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 < this.anInt8922 || this.anInt8934 < arg0) {
			return false;
		} else if (arg1 < this.anInt8926 || arg1 > this.anInt8925) {
			return false;
		} else if (this.anInt8931 <= arg2 && this.anInt8929 >= arg2) {
			@Pc(60) int local60 = arg0 - this.anInt8928;
			@Pc(65) int local65 = arg2 - this.anInt8927;
			return this.anInt8933 > local60 * local60 + local65 * local65;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIIIIIIIII)V")
	public void method7474(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInt8928 = arg4;
		this.anInt8927 = arg5;
		this.anInt8923 = arg0;
		this.anInt8933 = arg6 * arg6;
		this.anInt8934 = this.anInt8928 + arg3;
		this.anInt8925 = this.anInt8923 + arg8;
		this.anInt8929 = this.anInt8927 + arg1;
		this.anInt8926 = arg2 + this.anInt8923;
		this.anInt8922 = arg9 + this.anInt8928;
		this.anInt8931 = arg7 + this.anInt8927;
	}
}
