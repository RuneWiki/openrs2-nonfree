import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public final class Class1_Sub10 extends Class1 {

	@OriginalMember(owner = "client!cw", name = "q", descriptor = "I")
	public volatile int anInt1094 = -1;

	@OriginalMember(owner = "client!cw", name = "s", descriptor = "Ljava/lang/String;")
	public final String aString9;

	@OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class1_Sub10(@OriginalArg(0) String arg0) {
		this.aString9 = arg0;
	}
}
