import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public final class Class71_Sub1_Sub1 extends Class71_Sub1 {

	@OriginalMember(owner = "client!gb", name = "p", descriptor = "I")
	public final int anInt2565 = (int) (Static167.method2929() / 1000L);

	@OriginalMember(owner = "client!gb", name = "n", descriptor = "S")
	public final short aShort22;

	@OriginalMember(owner = "client!gb", name = "l", descriptor = "Ljava/lang/String;")
	public final String aString17;

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class71_Sub1_Sub1(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aShort22 = (short) arg1;
		this.aString17 = arg0;
	}
}
