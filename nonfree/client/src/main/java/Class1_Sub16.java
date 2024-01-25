import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public final class Class1_Sub16 extends Class1 {

	@OriginalMember(owner = "client!gd", name = "n", descriptor = "I")
	public volatile int anInt2994 = -1;

	@OriginalMember(owner = "client!gd", name = "m", descriptor = "Ljava/lang/String;")
	public final String aString65;

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class1_Sub16(@OriginalArg(0) String arg0) {
		this.aString65 = arg0;
	}
}
