import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ou")
public final class Class41_Sub3_Sub2 extends Class41_Sub3 {

	@OriginalMember(owner = "client!ou", name = "r", descriptor = "I")
	public final int anInt6880 = (int) (Static158.method2936() / 1000L);

	@OriginalMember(owner = "client!ou", name = "p", descriptor = "S")
	public final short aShort113;

	@OriginalMember(owner = "client!ou", name = "t", descriptor = "Ljava/lang/String;")
	public final String aString54;

	@OriginalMember(owner = "client!ou", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class41_Sub3_Sub2(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aShort113 = (short) arg1;
		this.aString54 = arg0;
	}
}
