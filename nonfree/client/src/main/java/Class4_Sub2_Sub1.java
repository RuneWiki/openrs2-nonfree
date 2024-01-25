import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public final class Class4_Sub2_Sub1 extends Class4_Sub2 {

	@OriginalMember(owner = "client!ij", name = "q", descriptor = "I")
	public final int anInt4538 = (int) (Static374.method6036() / 1000L);

	@OriginalMember(owner = "client!ij", name = "n", descriptor = "Ljava/lang/String;")
	public final String aString53;

	@OriginalMember(owner = "client!ij", name = "o", descriptor = "S")
	public final short aShort59;

	@OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class4_Sub2_Sub1(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString53 = arg0;
		this.aShort59 = (short) arg1;
	}
}
