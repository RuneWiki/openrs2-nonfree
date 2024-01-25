import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public final class Class182 {

	@OriginalMember(owner = "client!os", name = "f", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray34;

	static {
		new Class182("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos");
	}

	@OriginalMember(owner = "client!os", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public Class182(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3) {
		this.aStringArray34 = new String[] { arg0, arg1, arg2, arg3 };
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(II)Ljava/lang/String;")
	public String method4155(@OriginalArg(0) int arg0) {
		return this.aStringArray34[arg0];
	}

	@OriginalMember(owner = "client!os", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
