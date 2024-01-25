import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public abstract class Class34 {

	@OriginalMember(owner = "client!i", name = "e", descriptor = "I")
	public final int anInt7852;

	@OriginalMember(owner = "client!i", name = "g", descriptor = "I")
	public final int anInt7854;

	@OriginalMember(owner = "client!i", name = "c", descriptor = "I")
	public final int anInt7850;

	@OriginalMember(owner = "client!i", name = "i", descriptor = "I")
	public final int anInt7856;

	@OriginalMember(owner = "client!i", name = "b", descriptor = "[[I")
	public final int[][] anIntArrayArray172;

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(III[[I)V")
	protected Class34(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][] arg3) {
		this.anInt7852 = arg1;
		this.anInt7854 = arg0;
		@Pc(11) int local11 = 0;
		while (arg2 > 1) {
			arg2 >>= 0x1;
			local11++;
		}
		this.anInt7850 = 0x1 << local11;
		this.anInt7856 = local11;
		this.anIntArrayArray172 = arg3;
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(III)I")
	public final int method6525(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.anIntArrayArray172[arg1][arg0];
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(III[[ZZ)V")
	public abstract void method6526(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(II)V")
	public abstract void method6527(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!i", name = "O", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	public abstract void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13);

	@OriginalMember(owner = "client!i", name = "BA", descriptor = "()V")
	public abstract void BA();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(III[[ZZI)V")
	public abstract void method6529(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!i", name = "c", descriptor = "(III)I")
	public final int method6530(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0 >> this.anInt7856;
		@Pc(13) int local13 = arg1 >> this.anInt7856;
		if (local8 < 0 || local13 < 0 || this.anInt7854 - 1 < local8 || local13 > this.anInt7852 - 1) {
			return 0;
		}
		@Pc(42) int local42 = this.anInt7850 - 1 & arg0;
		@Pc(49) int local49 = this.anInt7850 - 1 & arg1;
		@Pc(83) int local83 = (this.anInt7850 - local42) * this.anIntArrayArray172[local8][local13] + this.anIntArrayArray172[local8 + 1][local13] * local42 >> this.anInt7856;
		@Pc(113) int local113 = this.anIntArrayArray172[local8][local13 + 1] * (this.anInt7850 - local42) + local42 * this.anIntArrayArray172[local8 + 1][local13 + 1] >> this.anInt7856;
		return local83 * (this.anInt7850 - local49) + local113 * local49 >> this.anInt7856;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(III)V")
	public abstract void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	public abstract void method6531(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIIIII[[Z)V")
	public abstract void method6532(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4);

	@OriginalMember(owner = "client!i", name = "v", descriptor = "(IILclient!ha;)Lclient!ha;")
	public abstract Class3_Sub7_Sub13 v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub7_Sub13 arg2);

	@OriginalMember(owner = "client!i", name = "DA", descriptor = "(Lclient!ha;IIIIZ)V")
	public abstract void DA(@OriginalArg(0) Class3_Sub7_Sub13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!ha;IIIIZ)Z")
	public abstract boolean method6534(@OriginalArg(0) Class3_Sub7_Sub13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!eq;[I)V")
	public abstract void method6535(@OriginalArg(0) Class3_Sub10 arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!i", name = "E", descriptor = "(Lclient!ha;IIIIZ)V")
	public abstract void E(@OriginalArg(0) Class3_Sub7_Sub13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);
}
