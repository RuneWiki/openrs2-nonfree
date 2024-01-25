import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public final class Class3_Sub20 extends Class3 {

	@OriginalMember(owner = "client!gv", name = "r", descriptor = "I")
	public final int anInt3878;

	@OriginalMember(owner = "client!gv", name = "q", descriptor = "I")
	public final int anInt3877;

	@OriginalMember(owner = "client!gv", name = "v", descriptor = "I")
	private final int anInt3882;

	@OriginalMember(owner = "client!gv", name = "m", descriptor = "I")
	public final int anInt3873;

	@OriginalMember(owner = "client!gv", name = "p", descriptor = "I")
	private final int anInt3876;

	@OriginalMember(owner = "client!gv", name = "y", descriptor = "I")
	private final int anInt3885;

	@OriginalMember(owner = "client!gv", name = "n", descriptor = "I")
	private final int anInt3874;

	@OriginalMember(owner = "client!gv", name = "s", descriptor = "I")
	private final int anInt3879;

	@OriginalMember(owner = "client!gv", name = "j", descriptor = "I")
	public final int anInt3870;

	@OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class3_Sub20(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt3878 = arg8;
		this.anInt3877 = arg6;
		this.anInt3882 = arg1;
		this.anInt3873 = arg7;
		this.anInt3876 = arg4;
		this.anInt3885 = arg2;
		this.anInt3874 = arg0;
		this.anInt3879 = arg3;
		this.anInt3870 = arg5;
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(ZI[II)V")
	public void method3222(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		arg1[0] = this.anInt3874;
		arg1[1] = this.anInt3882 + arg0 - this.anInt3870;
		arg1[2] = arg2 + this.anInt3885 - this.anInt3877;
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(IZII)Z")
	public boolean method3223(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return this.anInt3874 == arg0 && arg1 >= this.anInt3882 && arg1 <= this.anInt3879 && this.anInt3885 <= arg2 && this.anInt3876 >= arg2;
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(III)Z")
	public boolean method3224(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg1 >= this.anInt3882 && this.anInt3879 >= arg1 && this.anInt3885 <= arg0 && this.anInt3876 >= arg0;
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(I[III)V")
	public void method3226(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		arg1[2] = arg0 + this.anInt3877 - this.anInt3885;
		arg1[1] = this.anInt3870 + arg2 - this.anInt3882;
		arg1[0] = 0;
	}

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "(III)Z")
	public boolean method3227(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anInt3870 <= arg1 && arg1 <= this.anInt3873 && arg0 >= this.anInt3877 && arg0 <= this.anInt3878;
	}
}
