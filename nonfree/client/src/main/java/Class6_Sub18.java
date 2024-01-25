import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eda")
public final class Class6_Sub18 extends Class6 {

	@OriginalMember(owner = "client!eda", name = "o", descriptor = "Ljava/lang/String;")
	public String aString29;

	@OriginalMember(owner = "client!eda", name = "<init>", descriptor = "()V")
	private Class6_Sub18() {
	}

	@OriginalMember(owner = "client!eda", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class6_Sub18(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString29 = arg0;
	}
}
