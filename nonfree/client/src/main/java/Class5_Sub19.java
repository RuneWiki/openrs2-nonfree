import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public final class Class5_Sub19 extends Class5 {

	@OriginalMember(owner = "client!ed", name = "o", descriptor = "I")
	public volatile int anInt2183 = -1;

	@OriginalMember(owner = "client!ed", name = "n", descriptor = "Ljava/lang/String;")
	public final String aString25;

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class5_Sub19(@OriginalArg(0) String arg0) {
		this.aString25 = arg0;
	}
}
