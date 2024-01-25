import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fga")
public final class Class6_Sub17 extends Class6 {

	@OriginalMember(owner = "client!fga", name = "p", descriptor = "I")
	public volatile int anInt2807 = -1;

	@OriginalMember(owner = "client!fga", name = "n", descriptor = "Ljava/lang/String;")
	public final String aString31;

	@OriginalMember(owner = "client!fga", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class6_Sub17(@OriginalArg(0) String arg0) {
		this.aString31 = arg0;
	}
}
