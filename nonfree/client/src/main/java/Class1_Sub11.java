import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public final class Class1_Sub11 extends Class1 {

	@OriginalMember(owner = "client!gd", name = "q", descriptor = "Ljava/lang/String;")
	public String aString128;

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class1_Sub11(@OriginalArg(0) String arg0) {
		this.aString128 = arg0;
	}
}
