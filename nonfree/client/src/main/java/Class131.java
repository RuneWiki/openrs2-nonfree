import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public abstract class Class131 {

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "I")
	public final int anInt8871;

	@OriginalMember(owner = "client!sa", name = "e", descriptor = "I")
	public final int anInt8873;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "I")
	public int anInt8869;

	@OriginalMember(owner = "client!sa", name = "h", descriptor = "I")
	public final int anInt8874;

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(III)V")
	protected Class131(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt8871 = arg1;
		this.anInt8873 = arg0;
		while (arg2 > 1) {
			this.anInt8869++;
			arg2 >>= 0x1;
		}
		this.anInt8874 = 0x1 << this.anInt8869;
	}

	@OriginalMember(owner = "client!sa", name = "X", descriptor = "(IILclient!k;)Lclient!k;")
	public abstract Class5_Sub2_Sub13 X(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5_Sub2_Sub13 arg2);

	@OriginalMember(owner = "client!sa", name = "Q", descriptor = "(III)V")
	public abstract void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIIII[[Z)V")
	public abstract void method7182(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4);

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)V")
	public abstract void method7183(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!k;IIIIZ)Z")
	public abstract boolean method7185(@OriginalArg(0) Class5_Sub2_Sub13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!sa", name = "N", descriptor = "()V")
	public abstract void N();

	@OriginalMember(owner = "client!sa", name = "F", descriptor = "(Lclient!k;IIIIZ)V")
	public abstract void F(@OriginalArg(0) Class5_Sub2_Sub13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	public abstract void method7186(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15);

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!uca;[I)V")
	public abstract void method7187(@OriginalArg(0) Class5_Sub10 arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!sa", name = "ya", descriptor = "(Lclient!k;IIIIZ)V")
	public abstract void ya(@OriginalArg(0) Class5_Sub2_Sub13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!sa", name = "ba", descriptor = "(II)I")
	public abstract int ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!sa", name = "IA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	public abstract void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13);

	@OriginalMember(owner = "client!sa", name = "aa", descriptor = "(II)I")
	public abstract int aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(III[[ZZ)V")
	public abstract void method7190(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4);
}
