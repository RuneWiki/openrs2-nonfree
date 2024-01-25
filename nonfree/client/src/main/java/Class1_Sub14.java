import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public final class Class1_Sub14 extends Class1 {

	@OriginalMember(owner = "client!fq", name = "p", descriptor = "I")
	public int anInt2795;

	static {
		new Class45("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.", "Échangez ce reçu contre l'objet correspondant dans la banque de votre choix.", "Vá a qualquer banco para trocar esta nota pelo objeto equivalente.");
	}

	@OriginalMember(owner = "client!fq", name = "<init>", descriptor = "()V")
	private Class1_Sub14() {
	}

	@OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(I)V")
	public Class1_Sub14(@OriginalArg(0) int arg0) {
		this.anInt2795 = arg0;
	}
}
