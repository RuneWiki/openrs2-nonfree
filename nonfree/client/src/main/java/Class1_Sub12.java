import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public final class Class1_Sub12 extends Class1 {

	@OriginalMember(owner = "client!dl", name = "k", descriptor = "Ljava/lang/String;")
	public String aString11;

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "()V")
	private Class1_Sub12() {
	}

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class1_Sub12(@OriginalArg(0) String arg0) {
		this.aString11 = arg0;
	}
}
