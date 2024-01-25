import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ya")
public abstract class Class157 {

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "I")
	public int anInt6279;

	@OriginalMember(owner = "client!ya", name = "e", descriptor = "I")
	public final int anInt6283;

	@OriginalMember(owner = "client!ya", name = "h", descriptor = "I")
	public final int anInt6286;

	@OriginalMember(owner = "client!ya", name = "f", descriptor = "I")
	public final int anInt6284;

	static {
		new Class119("You already sent an abuse report under 60 secs ago! Do not abuse this system!", "Du hast bereits vor weniger als 60 Sekunden einen Regelverstoß gemeldet!", "Vous avez déjà signalé un abus il y a moins d'une minute ! N'abusez pas du système !", "Você já enviou uma denúncia de abuso há menos de um minuto. Não abuse deste sistema!");
	}

	@OriginalMember(owner = "client!ya", name = "<init>", descriptor = "(III)V")
	protected Class157(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		while (arg2 > 1) {
			this.anInt6279++;
			arg2 >>= 0x1;
		}
		this.anInt6283 = arg0;
		this.anInt6286 = arg1;
		this.anInt6284 = 0x1 << this.anInt6279;
	}

	@OriginalMember(owner = "client!ya", name = "aa", descriptor = "()V")
	public abstract void aa();

	@OriginalMember(owner = "client!ya", name = "pa", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	public abstract void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(III[[ZZ)V")
	public abstract void method4944(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ya", name = "ba", descriptor = "(Lclient!i;IIIIZ)V")
	public abstract void ba(@OriginalArg(0) Class1_Sub5_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!ya", name = "qa", descriptor = "(III)V")
	public abstract void qa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(II)V")
	public abstract void method4945(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lclient!i;IIIIZ)Z")
	public abstract boolean method4946(@OriginalArg(0) Class1_Sub5_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ya", name = "H", descriptor = "(Lclient!i;IIIIZ)V")
	public abstract void H(@OriginalArg(0) Class1_Sub5_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lclient!bn;[I)V")
	public abstract void method4948(@OriginalArg(0) Class1_Sub7 arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!ya", name = "ca", descriptor = "(II)I")
	public abstract int ca(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ya", name = "ua", descriptor = "(II)I")
	public abstract int ua(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIIIII[[Z)V")
	public abstract void method4950(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4);

	@OriginalMember(owner = "client!ya", name = "OA", descriptor = "(IILclient!i;)Lclient!i;")
	public abstract Class1_Sub5_Sub10 OA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub5_Sub10 arg2);

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	public abstract void method4952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15);
}
