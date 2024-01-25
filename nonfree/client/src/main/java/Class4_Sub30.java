import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public final class Class4_Sub30 extends Class4 {

	@OriginalMember(owner = "client!mo", name = "p", descriptor = "Ljava/lang/String;")
	public String aString146;

	@OriginalMember(owner = "client!mo", name = "<init>", descriptor = "()V")
	private Class4_Sub30() {
	}

	@OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class4_Sub30(@OriginalArg(0) String arg0) {
		this.aString146 = arg0;
	}
}
