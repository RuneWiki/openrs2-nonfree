import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public final class Class11_Sub11 extends Class11 {

	@OriginalMember(owner = "client!ef", name = "p", descriptor = "Ljava/lang/String;")
	public String aString11;

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "()V")
	private Class11_Sub11() {
	}

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class11_Sub11(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString11 = arg0;
	}
}
