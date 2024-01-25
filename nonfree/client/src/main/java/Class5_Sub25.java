import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public final class Class5_Sub25 extends Class5 {

	@OriginalMember(owner = "client!mh", name = "u", descriptor = "Ljava/lang/String;")
	public String aString27;

	@OriginalMember(owner = "client!mh", name = "<init>", descriptor = "()V")
	private Class5_Sub25() {
	}

	@OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class5_Sub25(@OriginalArg(0) String arg0) {
		this.aString27 = arg0;
	}
}
