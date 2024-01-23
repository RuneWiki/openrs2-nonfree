import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public final class Class1_Sub18 extends Class1 {

	@OriginalMember(owner = "client!mn", name = "z", descriptor = "Ljava/lang/String;")
	public String aString250;

	@OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class1_Sub18(@OriginalArg(0) String arg0) {
		this.aString250 = arg0;
	}
}
