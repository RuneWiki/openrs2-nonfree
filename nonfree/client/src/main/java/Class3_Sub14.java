import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cha")
public final class Class3_Sub14 extends Class3 {

	@OriginalMember(owner = "client!cha", name = "n", descriptor = "I")
	public volatile int anInt1404 = -1;

	@OriginalMember(owner = "client!cha", name = "m", descriptor = "Ljava/lang/String;")
	public final String aString11;

	@OriginalMember(owner = "client!cha", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class3_Sub14(@OriginalArg(0) String arg0) {
		this.aString11 = arg0;
	}
}
