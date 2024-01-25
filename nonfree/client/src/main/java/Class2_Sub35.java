import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!naa")
public final class Class2_Sub35 extends Class2 {

	@OriginalMember(owner = "client!naa", name = "h", descriptor = "I")
	public volatile int anInt6568 = -1;

	@OriginalMember(owner = "client!naa", name = "i", descriptor = "Ljava/lang/String;")
	public final String aString63;

	@OriginalMember(owner = "client!naa", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class2_Sub35(@OriginalArg(0) String arg0) {
		this.aString63 = arg0;
	}
}
