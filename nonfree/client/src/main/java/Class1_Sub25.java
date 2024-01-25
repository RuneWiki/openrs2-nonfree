import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public final class Class1_Sub25 extends Class1 {

	@OriginalMember(owner = "client!jr", name = "o", descriptor = "Ljava/lang/String;")
	public String aString39;

	@OriginalMember(owner = "client!jr", name = "<init>", descriptor = "()V")
	private Class1_Sub25() {
	}

	@OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class1_Sub25(@OriginalArg(0) String arg0) {
		this.aString39 = arg0;
	}
}
