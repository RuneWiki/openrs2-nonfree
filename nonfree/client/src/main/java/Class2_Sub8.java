import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public final class Class2_Sub8 extends Class2 {

	@OriginalMember(owner = "client!bk", name = "u", descriptor = "Ljava/lang/String;")
	public String aString8;

	@OriginalMember(owner = "client!bk", name = "<init>", descriptor = "()V")
	private Class2_Sub8() {
	}

	@OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class2_Sub8(@OriginalArg(0) String arg0) {
		this.aString8 = arg0;
	}
}
