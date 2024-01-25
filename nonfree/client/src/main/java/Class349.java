import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public final class Class349 {

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "Ljava/lang/String;")
	public final String aString225;

	@OriginalMember(owner = "client!vr", name = "k", descriptor = "Ljava/lang/String;")
	public final String aString227;

	@OriginalMember(owner = "client!vr", name = "e", descriptor = "Ljava/lang/String;")
	public final String aString226;

	@OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public Class349(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		this.aString225 = arg2;
		this.aString227 = arg0;
		this.aString226 = arg1;
	}
}
