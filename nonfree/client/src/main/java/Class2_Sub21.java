import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public final class Class2_Sub21 extends Class2 {

	@OriginalMember(owner = "client!hf", name = "s", descriptor = "I")
	public volatile int anInt2612 = -1;

	@OriginalMember(owner = "client!hf", name = "q", descriptor = "Ljava/lang/String;")
	public final String aString26;

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class2_Sub21(@OriginalArg(0) String arg0) {
		this.aString26 = arg0;
	}
}
