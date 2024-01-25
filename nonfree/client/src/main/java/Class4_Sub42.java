import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public final class Class4_Sub42 extends Class4 {

	@OriginalMember(owner = "client!va", name = "m", descriptor = "I")
	public volatile int anInt6883 = -1;

	@OriginalMember(owner = "client!va", name = "n", descriptor = "Ljava/lang/String;")
	public final String aString69;

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class4_Sub42(@OriginalArg(0) String arg0) {
		this.aString69 = arg0;
	}
}
