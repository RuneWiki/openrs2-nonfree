import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public abstract class Class91 {

	@OriginalMember(owner = "client!s", name = "h", descriptor = "I")
	public final int anInt8645;

	@OriginalMember(owner = "client!s", name = "n", descriptor = "I")
	public final int anInt8650;

	@OriginalMember(owner = "client!s", name = "j", descriptor = "I")
	public final int anInt8647;

	@OriginalMember(owner = "client!s", name = "l", descriptor = "[[I")
	public final int[][] anIntArrayArray104;

	@OriginalMember(owner = "client!s", name = "c", descriptor = "I")
	public final int anInt8641;

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "(III[[I)V")
	protected Class91(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][] arg3) {
		this.anInt8645 = arg1;
		this.anInt8650 = arg0;
		@Pc(11) int local11 = 0;
		while (arg2 > 1) {
			arg2 >>= 0x1;
			local11++;
		}
		this.anInt8647 = 0x1 << local11;
		this.anIntArrayArray104 = arg3;
		this.anInt8641 = local11;
	}

	@OriginalMember(owner = "client!s", name = "ka", descriptor = "(III)V")
	public abstract void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	public abstract void method7444(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15);

	@OriginalMember(owner = "client!s", name = "fa", descriptor = "(IILclient!r;)Lclient!r;")
	public abstract Class2_Sub7_Sub17 fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub7_Sub17 arg2);

	@OriginalMember(owner = "client!s", name = "YA", descriptor = "()V")
	public abstract void YA();

	@OriginalMember(owner = "client!s", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	public abstract void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!r;IIIIZ)Z")
	public abstract boolean method7445(@OriginalArg(0) Class2_Sub7_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IZI)I")
	public final int method7446(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0 >> this.anInt8641;
		@Pc(13) int local13 = arg1 >> this.anInt8641;
		if (local8 < 0 || local13 < 0 || local8 > this.anInt8650 - 1 || local13 > this.anInt8645 - 1) {
			return 0;
		}
		@Pc(54) int local54 = arg0 & this.anInt8647 - 1;
		@Pc(61) int local61 = this.anInt8647 - 1 & arg1;
		@Pc(88) int local88 = local54 * this.anIntArrayArray104[local8 + 1][local13] + (this.anInt8647 - local54) * this.anIntArrayArray104[local8][local13] >> this.anInt8641;
		@Pc(119) int local119 = (this.anInt8647 - local54) * this.anIntArrayArray104[local8][local13 - -1] + local54 * this.anIntArrayArray104[local8 + 1][local13 + 1] >> this.anInt8641;
		return local119 * local61 + local88 * (this.anInt8647 - local61) >> this.anInt8641;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IBI)I")
	public final int method7447(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.anIntArrayArray104[arg1][arg0];
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(II)V")
	public abstract void method7448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(III[[ZZII)V")
	public abstract void method7450(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(III[[ZZI)V")
	public abstract void method7451(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!s", name = "CA", descriptor = "(Lclient!r;IIIIZ)V")
	public abstract void CA(@OriginalArg(0) Class2_Sub7_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!s", name = "wa", descriptor = "(Lclient!r;IIIIZ)V")
	public abstract void wa(@OriginalArg(0) Class2_Sub7_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!laa;[I)V")
	public abstract void method7455(@OriginalArg(0) Class2_Sub12 arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIII[[Z)V")
	public abstract void method7456(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4);
}
