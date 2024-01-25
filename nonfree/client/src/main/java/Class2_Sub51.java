import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wv")
public final class Class2_Sub51 extends Class2 {

	@OriginalMember(owner = "client!wv", name = "k", descriptor = "I")
	public volatile int anInt9385 = -1;

	@OriginalMember(owner = "client!wv", name = "i", descriptor = "Ljava/lang/String;")
	public final String aString215;

	@OriginalMember(owner = "client!wv", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class2_Sub51(@OriginalArg(0) String arg0) {
		this.aString215 = arg0;
	}
}
