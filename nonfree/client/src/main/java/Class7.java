import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public abstract class Class7 {

	@OriginalMember(owner = "client!pl", name = "c", descriptor = "I")
	public final int anInt6380;

	@OriginalMember(owner = "client!pl", name = "f", descriptor = "I")
	public final int anInt6381;

	@OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(II)V")
	protected Class7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6380 = arg0;
		this.anInt6381 = arg1;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(III)V")
	public abstract void method5637(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(II)I")
	public abstract int method5638(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	public abstract void method5640(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15);

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IILclient!tm;)Lclient!tm;")
	public abstract Class3_Sub7_Sub6 method5641(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub7_Sub6 arg2);

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lclient!tm;IIIIZ)V")
	public abstract void method5642(@OriginalArg(0) Class3_Sub7_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "(Lclient!tm;IIIIZ)Z")
	public abstract boolean method5643(@OriginalArg(0) Class3_Sub7_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "()V")
	public abstract void method5644();

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lclient!eo;[I)V")
	public abstract void method5645(@OriginalArg(0) Class3_Sub12 arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!pl", name = "c", descriptor = "(Lclient!tm;IIIIZ)V")
	public abstract void method5646(@OriginalArg(0) Class3_Sub7_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(III[[ZZ)V")
	public abstract void method5647(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "(II)I")
	public abstract int method5648(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	public abstract void method5649(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13);

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIIIIII[[Z)V")
	public abstract void method5650(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4);

	@OriginalMember(owner = "client!pl", name = "c", descriptor = "(II)V")
	public abstract void method5651(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
