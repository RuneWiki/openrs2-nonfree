import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!na")
public abstract class Class146 {

	@OriginalMember(owner = "client!na", name = "j", descriptor = "[I")
	public static final int[] anIntArray424 = new int[32];

	@OriginalMember(owner = "client!na", name = "g", descriptor = "I")
	public int anInt4734;

	@OriginalMember(owner = "client!na", name = "e", descriptor = "I")
	public final int anInt4732;

	@OriginalMember(owner = "client!na", name = "c", descriptor = "I")
	public final int anInt4730;

	@OriginalMember(owner = "client!na", name = "f", descriptor = "I")
	public final int anInt4733;

	static {
		@Pc(10) int local10 = 2;
		for (@Pc(12) int local12 = 0; local12 < 32; local12++) {
			anIntArray424[local12] = local10 - 1;
			local10 += local10;
		}
	}

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "(III)V")
	protected Class146(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		while (arg2 > 1) {
			arg2 >>= 0x1;
			this.anInt4734++;
		}
		this.anInt4732 = arg1;
		this.anInt4730 = arg0;
		this.anInt4733 = 0x1 << this.anInt4734;
	}

	@OriginalMember(owner = "client!na", name = "JA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	public abstract void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13);

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(III[[ZZ)V")
	public abstract void method3600(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!dd;[I)V")
	public abstract void method3602(@OriginalArg(0) Class4_Sub8 arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!na", name = "U", descriptor = "(Lclient!j;IIIIZ)V")
	public abstract void U(@OriginalArg(0) Class4_Sub1_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!na", name = "va", descriptor = "(II)I")
	public abstract int va(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!na", name = "f", descriptor = "()V")
	public abstract void f();

	@OriginalMember(owner = "client!na", name = "O", descriptor = "(IILclient!j;)Lclient!j;")
	public abstract Class4_Sub1_Sub7 O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub1_Sub7 arg2);

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(II)V")
	public abstract void method3603(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	public abstract void method3604(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15);

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!j;IIIIZ)Z")
	public abstract boolean method3606(@OriginalArg(0) Class4_Sub1_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!na", name = "I", descriptor = "(II)I")
	public abstract int I(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!na", name = "SA", descriptor = "(Lclient!j;IIIIZ)V")
	public abstract void SA(@OriginalArg(0) Class4_Sub1_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!na", name = "QA", descriptor = "(III)V")
	public abstract void QA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIIII[[Z)V")
	public abstract void method3607(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4);
}
