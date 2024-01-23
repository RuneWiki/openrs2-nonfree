import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public final class Class1_Sub26 extends Class1 {

	@OriginalMember(owner = "client!qo", name = "P", descriptor = "I")
	private int anInt4710;

	@OriginalMember(owner = "client!qo", name = "y", descriptor = "I")
	private int anInt4695;

	@OriginalMember(owner = "client!qo", name = "x", descriptor = "I")
	public int anInt4694;

	@OriginalMember(owner = "client!qo", name = "J", descriptor = "I")
	private int anInt4704;

	@OriginalMember(owner = "client!qo", name = "z", descriptor = "I")
	private int anInt4696;

	@OriginalMember(owner = "client!qo", name = "n", descriptor = "I")
	public int anInt4686;

	@OriginalMember(owner = "client!qo", name = "N", descriptor = "I")
	public int anInt4708;

	@OriginalMember(owner = "client!qo", name = "B", descriptor = "I")
	private int anInt4698;

	@OriginalMember(owner = "client!qo", name = "E", descriptor = "I")
	private int anInt4700;

	@OriginalMember(owner = "client!qo", name = "L", descriptor = "I")
	public int anInt4706;

	@OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class1_Sub26(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInt4710 = arg5;
		this.anInt4695 = arg3;
		this.anInt4694 = arg6;
		this.anInt4704 = arg2;
		this.anInt4696 = arg4;
		this.anInt4686 = arg8;
		this.anInt4708 = arg7;
		this.anInt4698 = arg1;
		this.anInt4700 = arg0;
		this.anInt4706 = arg9;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IZII)Z")
	public boolean method3674(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return this.anInt4700 == arg2 && this.anInt4704 <= arg0 && this.anInt4696 >= arg0 && arg1 >= this.anInt4695 && this.anInt4710 >= arg1;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(III)Z")
	public boolean method3675(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.anInt4704 <= arg0 && arg0 <= this.anInt4696 && arg1 >= this.anInt4695 && this.anInt4710 >= arg1;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(I[III)V")
	public void method3677(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		arg1[2] = arg0 + this.anInt4695 - this.anInt4708;
		arg1[0] = this.anInt4700;
		arg1[1] = arg2 + this.anInt4704 - this.anInt4694;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IBI)Z")
	public boolean method3678(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 >= this.anInt4694 && this.anInt4686 >= arg0 && this.anInt4708 <= arg1 && this.anInt4706 >= arg1;
	}

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "(I[III)V")
	public void method3679(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		arg1[0] = this.anInt4698;
		arg1[1] = this.anInt4694 + arg0 - this.anInt4704;
		arg1[2] = arg2 + this.anInt4708 - this.anInt4695;
	}
}
