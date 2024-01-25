import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public final class Class35 {

	@OriginalMember(owner = "client!co", name = "a", descriptor = "I")
	public final int anInt1109;

	static {
		new Class174(null, "Mitglieder können 200 Freunde hinzufügen, freie Spieler nur 100.", null, null);
	}

	@OriginalMember(owner = "client!co", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class35(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt1109 = arg1;
	}

	@OriginalMember(owner = "client!co", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
