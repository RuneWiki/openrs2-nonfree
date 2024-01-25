import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public final class Class3_Sub38 extends Class3 {

	@OriginalMember(owner = "client!ol", name = "k", descriptor = "I")
	public volatile int anInt6787 = -1;

	@OriginalMember(owner = "client!ol", name = "p", descriptor = "Ljava/lang/String;")
	public final String aString50;

	@OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class3_Sub38(@OriginalArg(0) String arg0) {
		this.aString50 = arg0;
	}
}
