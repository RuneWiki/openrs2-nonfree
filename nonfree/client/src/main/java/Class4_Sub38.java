import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public final class Class4_Sub38 extends Class4 {

	@OriginalMember(owner = "client!sk", name = "k", descriptor = "Ljava/lang/String;")
	public String aString65;

	@OriginalMember(owner = "client!sk", name = "<init>", descriptor = "()V")
	private Class4_Sub38() {
	}

	@OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class4_Sub38(@OriginalArg(0) String arg0) {
		this.aString65 = arg0;
	}
}
