import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public abstract class Class207 {

	static {
		new Class174("clan_chat", "clanchat", "conversation_clan", "clan_chat");
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IBI)[B")
	public abstract byte[] method6071(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!re", name = "a", descriptor = "([BI)V")
	public abstract void method6072(@OriginalArg(0) byte[] arg0);

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(B)[B")
	public abstract byte[] method6075();
}
