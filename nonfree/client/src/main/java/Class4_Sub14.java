import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dia")
public final class Class4_Sub14 extends Class4 {

	@OriginalMember(owner = "client!dia", name = "o", descriptor = "I")
	public volatile int anInt2029 = -1;

	@OriginalMember(owner = "client!dia", name = "n", descriptor = "Ljava/lang/String;")
	public final String aString16;

	@OriginalMember(owner = "client!dia", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class4_Sub14(@OriginalArg(0) String arg0) {
		this.aString16 = arg0;
	}
}
