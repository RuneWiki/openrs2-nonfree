import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public final class Class2_Sub47 extends Class2 {

	@OriginalMember(owner = "client!vm", name = "o", descriptor = "I")
	public volatile int anInt9226 = -1;

	@OriginalMember(owner = "client!vm", name = "m", descriptor = "Ljava/lang/String;")
	public final String aString98;

	@OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class2_Sub47(@OriginalArg(0) String arg0) {
		this.aString98 = arg0;
	}
}
