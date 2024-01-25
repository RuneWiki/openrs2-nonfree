import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public final class Class1_Sub3_Sub20 extends Class1_Sub3 {

	static {
		new Class114("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos");
	}

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub20() {
		super(0, true);
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method7906(@OriginalArg(0) int arg0) {
		return Static201.anIntArray324;
	}
}
