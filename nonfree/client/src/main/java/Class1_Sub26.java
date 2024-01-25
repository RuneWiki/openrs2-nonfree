import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public final class Class1_Sub26 extends Class1 {

	@OriginalMember(owner = "client!lk", name = "k", descriptor = "Ljava/lang/String;")
	public String aString60;

	@OriginalMember(owner = "client!lk", name = "<init>", descriptor = "()V")
	private Class1_Sub26() {
	}

	@OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class1_Sub26(@OriginalArg(0) String arg0) {
		this.aString60 = arg0;
	}
}
