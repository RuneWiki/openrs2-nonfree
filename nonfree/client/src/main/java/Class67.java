import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public abstract class Class67 {

	@OriginalMember(owner = "client!i", name = "j", descriptor = "I")
	public final int anInt8110;

	@OriginalMember(owner = "client!i", name = "k", descriptor = "I")
	public final int anInt8111;

	@OriginalMember(owner = "client!i", name = "b", descriptor = "I")
	public final int anInt8104;

	@OriginalMember(owner = "client!i", name = "f", descriptor = "[[I")
	public final int[][] anIntArrayArray57;

	@OriginalMember(owner = "client!i", name = "g", descriptor = "I")
	public final int anInt8108;

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(III[[I)V")
	protected Class67(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][] arg3) {
		this.anInt8110 = arg1;
		this.anInt8111 = arg0;
		@Pc(11) int local11 = 0;
		while (arg2 > 1) {
			local11++;
			arg2 >>= 0x1;
		}
		this.anInt8104 = 0x1 << local11;
		this.anIntArrayArray57 = arg3;
		this.anInt8108 = local11;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!ha;IIIIZ)Z")
	public abstract boolean method6705(@OriginalArg(0) Class2_Sub3_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!i", name = "BA", descriptor = "()V")
	public abstract void BA();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IBI)I")
	public final int method6707(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.anIntArrayArray57[arg1][arg0];
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(III)V")
	public abstract void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!gga;[I)V")
	public abstract void method6709(@OriginalArg(0) Class2_Sub14 arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!i", name = "v", descriptor = "(IILclient!ha;)Lclient!ha;")
	public abstract Class2_Sub3_Sub6 v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub3_Sub6 arg2);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIZ)I")
	public final int method6711(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = arg1 >> this.anInt8108;
		@Pc(18) int local18 = arg0 >> this.anInt8108;
		if (local13 < 0 || local18 < 0 || local13 > this.anInt8111 - 1 || this.anInt8110 - 1 < local18) {
			return 0;
		}
		@Pc(54) int local54 = this.anInt8104 - 1 & arg1;
		@Pc(61) int local61 = arg0 & this.anInt8104 - 1;
		@Pc(87) int local87 = (this.anInt8104 - local54) * this.anIntArrayArray57[local13][local18] + this.anIntArrayArray57[local13 + 1][local18] * local54 >> this.anInt8108;
		@Pc(118) int local118 = (this.anInt8104 - local54) * this.anIntArrayArray57[local13][local18 + 1] + local54 * this.anIntArrayArray57[local13 + 1][local18 + 1] >> this.anInt8108;
		return local61 * local118 + (this.anInt8104 - local61) * local87 >> this.anInt8108;
	}

	@OriginalMember(owner = "client!i", name = "E", descriptor = "(Lclient!ha;IIIIZ)V")
	public abstract void E(@OriginalArg(0) Class2_Sub3_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(III[[ZZI)V")
	public abstract void method6712(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!i", name = "DA", descriptor = "(Lclient!ha;IIIIZ)V")
	public abstract void DA(@OriginalArg(0) Class2_Sub3_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIIIII[[Z)V")
	public abstract void method6713(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	public abstract void method6714(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15);

	@OriginalMember(owner = "client!i", name = "O", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	public abstract void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(III[[ZZ)V")
	public abstract void method6715(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(II)V")
	public abstract void method6716(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
