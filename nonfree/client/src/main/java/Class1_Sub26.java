import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public final class Class1_Sub26 extends Class1 {

	@OriginalMember(owner = "client!nk", name = "q", descriptor = "Ljava/lang/String;")
	public String aString169;

	@OriginalMember(owner = "client!nk", name = "<init>", descriptor = "()V")
	private Class1_Sub26() {
	}

	@OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class1_Sub26(@OriginalArg(0) String arg0) {
		this.aString169 = arg0;
	}
}
