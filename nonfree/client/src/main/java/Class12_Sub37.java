import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nba")
public final class Class12_Sub37 extends Class12 {

	@OriginalMember(owner = "client!nba", name = "o", descriptor = "I")
	public volatile int anInt6059 = -1;

	@OriginalMember(owner = "client!nba", name = "n", descriptor = "Ljava/lang/String;")
	public final String aString70;

	@OriginalMember(owner = "client!nba", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class12_Sub37(@OriginalArg(0) String arg0) {
		this.aString70 = arg0;
	}
}
