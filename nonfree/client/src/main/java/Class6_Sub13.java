import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public final class Class6_Sub13 extends Class6 {

	@OriginalMember(owner = "client!fk", name = "j", descriptor = "I")
	public volatile int anInt1618 = -1;

	@OriginalMember(owner = "client!fk", name = "l", descriptor = "Ljava/lang/String;")
	public final String aString58;

	@OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class6_Sub13(@OriginalArg(0) String arg0) {
		this.aString58 = arg0;
	}
}
