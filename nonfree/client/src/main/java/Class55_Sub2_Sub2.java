import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jv")
public final class Class55_Sub2_Sub2 extends Class55_Sub2 {

	@OriginalMember(owner = "client!jv", name = "w", descriptor = "I")
	public final int anInt5535 = (int) (Static376.method6088() / 1000L);

	@OriginalMember(owner = "client!jv", name = "q", descriptor = "S")
	public final short aShort53;

	@OriginalMember(owner = "client!jv", name = "s", descriptor = "Ljava/lang/String;")
	public final String aString58;

	@OriginalMember(owner = "client!jv", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class55_Sub2_Sub2(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aShort53 = (short) arg1;
		this.aString58 = arg0;
	}
}
