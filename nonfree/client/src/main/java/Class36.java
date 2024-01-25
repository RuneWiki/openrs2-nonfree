import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public abstract class Class36 {

	@OriginalMember(owner = "client!ui", name = "f", descriptor = "I")
	public final int anInt4859;

	@OriginalMember(owner = "client!ui", name = "d", descriptor = "I")
	public final int anInt4858;

	@OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(II)V")
	protected Class36(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4859 = arg1;
		this.anInt4858 = arg0;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)I")
	public abstract int method4431(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIIIII[[Z)V")
	public abstract void method4432(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4);

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "(II)I")
	public abstract int method4433(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "()V")
	public abstract void method4434();

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IILclient!qh;)Lclient!qh;")
	public abstract Class1_Sub4_Sub4 method4435(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub4_Sub4 arg2);

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(II[I[I[I[I[I[I[IIIZ)V")
	public abstract void method4436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11);

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(III[[ZZ)V")
	public abstract void method4437(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[IIIZ)V")
	public abstract void method4440(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13);

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "(II)V")
	public abstract void method4441(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lclient!qh;IIIIZ)V")
	public abstract void method4442(@OriginalArg(0) Class1_Sub4_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(III)V")
	public abstract void method4443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "(Lclient!qh;IIIIZ)V")
	public abstract void method4444(@OriginalArg(0) Class1_Sub4_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "(Lclient!qh;IIIIZ)Z")
	public abstract boolean method4445(@OriginalArg(0) Class1_Sub4_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lclient!ap;[I)V")
	public abstract void method4447(@OriginalArg(0) Class1_Sub5 arg0, @OriginalArg(1) int[] arg1);
}
