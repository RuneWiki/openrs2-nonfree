import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public final class Class3_Sub40 extends Class3 {

	@OriginalMember(owner = "client!lr", name = "m", descriptor = "Ljava/lang/String;")
	public String aString78;

	@OriginalMember(owner = "client!lr", name = "<init>", descriptor = "()V")
	private Class3_Sub40() {
	}

	@OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class3_Sub40(@OriginalArg(0) String arg0) {
		this.aString78 = arg0;
	}
}
