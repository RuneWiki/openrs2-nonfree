import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public final class Class12_Sub2_Sub3 extends Class12_Sub2 implements Interface11 {

	@OriginalMember(owner = "client!dd", name = "I", descriptor = "Lclient!pi;")
	public Class12_Sub2 aClass12_Sub2_1;

	static {
		new Class221("That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den Privatsphären-Modus aktiviert.", "Ce joueur est déconnecté ou en mode privé.", "O jogador está offline ou está com o modo de privacidade ativado.");
	}

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(IIIIILclient!pi;)V")
	public Class12_Sub2_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class12_Sub2 arg5) {
		super(arg2, arg3, arg4, Static46.method908(arg1, arg0));
		this.aClass12_Sub2_1 = arg5;
	}

	@OriginalMember(owner = "client!dd", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5455() {
		return false;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z)V")
	@Override
	public void method5022() {
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILclient!km;IZILclient!kj;B)V")
	@Override
	public void method5454(@OriginalArg(0) int arg0, @OriginalArg(1) Class82 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class12 arg5) {
	}

	@OriginalMember(owner = "client!dd", name = "d", descriptor = "(Lclient!km;I)Lclient!to;")
	@Override
	public Class22_Sub8 method5451(@OriginalArg(0) Class82 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lclient!km;BII)Z")
	@Override
	public boolean method5450(@OriginalArg(0) Class82 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lclient!km;I)V")
	@Override
	public void method5021(@OriginalArg(0) Class82 arg0) {
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)I")
	@Override
	public int method5024() {
		return 0;
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(Lclient!km;I)V")
	@Override
	public void method5028(@OriginalArg(0) Class82 arg0) {
	}

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "(Lclient!km;I)V")
	@Override
	public void method5449(@OriginalArg(0) Class82 arg0) {
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lclient!km;II)Lclient!ab;")
	@Override
	public Class3 method5023(@OriginalArg(0) Class82 arg0, @OriginalArg(2) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5026() {
		return false;
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(Z)I")
	@Override
	public int method5025() {
		return 0;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V")
	@Override
	public void method5456() {
	}

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "(I)I")
	@Override
	public int method5027() {
		return 0;
	}
}
