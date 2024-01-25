import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public final class Class2_Sub29 extends Class2 {

	@OriginalMember(owner = "client!nc", name = "r", descriptor = "I")
	public volatile int anInt4816 = -1;

	@OriginalMember(owner = "client!nc", name = "q", descriptor = "Ljava/lang/String;")
	public final String aString42;

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class2_Sub29(@OriginalArg(0) String arg0) {
		this.aString42 = arg0;
	}
}
