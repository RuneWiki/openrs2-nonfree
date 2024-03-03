import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public final class Class89 {

	@OriginalMember(owner = "client!h", name = "b", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_89 = new Class145(12, 8);

	@OriginalMember(owner = "client!h", name = "g", descriptor = "Z")
	public static volatile boolean aBoolean176 = false;

	@OriginalMember(owner = "client!h", name = "h", descriptor = "Lclient!gd;")
	public static final Class79 aClass79_54 = new Class79("You can't add yourself to your own friend list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.");

	@OriginalMember(owner = "client!h", name = "f", descriptor = "I")
	public final int anInt2402;

	@OriginalMember(owner = "client!h", name = "e", descriptor = "I")
	private final int anInt2401;

	@OriginalMember(owner = "client!h", name = "<init>", descriptor = "(II)V", line = 155)
	public Class89(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2402 = arg1;
		this.anInt2401 = arg0;
	}

	@OriginalMember(owner = "client!h", name = "toString", descriptor = "()Ljava/lang/String;", line = 17)
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(B)I", line = 144)
	public int method2401() {
		return this.anInt2401;
	}
}
