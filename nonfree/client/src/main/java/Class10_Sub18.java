import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public final class Class10_Sub18 extends Class10 {

	@OriginalMember(owner = "client!fu", name = "m", descriptor = "Ljava/lang/String;")
	public String aString15;

	@OriginalMember(owner = "client!fu", name = "<init>", descriptor = "()V")
	private Class10_Sub18() {
	}

	@OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class10_Sub18(@OriginalArg(0) String arg0) {
		this.aString15 = arg0;
	}
}
