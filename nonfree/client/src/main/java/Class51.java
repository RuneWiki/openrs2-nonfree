import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public abstract class Class51 {

	@OriginalMember(owner = "client!dn", name = "e", descriptor = "I")
	public final int anInt1961;

	@OriginalMember(owner = "client!dn", name = "g", descriptor = "I")
	public final int anInt1963;

	@OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(II)V")
	protected Class51(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1961 = arg1;
		this.anInt1963 = arg0;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(III)V")
	public abstract void method1841(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(III[[ZZ)V")
	public abstract void method1842(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(II)V")
	public abstract void method1843(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "(II)I")
	public abstract int method1844(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIIIIII[[Z)V")
	public abstract void method1845(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4);

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(II[I[I[I[I[I[I[IIIZ)V")
	public abstract void method1847(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11);

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[IIIZ)V")
	public abstract void method1850(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13);

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lclient!lb;IIIIZ)V")
	public abstract void method1851(@OriginalArg(0) Class5_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "(Lclient!lb;IIIIZ)Z")
	public abstract boolean method1852(@OriginalArg(0) Class5_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!dn", name = "c", descriptor = "(II)I")
	public abstract int method1856(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lclient!bn;[I)V")
	public abstract void method1857(@OriginalArg(0) Class5_Sub9 arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IILclient!lb;)Lclient!lb;")
	public abstract Class5_Sub1_Sub10 method1858(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5_Sub1_Sub10 arg2);

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "()V")
	public abstract void method1860();

	@OriginalMember(owner = "client!dn", name = "c", descriptor = "(Lclient!lb;IIIIZ)V")
	public abstract void method1861(@OriginalArg(0) Class5_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);
}
