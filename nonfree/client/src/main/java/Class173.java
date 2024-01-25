import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nl")
public final class Class173 {

	@OriginalMember(owner = "client!nl", name = "d", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	static {
		new Class198("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs chargée", "Dados da lista de mundos carregados");
	}

	@OriginalMember(owner = "client!nl", name = "<init>", descriptor = "()V")
	public Class173() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(III)V")
	private Class173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "([BZLclient!fh;)V")
	public void method3472(@OriginalArg(0) byte[] arg0, @OriginalArg(2) Class5_Sub15 arg1) {
		if (arg1.aByteArray93[arg1.anInt7013] != 31 || arg1.aByteArray93[arg1.anInt7013 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg1.aByteArray93, arg1.anInt7013 + 10, -arg1.anInt7013 + -10 + -8 + arg1.aByteArray93.length);
			this.anInflater1.inflate(arg0);
		} catch (@Pc(70) Exception local70) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
