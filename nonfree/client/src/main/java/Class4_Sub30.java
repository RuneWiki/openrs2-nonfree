import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public final class Class4_Sub30 extends Class4 {

	@OriginalMember(owner = "client!on", name = "o", descriptor = "[B")
	public final byte[] aByteArray76;

	static {
		new Class21("To talk, start each line of chat with the / symbol.", "Leite eine Zeile mit / ein, um hier zu chatten.", "Pour parler, insérez le symbole / au début de chaque ligne.", "Para falar, comece cada linha de conversa com o símbolo /.");
		new Class21(null, "Dieses System darf nicht missbraucht werden!", null, null);
	}

	@OriginalMember(owner = "client!on", name = "<init>", descriptor = "([B)V")
	public Class4_Sub30(@OriginalArg(0) byte[] arg0) {
		this.aByteArray76 = arg0;
	}
}
