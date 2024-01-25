import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public final class Class5_Sub38 extends Class5 {

	@OriginalMember(owner = "client!pj", name = "l", descriptor = "I")
	public volatile int anInt6970 = -1;

	@OriginalMember(owner = "client!pj", name = "m", descriptor = "Ljava/lang/String;")
	public final String aString67;

	@OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class5_Sub38(@OriginalArg(0) String arg0) {
		this.aString67 = arg0;
	}
}
