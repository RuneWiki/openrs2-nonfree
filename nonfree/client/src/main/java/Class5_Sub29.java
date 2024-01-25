import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public final class Class5_Sub29 extends Class5 {

	@OriginalMember(owner = "client!ie", name = "n", descriptor = "I")
	public volatile int anInt4567 = -1;

	@OriginalMember(owner = "client!ie", name = "q", descriptor = "Ljava/lang/String;")
	public final String aString33;

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class5_Sub29(@OriginalArg(0) String arg0) {
		this.aString33 = arg0;
	}
}
