import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ya")
public abstract class Class162 {

	@OriginalMember(owner = "client!ya", name = "d", descriptor = "I")
	public final int anInt4137;

	@OriginalMember(owner = "client!ya", name = "f", descriptor = "I")
	public int anInt4139;

	@OriginalMember(owner = "client!ya", name = "e", descriptor = "I")
	public final int anInt4138;

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "I")
	public final int anInt4134;

	static {
		new Class134("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs chargée", "Dados da lista de mundos carregados");
	}

	@OriginalMember(owner = "client!ya", name = "<init>", descriptor = "(III)V")
	protected Class162(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4137 = arg1;
		while (arg2 > 1) {
			this.anInt4139++;
			arg2 >>= 0x1;
		}
		this.anInt4138 = arg0;
		this.anInt4134 = 0x1 << this.anInt4139;
	}

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(II)V")
	public abstract void method3271(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ya", name = "ba", descriptor = "(Lclient!i;IIIIZ)V")
	public abstract void ba(@OriginalArg(0) Class2_Sub5_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lclient!i;IIIIZ)Z")
	public abstract boolean method3273(@OriginalArg(0) Class2_Sub5_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lclient!sa;[I)V")
	public abstract void method3274(@OriginalArg(0) Class2_Sub29 arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	public abstract void method3275(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15);

	@OriginalMember(owner = "client!ya", name = "qa", descriptor = "(III)V")
	public abstract void qa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ya", name = "pa", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	public abstract void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13);

	@OriginalMember(owner = "client!ya", name = "ca", descriptor = "(II)I")
	public abstract int ca(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ya", name = "aa", descriptor = "()V")
	public abstract void aa();

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(III[[ZZ)V")
	public abstract void method3277(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIIIII[[Z)V")
	public abstract void method3278(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4);

	@OriginalMember(owner = "client!ya", name = "H", descriptor = "(Lclient!i;IIIIZ)V")
	public abstract void H(@OriginalArg(0) Class2_Sub5_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!ya", name = "ua", descriptor = "(II)I")
	public abstract int ua(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ya", name = "OA", descriptor = "(IILclient!i;)Lclient!i;")
	public abstract Class2_Sub5_Sub7 OA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub5_Sub7 arg2);
}
