import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public abstract class Class159 {

	@OriginalMember(owner = "client!s", name = "k", descriptor = "I")
	public final int anInt9504;

	@OriginalMember(owner = "client!s", name = "j", descriptor = "I")
	public final int anInt9506;

	@OriginalMember(owner = "client!s", name = "d", descriptor = "I")
	public final int anInt9502;

	@OriginalMember(owner = "client!s", name = "n", descriptor = "I")
	public final int anInt9501;

	@OriginalMember(owner = "client!s", name = "b", descriptor = "[[I")
	public final int[][] anIntArrayArray56;

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "(III[[I)V")
	protected Class159(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][] arg3) {
		this.anInt9504 = arg0;
		this.anInt9506 = arg1;
		@Pc(11) int local11 = 0;
		while (arg2 > 1) {
			arg2 >>= 0x1;
			local11++;
		}
		this.anInt9502 = 0x1 << local11;
		this.anInt9501 = local11;
		this.anIntArrayArray56 = arg3;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!r;IIIIZ)Z")
	public abstract boolean method8198(@OriginalArg(0) Class14_Sub2_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	public abstract void method8200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15);

	@OriginalMember(owner = "client!s", name = "YA", descriptor = "()V")
	public abstract void YA();

	@OriginalMember(owner = "client!s", name = "fa", descriptor = "(IILclient!r;)Lclient!r;")
	public abstract Class14_Sub2_Sub5 fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class14_Sub2_Sub5 arg2);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(III[[ZZII)V")
	public abstract void method8203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(II)V")
	public abstract void method8204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIII[[Z)V")
	public abstract void method8205(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(III[[ZZI)V")
	public abstract void method8206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!s", name = "wa", descriptor = "(Lclient!r;IIIIZ)V")
	public abstract void wa(@OriginalArg(0) Class14_Sub2_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(III)I")
	public final int method8207(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.anIntArrayArray56[arg1][arg0];
	}

	@OriginalMember(owner = "client!s", name = "ka", descriptor = "(III)V")
	public abstract void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!rfa;[I)V")
	public abstract void method8208(@OriginalArg(0) Class14_Sub18 arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!s", name = "CA", descriptor = "(Lclient!r;IIIIZ)V")
	public abstract void CA(@OriginalArg(0) Class14_Sub2_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!s", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	public abstract void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(III)I")
	public final int method8209(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0 >> this.anInt9501;
		@Pc(13) int local13 = arg1 >> this.anInt9501;
		if (local8 < 0 || local13 < 0 || local8 > this.anInt9504 - 1 || local13 > this.anInt9506 - 1) {
			return 0;
		}
		@Pc(48) int local48 = arg0 & this.anInt9502 - 1;
		@Pc(55) int local55 = this.anInt9502 - 1 & arg1;
		@Pc(81) int local81 = (this.anInt9502 - local48) * this.anIntArrayArray56[local8][local13] + local48 * this.anIntArrayArray56[local8 + 1][local13] >> this.anInt9501;
		@Pc(112) int local112 = (this.anInt9502 - local48) * this.anIntArrayArray56[local8][local13 + 1] + this.anIntArrayArray56[local8 + 1][local13 + 1] * local48 >> this.anInt9501;
		return local81 * (this.anInt9502 - local55) + local112 * local55 >> this.anInt9501;
	}
}
