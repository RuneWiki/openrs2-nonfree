import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public final class Class3_Sub42 extends Class3 {

	@OriginalMember(owner = "client!qg", name = "n", descriptor = "I")
	public volatile int anInt7888 = -1;

	@OriginalMember(owner = "client!qg", name = "l", descriptor = "Ljava/lang/String;")
	public final String aString67;

	@OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class3_Sub42(@OriginalArg(0) String arg0) {
		this.aString67 = arg0;
	}
}
