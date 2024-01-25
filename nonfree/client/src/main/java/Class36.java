import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public final class Class36 {

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "I")
	private final int anInt1506;

	static {
		new Class242("Chat disabled", "Deaktiviert", "Messagerie désactivée", "Bate-papo desativado");
	}

	@OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(II)V")
	public Class36(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1506 = arg0;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)I")
	public int method1136() {
		return this.anInt1506;
	}

	@OriginalMember(owner = "client!cm", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
