import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public final class Class4_Sub46 extends Class4 {

	@OriginalMember(owner = "client!ts", name = "h", descriptor = "Ljava/lang/String;")
	public String aString110;

	@OriginalMember(owner = "client!ts", name = "<init>", descriptor = "()V")
	private Class4_Sub46() {
	}

	@OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class4_Sub46(@OriginalArg(0) String arg0) {
		this.aString110 = arg0;
	}
}
