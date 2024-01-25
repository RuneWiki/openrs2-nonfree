import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public final class Class11_Sub30 extends Class11 {

	@OriginalMember(owner = "client!oq", name = "l", descriptor = "Ljava/lang/String;")
	public String aString43;

	@OriginalMember(owner = "client!oq", name = "<init>", descriptor = "()V")
	private Class11_Sub30() {
	}

	@OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class11_Sub30(@OriginalArg(0) String arg0) {
		this.aString43 = arg0;
	}
}
