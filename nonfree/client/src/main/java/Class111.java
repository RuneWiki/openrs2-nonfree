import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hr")
public final class Class111 {

	@OriginalMember(owner = "client!hr", name = "c", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	static {
		new Class182("You can report that person under a different rule.", "Diese Person kann bezüglich einer anderen Regel gemeldet werden.", "Vous pouvez signaler cette personne pour une autre infraction aux règles.", "Você não pode denunciar essa pessoa de acordo com uma regra diferente.");
		new Class182("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "Não foi possível adicionar um amigo - jogador desconhecido.");
	}

	@OriginalMember(owner = "client!hr", name = "<init>", descriptor = "()V")
	public Class111() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(III)V")
	private Class111(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lclient!nn;Z[B)V")
	public void method2685(@OriginalArg(0) Class10_Sub8 arg0, @OriginalArg(2) byte[] arg1) {
		if (arg0.aByteArray44[arg0.anInt2989] != 31 || arg0.aByteArray44[arg0.anInt2989 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray44, arg0.anInt2989 + 10, -arg0.anInt2989 + -8 + -10 + arg0.aByteArray44.length);
			this.anInflater1.inflate(arg1);
		} catch (@Pc(62) Exception local62) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
