import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uia")
public final class Class359 {

	@OriginalMember(owner = "client!uia", name = "g", descriptor = "Ljava/lang/String;")
	public final String aString106;

	@OriginalMember(owner = "client!uia", name = "d", descriptor = "Ljava/lang/String;")
	public final String aString105;

	@OriginalMember(owner = "client!uia", name = "i", descriptor = "Ljava/lang/String;")
	public final String aString107;

	@OriginalMember(owner = "client!uia", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public Class359(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		this.aString106 = arg1;
		this.aString105 = arg0;
		this.aString107 = arg2;
	}
}
