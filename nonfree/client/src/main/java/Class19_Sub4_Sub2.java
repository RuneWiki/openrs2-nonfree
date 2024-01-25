import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qba")
public final class Class19_Sub4_Sub2 extends Class19_Sub4 {

	@OriginalMember(owner = "client!qba", name = "n", descriptor = "I")
	public final int anInt8654 = (int) (Static626.method8479() / 1000L);

	@OriginalMember(owner = "client!qba", name = "m", descriptor = "Ljava/lang/String;")
	public final String aString114;

	@OriginalMember(owner = "client!qba", name = "r", descriptor = "S")
	public final short aShort117;

	@OriginalMember(owner = "client!qba", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class19_Sub4_Sub2(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString114 = arg0;
		this.aShort117 = (short) arg1;
	}
}
