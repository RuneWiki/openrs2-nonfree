import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public final class Class1_Sub41 extends Class1 {

	@OriginalMember(owner = "client!qd", name = "l", descriptor = "Ljava/lang/String;")
	public String aString72;

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "()V")
	private Class1_Sub41() {
	}

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class1_Sub41(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString72 = arg0;
	}
}
