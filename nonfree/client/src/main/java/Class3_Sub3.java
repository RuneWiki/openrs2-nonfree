import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ada")
public final class Class3_Sub3 extends Class3 {

	@OriginalMember(owner = "client!ada", name = "m", descriptor = "I")
	public volatile int anInt228 = -1;

	@OriginalMember(owner = "client!ada", name = "i", descriptor = "Ljava/lang/String;")
	public final String aString1;

	@OriginalMember(owner = "client!ada", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class3_Sub3(@OriginalArg(0) String arg0) {
		this.aString1 = arg0;
	}
}
