import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!taa")
public final class Class1_Sub45 extends Class1 {

	@OriginalMember(owner = "client!taa", name = "i", descriptor = "I")
	public volatile int anInt8349 = -1;

	@OriginalMember(owner = "client!taa", name = "p", descriptor = "Ljava/lang/String;")
	public final String aString87;

	@OriginalMember(owner = "client!taa", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class1_Sub45(@OriginalArg(0) String arg0) {
		this.aString87 = arg0;
	}
}
