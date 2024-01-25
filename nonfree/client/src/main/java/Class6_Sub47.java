import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uba")
public final class Class6_Sub47 extends Class6 {

	@OriginalMember(owner = "client!uba", name = "o", descriptor = "I")
	public volatile int anInt8980 = -1;

	@OriginalMember(owner = "client!uba", name = "n", descriptor = "Ljava/lang/String;")
	public final String aString107;

	@OriginalMember(owner = "client!uba", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class6_Sub47(@OriginalArg(0) String arg0) {
		this.aString107 = arg0;
	}
}
