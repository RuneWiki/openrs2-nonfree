import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public final class Class290 {

	@OriginalMember(owner = "client!po", name = "k", descriptor = "I")
	public final int anInt7535;

	@OriginalMember(owner = "client!po", name = "f", descriptor = "Ljava/lang/String;")
	public final String aString91;

	@OriginalMember(owner = "client!po", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V")
	public Class290(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		this.anInt7535 = arg2;
		this.aString91 = arg0;
	}

	@OriginalMember(owner = "client!po", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
