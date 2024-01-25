import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public final class Class2_Sub34 extends Class2 {

	@OriginalMember(owner = "client!qm", name = "p", descriptor = "Ljava/lang/String;")
	public String aString54;

	@OriginalMember(owner = "client!qm", name = "<init>", descriptor = "()V")
	private Class2_Sub34() {
	}

	@OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class2_Sub34(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString54 = arg0;
	}
}
