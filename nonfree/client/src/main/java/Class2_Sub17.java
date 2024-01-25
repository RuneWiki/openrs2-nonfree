import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public final class Class2_Sub17 extends Class2 {

	@OriginalMember(owner = "client!gp", name = "h", descriptor = "Ljava/lang/String;")
	public String aString37;

	@OriginalMember(owner = "client!gp", name = "<init>", descriptor = "()V")
	private Class2_Sub17() {
	}

	@OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class2_Sub17(@OriginalArg(0) String arg0) {
		this.aString37 = arg0;
	}
}
