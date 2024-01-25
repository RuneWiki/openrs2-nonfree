import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public final class Class14_Sub41 extends Class14 {

	@OriginalMember(owner = "client!vo", name = "o", descriptor = "Ljava/lang/String;")
	public String aString239;

	@OriginalMember(owner = "client!vo", name = "<init>", descriptor = "()V")
	private Class14_Sub41() {
	}

	@OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class14_Sub41(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString239 = arg0;
	}
}
