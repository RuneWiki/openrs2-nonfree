import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public final class Class1_Sub36 extends Class1 {

	@OriginalMember(owner = "client!pn", name = "i", descriptor = "I")
	public volatile int anInt6597 = -1;

	@OriginalMember(owner = "client!pn", name = "l", descriptor = "Ljava/lang/String;")
	public final String aString61;

	@OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class1_Sub36(@OriginalArg(0) String arg0) {
		this.aString61 = arg0;
	}
}
