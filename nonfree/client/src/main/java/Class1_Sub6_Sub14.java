import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public final class Class1_Sub6_Sub14 extends Class1_Sub6 {

	@OriginalMember(owner = "client!qe", name = "w", descriptor = "[B")
	public final byte[] aByteArray76;

	static {
		new Class169("To talk, start each line of chat with the / symbol.", "Leite eine Zeile mit / ein, um hier zu chatten.", "Pour parler, insérez le symbole / au début de chaque ligne.", "Para falar, comece cada linha de conversa com o símbolo /.");
	}

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "([B)V")
	public Class1_Sub6_Sub14(@OriginalArg(0) byte[] arg0) {
		this.aByteArray76 = arg0;
	}
}
