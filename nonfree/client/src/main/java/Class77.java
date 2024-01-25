import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public abstract class Class77 {

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "I")
	public final int anInt4672;

	@OriginalMember(owner = "client!ij", name = "c", descriptor = "I")
	public final int anInt4673;

	@OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(II)V")
	protected Class77(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4672 = arg1;
		this.anInt4673 = arg0;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[IIIZ)V")
	public abstract void method4119(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13);

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(II)I")
	public abstract int method4122(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "()V")
	public abstract void method4124();

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIIIII[[Z)V")
	public abstract void method4125(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4);

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lclient!mc;IIIIZ)Z")
	public abstract boolean method4126(@OriginalArg(0) Class11_Sub4_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "(Lclient!mc;IIIIZ)V")
	public abstract void method4127(@OriginalArg(0) Class11_Sub4_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IILclient!mc;)Lclient!mc;")
	public abstract Class11_Sub4_Sub4 method4128(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class11_Sub4_Sub4 arg2);

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(II[I[I[I[I[I[I[IIIZ)V")
	public abstract void method4131(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11);

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(III)V")
	public abstract void method4132(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "(II)I")
	public abstract int method4133(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(III[[ZZ)V")
	public abstract void method4134(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ij", name = "c", descriptor = "(Lclient!mc;IIIIZ)V")
	public abstract void method4135(@OriginalArg(0) Class11_Sub4_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ij", name = "c", descriptor = "(II)V")
	public abstract void method4136(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lclient!bh;[I)V")
	public abstract void method4137(@OriginalArg(0) Class11_Sub5 arg0, @OriginalArg(1) int[] arg1);
}
