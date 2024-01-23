import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public final class Class4_Sub17 extends Class4 {

	@OriginalMember(owner = "client!hg", name = "n", descriptor = "Ljava/lang/String;")
	public String aString77;

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class4_Sub17(@OriginalArg(0) String arg0) {
		this.aString77 = arg0;
	}
}
