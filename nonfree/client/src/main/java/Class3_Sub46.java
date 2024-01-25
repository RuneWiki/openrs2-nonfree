import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rca")
public final class Class3_Sub46 extends Class3 {

	@OriginalMember(owner = "client!rca", name = "t", descriptor = "Ljava/lang/String;")
	public String aString217;

	@OriginalMember(owner = "client!rca", name = "<init>", descriptor = "()V")
	private Class3_Sub46() {
	}

	@OriginalMember(owner = "client!rca", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class3_Sub46(@OriginalArg(0) String arg0) {
		this.aString217 = arg0;
	}
}
