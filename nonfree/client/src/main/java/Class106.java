import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public abstract class Class106 {

	@OriginalMember(owner = "client!nc", name = "j", descriptor = "I")
	public final int anInt6277;

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
	public final int anInt6271;

	static {
		new Class31(64);
	}

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(II)V")
	protected Class106(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6277 = arg1;
		this.anInt6271 = arg0;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IILclient!sr;)Lclient!sr;")
	public abstract Class6_Sub2_Sub17 method5710(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6_Sub2_Sub17 arg2);

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[IIIZ)V")
	public abstract void method5712(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13);

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(III)V")
	public abstract void method5714(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(II)V")
	public abstract void method5715(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "(II)I")
	public abstract int method5717(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!sr;IIIIZ)V")
	public abstract void method5719(@OriginalArg(0) Class6_Sub2_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "(II)I")
	public abstract int method5720(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "()V")
	public abstract void method5721();

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(III[[ZZ)V")
	public abstract void method5723(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(Lclient!sr;IIIIZ)V")
	public abstract void method5724(@OriginalArg(0) Class6_Sub2_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!uc;[I)V")
	public abstract void method5726(@OriginalArg(0) Class6_Sub17 arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "(Lclient!sr;IIIIZ)Z")
	public abstract boolean method5727(@OriginalArg(0) Class6_Sub2_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIIIII[[Z)V")
	public abstract void method5728(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4);

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(II[I[I[I[I[I[I[IIIZ)V")
	public abstract void method5729(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11);
}
