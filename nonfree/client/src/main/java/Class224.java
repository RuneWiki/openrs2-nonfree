import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oda")
public final class Class224 {

	@OriginalMember(owner = "client!oda", name = "i", descriptor = "Ljava/lang/String;")
	public final String aString79;

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "Ljava/lang/String;")
	public final String aString77;

	@OriginalMember(owner = "client!oda", name = "h", descriptor = "Ljava/lang/String;")
	public final String aString78;

	@OriginalMember(owner = "client!oda", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public Class224(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		this.aString79 = arg1;
		this.aString77 = arg2;
		this.aString78 = arg0;
	}
}
