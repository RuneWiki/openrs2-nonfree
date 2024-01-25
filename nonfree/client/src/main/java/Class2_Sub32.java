import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public final class Class2_Sub32 extends Class2 {

	@OriginalMember(owner = "client!qn", name = "o", descriptor = "Ljava/lang/String;")
	public String aString49;

	@OriginalMember(owner = "client!qn", name = "<init>", descriptor = "()V")
	private Class2_Sub32() {
	}

	@OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class2_Sub32(@OriginalArg(0) String arg0) {
		this.aString49 = arg0;
	}
}
