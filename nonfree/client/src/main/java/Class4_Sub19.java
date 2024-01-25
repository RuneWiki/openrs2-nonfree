import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public final class Class4_Sub19 extends Class4 {

	@OriginalMember(owner = "client!il", name = "p", descriptor = "Ljava/lang/String;")
	public String aString97;

	@OriginalMember(owner = "client!il", name = "<init>", descriptor = "()V")
	private Class4_Sub19() {
	}

	@OriginalMember(owner = "client!il", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class4_Sub19(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString97 = arg0;
	}
}
