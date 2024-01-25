import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public final class Class3_Sub37 extends Class3 {

	@OriginalMember(owner = "client!ru", name = "r", descriptor = "Ljava/lang/String;")
	public String aString58;

	@OriginalMember(owner = "client!ru", name = "<init>", descriptor = "()V")
	private Class3_Sub37() {
	}

	@OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class3_Sub37(@OriginalArg(0) String arg0) {
		this.aString58 = arg0;
	}
}
