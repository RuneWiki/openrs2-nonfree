import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public final class Class1_Sub40 extends Class1 {

	@OriginalMember(owner = "client!ta", name = "o", descriptor = "Ljava/lang/String;")
	public String aString54;

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "()V")
	private Class1_Sub40() {
	}

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class1_Sub40(@OriginalArg(0) String arg0) {
		this.aString54 = arg0;
	}
}
