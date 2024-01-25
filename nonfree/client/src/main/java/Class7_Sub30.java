import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public final class Class7_Sub30 extends Class7 {

	@OriginalMember(owner = "client!pf", name = "q", descriptor = "Ljava/lang/String;")
	public String aString300;

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "()V")
	private Class7_Sub30() {
	}

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class7_Sub30(@OriginalArg(0) String arg0) {
		this.aString300 = arg0;
	}
}
