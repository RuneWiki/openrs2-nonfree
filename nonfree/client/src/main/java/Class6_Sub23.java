import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public final class Class6_Sub23 extends Class6 {

	@OriginalMember(owner = "client!nl", name = "j", descriptor = "Ljava/lang/String;")
	public String aString39;

	@OriginalMember(owner = "client!nl", name = "<init>", descriptor = "()V")
	private Class6_Sub23() {
	}

	@OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class6_Sub23(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString39 = arg0;
	}
}
