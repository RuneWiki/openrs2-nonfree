import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public final class Class3_Sub1 extends Class3 {

	@OriginalMember(owner = "client!ab", name = "l", descriptor = "I")
	public volatile int anInt64 = -1;

	@OriginalMember(owner = "client!ab", name = "n", descriptor = "Ljava/lang/String;")
	public final String aString2;

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class3_Sub1(@OriginalArg(0) String arg0) {
		this.aString2 = arg0;
	}
}
