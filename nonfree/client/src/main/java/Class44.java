import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public final class Class44 {

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "I")
	public final int anInt793;

	static {
		new Class96(null, "Mitglieder können 200 Freunde hinzufügen, freie Spieler nur 100.", null, null);
	}

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(II)V")
	public Class44(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt793 = arg0;
	}

	@OriginalMember(owner = "client!ck", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
