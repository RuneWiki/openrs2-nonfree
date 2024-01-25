import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public final class Class3_Sub35 extends Class3 {

	@OriginalMember(owner = "client!qc", name = "o", descriptor = "Ljava/lang/String;")
	public String aString54;

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "()V")
	private Class3_Sub35() {
	}

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class3_Sub35(@OriginalArg(0) String arg0) {
		this.aString54 = arg0;
	}
}
