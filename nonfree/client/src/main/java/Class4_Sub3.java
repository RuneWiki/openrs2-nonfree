import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public final class Class4_Sub3 extends Class4 {

	@OriginalMember(owner = "client!ak", name = "p", descriptor = "I")
	public int anInt207;

	@OriginalMember(owner = "client!ak", name = "q", descriptor = "I")
	public int anInt208;

	@OriginalMember(owner = "client!ak", name = "r", descriptor = "I")
	public int anInt209;

	@OriginalMember(owner = "client!ak", name = "v", descriptor = "I")
	public int anInt212;

	@OriginalMember(owner = "client!ak", name = "x", descriptor = "I")
	public int anInt214;

	@OriginalMember(owner = "client!ak", name = "s", descriptor = "I")
	public int anInt210 = -1;

	@OriginalMember(owner = "client!ak", name = "o", descriptor = "Z")
	public boolean aBoolean20 = false;

	static {
		new Class159(null, "Dieses System darf nicht missbraucht werden!", null, null);
		new Class159("I can't reach that!", "Da kommst du nicht hin.", "Je ne peux pas l'atteindre !", "Não consigo alcançar!");
	}

	@OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(I)V")
	public Class4_Sub3(@OriginalArg(0) int arg0) {
		this.anInt210 = arg0;
	}
}
