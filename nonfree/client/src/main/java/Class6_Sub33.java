import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public final class Class6_Sub33 extends Class6 {

	@OriginalMember(owner = "client!nb", name = "g", descriptor = "Ljava/lang/String;")
	public String aString45;

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "()V")
	private Class6_Sub33() {
	}

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class6_Sub33(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString45 = arg0;
	}
}
