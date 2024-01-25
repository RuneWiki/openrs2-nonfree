import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public final class Class6_Sub22 extends Class6 {

	@OriginalMember(owner = "client!mh", name = "j", descriptor = "I")
	public volatile int anInt4140 = -1;

	@OriginalMember(owner = "client!mh", name = "k", descriptor = "Ljava/lang/String;")
	public final String aString37;

	@OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class6_Sub22(@OriginalArg(0) String arg0) {
		this.aString37 = arg0;
	}
}
