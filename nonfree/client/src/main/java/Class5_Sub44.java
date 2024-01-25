import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public final class Class5_Sub44 extends Class5 {

	@OriginalMember(owner = "client!qj", name = "l", descriptor = "Ljava/lang/String;")
	public String aString83;

	@OriginalMember(owner = "client!qj", name = "<init>", descriptor = "()V")
	private Class5_Sub44() {
	}

	@OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class5_Sub44(@OriginalArg(0) String arg0) {
		this.aString83 = arg0;
	}
}
