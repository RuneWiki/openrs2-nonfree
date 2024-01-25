import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public final class Class4_Sub1_Sub2 extends Class4_Sub1 {

	@OriginalMember(owner = "client!lj", name = "u", descriptor = "I")
	public final int anInt5844 = (int) (Static567.method7863() / 1000L);

	@OriginalMember(owner = "client!lj", name = "q", descriptor = "S")
	public final short aShort69;

	@OriginalMember(owner = "client!lj", name = "v", descriptor = "Ljava/lang/String;")
	public final String aString63;

	@OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class4_Sub1_Sub2(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aShort69 = (short) arg1;
		this.aString63 = arg0;
	}
}
