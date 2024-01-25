import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public final class Class4_Sub25 extends Class4 {

	@OriginalMember(owner = "client!kc", name = "n", descriptor = "Ljava/lang/String;")
	public String aString45;

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V")
	private Class4_Sub25() {
	}

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class4_Sub25(@OriginalArg(0) String arg0) {
		this.aString45 = arg0;
	}
}
