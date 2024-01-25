import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public final class Class46_Sub3_Sub2 extends Class46_Sub3 {

	@OriginalMember(owner = "client!ws", name = "q", descriptor = "I")
	public final int anInt9560 = (int) (Static110.method2222() / 1000L);

	@OriginalMember(owner = "client!ws", name = "n", descriptor = "S")
	public final short aShort128;

	@OriginalMember(owner = "client!ws", name = "p", descriptor = "Ljava/lang/String;")
	public final String aString216;

	@OriginalMember(owner = "client!ws", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class46_Sub3_Sub2(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aShort128 = (short) arg1;
		this.aString216 = arg0;
	}
}
