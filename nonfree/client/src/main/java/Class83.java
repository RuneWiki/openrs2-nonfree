import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public abstract class Class83 {

	@OriginalMember(owner = "client!i", name = "i", descriptor = "I")
	public final int anInt8829;

	@OriginalMember(owner = "client!i", name = "m", descriptor = "I")
	public final int anInt8830;

	@OriginalMember(owner = "client!i", name = "b", descriptor = "I")
	public final int anInt8824;

	@OriginalMember(owner = "client!i", name = "g", descriptor = "[[I")
	public final int[][] anIntArrayArray54;

	@OriginalMember(owner = "client!i", name = "c", descriptor = "I")
	public final int anInt8825;

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(III[[I)V")
	protected Class83(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][] arg3) {
		this.anInt8829 = arg0;
		this.anInt8830 = arg1;
		@Pc(11) int local11 = 0;
		while (arg2 > 1) {
			local11++;
			arg2 >>= 0x1;
		}
		this.anInt8824 = 0x1 << local11;
		this.anIntArrayArray54 = arg3;
		this.anInt8825 = local11;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIIIII[[Z)V")
	public abstract void method7207(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4);

	@OriginalMember(owner = "client!i", name = "v", descriptor = "(IILclient!ha;)Lclient!ha;")
	public abstract Class4_Sub5_Sub6 v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub5_Sub6 arg2);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(II)V")
	public abstract void method7209(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	public abstract void method7210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!ul;[I)V")
	public abstract void method7211(@OriginalArg(0) Class4_Sub24 arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!ha;IIIIZ)Z")
	public abstract boolean method7212(@OriginalArg(0) Class4_Sub5_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(ZII)I")
	public final int method7213(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17 = arg0 >> this.anInt8825;
		@Pc(22) int local22 = arg1 >> this.anInt8825;
		if (local17 < 0 || local22 < 0 || this.anInt8829 - 1 < local17 || local22 > this.anInt8830 - 1) {
			return 0;
		}
		@Pc(55) int local55 = arg0 & this.anInt8824 - 1;
		@Pc(62) int local62 = this.anInt8824 - 1 & arg1;
		@Pc(89) int local89 = this.anIntArrayArray54[local17 + 1][local22] * local55 + (this.anInt8824 - local55) * this.anIntArrayArray54[local17][local22] >> this.anInt8825;
		@Pc(120) int local120 = local55 * this.anIntArrayArray54[local17 + 1][local22 + 1] + this.anIntArrayArray54[local17][local22 + 1] * (this.anInt8824 - local55) >> this.anInt8825;
		return local120 * local62 + (this.anInt8824 - local62) * local89 >> this.anInt8825;
	}

	@OriginalMember(owner = "client!i", name = "E", descriptor = "(Lclient!ha;IIIIZ)V")
	public abstract void E(@OriginalArg(0) Class4_Sub5_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!i", name = "DA", descriptor = "(Lclient!ha;IIIIZ)V")
	public abstract void DA(@OriginalArg(0) Class4_Sub5_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!i", name = "O", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	public abstract void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13);

	@OriginalMember(owner = "client!i", name = "BA", descriptor = "()V")
	public abstract void BA();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(III)V")
	public abstract void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(III[[ZZI)V")
	public abstract void method7215(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(III[[ZZ)V")
	public abstract void method7216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(III)I")
	public final int method7217(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.anIntArrayArray54[arg1][arg0];
	}
}
