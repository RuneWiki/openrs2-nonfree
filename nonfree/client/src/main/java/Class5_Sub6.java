import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public final class Class5_Sub6 extends Class5 {

	@OriginalMember(owner = "client!ce", name = "l", descriptor = "I")
	public volatile int anInt925 = -1;

	@OriginalMember(owner = "client!ce", name = "m", descriptor = "Ljava/lang/String;")
	public final String aString58;

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class5_Sub6(@OriginalArg(0) String arg0) {
		this.aString58 = arg0;
	}
}
