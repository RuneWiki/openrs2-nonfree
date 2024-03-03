import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public abstract class Class6 {

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "Lclient!ld;")
	public static final Class135 aClass135_38 = new Class135();

	@OriginalMember(owner = "client!tf", name = "f", descriptor = "Z")
	public static boolean aBoolean427 = false;

	@OriginalMember(owner = "client!tf", name = "e", descriptor = "Lclient!gd;")
	public static final Class79 aClass79_131 = new Class79(" is already on your friend list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.");

	@OriginalMember(owner = "client!tf", name = "i", descriptor = "I")
	public final int anInt6308;

	@OriginalMember(owner = "client!tf", name = "h", descriptor = "I")
	public final int anInt6307;

	@OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(II)V", line = 51)
	protected Class6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6308 = arg0;
		this.anInt6307 = arg1;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	public abstract void method5718(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15);

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "()V")
	public abstract void method5719();

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)I")
	public abstract int method5720(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(II)V")
	public abstract void method5721(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lclient!of;[I)V")
	public abstract void method5722(@OriginalArg(0) Class2_Sub26 arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIIIII[[Z)V")
	public abstract void method5723(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4);

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(III)V")
	public abstract void method5724(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lclient!kb;IIIIZ)V")
	public abstract void method5725(@OriginalArg(0) Class2_Sub2_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(Lclient!kb;IIIIZ)V")
	public abstract void method5726(@OriginalArg(0) Class2_Sub2_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	public abstract void method5728(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13);

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "(II)I")
	public abstract int method5729(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(III[[ZZ)V")
	public abstract void method5730(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IILclient!kb;)Lclient!kb;")
	public abstract Class2_Sub2_Sub4 method5731(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub2_Sub4 arg2);

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "(Lclient!kb;IIIIZ)Z")
	public abstract boolean method5732(@OriginalArg(0) Class2_Sub2_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);
}
