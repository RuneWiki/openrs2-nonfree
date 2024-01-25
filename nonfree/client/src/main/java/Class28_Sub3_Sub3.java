import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public final class Class28_Sub3_Sub3 extends Class28_Sub3 implements Interface3 {

	@OriginalMember(owner = "client!kk", name = "J", descriptor = "Lclient!uj;")
	public Class28_Sub3 aClass28_Sub3_3;

	static {
		new Class57("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "Não foi possível adicionar um amigo - jogador desconhecido.");
		new Class57("Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.", "Impossible de supprimer un ami - système occupé.", "Não foi possível excluir o amigo. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(IIIIILclient!uj;)V")
	public Class28_Sub3_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class28_Sub3 arg5) {
		super(arg2, arg3, arg4, Static224.method3721(arg1, arg0));
		this.aClass28_Sub3_3 = arg5;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIILclient!np;)Z")
	@Override
	public boolean method5408(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class155 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(ILclient!in;ILclient!np;BZI)V")
	@Override
	public void method5410(@OriginalArg(0) int arg0, @OriginalArg(1) Class28 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class155 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
	}

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "(I)I")
	@Override
	public int method5423() {
		return 0;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lclient!np;I)V")
	@Override
	public void method5426(@OriginalArg(0) Class155 arg0) {
	}

	@OriginalMember(owner = "client!kk", name = "d", descriptor = "(I)V")
	@Override
	public void method5411() {
	}

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "(ILclient!np;)Lclient!ql;")
	@Override
	public Class12_Sub7 method5407(@OriginalArg(1) Class155 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!kk", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5413() {
		return false;
	}

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5427() {
		return false;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lclient!np;BI)Lclient!f;")
	@Override
	public Class75 method5422(@OriginalArg(0) Class155 arg0, @OriginalArg(2) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)I")
	@Override
	public int method5420() {
		return 0;
	}

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "(I)V")
	@Override
	public void method5421() {
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(B)I")
	@Override
	public int method5425() {
		return 0;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(ILclient!np;)V")
	@Override
	public void method5424(@OriginalArg(1) Class155 arg0) {
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lclient!np;B)V")
	@Override
	public void method5406(@OriginalArg(0) Class155 arg0) {
	}
}
