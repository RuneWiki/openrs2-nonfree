import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!faa")
public final class Class82 {

	@OriginalMember(owner = "client!faa", name = "d", descriptor = "I")
	public int anInt2616;

	@OriginalMember(owner = "client!faa", name = "b", descriptor = "[I")
	public final int[] anIntArray262;

	@OriginalMember(owner = "client!faa", name = "c", descriptor = "[I")
	public final int[] anIntArray263;

	static {
		new Class67("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos");
	}

	@OriginalMember(owner = "client!faa", name = "<init>", descriptor = "(I)V")
	public Class82(@OriginalArg(0) int arg0) {
		this.anInt2616 = arg0;
		this.anIntArray262 = new int[this.anInt2616];
		this.anIntArray263 = new int[this.anInt2616];
	}
}
