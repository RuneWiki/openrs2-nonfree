import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public abstract class Class22 {

	@OriginalMember(owner = "client!da", name = "e", descriptor = "I")
	public final int anInt5577;

	@OriginalMember(owner = "client!da", name = "a", descriptor = "I")
	public final int anInt5574;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "(II)V")
	protected Class22(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5577 = arg1;
		this.anInt5574 = arg0;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IILclient!c;)Lclient!c;")
	public abstract Class3_Sub7_Sub3 method4665(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub7_Sub3 arg2);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIII[[Z)V")
	public abstract void method4666(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[IIIZ)V")
	public abstract void method4667(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(III[[ZZ)V")
	public abstract void method4669(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(III)V")
	public abstract void method4671(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II)I")
	public abstract int method4672(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!c;IIIIZ)V")
	public abstract void method4673(@OriginalArg(0) Class3_Sub7_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II[I[I[I[I[I[I[IIIZ)V")
	public abstract void method4674(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11);

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(II)V")
	public abstract void method4675(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(Lclient!c;IIIIZ)V")
	public abstract void method4676(@OriginalArg(0) Class3_Sub7_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!da", name = "c", descriptor = "(Lclient!c;IIIIZ)Z")
	public abstract boolean method4677(@OriginalArg(0) Class3_Sub7_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!da", name = "c", descriptor = "(II)I")
	public abstract int method4678(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "()V")
	public abstract void method4679();

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!dn;[I)V")
	public abstract void method4680(@OriginalArg(0) Class3_Sub13 arg0, @OriginalArg(1) int[] arg1);
}
