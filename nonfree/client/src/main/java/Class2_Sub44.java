import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public final class Class2_Sub44 extends Class2 {

	@OriginalMember(owner = "client!vn", name = "m", descriptor = "I")
	public volatile int anInt7320 = -1;

	@OriginalMember(owner = "client!vn", name = "o", descriptor = "Ljava/lang/String;")
	public final String aString69;

	static {
		new Class91("", 76);
	}

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class2_Sub44(@OriginalArg(0) String arg0) {
		this.aString69 = arg0;
	}
}
