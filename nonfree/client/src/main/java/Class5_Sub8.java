import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public abstract class Class5_Sub8 extends Class5 {

	@OriginalMember(owner = "client!cg", name = "n", descriptor = "Z")
	public boolean aBoolean601;

	@OriginalMember(owner = "client!cg", name = "s", descriptor = "Lclient!jj;")
	protected final Class62_Sub3 aClass62_Sub3_38;

	static {
		new Class40("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
	}

	@OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(Lclient!jj;)V")
	public Class5_Sub8(@OriginalArg(0) Class62_Sub3 arg0) {
		this.aClass62_Sub3_38 = arg0;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)V")
	public abstract void method6706(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(ILclient!hp;ZLclient!hp;)V")
	public abstract void method6708(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub2 arg1, @OriginalArg(3) Class4_Sub2 arg2);

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IBI)V")
	public abstract void method6710(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(I)V")
	public abstract void method6711();

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Z)Z")
	public abstract boolean method6712();

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(B)Z")
	public final boolean method6713() {
		return false;
	}

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "(Z)I")
	public int method6715() {
		return 0;
	}

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "(I)Z")
	public abstract boolean method6716();

	@OriginalMember(owner = "client!cg", name = "f", descriptor = "(I)I")
	public final int method6717() {
		return 1;
	}

	@OriginalMember(owner = "client!cg", name = "g", descriptor = "(I)Z")
	public final boolean method6718() {
		return this.aBoolean601;
	}
}
