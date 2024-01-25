import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public final class Class1_Sub17 extends Class1 {

	@OriginalMember(owner = "client!ha", name = "t", descriptor = "I")
	public volatile int anInt2301 = -1;

	@OriginalMember(owner = "client!ha", name = "q", descriptor = "Ljava/lang/String;")
	public final String aString18;

	@OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class1_Sub17(@OriginalArg(0) String arg0) {
		this.aString18 = arg0;
	}
}
