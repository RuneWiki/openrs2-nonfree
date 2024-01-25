import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public final class Class4_Sub46 extends Class4 {

	@OriginalMember(owner = "client!so", name = "x", descriptor = "I")
	public volatile int anInt9249 = -1;

	@OriginalMember(owner = "client!so", name = "q", descriptor = "Ljava/lang/String;")
	public final String aString195;

	@OriginalMember(owner = "client!so", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class4_Sub46(@OriginalArg(0) String arg0) {
		this.aString195 = arg0;
	}
}
