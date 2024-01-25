import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public final class Class4_Sub46 extends Class4 {

	@OriginalMember(owner = "client!tk", name = "l", descriptor = "Ljava/lang/String;")
	public String aString95;

	@OriginalMember(owner = "client!tk", name = "<init>", descriptor = "()V")
	private Class4_Sub46() {
	}

	@OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class4_Sub46(@OriginalArg(0) String arg0) {
		this.aString95 = arg0;
	}
}
