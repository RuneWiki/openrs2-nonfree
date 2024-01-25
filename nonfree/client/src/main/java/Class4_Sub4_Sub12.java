import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public abstract class Class4_Sub4_Sub12 extends Class4_Sub4 {

	@OriginalMember(owner = "client!ok", name = "B", descriptor = "Lclient!aa;")
	public final Interface1 anInterface1_3;

	static {
		new Class159("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ");
		new Class159("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que você tentou acessar não existe.");
	}

	@OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(Lclient!aa;)V")
	protected Class4_Sub4_Sub12(@OriginalArg(0) Interface1 arg0) {
		this.anInterface1_3 = arg0;
	}

	@OriginalMember(owner = "client!ok", name = "d", descriptor = "(B)Z")
	public abstract boolean method5306();

	@OriginalMember(owner = "client!ok", name = "e", descriptor = "(B)Ljava/lang/Object;")
	public abstract Object method5307();
}
