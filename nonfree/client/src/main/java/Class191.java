import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lca")
public final class Class191 {

	@OriginalMember(owner = "client!lca", name = "p", descriptor = "I")
	private int anInt6017;

	@OriginalMember(owner = "client!lca", name = "m", descriptor = "I")
	private int anInt6014;

	@OriginalMember(owner = "client!lca", name = "f", descriptor = "I")
	private int anInt6007;

	@OriginalMember(owner = "client!lca", name = "i", descriptor = "I")
	private int anInt6010;

	@OriginalMember(owner = "client!lca", name = "l", descriptor = "I")
	private int anInt6013;

	@OriginalMember(owner = "client!lca", name = "o", descriptor = "I")
	private int anInt6016;

	@OriginalMember(owner = "client!lca", name = "c", descriptor = "I")
	private int anInt6004;

	@OriginalMember(owner = "client!lca", name = "g", descriptor = "I")
	private int anInt6008;

	@OriginalMember(owner = "client!lca", name = "n", descriptor = "I")
	private int anInt6015;

	@OriginalMember(owner = "client!lca", name = "k", descriptor = "I")
	private int anInt6012;

	@OriginalMember(owner = "client!lca", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class191(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInt6017 = arg3 * arg3;
		this.anInt6014 = arg1;
		this.anInt6007 = arg0;
		this.anInt6010 = arg2;
		this.anInt6013 = this.anInt6010 + arg9;
		this.anInt6016 = arg5 + this.anInt6007;
		this.anInt6004 = this.anInt6007 + arg4;
		this.anInt6008 = arg8 + this.anInt6010;
		this.anInt6015 = arg6 + this.anInt6014;
		this.anInt6012 = this.anInt6014 + arg7;
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(IZII)Z")
	public boolean method4923(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (this.anInt6004 > arg0 || arg0 > this.anInt6016) {
			return false;
		} else if (arg2 < this.anInt6015 || arg2 > this.anInt6012) {
			return false;
		} else if (arg1 >= this.anInt6008 && arg1 <= this.anInt6013) {
			@Pc(56) int local56 = arg0 - this.anInt6007;
			@Pc(62) int local62 = arg1 - this.anInt6010;
			return this.anInt6017 > local62 * local62 + local56 * local56;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(IIIIIIIIIII)V")
	public void method4924(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		this.anInt6017 = arg4 * arg4;
		this.anInt6010 = arg7;
		this.anInt6014 = arg0;
		this.anInt6007 = arg9;
		this.anInt6012 = arg1 + this.anInt6014;
		this.anInt6015 = this.anInt6014 + arg6;
		this.anInt6013 = this.anInt6010 + arg5;
		this.anInt6016 = arg8 + this.anInt6007;
		this.anInt6008 = this.anInt6010 + arg2;
		this.anInt6004 = this.anInt6007 + arg3;
	}
}
