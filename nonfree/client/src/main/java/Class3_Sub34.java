import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public final class Class3_Sub34 extends Class3 {

	@OriginalMember(owner = "client!op", name = "u", descriptor = "Ljava/lang/String;")
	public String aString176;

	@OriginalMember(owner = "client!op", name = "<init>", descriptor = "()V")
	private Class3_Sub34() {
	}

	@OriginalMember(owner = "client!op", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class3_Sub34(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString176 = arg0;
	}
}
