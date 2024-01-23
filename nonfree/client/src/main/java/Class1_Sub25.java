import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public final class Class1_Sub25 extends Class1 {

	@OriginalMember(owner = "client!qg", name = "n", descriptor = "Ljava/lang/String;")
	public String aString147;

	@OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class1_Sub25(@OriginalArg(0) String arg0) {
		this.aString147 = arg0;
	}
}
