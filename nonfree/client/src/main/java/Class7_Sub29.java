import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public final class Class7_Sub29 extends Class7 {

	@OriginalMember(owner = "client!kk", name = "n", descriptor = "I")
	public volatile int anInt3815 = -1;

	@OriginalMember(owner = "client!kk", name = "k", descriptor = "Ljava/lang/String;")
	public final String aString44;

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class7_Sub29(@OriginalArg(0) String arg0) {
		this.aString44 = arg0;
	}
}
