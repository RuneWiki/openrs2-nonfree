import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nga")
public final class Class2_Sub32 extends Class2 {

	@OriginalMember(owner = "client!nga", name = "p", descriptor = "I")
	public volatile int anInt5896 = -1;

	@OriginalMember(owner = "client!nga", name = "l", descriptor = "Ljava/lang/String;")
	public final String aString77;

	@OriginalMember(owner = "client!nga", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class2_Sub32(@OriginalArg(0) String arg0) {
		this.aString77 = arg0;
	}
}
