import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qia")
public final class Class6_Sub46 extends Class6 {

	@OriginalMember(owner = "client!qia", name = "n", descriptor = "I")
	public volatile int anInt8354 = -1;

	@OriginalMember(owner = "client!qia", name = "p", descriptor = "Ljava/lang/String;")
	public final String aString94;

	@OriginalMember(owner = "client!qia", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class6_Sub46(@OriginalArg(0) String arg0) {
		this.aString94 = arg0;
	}
}
