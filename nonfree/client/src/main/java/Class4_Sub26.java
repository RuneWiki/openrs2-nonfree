import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public final class Class4_Sub26 extends Class4 {

	@OriginalMember(owner = "client!lf", name = "p", descriptor = "Ljava/lang/String;")
	public String aString59;

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "()V")
	private Class4_Sub26() {
	}

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class4_Sub26(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString59 = arg0;
	}
}
