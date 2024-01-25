import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gj")
public final class Class96 {

	@OriginalMember(owner = "client!gj", name = "d", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	static {
		new Class256("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
	}

	@OriginalMember(owner = "client!gj", name = "<init>", descriptor = "()V")
	public Class96() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(III)V")
	private Class96(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "([BZLclient!md;)V")
	public void method1923(@OriginalArg(0) byte[] arg0, @OriginalArg(2) Class2_Sub20 arg1) {
		if (arg1.aByteArray136[arg1.anInt4608] != 31 || arg1.aByteArray136[arg1.anInt4608 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg1.aByteArray136, arg1.anInt4608 + 10, -arg1.anInt4608 + -18 + arg1.aByteArray136.length);
			this.anInflater1.inflate(arg0);
		} catch (@Pc(62) Exception local62) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
