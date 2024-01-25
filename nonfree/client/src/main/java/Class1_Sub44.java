import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public final class Class1_Sub44 extends Class1 {

	@OriginalMember(owner = "client!sm", name = "m", descriptor = "Ljava/lang/String;")
	public String aString91;

	@OriginalMember(owner = "client!sm", name = "<init>", descriptor = "()V")
	private Class1_Sub44() {
	}

	@OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class1_Sub44(@OriginalArg(0) String arg0) {
		this.aString91 = arg0;
	}
}
