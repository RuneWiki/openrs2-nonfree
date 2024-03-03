import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public final class Class210 {

	@OriginalMember(owner = "client!s", name = "b", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_204 = new Class145(22, 7);

	@OriginalMember(owner = "client!s", name = "g", descriptor = "I")
	public static int anInt5799 = 0;

	@OriginalMember(owner = "client!s", name = "e", descriptor = "Lclient!gd;")
	public static final Class79 aClass79_122 = new Class79("Allocating memory", "Speicher wird zugewiesen.", "Mémoire en cours d'attribution", "Alocando memória");

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "(II)V", line = 38)
	public Class210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!s", name = "toString", descriptor = "()Ljava/lang/String;", line = 10)
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
