import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public final class Class1_Sub27 extends Class1 {

	@OriginalMember(owner = "client!qj", name = "p", descriptor = "Ljava/lang/String;")
	public String aString255;

	@OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class1_Sub27(@OriginalArg(0) String arg0) {
		this.aString255 = arg0;
	}
}
