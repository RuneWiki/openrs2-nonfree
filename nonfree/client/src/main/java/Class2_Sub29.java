import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public final class Class2_Sub29 extends Class2 {

	@OriginalMember(owner = "client!gv", name = "z", descriptor = "I")
	public final int anInt4300;

	@OriginalMember(owner = "client!gv", name = "s", descriptor = "I")
	public final int anInt4293;

	@OriginalMember(owner = "client!gv", name = "x", descriptor = "I")
	public final int anInt4298;

	@OriginalMember(owner = "client!gv", name = "B", descriptor = "I")
	private final int anInt4302;

	@OriginalMember(owner = "client!gv", name = "A", descriptor = "I")
	private final int anInt4301;

	@OriginalMember(owner = "client!gv", name = "p", descriptor = "I")
	private final int anInt4291;

	@OriginalMember(owner = "client!gv", name = "n", descriptor = "I")
	private final int anInt4289;

	@OriginalMember(owner = "client!gv", name = "y", descriptor = "I")
	private final int anInt4299;

	@OriginalMember(owner = "client!gv", name = "C", descriptor = "I")
	public final int anInt4303;

	@OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class2_Sub29(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt4300 = arg7;
		this.anInt4293 = arg8;
		this.anInt4298 = arg5;
		this.anInt4302 = arg4;
		this.anInt4301 = arg0;
		this.anInt4291 = arg1;
		this.anInt4289 = arg2;
		this.anInt4299 = arg3;
		this.anInt4303 = arg6;
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(IIII)Z")
	public boolean method3916(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return this.anInt4301 == arg2 && this.anInt4291 <= arg1 && this.anInt4299 >= arg1 && this.anInt4289 <= arg0 && arg0 <= this.anInt4302;
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(IIZ)Z")
	public boolean method3918(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 >= this.anInt4291 && arg0 <= this.anInt4299 && arg1 >= this.anInt4289 && arg1 <= this.anInt4302;
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(IIB)Z")
	public boolean method3919(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 >= this.anInt4298 && arg0 <= this.anInt4300 && arg1 >= this.anInt4303 && this.anInt4293 >= arg1;
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(II[II)V")
	public void method3921(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		arg1[2] = arg0 + this.anInt4289 - this.anInt4303;
		arg1[1] = this.anInt4291 + arg2 - this.anInt4298;
		arg1[0] = this.anInt4301;
	}

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "(II[II)V")
	public void method3922(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		arg1[0] = 0;
		arg1[1] = this.anInt4298 + arg2 - this.anInt4291;
		arg1[2] = this.anInt4303 + arg0 - this.anInt4289;
	}
}
