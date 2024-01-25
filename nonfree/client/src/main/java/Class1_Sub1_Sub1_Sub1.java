import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public final class Class1_Sub1_Sub1_Sub1 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!cj", name = "u", descriptor = "Ljava/lang/Object;")
	private final Object anObject1;

	static {
		new Class306("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs chargée", "Dados da lista de mundos carregados");
	}

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(Lclient!maa;Ljava/lang/Object;I)V")
	public Class1_Sub1_Sub1_Sub1(@OriginalArg(0) Interface6 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject1 = arg1;
	}

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method4834() {
		return false;
	}

	@OriginalMember(owner = "client!cj", name = "c", descriptor = "(Z)Ljava/lang/Object;")
	@Override
	public Object method4835() {
		return this.anObject1;
	}
}
