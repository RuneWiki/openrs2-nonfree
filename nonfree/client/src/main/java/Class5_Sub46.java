import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public final class Class5_Sub46 extends Class5 {

	@OriginalMember(owner = "client!pi", name = "p", descriptor = "Ljava/lang/String;")
	public String aString87;

	@OriginalMember(owner = "client!pi", name = "<init>", descriptor = "()V")
	private Class5_Sub46() {
	}

	@OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class5_Sub46(@OriginalArg(0) String arg0) {
		this.aString87 = arg0;
	}
}
