import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public final class Class2_Sub33 extends Class2 {

	@OriginalMember(owner = "client!nb", name = "t", descriptor = "I")
	public final int anInt6347;

	@OriginalMember(owner = "client!nb", name = "q", descriptor = "I")
	private final int anInt6344;

	@OriginalMember(owner = "client!nb", name = "y", descriptor = "I")
	private final int anInt6352;

	@OriginalMember(owner = "client!nb", name = "m", descriptor = "I")
	public final int anInt6340;

	@OriginalMember(owner = "client!nb", name = "s", descriptor = "I")
	private final int anInt6346;

	@OriginalMember(owner = "client!nb", name = "v", descriptor = "I")
	private final int anInt6349;

	@OriginalMember(owner = "client!nb", name = "o", descriptor = "I")
	public final int anInt6342;

	@OriginalMember(owner = "client!nb", name = "l", descriptor = "I")
	public final int anInt6339;

	@OriginalMember(owner = "client!nb", name = "r", descriptor = "I")
	private final int anInt6345;

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class2_Sub33(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt6347 = arg7;
		this.anInt6344 = arg2;
		this.anInt6352 = arg3;
		this.anInt6340 = arg6;
		this.anInt6346 = arg4;
		this.anInt6349 = arg0;
		this.anInt6342 = arg8;
		this.anInt6339 = arg5;
		this.anInt6345 = arg1;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIZ)Z")
	public boolean method5257(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 >= this.anInt6345 && this.anInt6352 >= arg0 && arg1 >= this.anInt6344 && this.anInt6346 >= arg1;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(II[IB)V")
	public void method5258(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		arg2[1] = this.anInt6345 + arg1 - this.anInt6339;
		arg2[2] = arg0 + this.anInt6344 - this.anInt6340;
		arg2[0] = this.anInt6349;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "([IIII)V")
	public void method5260(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0[2] = arg1 + this.anInt6340 - this.anInt6344;
		arg0[1] = arg2 + this.anInt6339 - this.anInt6345;
		arg0[0] = 0;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIII)Z")
	public boolean method5261(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return arg2 == this.anInt6349 && this.anInt6345 <= arg0 && this.anInt6352 >= arg0 && arg1 >= this.anInt6344 && this.anInt6346 >= arg1;
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(III)Z")
	public boolean method5262(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg1 >= this.anInt6339 && arg1 <= this.anInt6347 && arg0 >= this.anInt6340 && arg0 <= this.anInt6342;
	}
}
