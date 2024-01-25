import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public abstract class Class129 {

	@OriginalMember(owner = "client!i", name = "i", descriptor = "I")
	public final int anInt8065;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "I")
	public final int anInt8058;

	@OriginalMember(owner = "client!i", name = "d", descriptor = "I")
	public final int anInt8060;

	@OriginalMember(owner = "client!i", name = "c", descriptor = "[[I")
	public final int[][] anIntArrayArray49;

	@OriginalMember(owner = "client!i", name = "j", descriptor = "I")
	public final int anInt8066;

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(III[[I)V")
	protected Class129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][] arg3) {
		this.anInt8065 = arg0;
		this.anInt8058 = arg1;
		@Pc(11) int local11 = 0;
		while (arg2 > 1) {
			arg2 >>= 0x1;
			local11++;
		}
		this.anInt8060 = 0x1 << local11;
		this.anIntArrayArray49 = arg3;
		this.anInt8066 = local11;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	public abstract void method6473(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(III)V")
	public abstract void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!ha;IIIIZ)Z")
	public abstract boolean method6474(@OriginalArg(0) Class1_Sub8_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(II)V")
	public abstract void method6475(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIIIII[[Z)V")
	public abstract void method6476(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4);

	@OriginalMember(owner = "client!i", name = "O", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	public abstract void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13);

	@OriginalMember(owner = "client!i", name = "v", descriptor = "(IILclient!ha;)Lclient!ha;")
	public abstract Class1_Sub8_Sub4 v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub8_Sub4 arg2);

	@OriginalMember(owner = "client!i", name = "BA", descriptor = "()V")
	public abstract void BA();

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(III[[ZZ)V")
	public abstract void method6478(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(III[[ZZI)V")
	public abstract void method6479(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!i", name = "DA", descriptor = "(Lclient!ha;IIIIZ)V")
	public abstract void DA(@OriginalArg(0) Class1_Sub8_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!i", name = "E", descriptor = "(Lclient!ha;IIIIZ)V")
	public abstract void E(@OriginalArg(0) Class1_Sub8_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IBI)I")
	public final int method6480(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 >> this.anInt8066;
		@Pc(13) int local13 = arg0 >> this.anInt8066;
		if (local8 < 0 || local13 < 0 || this.anInt8065 - 1 < local8 || this.anInt8058 - 1 < local13) {
			return 0;
		}
		@Pc(60) int local60 = arg1 & this.anInt8060 - 1;
		@Pc(67) int local67 = this.anInt8060 - 1 & arg0;
		@Pc(95) int local95 = this.anIntArrayArray49[local8][local13] * (this.anInt8060 - local60) + local60 * this.anIntArrayArray49[local8 + 1][local13] >> this.anInt8066;
		@Pc(125) int local125 = (this.anInt8060 - local60) * this.anIntArrayArray49[local8][local13 + 1] + local60 * this.anIntArrayArray49[local8 + 1][local13 + 1] >> this.anInt8066;
		return (this.anInt8060 - local67) * local95 + local67 * local125 >> this.anInt8066;
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(III)I")
	public final int method6481(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.anIntArrayArray49[arg1][arg0];
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!tw;[I)V")
	public abstract void method6482(@OriginalArg(0) Class1_Sub24 arg0, @OriginalArg(1) int[] arg1);
}
