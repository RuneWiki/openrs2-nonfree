import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public final class Class6_Sub1_Sub1 extends Class6_Sub1 {

	@OriginalMember(owner = "client!bs", name = "v", descriptor = "I")
	public final int anInt846 = (int) (Static143.method2502() / 1000L);

	@OriginalMember(owner = "client!bs", name = "u", descriptor = "Ljava/lang/String;")
	public final String aString25;

	@OriginalMember(owner = "client!bs", name = "r", descriptor = "S")
	public final short aShort16;

	@OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class6_Sub1_Sub1(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString25 = arg0;
		this.aShort16 = (short) arg1;
	}
}
