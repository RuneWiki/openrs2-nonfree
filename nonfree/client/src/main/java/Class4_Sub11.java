import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public final class Class4_Sub11 extends Class4 {

	@OriginalMember(owner = "client!dw", name = "q", descriptor = "Ljava/lang/String;")
	public String aString37;

	@OriginalMember(owner = "client!dw", name = "<init>", descriptor = "()V")
	private Class4_Sub11() {
	}

	@OriginalMember(owner = "client!dw", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class4_Sub11(@OriginalArg(0) String arg0) {
		this.aString37 = arg0;
	}
}
