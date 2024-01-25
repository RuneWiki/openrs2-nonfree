import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public final class Class2_Sub36 extends Class2 {

	@OriginalMember(owner = "client!qq", name = "m", descriptor = "I")
	public volatile int anInt5667 = -1;

	@OriginalMember(owner = "client!qq", name = "n", descriptor = "Ljava/lang/String;")
	public final String aString53;

	@OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class2_Sub36(@OriginalArg(0) String arg0) {
		this.aString53 = arg0;
	}
}
