import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public final class Class35 {

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	static {
		new Class267("Error joining clan channel - please try again later!", "Fehler beim Betreten des Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de clan - veuillez réessayer ultérieurement.", "Erro ao entrar no canal do clã. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "()V")
	public Class35() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(III)V")
	private Class35(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lclient!ae;B[B)V")
	public void method975(@OriginalArg(0) Class6_Sub1 arg0, @OriginalArg(2) byte[] arg1) {
		if (arg0.aByteArray96[arg0.anInt7898] != 31 || arg0.aByteArray96[arg0.anInt7898 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray96, arg0.anInt7898 + 10, arg0.aByteArray96.length + -arg0.anInt7898 + -18);
			this.anInflater1.inflate(arg1);
		} catch (@Pc(60) Exception local60) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
