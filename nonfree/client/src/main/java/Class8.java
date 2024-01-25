import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public abstract class Class8 {

	@OriginalMember(owner = "client!sa", name = "g", descriptor = "I")
	public final int anInt4760;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "I")
	public final int anInt4755;

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(II)V")
	protected Class8(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4760 = arg1;
		this.anInt4755 = arg0;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!ug;IIIIZ)Z")
	public abstract boolean method4158(@OriginalArg(0) Class7_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(Lclient!ug;IIIIZ)V")
	public abstract void method4159(@OriginalArg(0) Class7_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[IIIZ)V")
	public abstract void method4160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13);

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(II[I[I[I[I[I[I[IIIZ)V")
	public abstract void method4161(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11);

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!j;[I)V")
	public abstract void method4162(@OriginalArg(0) Class7_Sub16 arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "()V")
	public abstract void method4163();

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "(Lclient!ug;IIIIZ)V")
	public abstract void method4164(@OriginalArg(0) Class7_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IILclient!ug;)Lclient!ug;")
	public abstract Class7_Sub1_Sub4 method4165(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class7_Sub1_Sub4 arg2);

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(III[[ZZ)V")
	public abstract void method4166(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)V")
	public abstract void method4168(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(II)I")
	public abstract int method4169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIIII[[Z)V")
	public abstract void method4171(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4);

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(III)V")
	public abstract void method4172(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "(II)I")
	public abstract int method4173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
