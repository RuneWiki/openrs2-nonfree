import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public abstract class Class12 {

	@OriginalMember(owner = "client!s", name = "l", descriptor = "I")
	public final int anInt9314;

	@OriginalMember(owner = "client!s", name = "k", descriptor = "I")
	public final int anInt9313;

	@OriginalMember(owner = "client!s", name = "c", descriptor = "I")
	public final int anInt9306;

	@OriginalMember(owner = "client!s", name = "j", descriptor = "I")
	public final int anInt9312;

	@OriginalMember(owner = "client!s", name = "h", descriptor = "[[I")
	public final int[][] anIntArrayArray53;

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "(III[[I)V")
	protected Class12(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][] arg3) {
		this.anInt9314 = arg0;
		this.anInt9313 = arg1;
		@Pc(11) int local11 = 0;
		while (arg2 > 1) {
			arg2 >>= 0x1;
			local11++;
		}
		this.anInt9306 = 0x1 << local11;
		this.anInt9312 = local11;
		this.anIntArrayArray53 = arg3;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIB)I")
	public final int method7846(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray53[arg0][arg1];
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(II)V")
	public abstract void method7847(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!s", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	public abstract void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIII[[Z)V")
	public abstract void method7848(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	public abstract void method7850(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15);

	@OriginalMember(owner = "client!s", name = "YA", descriptor = "()V")
	public abstract void YA();

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!r;IIIIZ)Z")
	public abstract boolean method7852(@OriginalArg(0) Class6_Sub4_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(IIB)I")
	public final int method7854(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg1 >> this.anInt9312;
		@Pc(13) int local13 = arg0 >> this.anInt9312;
		if (local8 < 0 || local13 < 0 || this.anInt9314 - 1 < local8 || local13 > this.anInt9313 - 1) {
			return 0;
		}
		@Pc(50) int local50 = arg1 & this.anInt9306 - 1;
		@Pc(57) int local57 = this.anInt9306 - 1 & arg0;
		@Pc(85) int local85 = this.anIntArrayArray53[local8][local13] * (this.anInt9306 - local50) + local50 * this.anIntArrayArray53[local8 + 1][local13] >> this.anInt9312;
		@Pc(116) int local116 = (this.anInt9306 - local50) * this.anIntArrayArray53[local8][local13 + 1] + this.anIntArrayArray53[local8 + 1][local13 + 1] * local50 >> this.anInt9312;
		return (this.anInt9306 - local57) * local85 + local57 * local116 >> this.anInt9312;
	}

	@OriginalMember(owner = "client!s", name = "fa", descriptor = "(IILclient!r;)Lclient!r;")
	public abstract Class6_Sub4_Sub5 fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6_Sub4_Sub5 arg2);

	@OriginalMember(owner = "client!s", name = "wa", descriptor = "(Lclient!r;IIIIZ)V")
	public abstract void wa(@OriginalArg(0) Class6_Sub4_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!s", name = "ka", descriptor = "(III)V")
	public abstract void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!s", name = "CA", descriptor = "(Lclient!r;IIIIZ)V")
	public abstract void CA(@OriginalArg(0) Class6_Sub4_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!sca;[I)V")
	public abstract void method7856(@OriginalArg(0) Class6_Sub17 arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(III[[ZZI)V")
	public abstract void method7858(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(III[[ZZII)V")
	public abstract void method7859(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);
}
