import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public final class Class7_Sub17 extends Class7 {

	@OriginalMember(owner = "client!fj", name = "p", descriptor = "Ljava/lang/String;")
	public String aString22;

	@OriginalMember(owner = "client!fj", name = "<init>", descriptor = "()V")
	private Class7_Sub17() {
	}

	@OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class7_Sub17(@OriginalArg(0) String arg0) {
		this.aString22 = arg0;
	}
}
