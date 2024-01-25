import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public final class Class306 {

	@OriginalMember(owner = "client!vt", name = "b", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray42;

	static {
		new Class306("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.", "Échangez ce reçu contre l'objet correspondant dans la banque de votre choix.", "Vá a qualquer banco para trocar esta nota pelo objeto equivalente.");
	}

	@OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public Class306(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3) {
		this.aStringArray42 = new String[] { arg0, arg1, arg2, arg3 };
	}

	@OriginalMember(owner = "client!vt", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!vt", name = "b", descriptor = "(II)Ljava/lang/String;")
	public String method7165(@OriginalArg(0) int arg0) {
		return this.aStringArray42[arg0];
	}
}
