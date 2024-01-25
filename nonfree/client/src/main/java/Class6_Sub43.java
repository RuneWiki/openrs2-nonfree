import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public final class Class6_Sub43 extends Class6 {

	@OriginalMember(owner = "client!po", name = "m", descriptor = "Ljava/lang/String;")
	public String aString89;

	@OriginalMember(owner = "client!po", name = "<init>", descriptor = "()V")
	private Class6_Sub43() {
	}

	@OriginalMember(owner = "client!po", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class6_Sub43(@OriginalArg(0) String arg0) {
		this.aString89 = arg0;
	}
}
