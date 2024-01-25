import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public abstract class Class42 {

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "I")
	public final int anInt3739;

	@OriginalMember(owner = "client!cl", name = "e", descriptor = "I")
	public final int anInt3742;

	static {
		new Class169("You already sent an abuse report under 60 secs ago! Do not abuse this system!", "Du hast bereits vor weniger als 60 Sekunden einen Regelverstoß gemeldet!", "Vous avez déjà signalé un abus il y a moins d'une minute ! N'abusez pas du système !", "Você já enviou uma denúncia de abuso há menos de um minuto. Não abuse deste sistema!");
		new Class169("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n'êtes pas autorisé à expulser cet utilisateur.", "Você não tem permissão para expulsar este usuário.");
	}

	@OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(II)V")
	protected Class42(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3739 = arg0;
		this.anInt3742 = arg1;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(II)I")
	public abstract int method3043(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(III)V")
	public abstract void method3045(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lclient!fq;IIIIZ)Z")
	public abstract boolean method3046(@OriginalArg(0) Class1_Sub6_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IILclient!fq;)Lclient!fq;")
	public abstract Class1_Sub6_Sub5 method3047(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub6_Sub5 arg2);

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lclient!ma;[I)V")
	public abstract void method3050(@OriginalArg(0) Class1_Sub27 arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIIIII[[Z)V")
	public abstract void method3051(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4);

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(III[[ZZ)V")
	public abstract void method3053(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "(Lclient!fq;IIIIZ)V")
	public abstract void method3054(@OriginalArg(0) Class1_Sub6_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!cl", name = "c", descriptor = "(Lclient!fq;IIIIZ)V")
	public abstract void method3055(@OriginalArg(0) Class1_Sub6_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "(II)V")
	public abstract void method3056(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "()V")
	public abstract void method3057();

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	public abstract void method3058(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13);

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	public abstract void method3059(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15);

	@OriginalMember(owner = "client!cl", name = "c", descriptor = "(II)I")
	public abstract int method3060(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
