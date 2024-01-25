import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public abstract class Class55 {

	@OriginalMember(owner = "client!o", name = "i", descriptor = "I")
	public int anInt4615;

	@OriginalMember(owner = "client!o", name = "e", descriptor = "I")
	public final int anInt4611;

	@OriginalMember(owner = "client!o", name = "h", descriptor = "I")
	public final int anInt4614;

	@OriginalMember(owner = "client!o", name = "d", descriptor = "I")
	public final int anInt4610;

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "(III)V")
	protected Class55(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		while (arg2 > 1) {
			arg2 >>= 0x1;
			this.anInt4615++;
		}
		this.anInt4611 = arg1;
		this.anInt4614 = arg0;
		this.anInt4610 = 0x1 << this.anInt4615;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIIII[[Z)V")
	public abstract void method3813(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4);

	@OriginalMember(owner = "client!o", name = "ia", descriptor = "(Lclient!ia;IIIIZ)V")
	public abstract void ia(@OriginalArg(0) Class3_Sub3_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(II)V")
	public abstract void method3814(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!o", name = "U", descriptor = "()V")
	public abstract void U();

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Lclient!ia;IIIIZ)Z")
	public abstract boolean method3815(@OriginalArg(0) Class3_Sub3_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(III[[ZZ)V")
	public abstract void method3816(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!o", name = "q", descriptor = "(IILclient!ia;)Lclient!ia;")
	public abstract Class3_Sub3_Sub9 q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub3_Sub9 arg2);

	@OriginalMember(owner = "client!o", name = "ta", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	public abstract void ta(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13);

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Lclient!be;[I)V")
	public abstract void method3818(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!o", name = "R", descriptor = "(II)I")
	public abstract int R(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!o", name = "m", descriptor = "(III)V")
	public abstract void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	public abstract void method3820(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15);

	@OriginalMember(owner = "client!o", name = "oa", descriptor = "(II)I")
	public abstract int oa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!o", name = "H", descriptor = "(Lclient!ia;IIIIZ)V")
	public abstract void H(@OriginalArg(0) Class3_Sub3_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);
}
