import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public final class Class6_Sub34 extends Class6 {

	@OriginalMember(owner = "client!pp", name = "u", descriptor = "Ljava/lang/String;")
	public String aString90;

	@OriginalMember(owner = "client!pp", name = "<init>", descriptor = "()V")
	private Class6_Sub34() {
	}

	@OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class6_Sub34(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString90 = arg0;
	}
}
