import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public final class Class8_Sub28 extends Class8 {

	@OriginalMember(owner = "client!ii", name = "o", descriptor = "Ljava/lang/String;")
	public String aString63;

	@OriginalMember(owner = "client!ii", name = "<init>", descriptor = "()V")
	private Class8_Sub28() {
	}

	@OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class8_Sub28(@OriginalArg(0) String arg0) {
		this.aString63 = arg0;
	}
}
