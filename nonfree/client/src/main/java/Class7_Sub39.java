import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public final class Class7_Sub39 extends Class7 {

	@OriginalMember(owner = "client!uq", name = "p", descriptor = "I")
	public volatile int anInt6210 = -1;

	@OriginalMember(owner = "client!uq", name = "o", descriptor = "Ljava/lang/String;")
	public final String aString406;

	@OriginalMember(owner = "client!uq", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class7_Sub39(@OriginalArg(0) String arg0) {
		this.aString406 = arg0;
	}
}
