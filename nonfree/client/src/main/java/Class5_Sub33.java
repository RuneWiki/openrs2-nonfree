import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public final class Class5_Sub33 extends Class5 {

	@OriginalMember(owner = "client!le", name = "i", descriptor = "I")
	public volatile int anInt5994 = -1;

	@OriginalMember(owner = "client!le", name = "m", descriptor = "Ljava/lang/String;")
	public final String aString58;

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class5_Sub33(@OriginalArg(0) String arg0) {
		this.aString58 = arg0;
	}
}
