import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bv")
public final class Class33 {

	@OriginalMember(owner = "client!bv", name = "d", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	static {
		new Class209("Unable to add friend - system busy.", "Der Freund konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un ami - système occupé.", "Não foi possível adicionar o amigo. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!bv", name = "<init>", descriptor = "(III)V")
	private Class33(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!bv", name = "<init>", descriptor = "()V")
	public Class33() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(BLclient!si;[B)V")
	public void method597(@OriginalArg(1) Class2_Sub23 arg0, @OriginalArg(2) byte[] arg1) {
		if (arg0.aByteArray130[arg0.anInt6952] != 31 || arg0.aByteArray130[arg0.anInt6952 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray130, arg0.anInt6952 + 10, -18 - (arg0.anInt6952 - arg0.aByteArray130.length));
			this.anInflater1.inflate(arg1);
		} catch (@Pc(66) Exception local66) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
