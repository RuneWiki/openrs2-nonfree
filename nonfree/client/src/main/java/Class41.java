import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public abstract class Class41 {

	@OriginalMember(owner = "client!sm", name = "j", descriptor = "I")
	public final int anInt6185;

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "I")
	public final int anInt6179;

	@OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(II)V")
	protected Class41(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6185 = arg1;
		this.anInt6179 = arg0;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[IIIZ)V")
	public abstract void method5415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13);

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(III[[ZZ)V")
	public abstract void method5416(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lclient!ek;IIIIZ)V")
	public abstract void method5417(@OriginalArg(0) Class1_Sub1_Sub8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "(Lclient!ek;IIIIZ)Z")
	public abstract boolean method5419(@OriginalArg(0) Class1_Sub1_Sub8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(II[I[I[I[I[I[I[IIIZ)V")
	public abstract void method5420(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11);

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "()V")
	public abstract void method5422();

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lclient!vb;[I)V")
	public abstract void method5423(@OriginalArg(0) Class1_Sub31 arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(II)V")
	public abstract void method5425(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!sm", name = "c", descriptor = "(Lclient!ek;IIIIZ)V")
	public abstract void method5426(@OriginalArg(0) Class1_Sub1_Sub8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(III)V")
	public abstract void method5427(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IILclient!ek;)Lclient!ek;")
	public abstract Class1_Sub1_Sub8 method5429(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub8 arg2);

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIIIIII[[Z)V")
	public abstract void method5432(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4);

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "(II)I")
	public abstract int method5433(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!sm", name = "c", descriptor = "(II)I")
	public abstract int method5434(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
