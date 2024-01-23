import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public final class Class4_Sub27 extends Class4 {

	@OriginalMember(owner = "client!sd", name = "m", descriptor = "Ljava/lang/String;")
	public String aString156;

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class4_Sub27(@OriginalArg(0) String arg0) {
		this.aString156 = arg0;
	}
}
