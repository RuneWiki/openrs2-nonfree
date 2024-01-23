import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public final class Class1_Sub25 extends Class1 {

	@OriginalMember(owner = "client!rk", name = "x", descriptor = "Ljava/lang/String;")
	public String aString317;

	@OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class1_Sub25(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString317 = arg0;
	}
}
