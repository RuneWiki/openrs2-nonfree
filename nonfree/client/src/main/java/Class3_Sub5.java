import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aea")
public final class Class3_Sub5 extends Class3 {

	@OriginalMember(owner = "client!aea", name = "s", descriptor = "I")
	public volatile int anInt124 = -1;

	@OriginalMember(owner = "client!aea", name = "m", descriptor = "Ljava/lang/String;")
	public final String aString3;

	@OriginalMember(owner = "client!aea", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class3_Sub5(@OriginalArg(0) String arg0) {
		this.aString3 = arg0;
	}
}
