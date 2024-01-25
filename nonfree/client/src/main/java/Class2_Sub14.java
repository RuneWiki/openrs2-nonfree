import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public final class Class2_Sub14 extends Class2 {

	@OriginalMember(owner = "client!em", name = "p", descriptor = "Ljava/lang/String;")
	public String aString15;

	@OriginalMember(owner = "client!em", name = "<init>", descriptor = "()V")
	private Class2_Sub14() {
	}

	@OriginalMember(owner = "client!em", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class2_Sub14(@OriginalArg(0) String arg0) {
		this.aString15 = arg0;
	}
}
