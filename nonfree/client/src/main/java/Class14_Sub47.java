import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public final class Class14_Sub47 extends Class14 {

	@OriginalMember(owner = "client!uk", name = "p", descriptor = "I")
	public volatile int anInt10186 = -1;

	@OriginalMember(owner = "client!uk", name = "l", descriptor = "Ljava/lang/String;")
	public final String aString116;

	@OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class14_Sub47(@OriginalArg(0) String arg0) {
		this.aString116 = arg0;
	}
}
