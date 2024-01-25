import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public abstract class Class91 {

	@OriginalMember(owner = "client!s", name = "e", descriptor = "I")
	public final int anInt8985;

	@OriginalMember(owner = "client!s", name = "b", descriptor = "I")
	public final int anInt8983;

	@OriginalMember(owner = "client!s", name = "f", descriptor = "I")
	public final int anInt8986;

	@OriginalMember(owner = "client!s", name = "j", descriptor = "I")
	public final int anInt8988;

	@OriginalMember(owner = "client!s", name = "i", descriptor = "[[I")
	public final int[][] anIntArrayArray53;

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "(III[[I)V")
	protected Class91(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][] arg3) {
		this.anInt8985 = arg1;
		this.anInt8983 = arg0;
		@Pc(11) int local11 = 0;
		while (arg2 > 1) {
			local11++;
			arg2 >>= 0x1;
		}
		this.anInt8986 = 0x1 << local11;
		this.anInt8988 = local11;
		this.anIntArrayArray53 = arg3;
	}

	@OriginalMember(owner = "client!s", name = "ka", descriptor = "(III)V")
	public abstract void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(III[[ZZII)V")
	public abstract void method7714(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!r;IIIIZ)Z")
	public abstract boolean method7716(@OriginalArg(0) Class3_Sub7_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(II)V")
	public abstract void method7717(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!s", name = "fa", descriptor = "(IILclient!r;)Lclient!r;")
	public abstract Class3_Sub7_Sub17 fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub7_Sub17 arg2);

	@OriginalMember(owner = "client!s", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	public abstract void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	public abstract void method7718(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(III[[ZZI)V")
	public abstract void method7719(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!s", name = "CA", descriptor = "(Lclient!r;IIIIZ)V")
	public abstract void CA(@OriginalArg(0) Class3_Sub7_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIII[[Z)V")
	public abstract void method7721(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!tj;[I)V")
	public abstract void method7722(@OriginalArg(0) Class3_Sub22 arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!s", name = "YA", descriptor = "()V")
	public abstract void YA();

	@OriginalMember(owner = "client!s", name = "wa", descriptor = "(Lclient!r;IIIIZ)V")
	public abstract void wa(@OriginalArg(0) Class3_Sub7_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(III)I")
	public final int method7724(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray53[arg1][arg0];
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(III)I")
	public final int method7725(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0 >> this.anInt8988;
		@Pc(13) int local13 = arg1 >> this.anInt8988;
		if (local8 < 0 || local13 < 0 || local8 > this.anInt8983 - 1 || this.anInt8985 - 1 < local13) {
			return 0;
		}
		@Pc(42) int local42 = arg0 & this.anInt8986 - 1;
		@Pc(49) int local49 = this.anInt8986 - 1 & arg1;
		@Pc(77) int local77 = this.anIntArrayArray53[local8][local13] * (this.anInt8986 - local42) + local42 * this.anIntArrayArray53[local8 + 1][local13] >> this.anInt8988;
		@Pc(107) int local107 = local42 * this.anIntArrayArray53[local8 + 1][local13 + 1] + this.anIntArrayArray53[local8][local13 + 1] * (this.anInt8986 - local42) >> this.anInt8988;
		return (this.anInt8986 - local49) * local77 + local49 * local107 >> this.anInt8988;
	}
}
