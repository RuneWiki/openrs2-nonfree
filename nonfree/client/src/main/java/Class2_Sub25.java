import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public final class Class2_Sub25 extends Class2 {

	@OriginalMember(owner = "client!te", name = "S", descriptor = "I")
	public int anInt5019;

	@OriginalMember(owner = "client!te", name = "u", descriptor = "I")
	public int anInt5000;

	@OriginalMember(owner = "client!te", name = "H", descriptor = "I")
	private int anInt5010;

	@OriginalMember(owner = "client!te", name = "v", descriptor = "I")
	private int anInt5001;

	@OriginalMember(owner = "client!te", name = "B", descriptor = "I")
	public int anInt5005;

	@OriginalMember(owner = "client!te", name = "D", descriptor = "I")
	private int anInt5007;

	@OriginalMember(owner = "client!te", name = "L", descriptor = "I")
	private int anInt5013;

	@OriginalMember(owner = "client!te", name = "C", descriptor = "I")
	private int anInt5006;

	@OriginalMember(owner = "client!te", name = "R", descriptor = "I")
	public int anInt5018;

	@OriginalMember(owner = "client!te", name = "J", descriptor = "I")
	private int anInt5011;

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class2_Sub25(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInt5019 = arg6;
		this.anInt5000 = arg8;
		this.anInt5010 = arg2;
		this.anInt5001 = arg5;
		this.anInt5005 = arg9;
		this.anInt5007 = arg1;
		this.anInt5013 = arg3;
		this.anInt5006 = arg4;
		this.anInt5018 = arg7;
		this.anInt5011 = arg0;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIBI)Z")
	public boolean method4013(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return this.anInt5011 == arg0 && arg1 >= this.anInt5010 && arg1 <= this.anInt5006 && this.anInt5013 <= arg2 && arg2 <= this.anInt5001;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IZI)[I")
	public int[] method4014(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return new int[] { this.anInt5007, arg1 + this.anInt5019 - this.anInt5010, arg0 - (this.anInt5013 + -this.anInt5018) };
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIB)Z")
	public boolean method4016(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 >= this.anInt5019 && arg1 <= this.anInt5000 && this.anInt5018 <= arg0 && this.anInt5005 >= arg0;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(BII)[I")
	public int[] method4017(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return new int[] { this.anInt5011, arg1 + this.anInt5010 - this.anInt5019, this.anInt5013 + -this.anInt5018 + arg0 };
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IBI)Z")
	public boolean method4019(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg1 >= this.anInt5010 && arg1 <= this.anInt5006 && arg0 >= this.anInt5013 && this.anInt5001 >= arg0;
	}
}
