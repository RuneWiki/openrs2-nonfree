import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public final class Class3_Sub46 extends Class3 {

	@OriginalMember(owner = "client!rs", name = "t", descriptor = "I")
	public volatile int anInt9328 = -1;

	@OriginalMember(owner = "client!rs", name = "m", descriptor = "Ljava/lang/String;")
	public final String aString122;

	@OriginalMember(owner = "client!rs", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class3_Sub46(@OriginalArg(0) String arg0) {
		this.aString122 = arg0;
	}
}
