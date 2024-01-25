import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public abstract class Class4 {

	@OriginalMember(owner = "client!d", name = "b", descriptor = "I")
	public final int anInt10459;

	@OriginalMember(owner = "client!d", name = "d", descriptor = "I")
	public final int anInt10461;

	@OriginalMember(owner = "client!d", name = "f", descriptor = "I")
	public int anInt10463;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "I")
	public final int anInt10458;

	@OriginalMember(owner = "client!d", name = "<init>", descriptor = "(III)V")
	protected Class4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt10459 = arg1;
		this.anInt10461 = arg0;
		while (arg2 > 1) {
			this.anInt10463++;
			arg2 >>= 0x1;
		}
		this.anInt10458 = 0x1 << this.anInt10463;
	}

	@OriginalMember(owner = "client!d", name = "BA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	public abstract void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(II)V")
	public abstract void method8442(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(III[[ZZ)V")
	public abstract void method8443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	public abstract void method8444(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15);

	@OriginalMember(owner = "client!d", name = "EA", descriptor = "(III)V")
	public abstract void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!d", name = "ba", descriptor = "()V")
	public abstract void ba();

	@OriginalMember(owner = "client!d", name = "c", descriptor = "(IILclient!w;)Lclient!w;")
	public abstract Class3_Sub4_Sub2 c(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub4_Sub2 arg2);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!w;IIIIZ)Z")
	public abstract boolean method8445(@OriginalArg(0) Class3_Sub4_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!d", name = "aa", descriptor = "(Lclient!w;IIIIZ)V")
	public abstract void aa(@OriginalArg(0) Class3_Sub4_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!d", name = "FA", descriptor = "(Lclient!w;IIIIZ)V")
	public abstract void FA(@OriginalArg(0) Class3_Sub4_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!d", name = "JA", descriptor = "(II)I")
	public abstract int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!d", name = "sa", descriptor = "(II)I")
	public abstract int sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIIIII[[Z)V")
	public abstract void method8446(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!pn;[I)V")
	public abstract void method8448(@OriginalArg(0) Class3_Sub28 arg0, @OriginalArg(1) int[] arg1);
}
