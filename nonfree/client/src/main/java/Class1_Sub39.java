import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public final class Class1_Sub39 extends Class1 {

	@OriginalMember(owner = "client!vh", name = "n", descriptor = "I")
	public volatile int anInt6392 = -1;

	@OriginalMember(owner = "client!vh", name = "r", descriptor = "Ljava/lang/String;")
	public final String aString62;

	@OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class1_Sub39(@OriginalArg(0) String arg0) {
		this.aString62 = arg0;
	}
}
