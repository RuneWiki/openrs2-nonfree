import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public abstract class Class114 {

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "I")
	public final int anInt3871;

	@OriginalMember(owner = "client!lf", name = "e", descriptor = "I")
	public final int anInt3873;

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(II)V")
	protected Class114(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3871 = arg0;
		this.anInt3873 = arg1;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIIII[[Z)V")
	public abstract void method3597(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4);

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(III)V")
	public abstract void method3598(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "()V")
	public abstract void method3599();

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!as;IIIIZ)Z")
	public abstract boolean method3601(@OriginalArg(0) Class14_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(Lclient!as;IIIIZ)V")
	public abstract void method3602(@OriginalArg(0) Class14_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(II[I[I[I[I[I[I[IIIZ)V")
	public abstract void method3603(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11);

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lclient!ej;[I)V")
	public abstract void method3604(@OriginalArg(0) Class14_Sub13 arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)V")
	public abstract void method3606(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(II)I")
	public abstract int method3607(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(III[[ZZ)V")
	public abstract void method3608(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "(II)I")
	public abstract int method3610(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "(Lclient!as;IIIIZ)V")
	public abstract void method3611(@OriginalArg(0) Class14_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[IIIZ)V")
	public abstract void method3612(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13);

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IILclient!as;)Lclient!as;")
	public abstract Class14_Sub2_Sub2 method3613(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class14_Sub2_Sub2 arg2);
}
