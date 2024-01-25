import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public final class Class2_Sub11 extends Class2 {

	@OriginalMember(owner = "client!dp", name = "p", descriptor = "I")
	public volatile int anInt1499 = -1;

	@OriginalMember(owner = "client!dp", name = "l", descriptor = "Ljava/lang/String;")
	public final String aString49;

	@OriginalMember(owner = "client!dp", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class2_Sub11(@OriginalArg(0) String arg0) {
		this.aString49 = arg0;
	}
}
