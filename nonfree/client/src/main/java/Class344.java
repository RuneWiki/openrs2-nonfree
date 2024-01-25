import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public final class Class344 {

	@OriginalMember(owner = "client!vc", name = "e", descriptor = "Ljava/lang/String;")
	public final String aString124;

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "Ljava/lang/String;")
	public final String aString123;

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "Ljava/lang/String;")
	public final String aString122;

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public Class344(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		this.aString124 = arg0;
		this.aString123 = arg1;
		this.aString122 = arg2;
	}
}
