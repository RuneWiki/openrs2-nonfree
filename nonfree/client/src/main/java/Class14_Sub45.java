import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public final class Class14_Sub45 extends Class14 {

	@OriginalMember(owner = "client!tt", name = "r", descriptor = "Ljava/lang/String;")
	public String aString109;

	@OriginalMember(owner = "client!tt", name = "<init>", descriptor = "()V")
	private Class14_Sub45() {
	}

	@OriginalMember(owner = "client!tt", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class14_Sub45(@OriginalArg(0) String arg0) {
		this.aString109 = arg0;
	}
}
