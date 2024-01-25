import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public abstract class Class149 {

	@OriginalMember(owner = "client!ta", name = "j", descriptor = "I")
	public final int anInt4319;

	@OriginalMember(owner = "client!ta", name = "f", descriptor = "I")
	public final int anInt4317;

	@OriginalMember(owner = "client!ta", name = "e", descriptor = "I")
	public int anInt4316;

	@OriginalMember(owner = "client!ta", name = "i", descriptor = "I")
	public final int anInt4318;

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(III)V")
	protected Class149(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4319 = arg1;
		this.anInt4317 = arg0;
		while (arg2 > 1) {
			this.anInt4316++;
			arg2 >>= 0x1;
		}
		this.anInt4318 = 0x1 << this.anInt4316;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIIIII[[Z)V")
	public abstract void method3564(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4);

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	public abstract void method3565(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15);

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)I")
	public abstract int a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ta", name = "B", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	public abstract void B(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13);

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!ba;IIIIZ)Z")
	public abstract boolean method3567(@OriginalArg(0) Class1_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(Lclient!ba;IIIIZ)V")
	public abstract void b(@OriginalArg(0) Class1_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!ta", name = "p", descriptor = "(Lclient!ba;IIIIZ)V")
	public abstract void p(@OriginalArg(0) Class1_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!ta", name = "i", descriptor = "(III)V")
	public abstract void i(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ta", name = "ca", descriptor = "()V")
	public abstract void ca();

	@OriginalMember(owner = "client!ta", name = "k", descriptor = "(IILclient!ba;)Lclient!ba;")
	public abstract Class1_Sub2_Sub1 k(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub2_Sub1 arg2);

	@OriginalMember(owner = "client!ta", name = "l", descriptor = "(II)I")
	public abstract int l(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(III[[ZZ)V")
	public abstract void method3569(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!qp;[I)V")
	public abstract void method3571(@OriginalArg(0) Class1_Sub31 arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(II)V")
	public abstract void method3572(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
