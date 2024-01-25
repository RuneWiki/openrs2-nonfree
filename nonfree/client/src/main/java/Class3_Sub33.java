import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public final class Class3_Sub33 extends Class3 {

	@OriginalMember(owner = "client!oh", name = "v", descriptor = "I")
	public volatile int anInt4563 = -1;

	@OriginalMember(owner = "client!oh", name = "w", descriptor = "Ljava/lang/String;")
	public final String aString171;

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class3_Sub33(@OriginalArg(0) String arg0) {
		this.aString171 = arg0;
	}
}
