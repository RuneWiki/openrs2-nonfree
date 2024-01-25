import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public abstract class Class86 {

	@OriginalMember(owner = "client!og", name = "a", descriptor = "I")
	public final int anInt8047;

	@OriginalMember(owner = "client!og", name = "c", descriptor = "I")
	public final int anInt8049;

	@OriginalMember(owner = "client!og", name = "h", descriptor = "I")
	public int anInt8051;

	@OriginalMember(owner = "client!og", name = "e", descriptor = "I")
	public final int anInt8050;

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "(III)V")
	protected Class86(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt8047 = arg0;
		this.anInt8049 = arg1;
		while (arg2 > 1) {
			this.anInt8051++;
			arg2 >>= 0x1;
		}
		this.anInt8050 = 0x1 << this.anInt8051;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "()V")
	public abstract void method6582();

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!ss;IIIIZ)V")
	public abstract void method6583(@OriginalArg(0) Class6_Sub2_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(II)V")
	public abstract void method6584(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!dq;[I)V")
	public abstract void method6585(@OriginalArg(0) Class6_Sub11 arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(Lclient!ss;IIIIZ)Z")
	public abstract boolean method6586(@OriginalArg(0) Class6_Sub2_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!og", name = "c", descriptor = "(Lclient!ss;IIIIZ)V")
	public abstract void method6588(@OriginalArg(0) Class6_Sub2_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(II)I")
	public abstract int method6590(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IILclient!ss;)Lclient!ss;")
	public abstract Class6_Sub2_Sub10 method6591(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6_Sub2_Sub10 arg2);

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	public abstract void method6592(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13);

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(III)V")
	public abstract void method6593(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!og", name = "c", descriptor = "(II)I")
	public abstract int method6594(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(III[[ZZ)V")
	public abstract void method6595(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	public abstract void method6596(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15);

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIIIII[[Z)V")
	public abstract void method6597(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4);
}
