import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dha")
public final class Class9_Sub2_Sub2 extends Class9_Sub2 {

	@OriginalMember(owner = "client!dha", name = "v", descriptor = "I")
	public final int anInt2345 = (int) (Static517.method6965() / 1000L);

	@OriginalMember(owner = "client!dha", name = "t", descriptor = "S")
	public final short aShort41;

	@OriginalMember(owner = "client!dha", name = "u", descriptor = "Ljava/lang/String;")
	public final String aString42;

	@OriginalMember(owner = "client!dha", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class9_Sub2_Sub2(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aShort41 = (short) arg1;
		this.aString42 = arg0;
	}
}
