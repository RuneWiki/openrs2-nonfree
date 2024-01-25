import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public final class Class1_Sub34 extends Class1 {

	@OriginalMember(owner = "client!ml", name = "m", descriptor = "I")
	public volatile int anInt5530 = -1;

	@OriginalMember(owner = "client!ml", name = "n", descriptor = "Ljava/lang/String;")
	public final String aString52;

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class1_Sub34(@OriginalArg(0) String arg0) {
		this.aString52 = arg0;
	}
}
