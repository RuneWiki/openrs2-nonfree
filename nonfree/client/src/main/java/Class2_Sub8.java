import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public final class Class2_Sub8 extends Class2 {

	@OriginalMember(owner = "client!cc", name = "m", descriptor = "I")
	public volatile int anInt991 = -1;

	@OriginalMember(owner = "client!cc", name = "k", descriptor = "Ljava/lang/String;")
	public final String aString9;

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class2_Sub8(@OriginalArg(0) String arg0) {
		this.aString9 = arg0;
	}
}
