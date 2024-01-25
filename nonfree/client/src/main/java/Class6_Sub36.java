import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public final class Class6_Sub36 extends Class6 {

	@OriginalMember(owner = "client!pc", name = "m", descriptor = "Ljava/lang/String;")
	public String aString54;

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "()V")
	private Class6_Sub36() {
	}

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class6_Sub36(@OriginalArg(0) String arg0) {
		this.aString54 = arg0;
	}
}
