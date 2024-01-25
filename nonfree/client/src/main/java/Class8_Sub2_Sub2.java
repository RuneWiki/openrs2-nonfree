import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uv")
public final class Class8_Sub2_Sub2 extends Class8_Sub2 {

	@OriginalMember(owner = "client!uv", name = "s", descriptor = "I")
	public final int anInt9076 = (int) (Static413.method5668() / 1000L);

	@OriginalMember(owner = "client!uv", name = "v", descriptor = "Ljava/lang/String;")
	public final String aString89;

	@OriginalMember(owner = "client!uv", name = "t", descriptor = "S")
	public final short aShort124;

	@OriginalMember(owner = "client!uv", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class8_Sub2_Sub2(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString89 = arg0;
		this.aShort124 = (short) arg1;
	}
}
