import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uaa")
public final class Class335 {

	@OriginalMember(owner = "client!uaa", name = "c", descriptor = "Ljava/lang/String;")
	public final String aString103;

	@OriginalMember(owner = "client!uaa", name = "b", descriptor = "Ljava/lang/String;")
	public final String aString102;

	@OriginalMember(owner = "client!uaa", name = "d", descriptor = "Ljava/lang/String;")
	public final String aString104;

	@OriginalMember(owner = "client!uaa", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public Class335(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		this.aString103 = arg2;
		this.aString102 = arg0;
		this.aString104 = arg1;
	}
}
