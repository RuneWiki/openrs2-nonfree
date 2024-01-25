import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public abstract class Class149 {

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "I")
	public final int anInt6740;

	@OriginalMember(owner = "client!mi", name = "c", descriptor = "I")
	public final int anInt6741;

	static {
		new Class62(null, "Spieler nicht auf deiner Freunde-Liste.", null, null);
	}

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(II)V")
	protected Class149(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6740 = arg1;
		this.anInt6741 = arg0;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lclient!hq;[I)V")
	public abstract void method5830(@OriginalArg(0) Class2_Sub8 arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIIIII[[Z)V")
	public abstract void method5831(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4);

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lclient!ph;IIIIZ)V")
	public abstract void method5832(@OriginalArg(0) Class2_Sub7_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(III[[ZZ)V")
	public abstract void method5833(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IILclient!ph;)Lclient!ph;")
	public abstract Class2_Sub7_Sub11 method5834(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub7_Sub11 arg2);

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "()V")
	public abstract void method5836();

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(II)I")
	public abstract int method5837(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(III)V")
	public abstract void method5838(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(II)I")
	public abstract int method5839(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(Lclient!ph;IIIIZ)V")
	public abstract void method5840(@OriginalArg(0) Class2_Sub7_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!mi", name = "c", descriptor = "(Lclient!ph;IIIIZ)Z")
	public abstract boolean method5841(@OriginalArg(0) Class2_Sub7_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	public abstract void method5842(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13);

	@OriginalMember(owner = "client!mi", name = "c", descriptor = "(II)V")
	public abstract void method5844(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	public abstract void method5845(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15);
}
