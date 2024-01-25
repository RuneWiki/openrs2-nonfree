import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public final class Class41_Sub4_Sub2 extends Class41_Sub4 {

	@OriginalMember(owner = "client!os", name = "u", descriptor = "I")
	public final int anInt7654 = (int) (Static124.method1947() / 1000L);

	@OriginalMember(owner = "client!os", name = "t", descriptor = "S")
	public final short aShort90;

	@OriginalMember(owner = "client!os", name = "v", descriptor = "Ljava/lang/String;")
	public final String aString74;

	@OriginalMember(owner = "client!os", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class41_Sub4_Sub2(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aShort90 = (short) arg1;
		this.aString74 = arg0;
	}
}
