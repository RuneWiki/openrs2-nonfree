import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fea")
public final class Class2_Sub25 extends Class2 {

	@OriginalMember(owner = "client!fea", name = "q", descriptor = "I")
	public volatile int anInt2903 = -1;

	@OriginalMember(owner = "client!fea", name = "n", descriptor = "Ljava/lang/String;")
	public final String aString27;

	@OriginalMember(owner = "client!fea", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class2_Sub25(@OriginalArg(0) String arg0) {
		this.aString27 = arg0;
	}
}
