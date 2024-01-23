import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public final class Class2_Sub16 extends Class2 {

	@OriginalMember(owner = "client!me", name = "B", descriptor = "Ljava/lang/String;")
	public String aString160;

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class2_Sub16(@OriginalArg(0) String arg0) {
		this.aString160 = arg0;
	}
}
