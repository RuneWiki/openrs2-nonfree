import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public final class Class5_Sub44 extends Class5 {

	@OriginalMember(owner = "client!u", name = "i", descriptor = "I")
	public volatile int anInt9280 = -1;

	@OriginalMember(owner = "client!u", name = "l", descriptor = "Ljava/lang/String;")
	public final String aString130;

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class5_Sub44(@OriginalArg(0) String arg0) {
		this.aString130 = arg0;
	}
}
