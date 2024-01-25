import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public abstract class Class60 {

	@OriginalMember(owner = "client!uh", name = "h", descriptor = "I")
	public final int anInt2567;

	@OriginalMember(owner = "client!uh", name = "d", descriptor = "I")
	public final int anInt2564;

	@OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(II)V")
	protected Class60(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2567 = arg0;
		this.anInt2564 = arg1;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "()V")
	public abstract void method2257();

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lclient!o;IIIIZ)V")
	public abstract void method2259(@OriginalArg(0) Class4_Sub4_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(II[I[I[I[I[I[I[IIIZ)V")
	public abstract void method2260(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11);

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[IIIZ)V")
	public abstract void method2261(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13);

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lclient!pc;[I)V")
	public abstract void method2262(@OriginalArg(0) Class4_Sub33 arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)I")
	public abstract int method2264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "(Lclient!o;IIIIZ)V")
	public abstract void method2265(@OriginalArg(0) Class4_Sub4_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!uh", name = "c", descriptor = "(Lclient!o;IIIIZ)Z")
	public abstract boolean method2266(@OriginalArg(0) Class4_Sub4_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(III[[ZZ)V")
	public abstract void method2268(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(III)V")
	public abstract void method2269(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "(II)I")
	public abstract int method2270(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!uh", name = "c", descriptor = "(II)V")
	public abstract void method2272(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIIIII[[Z)V")
	public abstract void method2273(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4);

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IILclient!o;)Lclient!o;")
	public abstract Class4_Sub4_Sub4 method2274(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub4_Sub4 arg2);
}
