import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public final class Class3_Sub26 extends Class3 {

	@OriginalMember(owner = "client!gb", name = "n", descriptor = "I")
	public volatile int anInt3727 = -1;

	@OriginalMember(owner = "client!gb", name = "q", descriptor = "Ljava/lang/String;")
	public final String aString30;

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class3_Sub26(@OriginalArg(0) String arg0) {
		this.aString30 = arg0;
	}
}
