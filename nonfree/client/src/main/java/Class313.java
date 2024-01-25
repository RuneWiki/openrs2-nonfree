import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public abstract class Class313 {

	@OriginalMember(owner = "client!s", name = "i", descriptor = "I")
	public final int anInt10872;

	@OriginalMember(owner = "client!s", name = "f", descriptor = "I")
	public final int anInt10875;

	@OriginalMember(owner = "client!s", name = "j", descriptor = "I")
	public final int anInt10871;

	@OriginalMember(owner = "client!s", name = "l", descriptor = "[[I")
	public final int[][] anIntArrayArray60;

	@OriginalMember(owner = "client!s", name = "d", descriptor = "I")
	public final int anInt10873;

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "(III[[I)V")
	protected Class313(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][] arg3) {
		this.anInt10872 = arg1;
		this.anInt10875 = arg0;
		@Pc(11) int local11 = 0;
		while (arg2 > 1) {
			local11++;
			arg2 >>= 0x1;
		}
		this.anInt10871 = 0x1 << local11;
		this.anIntArrayArray60 = arg3;
		this.anInt10873 = local11;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(III[[ZZI)V")
	public abstract void method9087(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	public abstract void method9088(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15);

	@OriginalMember(owner = "client!s", name = "wa", descriptor = "(Lclient!r;IIIIZ)V")
	public abstract void wa(@OriginalArg(0) Class3_Sub4_Sub13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIII[[Z)V")
	public abstract void method9089(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(II)V")
	public abstract void method9090(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!s", name = "ka", descriptor = "(III)V")
	public abstract void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(III[[ZZII)V")
	public abstract void method9092(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!s", name = "fa", descriptor = "(IILclient!r;)Lclient!r;")
	public abstract Class3_Sub4_Sub13 fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub4_Sub13 arg2);

	@OriginalMember(owner = "client!s", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	public abstract void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13);

	@OriginalMember(owner = "client!s", name = "CA", descriptor = "(Lclient!r;IIIIZ)V")
	public abstract void CA(@OriginalArg(0) Class3_Sub4_Sub13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!r;IIIIZ)Z")
	public abstract boolean method9094(@OriginalArg(0) Class3_Sub4_Sub13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(III)I")
	public final int method9095(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.anIntArrayArray60[arg1][arg0];
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIB)I")
	public final int method9096(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 >> this.anInt10873;
		@Pc(13) int local13 = arg1 >> this.anInt10873;
		if (local8 < 0 || local13 < 0 || this.anInt10875 - 1 < local8 || local13 > this.anInt10872 - 1) {
			return 0;
		}
		@Pc(57) int local57 = this.anInt10871 - 1 & arg0;
		@Pc(64) int local64 = this.anInt10871 - 1 & arg1;
		@Pc(91) int local91 = local57 * this.anIntArrayArray60[local8 + 1][local13] + this.anIntArrayArray60[local8][local13] * (this.anInt10871 - local57) >> this.anInt10873;
		@Pc(123) int local123 = (this.anInt10871 - local57) * this.anIntArrayArray60[local8][local13 - -1] + local57 * this.anIntArrayArray60[local8 + 1][local13 + 1] >> this.anInt10873;
		return local123 * local64 + (this.anInt10871 - local64) * local91 >> this.anInt10873;
	}

	@OriginalMember(owner = "client!s", name = "YA", descriptor = "()V")
	public abstract void YA();

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!vj;[I)V")
	public abstract void method9097(@OriginalArg(0) Class3_Sub16 arg0, @OriginalArg(1) int[] arg1);
}
