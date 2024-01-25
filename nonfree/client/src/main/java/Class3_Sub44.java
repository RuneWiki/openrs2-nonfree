import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public final class Class3_Sub44 extends Class3 {

	@OriginalMember(owner = "client!sp", name = "j", descriptor = "Ljava/lang/String;")
	public String aString102;

	@OriginalMember(owner = "client!sp", name = "<init>", descriptor = "()V")
	private Class3_Sub44() {
	}

	@OriginalMember(owner = "client!sp", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class3_Sub44(@OriginalArg(0) String arg0) {
		this.aString102 = arg0;
	}
}
