import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public final class Class6_Sub11 extends Class6 {

	@OriginalMember(owner = "client!er", name = "p", descriptor = "Ljava/lang/String;")
	public String aString14;

	@OriginalMember(owner = "client!er", name = "<init>", descriptor = "()V")
	private Class6_Sub11() {
	}

	@OriginalMember(owner = "client!er", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class6_Sub11(@OriginalArg(0) String arg0) {
		this.aString14 = arg0;
	}
}
