import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public final class Class1_Sub39 extends Class1 {

	@OriginalMember(owner = "client!rn", name = "p", descriptor = "Ljava/lang/String;")
	public String aString215;

	@OriginalMember(owner = "client!rn", name = "<init>", descriptor = "()V")
	private Class1_Sub39() {
	}

	@OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class1_Sub39(@OriginalArg(0) String arg0) {
		this.aString215 = arg0;
	}
}
