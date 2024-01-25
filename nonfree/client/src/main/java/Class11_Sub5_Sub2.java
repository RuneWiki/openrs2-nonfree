import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kfa")
public final class Class11_Sub5_Sub2 extends Class11_Sub5 {

	@OriginalMember(owner = "client!kfa", name = "x", descriptor = "I")
	public final int anInt4913 = (int) (Static480.method6650() / 1000L);

	@OriginalMember(owner = "client!kfa", name = "y", descriptor = "Ljava/lang/String;")
	public final String aString55;

	@OriginalMember(owner = "client!kfa", name = "A", descriptor = "S")
	public final short aShort57;

	@OriginalMember(owner = "client!kfa", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class11_Sub5_Sub2(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString55 = arg0;
		this.aShort57 = (short) arg1;
	}
}
