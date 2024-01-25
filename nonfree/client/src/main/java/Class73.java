import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public abstract class Class73 {

	@OriginalMember(owner = "client!gh", name = "h", descriptor = "I")
	public final int anInt5550;

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "I")
	public final int anInt5546;

	@OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(II)V")
	protected Class73(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5550 = arg1;
		this.anInt5546 = arg0;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(III[[ZZ)V")
	public abstract void method4922(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIIIIII[[Z)V")
	public abstract void method4923(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4);

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[IIIZ)V")
	public abstract void method4929(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13);

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(II)I")
	public abstract int method4931(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!gh", name = "c", descriptor = "(II)I")
	public abstract int method4932(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lclient!qp;[I)V")
	public abstract void method4933(@OriginalArg(0) Class2_Sub36 arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(II[I[I[I[I[I[I[IIIZ)V")
	public abstract void method4934(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11);

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lclient!mm;IIIIZ)Z")
	public abstract boolean method4935(@OriginalArg(0) Class2_Sub11_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IILclient!mm;)Lclient!mm;")
	public abstract Class2_Sub11_Sub10 method4936(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub11_Sub10 arg2);

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(Lclient!mm;IIIIZ)V")
	public abstract void method4937(@OriginalArg(0) Class2_Sub11_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!gh", name = "d", descriptor = "(II)V")
	public abstract void method4938(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "()V")
	public abstract void method4939();

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(III)V")
	public abstract void method4940(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!gh", name = "c", descriptor = "(Lclient!mm;IIIIZ)V")
	public abstract void method4941(@OriginalArg(0) Class2_Sub11_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);
}
