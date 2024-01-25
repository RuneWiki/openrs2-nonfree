import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public final class Class4_Sub2_Sub2 extends Class4_Sub2 {

	@OriginalMember(owner = "client!ec", name = "y", descriptor = "I")
	public final int anInt1892 = (int) (Static279.method4058() / 1000L);

	@OriginalMember(owner = "client!ec", name = "C", descriptor = "S")
	public final short aShort30;

	@OriginalMember(owner = "client!ec", name = "z", descriptor = "Ljava/lang/String;")
	public final String aString15;

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class4_Sub2_Sub2(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aShort30 = (short) arg1;
		this.aString15 = arg0;
	}
}
