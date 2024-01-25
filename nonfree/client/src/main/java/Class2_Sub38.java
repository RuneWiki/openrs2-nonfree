import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public final class Class2_Sub38 extends Class2 {

	@OriginalMember(owner = "client!nu", name = "j", descriptor = "Ljava/lang/String;")
	public String aString68;

	@OriginalMember(owner = "client!nu", name = "<init>", descriptor = "()V")
	private Class2_Sub38() {
	}

	@OriginalMember(owner = "client!nu", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class2_Sub38(@OriginalArg(0) String arg0) {
		this.aString68 = arg0;
	}
}
