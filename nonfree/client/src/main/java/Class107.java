import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public final class Class107 {

	@OriginalMember(owner = "client!gh", name = "d", descriptor = "I")
	private final int anInt2916;

	@OriginalMember(owner = "client!gh", name = "e", descriptor = "I")
	public final int anInt2917;

	@OriginalMember(owner = "client!gh", name = "i", descriptor = "Lclient!sb;")
	private final Class264 aClass264_7;

	@OriginalMember(owner = "client!gh", name = "g", descriptor = "I")
	public final int anInt2918;

	static {
		new Class306("Login to a members' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Connectez-vous à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
	}

	@OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(IILclient!sb;)V")
	public Class107(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class264 arg2) {
		this.anInt2916 = arg1;
		this.anInt2917 = arg0;
		this.aClass264_7 = arg2;
		this.anInt2918 = this.anInt2916 * this.aClass264_7.anInt7501;
		if (this.anInt2917 >= 16) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gh", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
