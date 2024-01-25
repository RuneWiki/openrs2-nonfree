import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public final class Class3_Sub23 extends Class3 {

	@OriginalMember(owner = "client!hv", name = "n", descriptor = "I")
	public volatile int anInt3004 = -1;

	@OriginalMember(owner = "client!hv", name = "m", descriptor = "Ljava/lang/String;")
	public final String aString39;

	@OriginalMember(owner = "client!hv", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class3_Sub23(@OriginalArg(0) String arg0) {
		this.aString39 = arg0;
	}
}
