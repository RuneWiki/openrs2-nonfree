import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public abstract class Class64 {

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "I")
	public final int anInt2928;

	@OriginalMember(owner = "client!ta", name = "h", descriptor = "I")
	public final int anInt2934;

	@OriginalMember(owner = "client!ta", name = "f", descriptor = "I")
	public int anInt2932;

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "I")
	public final int anInt2927;

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(III)V")
	protected Class64(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2928 = arg1;
		this.anInt2934 = arg0;
		while (arg2 > 1) {
			arg2 >>= 0x1;
			this.anInt2932++;
		}
		this.anInt2927 = 0x1 << this.anInt2932;
	}

	@OriginalMember(owner = "client!ta", name = "l", descriptor = "(II)I")
	public abstract int l(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ta", name = "k", descriptor = "(IILclient!ba;)Lclient!ba;")
	public abstract Class2_Sub5_Sub1 k(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub5_Sub1 arg2);

	@OriginalMember(owner = "client!ta", name = "p", descriptor = "(Lclient!ba;IIIIZ)V")
	public abstract void p(@OriginalArg(0) Class2_Sub5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(Lclient!ba;IIIIZ)V")
	public abstract void b(@OriginalArg(0) Class2_Sub5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!jd;[I)V")
	public abstract void method2349(@OriginalArg(0) Class2_Sub20 arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	public abstract void method2351(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15);

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)I")
	public abstract int a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!ba;IIIIZ)Z")
	public abstract boolean method2352(@OriginalArg(0) Class2_Sub5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(II)V")
	public abstract void method2354(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ta", name = "B", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	public abstract void B(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13);

	@OriginalMember(owner = "client!ta", name = "i", descriptor = "(III)V")
	public abstract void i(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ta", name = "ca", descriptor = "()V")
	public abstract void ca();

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(III[[ZZ)V")
	public abstract void method2355(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIIIII[[Z)V")
	public abstract void method2356(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4);
}
