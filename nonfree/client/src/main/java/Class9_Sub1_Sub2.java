import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public final class Class9_Sub1_Sub2 extends Class9_Sub1 {

	@OriginalMember(owner = "client!ii", name = "x", descriptor = "I")
	public final int anInt5336 = (int) (Static582.method8056() / 1000L);

	@OriginalMember(owner = "client!ii", name = "t", descriptor = "Ljava/lang/String;")
	public final String aString50;

	@OriginalMember(owner = "client!ii", name = "s", descriptor = "S")
	public final short aShort48;

	@OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class9_Sub1_Sub2(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString50 = arg0;
		this.aShort48 = (short) arg1;
	}
}
