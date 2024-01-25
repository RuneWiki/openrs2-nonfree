import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jw")
public final class Class6_Sub32 extends Class6 {

	@OriginalMember(owner = "client!jw", name = "q", descriptor = "I")
	public volatile int anInt4924 = -1;

	@OriginalMember(owner = "client!jw", name = "p", descriptor = "Ljava/lang/String;")
	public final String aString60;

	@OriginalMember(owner = "client!jw", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class6_Sub32(@OriginalArg(0) String arg0) {
		this.aString60 = arg0;
	}
}
