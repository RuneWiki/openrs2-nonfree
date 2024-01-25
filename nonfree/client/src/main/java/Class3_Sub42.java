import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rda")
public final class Class3_Sub42 extends Class3 {

	@OriginalMember(owner = "client!rda", name = "n", descriptor = "I")
	public volatile int anInt8103 = -1;

	@OriginalMember(owner = "client!rda", name = "o", descriptor = "Ljava/lang/String;")
	public final String aString98;

	@OriginalMember(owner = "client!rda", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class3_Sub42(@OriginalArg(0) String arg0) {
		this.aString98 = arg0;
	}
}
