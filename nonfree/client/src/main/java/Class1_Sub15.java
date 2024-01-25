import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public final class Class1_Sub15 extends Class1 {

	@OriginalMember(owner = "client!h", name = "u", descriptor = "I")
	public volatile int anInt2305 = -1;

	@OriginalMember(owner = "client!h", name = "s", descriptor = "Ljava/lang/String;")
	public final String aString94;

	@OriginalMember(owner = "client!h", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class1_Sub15(@OriginalArg(0) String arg0) {
		this.aString94 = arg0;
	}
}
