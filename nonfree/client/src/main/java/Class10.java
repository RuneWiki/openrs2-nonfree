import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public abstract class Class10 {

	static {
		new Class85("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.", "Échangez ce reçu contre l'objet correspondant dans la banque de votre choix.", "Vá a qualquer banco para trocar esta nota pelo objeto equivalente.");
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)I")
	public abstract int method3935(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(B)J")
	public abstract long method3937();

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(B)V")
	public abstract void method3939();
}
