import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public final class Class2_Sub17 extends Class2 {

	@OriginalMember(owner = "client!im", name = "p", descriptor = "Ljava/lang/String;")
	public String aString98;

	@OriginalMember(owner = "client!im", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class2_Sub17(@OriginalArg(0) String arg0) {
		this.aString98 = arg0;
	}
}
