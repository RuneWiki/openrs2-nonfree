import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public final class Class7_Sub1_Sub2 extends Class7_Sub1 {

	@OriginalMember(owner = "client!um", name = "y", descriptor = "I")
	public final int anInt8947 = (int) (Static76.method1679() / 1000L);

	@OriginalMember(owner = "client!um", name = "x", descriptor = "Ljava/lang/String;")
	public final String aString102;

	@OriginalMember(owner = "client!um", name = "u", descriptor = "S")
	public final short aShort110;

	@OriginalMember(owner = "client!um", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class7_Sub1_Sub2(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString102 = arg0;
		this.aShort110 = (short) arg1;
	}
}
