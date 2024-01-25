import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public abstract class Class53 {

	@OriginalMember(owner = "client!ip", name = "b", descriptor = "I")
	public final int anInt3016;

	@OriginalMember(owner = "client!ip", name = "c", descriptor = "I")
	public final int anInt3017;

	@OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(II)V")
	protected Class53(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3016 = arg1;
		this.anInt3017 = arg0;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(II)V")
	public abstract void method2781(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(Lclient!gi;IIIIZ)V")
	public abstract void method2782(@OriginalArg(0) Class1_Sub4_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(IILclient!gi;)Lclient!gi;")
	public abstract Class1_Sub4_Sub10 method2784(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub4_Sub10 arg2);

	@OriginalMember(owner = "client!ip", name = "b", descriptor = "(II)I")
	public abstract int method2785(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(Lclient!si;[I)V")
	public abstract void method2786(@OriginalArg(0) Class1_Sub30 arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "()V")
	public abstract void method2787();

	@OriginalMember(owner = "client!ip", name = "b", descriptor = "(Lclient!gi;IIIIZ)V")
	public abstract void method2788(@OriginalArg(0) Class1_Sub4_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIIIIII[[Z)V")
	public abstract void method2789(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4);

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(II[I[I[I[I[I[I[IIIZ)V")
	public abstract void method2790(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11);

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(III[[ZZ)V")
	public abstract void method2791(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ip", name = "c", descriptor = "(II)I")
	public abstract int method2792(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(III)V")
	public abstract void method2793(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[IIIZ)V")
	public abstract void method2794(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13);

	@OriginalMember(owner = "client!ip", name = "c", descriptor = "(Lclient!gi;IIIIZ)Z")
	public abstract boolean method2796(@OriginalArg(0) Class1_Sub4_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);
}
