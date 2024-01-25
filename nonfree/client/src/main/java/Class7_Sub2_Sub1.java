import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public final class Class7_Sub2_Sub1 extends Class7_Sub2 implements Interface8 {

	@OriginalMember(owner = "client!al", name = "E", descriptor = "Lclient!nu;")
	public Class7_Sub2 aClass7_Sub2_1;

	static {
		new Class189("The channel you tried to join is currently full.", "Der von dir gewünschte Chatraum ist derzeit überfüllt.", "Le canal que vous essayez de rejoindre est plein.", "O canal que você tentou acessar está cheio no momento.");
		new Class189("If you are not, please change your password to something more obscure!", "nicht der Fall ist, ändere dein Passwort zu einem ungewöhnlicheren Begriff!", "Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins évidente !", "Caso não esteja, altere sua senha para algo mais obscuro!");
	}

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "(IIIIIIIIIILclient!nu;)V")
	public Class7_Sub2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class7_Sub2 arg10) {
		super(arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, false, Static88.method1663(arg1, arg0));
		this.aClass7_Sub2_1 = arg10;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method4809() {
		return false;
	}

	@OriginalMember(owner = "client!al", name = "d", descriptor = "(I)I")
	@Override
	public int method3494() {
		return 0;
	}

	@OriginalMember(owner = "client!al", name = "c", descriptor = "(I)V")
	@Override
	public void method4811() {
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(ILclient!qa;ZLclient!to;III)V")
	@Override
	public void method5273(@OriginalArg(0) int arg0, @OriginalArg(1) Class172 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class7 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(Lclient!qa;II)Lclient!c;")
	@Override
	public Class9 method4805(@OriginalArg(0) Class172 arg0, @OriginalArg(2) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!al", name = "b", descriptor = "(I)I")
	@Override
	public int method4810() {
		return 0;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method4806(@OriginalArg(1) Class172 arg0) {
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(ILclient!qa;II)Z")
	@Override
	public boolean method5270(@OriginalArg(1) Class172 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(B)I")
	@Override
	public int method4807() {
		return 0;
	}

	@OriginalMember(owner = "client!al", name = "c", descriptor = "(B)V")
	@Override
	public void method5268() {
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method4804(@OriginalArg(0) Class172 arg0) {
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(ZLclient!qa;)Lclient!ae;")
	@Override
	public Class6_Sub1 method5274(@OriginalArg(1) Class172 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method5267(@OriginalArg(1) Class172 arg0) {
	}

	@OriginalMember(owner = "client!al", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method5276() {
		return false;
	}

	@OriginalMember(owner = "client!al", name = "b", descriptor = "(B)I")
	@Override
	public int method4808() {
		return 0;
	}
}
