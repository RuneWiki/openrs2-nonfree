import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nv")
public final class Class177 {

	@OriginalMember(owner = "client!nv", name = "c", descriptor = "I")
	public final int anInt4871;

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "I")
	public final int anInt4870;

	@OriginalMember(owner = "client!nv", name = "f", descriptor = "I")
	public final int anInt4873;

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "I")
	public final int anInt4869;

	static {
		new Class7("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos");
	}

	@OriginalMember(owner = "client!nv", name = "<init>", descriptor = "(IIII)V")
	public Class177(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4871 = arg0;
		this.anInt4870 = arg3;
		this.anInt4873 = arg1;
		this.anInt4869 = arg2;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(II)Lclient!nv;")
	public Class177 method4036(@OriginalArg(1) int arg0) {
		return new Class177(this.anInt4871, arg0, this.anInt4869, this.anInt4870);
	}
}
