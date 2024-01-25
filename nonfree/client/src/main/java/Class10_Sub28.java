import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public final class Class10_Sub28 extends Class10 {

	@OriginalMember(owner = "client!mg", name = "k", descriptor = "I")
	public volatile int anInt4505 = -1;

	@OriginalMember(owner = "client!mg", name = "m", descriptor = "Ljava/lang/String;")
	public final String aString48;

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class10_Sub28(@OriginalArg(0) String arg0) {
		this.aString48 = arg0;
	}
}
