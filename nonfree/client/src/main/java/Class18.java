import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public abstract class Class18 {

	@OriginalMember(owner = "client!s", name = "h", descriptor = "I")
	public final int anInt9741;

	@OriginalMember(owner = "client!s", name = "i", descriptor = "I")
	public final int anInt9742;

	@OriginalMember(owner = "client!s", name = "e", descriptor = "I")
	public final int anInt9739;

	@OriginalMember(owner = "client!s", name = "g", descriptor = "I")
	public final int anInt9740;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "[[I")
	public final int[][] anIntArrayArray51;

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "(III[[I)V")
	protected Class18(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][] arg3) {
		this.anInt9741 = arg0;
		this.anInt9742 = arg1;
		@Pc(11) int local11 = 0;
		while (arg2 > 1) {
			arg2 >>= 0x1;
			local11++;
		}
		this.anInt9739 = 0x1 << local11;
		this.anInt9740 = local11;
		this.anIntArrayArray51 = arg3;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(II)V")
	public abstract void method8533(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!s", name = "YA", descriptor = "()V")
	public abstract void YA();

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIII[[Z)V")
	public abstract void method8534(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4);

	@OriginalMember(owner = "client!s", name = "CA", descriptor = "(Lclient!r;IIIIZ)V")
	public abstract void CA(@OriginalArg(0) Class2_Sub1_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(III[[ZZII)V")
	public abstract void method8535(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(III)I")
	public final int method8537(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray51[arg1][arg0];
	}

	@OriginalMember(owner = "client!s", name = "wa", descriptor = "(Lclient!r;IIIIZ)V")
	public abstract void wa(@OriginalArg(0) Class2_Sub1_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(III[[ZZI)V")
	public abstract void method8538(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	public abstract void method8540(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!r;IIIIZ)Z")
	public abstract boolean method8541(@OriginalArg(0) Class2_Sub1_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!s", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	public abstract void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13);

	@OriginalMember(owner = "client!s", name = "fa", descriptor = "(IILclient!r;)Lclient!r;")
	public abstract Class2_Sub1_Sub11 fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub1_Sub11 arg2);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ZII)I")
	public final int method8542(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 >> this.anInt9740;
		@Pc(13) int local13 = arg0 >> this.anInt9740;
		if (local8 < 0 || local13 < 0 || this.anInt9741 - 1 < local8 || local13 > this.anInt9742 - 1) {
			return 0;
		}
		@Pc(45) int local45 = arg1 & this.anInt9739 - 1;
		@Pc(52) int local52 = this.anInt9739 - 1 & arg0;
		@Pc(80) int local80 = this.anIntArrayArray51[local8][local13] * (this.anInt9739 - local45) + local45 * this.anIntArrayArray51[local8 + 1][local13] >> this.anInt9740;
		@Pc(110) int local110 = local45 * this.anIntArrayArray51[local8 + 1][local13 + 1] + (this.anInt9739 - local45) * this.anIntArrayArray51[local8][local13 + 1] >> this.anInt9740;
		return (this.anInt9739 - local52) * local80 + local52 * local110 >> this.anInt9740;
	}

	@OriginalMember(owner = "client!s", name = "ka", descriptor = "(III)V")
	public abstract void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!mfa;[I)V")
	public abstract void method8543(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(1) int[] arg1);
}
