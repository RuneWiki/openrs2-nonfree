import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public final class Class222 {

	@OriginalMember(owner = "client!sv", name = "f", descriptor = "I")
	public final int anInt6751;

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "I")
	public final int anInt6746;

	@OriginalMember(owner = "client!sv", name = "b", descriptor = "I")
	public final int anInt6747;

	@OriginalMember(owner = "client!sv", name = "c", descriptor = "I")
	public final int anInt6748;

	static {
		new Class96("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
	}

	@OriginalMember(owner = "client!sv", name = "<init>", descriptor = "(IIII)V")
	public Class222(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6751 = arg0;
		this.anInt6746 = arg1;
		this.anInt6747 = arg2;
		this.anInt6748 = arg3;
	}

	@OriginalMember(owner = "client!sv", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
