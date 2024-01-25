import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public final class Class5_Sub11 extends Class5 {

	@OriginalMember(owner = "client!c", name = "s", descriptor = "Ljava/lang/String;")
	public String aString8;

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "()V")
	private Class5_Sub11() {
	}

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class5_Sub11(@OriginalArg(0) String arg0) {
		this.aString8 = arg0;
	}
}
