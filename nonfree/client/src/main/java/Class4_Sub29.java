import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public final class Class4_Sub29 extends Class4 {

	@OriginalMember(owner = "client!mn", name = "m", descriptor = "I")
	public volatile int anInt4207 = -1;

	@OriginalMember(owner = "client!mn", name = "s", descriptor = "Ljava/lang/String;")
	public final String aString144;

	@OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class4_Sub29(@OriginalArg(0) String arg0) {
		this.aString144 = arg0;
	}
}
