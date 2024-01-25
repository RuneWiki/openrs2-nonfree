import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public final class Class1_Sub8 extends Class1 {

	@OriginalMember(owner = "client!dl", name = "t", descriptor = "Ljava/lang/String;")
	public String aString9;

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "()V")
	private Class1_Sub8() {
	}

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class1_Sub8(@OriginalArg(0) String arg0) {
		this.aString9 = arg0;
	}
}
