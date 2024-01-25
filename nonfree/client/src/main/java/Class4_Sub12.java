import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public final class Class4_Sub12 extends Class4 {

	@OriginalMember(owner = "client!dt", name = "p", descriptor = "Ljava/lang/String;")
	public String aString12;

	@OriginalMember(owner = "client!dt", name = "<init>", descriptor = "()V")
	private Class4_Sub12() {
	}

	@OriginalMember(owner = "client!dt", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class4_Sub12(@OriginalArg(0) String arg0) {
		this.aString12 = arg0;
	}
}
