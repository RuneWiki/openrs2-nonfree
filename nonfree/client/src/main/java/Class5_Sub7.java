import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public final class Class5_Sub7 extends Class5 {

	@OriginalMember(owner = "client!bn", name = "l", descriptor = "Ljava/lang/String;")
	public String aString19;

	@OriginalMember(owner = "client!bn", name = "<init>", descriptor = "()V")
	private Class5_Sub7() {
	}

	@OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class5_Sub7(@OriginalArg(0) String arg0) {
		this.aString19 = arg0;
	}
}
