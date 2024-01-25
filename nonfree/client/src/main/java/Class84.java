import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public abstract class Class84 {

	@OriginalMember(owner = "client!fo", name = "d", descriptor = "I")
	public final int anInt6363;

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "I")
	public final int anInt6360;

	@OriginalMember(owner = "client!fo", name = "h", descriptor = "I")
	public int anInt6366;

	@OriginalMember(owner = "client!fo", name = "c", descriptor = "I")
	public final int anInt6362;

	@OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(III)V")
	protected Class84(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6363 = arg0;
		this.anInt6360 = arg1;
		while (arg2 > 1) {
			this.anInt6366++;
			arg2 >>= 0x1;
		}
		this.anInt6362 = 0x1 << this.anInt6366;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "()V")
	public abstract void method5320();

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lclient!h;IIIIZ)V")
	public abstract void method5321(@OriginalArg(0) Class6_Sub1_Sub8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(II)I")
	public abstract int method5322(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lclient!ki;[I)V")
	public abstract void method5323(@OriginalArg(0) Class6_Sub6 arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(III[[ZZ)V")
	public abstract void method5324(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "(II)V")
	public abstract void method5325(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	public abstract void method5327(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13);

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	public abstract void method5328(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15);

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "(Lclient!h;IIIIZ)V")
	public abstract void method5329(@OriginalArg(0) Class6_Sub1_Sub8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIIIIII[[Z)V")
	public abstract void method5330(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4);

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IILclient!h;)Lclient!h;")
	public abstract Class6_Sub1_Sub8 method5331(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6_Sub1_Sub8 arg2);

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(III)V")
	public abstract void method5332(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!fo", name = "c", descriptor = "(Lclient!h;IIIIZ)Z")
	public abstract boolean method5333(@OriginalArg(0) Class6_Sub1_Sub8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!fo", name = "c", descriptor = "(II)I")
	public abstract int method5334(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
