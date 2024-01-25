import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public abstract class Class3 {

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "I")
	public final int anInt6360;

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "I")
	public final int anInt6361;

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(II)V")
	protected Class3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6360 = arg0;
		this.anInt6361 = arg1;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!lg;IIIIZ)Z")
	public abstract boolean method5626(@OriginalArg(0) Class5_Sub9_Sub14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IILclient!lg;)Lclient!lg;")
	public abstract Class5_Sub9_Sub14 method5627(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5_Sub9_Sub14 arg2);

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(Lclient!lg;IIIIZ)V")
	public abstract void method5628(@OriginalArg(0) Class5_Sub9_Sub14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "()V")
	public abstract void method5629();

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)V")
	public abstract void method5630(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "(Lclient!lg;IIIIZ)V")
	public abstract void method5631(@OriginalArg(0) Class5_Sub9_Sub14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[IIIZ)V")
	public abstract void method5632(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13);

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIIII[[Z)V")
	public abstract void method5634(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4);

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(III[[ZZ)V")
	public abstract void method5635(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!vg;[I)V")
	public abstract void method5637(@OriginalArg(0) Class5_Sub13 arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(II)I")
	public abstract int method5638(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "(II)I")
	public abstract int method5639(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(III)V")
	public abstract void method5640(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(II[I[I[I[I[I[I[IIIZ)V")
	public abstract void method5641(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11);
}
