import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public abstract class Class59 {

	@OriginalMember(owner = "client!d", name = "a", descriptor = "I")
	public int anInt9638;

	@OriginalMember(owner = "client!d", name = "c", descriptor = "I")
	public final int anInt9640;

	@OriginalMember(owner = "client!d", name = "b", descriptor = "I")
	public final int anInt9639;

	@OriginalMember(owner = "client!d", name = "d", descriptor = "I")
	public final int anInt9641;

	@OriginalMember(owner = "client!d", name = "<init>", descriptor = "(III)V")
	protected Class59(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		while (arg2 > 1) {
			arg2 >>= 0x1;
			this.anInt9638++;
		}
		this.anInt9640 = arg0;
		this.anInt9639 = arg1;
		this.anInt9641 = 0x1 << this.anInt9638;
	}

	@OriginalMember(owner = "client!d", name = "BA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	public abstract void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13);

	@OriginalMember(owner = "client!d", name = "EA", descriptor = "(III)V")
	public abstract void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(III[[ZZ)V")
	public abstract void method7860(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!d", name = "aa", descriptor = "(Lclient!w;IIIIZ)V")
	public abstract void aa(@OriginalArg(0) Class6_Sub2_Sub14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(II)V")
	public abstract void method7862(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!d", name = "JA", descriptor = "(II)I")
	public abstract int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	public abstract void method7863(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIIIII[[Z)V")
	public abstract void method7864(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4);

	@OriginalMember(owner = "client!d", name = "FA", descriptor = "(Lclient!w;IIIIZ)V")
	public abstract void FA(@OriginalArg(0) Class6_Sub2_Sub14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!d", name = "sa", descriptor = "(II)I")
	public abstract int sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!w;IIIIZ)Z")
	public abstract boolean method7865(@OriginalArg(0) Class6_Sub2_Sub14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!bj;[I)V")
	public abstract void method7866(@OriginalArg(0) Class6_Sub7 arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!d", name = "ba", descriptor = "()V")
	public abstract void ba();

	@OriginalMember(owner = "client!d", name = "c", descriptor = "(IILclient!w;)Lclient!w;")
	public abstract Class6_Sub2_Sub14 c(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6_Sub2_Sub14 arg2);
}
