import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public final class Class102_Sub1_Sub2 extends Class102_Sub1 {

	@OriginalMember(owner = "client!ti", name = "B", descriptor = "I")
	public final int anInt8196 = (int) (Static137.method2058() / 1000L);

	@OriginalMember(owner = "client!ti", name = "x", descriptor = "Ljava/lang/String;")
	public final String aString101;

	@OriginalMember(owner = "client!ti", name = "C", descriptor = "S")
	public final short aShort111;

	@OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class102_Sub1_Sub2(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString101 = arg0;
		this.aShort111 = (short) arg1;
	}
}
