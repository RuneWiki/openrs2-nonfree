import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public final class Class4_Sub27 extends Class4 {

	@OriginalMember(owner = "client!m", name = "A", descriptor = "I")
	private final int anInt4041;

	@OriginalMember(owner = "client!m", name = "t", descriptor = "I")
	public final int anInt4035;

	@OriginalMember(owner = "client!m", name = "u", descriptor = "I")
	private final int anInt4036;

	@OriginalMember(owner = "client!m", name = "D", descriptor = "I")
	private final int anInt4042;

	@OriginalMember(owner = "client!m", name = "n", descriptor = "I")
	public final int anInt4029;

	@OriginalMember(owner = "client!m", name = "o", descriptor = "I")
	private final int anInt4030;

	@OriginalMember(owner = "client!m", name = "v", descriptor = "I")
	private final int anInt4037;

	@OriginalMember(owner = "client!m", name = "m", descriptor = "I")
	public final int anInt4028;

	@OriginalMember(owner = "client!m", name = "E", descriptor = "I")
	public final int anInt4043;

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class4_Sub27(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt4041 = arg0;
		this.anInt4035 = arg7;
		this.anInt4036 = arg1;
		this.anInt4042 = arg3;
		this.anInt4029 = arg6;
		this.anInt4030 = arg2;
		this.anInt4037 = arg4;
		this.anInt4028 = arg5;
		this.anInt4043 = arg8;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IIII)Z")
	public boolean method3403(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return this.anInt4041 == arg0 && this.anInt4036 <= arg2 && this.anInt4042 >= arg2 && this.anInt4030 <= arg1 && arg1 <= this.anInt4037;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(III)Z")
	public boolean method3404(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.anInt4036 <= arg0 && this.anInt4042 >= arg0 && arg1 >= this.anInt4030 && this.anInt4037 >= arg1;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(BI[II)V")
	public void method3405(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		arg1[1] = arg2 + this.anInt4036 - this.anInt4028;
		arg1[0] = this.anInt4041;
		arg1[2] = arg0 + this.anInt4030 - this.anInt4029;
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(III)Z")
	public boolean method3406(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 >= this.anInt4028 && this.anInt4035 >= arg1 && this.anInt4029 <= arg0 && arg0 <= this.anInt4043;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(II[II)V")
	public void method3409(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		arg1[1] = this.anInt4028 + arg2 - this.anInt4036;
		arg1[2] = this.anInt4029 + arg0 - this.anInt4030;
		arg1[0] = 0;
	}
}
