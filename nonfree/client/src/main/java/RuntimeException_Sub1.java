import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public final class RuntimeException_Sub1 extends RuntimeException {

	@OriginalMember(owner = "client!un", name = "b", descriptor = "Ljava/lang/String;")
	public String aString61;

	@OriginalMember(owner = "client!un", name = "a", descriptor = "Ljava/lang/Throwable;")
	public final Throwable aThrowable1;

	static {
		new Class189("clan_chat", "clanchat", "conversation_clan", "clan_chat");
	}

	@OriginalMember(owner = "client!un", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	public RuntimeException_Sub1(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aString61 = arg1;
		this.aThrowable1 = arg0;
	}
}
