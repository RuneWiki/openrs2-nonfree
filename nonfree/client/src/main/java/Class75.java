import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public abstract class Class75 {

	@OriginalMember(owner = "client!sa", name = "h", descriptor = "I")
	public final int anInt7995;

	@OriginalMember(owner = "client!sa", name = "k", descriptor = "I")
	public final int anInt7998;

	@OriginalMember(owner = "client!sa", name = "i", descriptor = "I")
	public int anInt7996;

	@OriginalMember(owner = "client!sa", name = "f", descriptor = "I")
	public final int anInt7994;

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(III)V")
	protected Class75(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt7995 = arg1;
		this.anInt7998 = arg0;
		while (arg2 > 1) {
			this.anInt7996++;
			arg2 >>= 0x1;
		}
		this.anInt7994 = 0x1 << this.anInt7996;
	}

	@OriginalMember(owner = "client!sa", name = "ya", descriptor = "(Lclient!k;IIIIZ)V")
	public abstract void ya(@OriginalArg(0) Class2_Sub13_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!sa", name = "IA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	public abstract void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13);

	@OriginalMember(owner = "client!sa", name = "N", descriptor = "()V")
	public abstract void N();

	@OriginalMember(owner = "client!sa", name = "F", descriptor = "(Lclient!k;IIIIZ)V")
	public abstract void F(@OriginalArg(0) Class2_Sub13_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIIII[[Z)V")
	public abstract void method6698(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4);

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)V")
	public abstract void method6699(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!sa", name = "aa", descriptor = "(II)I")
	public abstract int aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!sa", name = "X", descriptor = "(IILclient!k;)Lclient!k;")
	public abstract Class2_Sub13_Sub6 X(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub13_Sub6 arg2);

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!k;IIIIZ)Z")
	public abstract boolean method6703(@OriginalArg(0) Class2_Sub13_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	public abstract void method6704(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15);

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(III[[ZZ)V")
	public abstract void method6705(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!sa", name = "ba", descriptor = "(II)I")
	public abstract int ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!sa", name = "Q", descriptor = "(III)V")
	public abstract void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!at;[I)V")
	public abstract void method6706(@OriginalArg(0) Class2_Sub5 arg0, @OriginalArg(1) int[] arg1);
}
