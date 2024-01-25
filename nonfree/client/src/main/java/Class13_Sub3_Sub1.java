import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public final class Class13_Sub3_Sub1 extends Class13_Sub3 {

	@OriginalMember(owner = "client!ct", name = "o", descriptor = "I")
	public final int anInt1491 = (int) (Static476.method6413() / 1000L);

	@OriginalMember(owner = "client!ct", name = "p", descriptor = "Ljava/lang/String;")
	public final String aString15;

	@OriginalMember(owner = "client!ct", name = "u", descriptor = "S")
	public final short aShort25;

	static {
		new Class260("", 76);
	}

	@OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class13_Sub3_Sub1(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString15 = arg0;
		this.aShort25 = (short) arg1;
	}
}
