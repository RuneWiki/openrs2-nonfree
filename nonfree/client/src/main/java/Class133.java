import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public abstract class Class133 {

	@OriginalMember(owner = "client!s", name = "j", descriptor = "I")
	public final int anInt9318;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "I")
	public final int anInt9315;

	@OriginalMember(owner = "client!s", name = "f", descriptor = "I")
	public final int anInt9321;

	@OriginalMember(owner = "client!s", name = "g", descriptor = "[[I")
	public final int[][] anIntArrayArray60;

	@OriginalMember(owner = "client!s", name = "d", descriptor = "I")
	public final int anInt9317;

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "(III[[I)V")
	protected Class133(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][] arg3) {
		this.anInt9318 = arg0;
		this.anInt9315 = arg1;
		@Pc(11) int local11 = 0;
		while (arg2 > 1) {
			local11++;
			arg2 >>= 0x1;
		}
		this.anInt9321 = 0x1 << local11;
		this.anIntArrayArray60 = arg3;
		this.anInt9317 = local11;
	}

	@OriginalMember(owner = "client!s", name = "YA", descriptor = "()V")
	public abstract void YA();

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!r;IIIIZ)Z")
	public abstract boolean method8213(@OriginalArg(0) Class2_Sub6_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(III)I")
	public final int method8214(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0 >> this.anInt9317;
		@Pc(13) int local13 = arg1 >> this.anInt9317;
		if (local8 < 0 || local13 < 0 || local8 > this.anInt9318 - 1 || local13 > this.anInt9315 - 1) {
			return 0;
		}
		@Pc(56) int local56 = arg0 & this.anInt9321 - 1;
		@Pc(63) int local63 = arg1 & this.anInt9321 - 1;
		@Pc(98) int local98 = local56 * this.anIntArrayArray60[local8 + 1][local13] + this.anIntArrayArray60[local8][local13] * (this.anInt9321 - local56) >> this.anInt9317;
		@Pc(129) int local129 = this.anIntArrayArray60[local8 + 1][local13 + 1] * local56 + (this.anInt9321 - local56) * this.anIntArrayArray60[local8][local13 + 1] >> this.anInt9317;
		return local63 * local129 + (this.anInt9321 - local63) * local98 >> this.anInt9317;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!bba;[I)V")
	public abstract void method8215(@OriginalArg(0) Class2_Sub7 arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	public abstract void method8216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15);

	@OriginalMember(owner = "client!s", name = "fa", descriptor = "(IILclient!r;)Lclient!r;")
	public abstract Class2_Sub6_Sub9 fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub6_Sub9 arg2);

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(III)I")
	public final int method8217(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.anIntArrayArray60[arg0][arg1];
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(III[[ZZI)V")
	public abstract void method8218(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!s", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	public abstract void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13);

	@OriginalMember(owner = "client!s", name = "wa", descriptor = "(Lclient!r;IIIIZ)V")
	public abstract void wa(@OriginalArg(0) Class2_Sub6_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIII[[Z)V")
	public abstract void method8219(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4);

	@OriginalMember(owner = "client!s", name = "CA", descriptor = "(Lclient!r;IIIIZ)V")
	public abstract void CA(@OriginalArg(0) Class2_Sub6_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(III[[ZZII)V")
	public abstract void method8222(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!s", name = "ka", descriptor = "(III)V")
	public abstract void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(II)V")
	public abstract void method8223(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
