import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public final class Class1_Sub15 extends Class1 {

	@OriginalMember(owner = "client!eo", name = "n", descriptor = "I")
	public volatile int anInt2380 = -1;

	@OriginalMember(owner = "client!eo", name = "q", descriptor = "Ljava/lang/String;")
	public final String aString24;

	@OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class1_Sub15(@OriginalArg(0) String arg0) {
		this.aString24 = arg0;
	}
}
