import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public abstract class Class26 {

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "I")
	public final int anInt5936;

	@OriginalMember(owner = "client!bl", name = "h", descriptor = "I")
	public final int anInt5941;

	@OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(II)V")
	protected Class26(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5936 = arg1;
		this.anInt5941 = arg0;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(II)I")
	public abstract int method4990(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lclient!ve;IIIIZ)V")
	public abstract void method4991(@OriginalArg(0) Class4_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[IIIZ)V")
	public abstract void method4992(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13);

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(III[[ZZ)V")
	public abstract void method4993(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lclient!fs;[I)V")
	public abstract void method4995(@OriginalArg(0) Class4_Sub12 arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(II)I")
	public abstract int method4996(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(Lclient!ve;IIIIZ)V")
	public abstract void method4998(@OriginalArg(0) Class4_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IILclient!ve;)Lclient!ve;")
	public abstract Class4_Sub1_Sub1 method4999(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub1_Sub1 arg2);

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(II[I[I[I[I[I[I[IIIZ)V")
	public abstract void method5000(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11);

	@OriginalMember(owner = "client!bl", name = "c", descriptor = "(II)V")
	public abstract void method5001(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(III)V")
	public abstract void method5002(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!bl", name = "c", descriptor = "(Lclient!ve;IIIIZ)Z")
	public abstract boolean method5003(@OriginalArg(0) Class4_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIIIII[[Z)V")
	public abstract void method5004(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4);

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "()V")
	public abstract void method5005();
}
