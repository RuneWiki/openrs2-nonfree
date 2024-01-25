import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public final class Class3_Sub48 extends Class3 {

	@OriginalMember(owner = "client!ti", name = "g", descriptor = "Ljava/lang/String;")
	public String aString106;

	@OriginalMember(owner = "client!ti", name = "<init>", descriptor = "()V")
	private Class3_Sub48() {
	}

	@OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class3_Sub48(@OriginalArg(0) String arg0) {
		this.aString106 = arg0;
	}
}
