import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public final class Class100 {

	@OriginalMember(owner = "client!f", name = "e", descriptor = "Ljava/lang/String;")
	public final String aString24;

	@OriginalMember(owner = "client!f", name = "f", descriptor = "Ljava/lang/String;")
	public final String aString25;

	@OriginalMember(owner = "client!f", name = "c", descriptor = "Ljava/lang/String;")
	public final String aString23;

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public Class100(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		this.aString24 = arg2;
		this.aString25 = arg0;
		this.aString23 = arg1;
	}
}
