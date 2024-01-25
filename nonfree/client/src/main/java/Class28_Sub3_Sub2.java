import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public final class Class28_Sub3_Sub2 extends Class28_Sub3 {

	@OriginalMember(owner = "client!tj", name = "n", descriptor = "I")
	public final int anInt9317 = (int) (Static547.method7619() / 1000L);

	@OriginalMember(owner = "client!tj", name = "q", descriptor = "Ljava/lang/String;")
	public final String aString88;

	@OriginalMember(owner = "client!tj", name = "o", descriptor = "S")
	public final short aShort94;

	@OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class28_Sub3_Sub2(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString88 = arg0;
		this.aShort94 = (short) arg1;
	}
}
