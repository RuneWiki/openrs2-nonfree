import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public final class Class3_Sub40 extends Class3 {

	@OriginalMember(owner = "client!qm", name = "t", descriptor = "I")
	public volatile int anInt7397 = -1;

	@OriginalMember(owner = "client!qm", name = "q", descriptor = "Ljava/lang/String;")
	public final String aString60;

	@OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class3_Sub40(@OriginalArg(0) String arg0) {
		this.aString60 = arg0;
	}
}
