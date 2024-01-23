import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public final class Class8_Sub7 extends Class8 {

	@OriginalMember(owner = "client!ci", name = "n", descriptor = "Ljava/lang/String;")
	public String aString35;

	@OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class8_Sub7(@OriginalArg(0) String arg0) {
		this.aString35 = arg0;
	}
}
