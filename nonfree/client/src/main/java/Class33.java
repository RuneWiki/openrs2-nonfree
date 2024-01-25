import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public abstract class Class33 {

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "I")
	public final int anInt4626;

	@OriginalMember(owner = "client!dh", name = "c", descriptor = "I")
	public final int anInt4627;

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(II)V")
	protected Class33(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4626 = arg1;
		this.anInt4627 = arg0;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(II)I")
	public abstract int method4055(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lclient!mr;IIIIZ)V")
	public abstract void method4056(@OriginalArg(0) Class2_Sub1_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "(II)I")
	public abstract int method4057(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "(Lclient!mr;IIIIZ)V")
	public abstract void method4059(@OriginalArg(0) Class2_Sub1_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lclient!rc;[I)V")
	public abstract void method4061(@OriginalArg(0) Class2_Sub14 arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(III)V")
	public abstract void method4062(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "()V")
	public abstract void method4063();

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	public abstract void method4064(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13);

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	public abstract void method4065(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15);

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIIIII[[Z)V")
	public abstract void method4066(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4);

	@OriginalMember(owner = "client!dh", name = "d", descriptor = "(II)V")
	public abstract void method4067(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!dh", name = "c", descriptor = "(Lclient!mr;IIIIZ)Z")
	public abstract boolean method4068(@OriginalArg(0) Class2_Sub1_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IILclient!mr;)Lclient!mr;")
	public abstract Class2_Sub1_Sub6 method4069(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub1_Sub6 arg2);

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(III[[ZZ)V")
	public abstract void method4070(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4);
}
