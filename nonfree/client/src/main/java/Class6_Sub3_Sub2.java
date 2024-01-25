import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public final class Class6_Sub3_Sub2 extends Class6_Sub3 {

	@OriginalMember(owner = "client!rk", name = "p", descriptor = "I")
	public final int anInt7975 = (int) (Static548.method7437() / 1000L);

	@OriginalMember(owner = "client!rk", name = "q", descriptor = "Ljava/lang/String;")
	public final String aString83;

	@OriginalMember(owner = "client!rk", name = "n", descriptor = "S")
	public final short aShort87;

	@OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class6_Sub3_Sub2(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString83 = arg0;
		this.aShort87 = (short) arg1;
	}
}
