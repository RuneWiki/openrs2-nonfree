import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public final class Class4_Sub26 extends Class4 {

	@OriginalMember(owner = "client!rk", name = "u", descriptor = "Ljava/lang/String;")
	public String aString285;

	@OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class4_Sub26(@OriginalArg(0) String arg0) {
		this.aString285 = arg0;
	}
}
