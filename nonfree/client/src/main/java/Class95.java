import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public final class Class95 {

	@OriginalMember(owner = "client!go", name = "g", descriptor = "Ljava/lang/String;")
	public final String aString24;

	@OriginalMember(owner = "client!go", name = "b", descriptor = "I")
	public final int anInt2635;

	static {
		new Class242("clan_chat", "clanchat", "conversation_clan", "clan_chat");
	}

	@OriginalMember(owner = "client!go", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class95(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString24 = arg0;
		this.anInt2635 = arg1;
	}

	@OriginalMember(owner = "client!go", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
