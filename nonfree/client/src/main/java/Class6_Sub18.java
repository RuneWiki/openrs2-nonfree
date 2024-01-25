import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public final class Class6_Sub18 extends Class6 {

	@OriginalMember(owner = "client!fn", name = "o", descriptor = "Ljava/lang/String;")
	public String aString33;

	@OriginalMember(owner = "client!fn", name = "<init>", descriptor = "()V")
	private Class6_Sub18() {
	}

	@OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class6_Sub18(@OriginalArg(0) String arg0) {
		this.aString33 = arg0;
	}
}
