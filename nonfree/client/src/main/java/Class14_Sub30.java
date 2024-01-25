import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public final class Class14_Sub30 extends Class14 {

	@OriginalMember(owner = "client!sa", name = "r", descriptor = "I")
	public volatile int anInt5459 = -1;

	@OriginalMember(owner = "client!sa", name = "n", descriptor = "Ljava/lang/String;")
	public final String aString204;

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class14_Sub30(@OriginalArg(0) String arg0) {
		this.aString204 = arg0;
	}
}
