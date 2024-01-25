import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public final class Class3_Sub20 extends Class3 {

	@OriginalMember(owner = "client!j", name = "r", descriptor = "Ljava/lang/String;")
	public String aString28;

	@OriginalMember(owner = "client!j", name = "<init>", descriptor = "()V")
	private Class3_Sub20() {
	}

	@OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class3_Sub20(@OriginalArg(0) String arg0) {
		this.aString28 = arg0;
	}
}
