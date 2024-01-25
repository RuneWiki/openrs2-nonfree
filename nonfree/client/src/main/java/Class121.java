import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public final class Class121 {

	@OriginalMember(owner = "client!jk", name = "h", descriptor = "Ljava/lang/String;")
	public final String aString36;

	@OriginalMember(owner = "client!jk", name = "c", descriptor = "I")
	public final int anInt3570;

	static {
		new Class83("Attempting to join channel...", "Chatraum wird betreten...", "Tentative de connexion au canal...", "Tentando acessar canal...");
	}

	@OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class121(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString36 = arg0;
		this.anInt3570 = arg1;
	}

	@OriginalMember(owner = "client!jk", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
