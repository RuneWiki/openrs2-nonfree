import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public final class Class5_Sub40 extends Class5 {

	@OriginalMember(owner = "client!tg", name = "t", descriptor = "I")
	public volatile int anInt6005 = -1;

	@OriginalMember(owner = "client!tg", name = "w", descriptor = "Ljava/lang/String;")
	public final String aString57;

	@OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class5_Sub40(@OriginalArg(0) String arg0) {
		this.aString57 = arg0;
	}
}
