import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public final class Class5_Sub30 extends Class5 {

	@OriginalMember(owner = "client!lk", name = "y", descriptor = "I")
	public final int anInt5817;

	@OriginalMember(owner = "client!lk", name = "z", descriptor = "I")
	private final int anInt5818;

	@OriginalMember(owner = "client!lk", name = "q", descriptor = "I")
	private final int anInt5809;

	@OriginalMember(owner = "client!lk", name = "l", descriptor = "I")
	private final int anInt5804;

	@OriginalMember(owner = "client!lk", name = "v", descriptor = "I")
	public final int anInt5814;

	@OriginalMember(owner = "client!lk", name = "w", descriptor = "I")
	private final int anInt5815;

	@OriginalMember(owner = "client!lk", name = "x", descriptor = "I")
	private final int anInt5816;

	@OriginalMember(owner = "client!lk", name = "r", descriptor = "I")
	public final int anInt5810;

	@OriginalMember(owner = "client!lk", name = "k", descriptor = "I")
	public final int anInt5803;

	@OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class5_Sub30(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt5817 = arg6;
		this.anInt5818 = arg0;
		this.anInt5809 = arg4;
		this.anInt5804 = arg3;
		this.anInt5814 = arg5;
		this.anInt5815 = arg2;
		this.anInt5816 = arg1;
		this.anInt5810 = arg7;
		this.anInt5803 = arg8;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIII)Z")
	public boolean method4814(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return arg0 == this.anInt5818 && arg2 >= this.anInt5816 && this.anInt5804 >= arg2 && this.anInt5815 <= arg1 && arg1 <= this.anInt5809;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(I[III)V")
	public void method4815(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		arg1[0] = 0;
		arg1[1] = arg0 + this.anInt5814 - this.anInt5816;
		arg1[2] = arg2 + this.anInt5817 - this.anInt5815;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "([IIZI)V")
	public void method4816(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		arg0[0] = this.anInt5818;
		arg0[2] = arg2 + this.anInt5815 - this.anInt5817;
		arg0[1] = arg1 + this.anInt5816 - this.anInt5814;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIB)Z")
	public boolean method4817(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 >= this.anInt5814 && this.anInt5810 >= arg0 && arg1 >= this.anInt5817 && this.anInt5803 >= arg1;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IBI)Z")
	public boolean method4819(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.anInt5816 <= arg1 && arg1 <= this.anInt5804 && arg0 >= this.anInt5815 && arg0 <= this.anInt5809;
	}
}
