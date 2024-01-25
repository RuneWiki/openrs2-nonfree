import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public final class Class2_Sub28 extends Class2 {

	@OriginalMember(owner = "client!mc", name = "D", descriptor = "I")
	public final int anInt3839;

	@OriginalMember(owner = "client!mc", name = "q", descriptor = "I")
	public final int anInt3827;

	@OriginalMember(owner = "client!mc", name = "E", descriptor = "I")
	private final int anInt3840;

	@OriginalMember(owner = "client!mc", name = "F", descriptor = "I")
	private final int anInt3841;

	@OriginalMember(owner = "client!mc", name = "M", descriptor = "I")
	private final int anInt3847;

	@OriginalMember(owner = "client!mc", name = "v", descriptor = "I")
	private final int anInt3832;

	@OriginalMember(owner = "client!mc", name = "K", descriptor = "I")
	private final int anInt3845;

	@OriginalMember(owner = "client!mc", name = "u", descriptor = "I")
	public final int anInt3831;

	@OriginalMember(owner = "client!mc", name = "C", descriptor = "I")
	public final int anInt3838;

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class2_Sub28(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt3839 = arg5;
		this.anInt3827 = arg6;
		this.anInt3840 = arg3;
		this.anInt3841 = arg2;
		this.anInt3847 = arg4;
		this.anInt3832 = arg0;
		this.anInt3845 = arg1;
		this.anInt3831 = arg8;
		this.anInt3838 = arg7;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(III)Z")
	public boolean method3525(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.anInt3845 <= arg0 && arg0 <= this.anInt3840 && arg1 >= this.anInt3841 && this.anInt3847 >= arg1;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "([IIII)V")
	public void method3526(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		arg0[2] = this.anInt3827 + arg2 - this.anInt3841;
		arg0[0] = 0;
		arg0[1] = arg1 + this.anInt3839 - this.anInt3845;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(BII)Z")
	public boolean method3530(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 >= this.anInt3839 && this.anInt3838 >= arg1 && arg0 >= this.anInt3827 && this.anInt3831 >= arg0;
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "([IIII)V")
	public void method3532(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		arg0[1] = this.anInt3845 + arg1 - this.anInt3839;
		arg0[2] = arg2 + this.anInt3841 - this.anInt3827;
		arg0[0] = this.anInt3832;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(BIII)Z")
	public boolean method3535(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return this.anInt3832 == arg0 && arg1 >= this.anInt3845 && arg1 <= this.anInt3840 && this.anInt3841 <= arg2 && arg2 <= this.anInt3847;
	}
}
