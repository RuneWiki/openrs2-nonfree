import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public final class Class43 {

	@OriginalMember(owner = "client!bq", name = "b", descriptor = "Ljava/lang/String;")
	public final String aString8;

	@OriginalMember(owner = "client!bq", name = "c", descriptor = "Ljava/lang/String;")
	public final String aString9;

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "Ljava/lang/String;")
	public final String aString7;

	@OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public Class43(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		this.aString8 = arg2;
		this.aString9 = arg1;
		this.aString7 = arg0;
	}
}
