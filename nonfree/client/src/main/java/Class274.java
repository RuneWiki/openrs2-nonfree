import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public abstract class Class274 {

	@OriginalMember(owner = "client!s", name = "b", descriptor = "I")
	public final int anInt9723;

	@OriginalMember(owner = "client!s", name = "i", descriptor = "I")
	public final int anInt9726;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "I")
	public final int anInt9722;

	@OriginalMember(owner = "client!s", name = "j", descriptor = "I")
	public final int anInt9727;

	@OriginalMember(owner = "client!s", name = "e", descriptor = "[[I")
	public final int[][] anIntArrayArray99;

	static {
		new Class229("", 76);
	}

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "(III[[I)V")
	protected Class274(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][] arg3) {
		this.anInt9723 = arg1;
		this.anInt9726 = arg0;
		@Pc(11) int local11 = 0;
		while (arg2 > 1) {
			arg2 >>= 0x1;
			local11++;
		}
		this.anInt9722 = 0x1 << local11;
		this.anInt9727 = local11;
		this.anIntArrayArray99 = arg3;
	}

	@OriginalMember(owner = "client!s", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	public abstract void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(III[[ZZII)V")
	public abstract void method8035(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!s", name = "CA", descriptor = "(Lclient!r;IIIIZ)V")
	public abstract void CA(@OriginalArg(0) Class3_Sub1_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!s", name = "YA", descriptor = "()V")
	public abstract void YA();

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIII[[Z)V")
	public abstract void method8036(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4);

	@OriginalMember(owner = "client!s", name = "wa", descriptor = "(Lclient!r;IIIIZ)V")
	public abstract void wa(@OriginalArg(0) Class3_Sub1_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(II)V")
	public abstract void method8037(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!s", name = "fa", descriptor = "(IILclient!r;)Lclient!r;")
	public abstract Class3_Sub1_Sub6 fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub1_Sub6 arg2);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	public abstract void method8039(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15);

	@OriginalMember(owner = "client!s", name = "ka", descriptor = "(III)V")
	public abstract void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!pk;[I)V")
	public abstract void method8040(@OriginalArg(0) Class3_Sub27 arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(III)I")
	public final int method8041(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.anIntArrayArray99[arg0][arg1];
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!r;IIIIZ)Z")
	public abstract boolean method8042(@OriginalArg(0) Class3_Sub1_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(BII)I")
	public final int method8043(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 >> this.anInt9727;
		@Pc(13) int local13 = arg0 >> this.anInt9727;
		if (local8 < 0 || local13 < 0 || this.anInt9726 - 1 < local8 || this.anInt9723 - 1 < local13) {
			return 0;
		}
		@Pc(46) int local46 = arg1 & this.anInt9722 - 1;
		@Pc(53) int local53 = this.anInt9722 - 1 & arg0;
		@Pc(86) int local86 = (this.anInt9722 - local46) * this.anIntArrayArray99[local8][local13] + local46 * this.anIntArrayArray99[local8 + 1][local13] >> this.anInt9727;
		@Pc(117) int local117 = (this.anInt9722 - local46) * this.anIntArrayArray99[local8][local13 + 1] + local46 * this.anIntArrayArray99[local8 + 1][local13 + 1] >> this.anInt9727;
		return local86 * (this.anInt9722 - local53) + local53 * local117 >> this.anInt9727;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(III[[ZZI)V")
	public abstract void method8044(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5);
}
