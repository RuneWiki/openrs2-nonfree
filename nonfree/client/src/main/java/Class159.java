import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public abstract class Class159 {

	static {
		new Class231("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.", "Échangez ce reçu contre l'objet correspondant dans la banque de votre choix.", "Vá a qualquer banco para trocar esta nota pelo objeto equivalente.");
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(ILclient!mh;)Lclient!mh;")
	public abstract Class2_Sub1_Sub11 method3126(@OriginalArg(1) Class2_Sub1_Sub11 arg0);
}
