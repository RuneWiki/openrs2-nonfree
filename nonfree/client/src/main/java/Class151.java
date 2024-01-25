import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public abstract class Class151 {

	@OriginalMember(owner = "client!i", name = "i", descriptor = "I")
	public final int anInt9574;

	@OriginalMember(owner = "client!i", name = "g", descriptor = "I")
	public final int anInt9572;

	@OriginalMember(owner = "client!i", name = "h", descriptor = "I")
	public final int anInt9573;

	@OriginalMember(owner = "client!i", name = "b", descriptor = "I")
	public final int anInt9568;

	@OriginalMember(owner = "client!i", name = "c", descriptor = "[[I")
	public final int[][] anIntArrayArray65;

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(III[[I)V")
	protected Class151(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][] arg3) {
		this.anInt9574 = arg1;
		this.anInt9572 = arg0;
		@Pc(11) int local11 = 0;
		while (arg2 > 1) {
			local11++;
			arg2 >>= 0x1;
		}
		this.anInt9573 = 0x1 << local11;
		this.anInt9568 = local11;
		this.anIntArrayArray65 = arg3;
	}

	@OriginalMember(owner = "client!i", name = "DA", descriptor = "(Lclient!ha;IIIIZ)V")
	public abstract void DA(@OriginalArg(0) Class2_Sub2_Sub8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!i", name = "BA", descriptor = "()V")
	public abstract void BA();

	@OriginalMember(owner = "client!i", name = "v", descriptor = "(IILclient!ha;)Lclient!ha;")
	public abstract Class2_Sub2_Sub8 v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub2_Sub8 arg2);

	@OriginalMember(owner = "client!i", name = "O", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	public abstract void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	public abstract void method7673(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!tg;[I)V")
	public abstract void method7674(@OriginalArg(0) Class2_Sub11 arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!ha;IIIIZ)Z")
	public abstract boolean method7675(@OriginalArg(0) Class2_Sub2_Sub8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!i", name = "E", descriptor = "(Lclient!ha;IIIIZ)V")
	public abstract void E(@OriginalArg(0) Class2_Sub2_Sub8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(III)I")
	public final int method7676(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray65[arg1][arg0];
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIIIII[[Z)V")
	public abstract void method7677(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(III[[ZZI)V")
	public abstract void method7678(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(III)V")
	public abstract void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!i", name = "c", descriptor = "(III)I")
	public final int method7680(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0 >> this.anInt9568;
		@Pc(13) int local13 = arg1 >> this.anInt9568;
		if (local8 < 0 || local13 < 0 || local8 > this.anInt9572 - 1 || local13 > this.anInt9574 - 1) {
			return 0;
		}
		@Pc(45) int local45 = arg0 & this.anInt9573 - 1;
		@Pc(52) int local52 = this.anInt9573 - 1 & arg1;
		@Pc(79) int local79 = (this.anInt9573 - local45) * this.anIntArrayArray65[local8][local13] + this.anIntArrayArray65[local8 + 1][local13] * local45 >> this.anInt9568;
		@Pc(110) int local110 = this.anIntArrayArray65[local8 + 1][local13 + 1] * local45 + (this.anInt9573 - local45) * this.anIntArrayArray65[local8][local13 + 1] >> this.anInt9568;
		return local110 * local52 + local79 * (this.anInt9573 - local52) >> this.anInt9568;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(III[[ZZ)V")
	public abstract void method7681(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(II)V")
	public abstract void method7682(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
