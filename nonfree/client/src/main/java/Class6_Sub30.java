import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public final class Class6_Sub30 extends Class6 {

	@OriginalMember(owner = "client!jd", name = "n", descriptor = "Ljava/lang/String;")
	public String aString55;

	@OriginalMember(owner = "client!jd", name = "<init>", descriptor = "()V")
	private Class6_Sub30() {
	}

	@OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class6_Sub30(@OriginalArg(0) String arg0) {
		this.aString55 = arg0;
	}
}
