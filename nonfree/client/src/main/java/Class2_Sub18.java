import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public final class Class2_Sub18 extends Class2 {

	@OriginalMember(owner = "client!id", name = "s", descriptor = "I")
	public volatile int anInt2669 = -1;

	@OriginalMember(owner = "client!id", name = "r", descriptor = "Ljava/lang/String;")
	public final String aString26;

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class2_Sub18(@OriginalArg(0) String arg0) {
		this.aString26 = arg0;
	}
}
