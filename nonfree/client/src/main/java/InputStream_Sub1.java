import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public final class InputStream_Sub1 extends InputStream {

	static {
		new Class158("The channel you tried to join is currently full.", "Der von dir gewünschte Chatraum ist derzeit überfüllt.", "Le canal que vous essayez de rejoindre est plein.", "O canal que você tentou acessar está cheio no momento.");
	}

	@OriginalMember(owner = "client!nf", name = "read", descriptor = "()I")
	@Override
	public int read() {
		Static289.method4249(30000L);
		return -1;
	}
}
