import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tba")
public final class Class2_Sub43 extends Class2 {

	@OriginalMember(owner = "client!tba", name = "m", descriptor = "Ljava/lang/String;")
	public String aString166;

	@OriginalMember(owner = "client!tba", name = "<init>", descriptor = "()V")
	private Class2_Sub43() {
	}

	@OriginalMember(owner = "client!tba", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class2_Sub43(@OriginalArg(0) String arg0) {
		this.aString166 = arg0;
	}
}
