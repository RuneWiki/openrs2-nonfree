import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public final class Class2_Sub13 extends Class2 {

	@OriginalMember(owner = "client!gd", name = "w", descriptor = "Ljava/lang/String;")
	public String aString89;

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class2_Sub13(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString89 = arg0;
	}
}
