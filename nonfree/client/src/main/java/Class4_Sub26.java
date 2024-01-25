import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public final class Class4_Sub26 extends Class4 {

	@OriginalMember(owner = "client!lh", name = "r", descriptor = "Ljava/lang/String;")
	public String aString35;

	@OriginalMember(owner = "client!lh", name = "<init>", descriptor = "()V")
	private Class4_Sub26() {
	}

	@OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class4_Sub26(@OriginalArg(0) String arg0) {
		this.aString35 = arg0;
	}
}
