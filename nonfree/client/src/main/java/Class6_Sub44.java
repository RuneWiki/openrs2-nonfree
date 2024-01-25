import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qda")
public final class Class6_Sub44 extends Class6 {

	@OriginalMember(owner = "client!qda", name = "n", descriptor = "Ljava/lang/String;")
	public String aString84;

	@OriginalMember(owner = "client!qda", name = "<init>", descriptor = "()V")
	private Class6_Sub44() {
	}

	@OriginalMember(owner = "client!qda", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class6_Sub44(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString84 = arg0;
	}
}
