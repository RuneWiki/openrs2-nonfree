import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public final class Class3_Sub14 extends Class3 {

	@OriginalMember(owner = "client!ea", name = "k", descriptor = "Ljava/lang/String;")
	public String aString16;

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "()V")
	private Class3_Sub14() {
	}

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class3_Sub14(@OriginalArg(0) String arg0) {
		this.aString16 = arg0;
	}
}
