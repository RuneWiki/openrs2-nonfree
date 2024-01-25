import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mia")
public final class Class14_Sub34 extends Class14 {

	@OriginalMember(owner = "client!mia", name = "m", descriptor = "Ljava/lang/String;")
	public String aString75;

	@OriginalMember(owner = "client!mia", name = "<init>", descriptor = "()V")
	private Class14_Sub34() {
	}

	@OriginalMember(owner = "client!mia", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class14_Sub34(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString75 = arg0;
	}
}
