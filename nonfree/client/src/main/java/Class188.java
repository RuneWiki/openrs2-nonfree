import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public final class Class188 {

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "I")
	public final int anInt5048;

	static {
		new Class55("clan_chat", "clanchat", "conversation_clan", "clan_chat");
	}

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(II)V")
	public Class188(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5048 = arg0;
	}

	@OriginalMember(owner = "client!pe", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
