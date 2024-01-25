import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!li")
public final class Class4_Sub27 extends Class4 {

	@OriginalMember(owner = "client!li", name = "v", descriptor = "[I")
	public static final int[] anIntArray296 = new int[16384];

	@OriginalMember(owner = "client!li", name = "y", descriptor = "[I")
	public static final int[] anIntArray297 = new int[16384];

	@OriginalMember(owner = "client!li", name = "o", descriptor = "I")
	private final int anInt6054;

	@OriginalMember(owner = "client!li", name = "t", descriptor = "I")
	public final int anInt6059;

	@OriginalMember(owner = "client!li", name = "q", descriptor = "I")
	private final int anInt6056;

	@OriginalMember(owner = "client!li", name = "k", descriptor = "I")
	public final int anInt6050;

	@OriginalMember(owner = "client!li", name = "p", descriptor = "I")
	public final int anInt6055;

	@OriginalMember(owner = "client!li", name = "m", descriptor = "I")
	private final int anInt6052;

	@OriginalMember(owner = "client!li", name = "u", descriptor = "I")
	public final int anInt6060;

	@OriginalMember(owner = "client!li", name = "x", descriptor = "I")
	private final int anInt6062;

	@OriginalMember(owner = "client!li", name = "w", descriptor = "I")
	private final int anInt6061;

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			anIntArray296[local9] = (int) (Math.sin((double) local9 * local7) * 16384.0D);
			anIntArray297[local9] = (int) (Math.cos((double) local9 * local7) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class4_Sub27(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt6054 = arg3;
		this.anInt6059 = arg7;
		this.anInt6056 = arg0;
		this.anInt6050 = arg6;
		this.anInt6055 = arg5;
		this.anInt6052 = arg2;
		this.anInt6060 = arg8;
		this.anInt6062 = arg4;
		this.anInt6061 = arg1;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IZII)Z")
	public boolean method5156(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return arg0 == this.anInt6056 && arg2 >= this.anInt6061 && arg2 <= this.anInt6054 && arg1 >= this.anInt6052 && arg1 <= this.anInt6062;
	}

	@OriginalMember(owner = "client!li", name = "b", descriptor = "(III)Z")
	public boolean method5157(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.anInt6061 <= arg1 && this.anInt6054 >= arg1 && arg0 >= this.anInt6052 && this.anInt6062 >= arg0;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(II[IB)V")
	public void method5158(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		arg2[0] = this.anInt6056;
		arg2[1] = arg1 + this.anInt6061 - this.anInt6055;
		arg2[2] = this.anInt6052 + arg0 - this.anInt6050;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(I[III)V")
	public void method5159(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		arg1[1] = arg0 + this.anInt6055 - this.anInt6061;
		arg1[2] = arg2 + this.anInt6050 - this.anInt6052;
		arg1[0] = 0;
	}

	@OriginalMember(owner = "client!li", name = "c", descriptor = "(III)Z")
	public boolean method5160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 >= this.anInt6055 && this.anInt6059 >= arg0 && this.anInt6050 <= arg1 && this.anInt6060 >= arg1;
	}
}
