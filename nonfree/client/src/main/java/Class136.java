import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public abstract class Class136 {

	@OriginalMember(owner = "client!na", name = "d", descriptor = "I")
	public int anInt7660;

	@OriginalMember(owner = "client!na", name = "g", descriptor = "I")
	public final int anInt7662;

	@OriginalMember(owner = "client!na", name = "i", descriptor = "I")
	public final int anInt7664;

	@OriginalMember(owner = "client!na", name = "f", descriptor = "I")
	public final int anInt7661;

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "(III)V")
	protected Class136(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		while (arg2 > 1) {
			arg2 >>= 0x1;
			this.anInt7660++;
		}
		this.anInt7662 = arg0;
		this.anInt7664 = arg1;
		this.anInt7661 = 0x1 << this.anInt7660;
	}

	@OriginalMember(owner = "client!na", name = "I", descriptor = "(II)I")
	public abstract int I(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	public abstract void method5974(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15);

	@OriginalMember(owner = "client!na", name = "JA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	public abstract void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13);

	@OriginalMember(owner = "client!na", name = "O", descriptor = "(IILclient!j;)Lclient!j;")
	public abstract Class1_Sub2_Sub11 O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub2_Sub11 arg2);

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(II)V")
	public abstract void method5975(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!na", name = "U", descriptor = "(Lclient!j;IIIIZ)V")
	public abstract void U(@OriginalArg(0) Class1_Sub2_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!na", name = "SA", descriptor = "(Lclient!j;IIIIZ)V")
	public abstract void SA(@OriginalArg(0) Class1_Sub2_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIIII[[Z)V")
	public abstract void method5976(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4);

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(III[[ZZ)V")
	public abstract void method5977(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!j;IIIIZ)Z")
	public abstract boolean method5978(@OriginalArg(0) Class1_Sub2_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!na", name = "QA", descriptor = "(III)V")
	public abstract void QA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!na", name = "va", descriptor = "(II)I")
	public abstract int va(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!pe;[I)V")
	public abstract void method5979(@OriginalArg(0) Class1_Sub5 arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!na", name = "f", descriptor = "()V")
	public abstract void f();
}
