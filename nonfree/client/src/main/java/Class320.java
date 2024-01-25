import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public final class Class320 {

	@OriginalMember(owner = "client!sv", name = "j", descriptor = "Ljava/lang/String;")
	public final String aString124;

	@OriginalMember(owner = "client!sv", name = "d", descriptor = "Ljava/lang/String;")
	public final String aString123;

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "Ljava/lang/String;")
	public final String aString122;

	@OriginalMember(owner = "client!sv", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public Class320(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		this.aString124 = arg1;
		this.aString123 = arg2;
		this.aString122 = arg0;
	}
}
