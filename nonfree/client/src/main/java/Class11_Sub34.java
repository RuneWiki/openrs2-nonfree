import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public final class Class11_Sub34 extends Class11 {

	@OriginalMember(owner = "client!rn", name = "k", descriptor = "I")
	public volatile int anInt5507 = -1;

	@OriginalMember(owner = "client!rn", name = "l", descriptor = "Ljava/lang/String;")
	public final String aString54;

	static {
		new Class117("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitté le canal.", "Você saiu do canal.");
	}

	@OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class11_Sub34(@OriginalArg(0) String arg0) {
		this.aString54 = arg0;
	}
}
