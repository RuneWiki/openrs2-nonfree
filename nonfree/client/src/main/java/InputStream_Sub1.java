import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public final class InputStream_Sub1 extends InputStream {

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "I")
	public static int anInt3788 = -1;

	@OriginalMember(owner = "client!mk", name = "c", descriptor = "I")
	public static int anInt3789;

	static {
		new Class79("Unable to delete name - system busy.", "Name konnte nicht gelöscht werden - Systemfehler.", "Impossible d'effacer le nom - système occupé.", "Não foi possível deletar o nome - sistema ocupado.");
		anInt3789 = 0;
	}

	@OriginalMember(owner = "client!mk", name = "read", descriptor = "()I", line = 6)
	@Override
	public int read() {
		Static214.method4024(30000L);
		return -1;
	}
}
