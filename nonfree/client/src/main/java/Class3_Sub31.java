import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public final class Class3_Sub31 extends Class3 {

	@OriginalMember(owner = "client!km", name = "q", descriptor = "Ljava/lang/String;")
	public String aString63;

	@OriginalMember(owner = "client!km", name = "<init>", descriptor = "()V")
	private Class3_Sub31() {
	}

	@OriginalMember(owner = "client!km", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class3_Sub31(@OriginalArg(0) String arg0) {
		this.aString63 = arg0;
	}
}
