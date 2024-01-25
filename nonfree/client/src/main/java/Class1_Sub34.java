import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public final class Class1_Sub34 extends Class1 {

	@OriginalMember(owner = "client!oq", name = "n", descriptor = "I")
	public volatile int anInt4693 = -1;

	@OriginalMember(owner = "client!oq", name = "p", descriptor = "Ljava/lang/String;")
	public final String aString176;

	@OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class1_Sub34(@OriginalArg(0) String arg0) {
		this.aString176 = arg0;
	}
}
