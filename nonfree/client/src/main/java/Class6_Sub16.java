import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public final class Class6_Sub16 extends Class6 {

	@OriginalMember(owner = "client!fu", name = "m", descriptor = "I")
	public volatile int anInt2906 = -1;

	@OriginalMember(owner = "client!fu", name = "n", descriptor = "Ljava/lang/String;")
	public final String aString31;

	@OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class6_Sub16(@OriginalArg(0) String arg0) {
		this.aString31 = arg0;
	}
}
