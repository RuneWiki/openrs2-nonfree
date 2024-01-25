import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jda")
public final class Class3_Sub29 extends Class3 {

	@OriginalMember(owner = "client!jda", name = "o", descriptor = "Ljava/lang/String;")
	public String aString27;

	@OriginalMember(owner = "client!jda", name = "<init>", descriptor = "()V")
	private Class3_Sub29() {
	}

	@OriginalMember(owner = "client!jda", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class3_Sub29(@OriginalArg(0) String arg0) {
		this.aString27 = arg0;
	}
}
