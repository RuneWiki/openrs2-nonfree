import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public final class Class6_Sub40 extends Class6 {

	@OriginalMember(owner = "client!sk", name = "i", descriptor = "I")
	public volatile int anInt8165 = -1;

	@OriginalMember(owner = "client!sk", name = "g", descriptor = "Ljava/lang/String;")
	public final String aString86;

	@OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class6_Sub40(@OriginalArg(0) String arg0) {
		this.aString86 = arg0;
	}
}
