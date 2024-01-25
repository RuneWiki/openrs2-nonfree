import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public final class Class8_Sub48 extends Class8 {

	@OriginalMember(owner = "client!va", name = "k", descriptor = "I")
	public volatile int anInt10047 = -1;

	@OriginalMember(owner = "client!va", name = "l", descriptor = "Ljava/lang/String;")
	public final String aString105;

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class8_Sub48(@OriginalArg(0) String arg0) {
		this.aString105 = arg0;
	}
}
