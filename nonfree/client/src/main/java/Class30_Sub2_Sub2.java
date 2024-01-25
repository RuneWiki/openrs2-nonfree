import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public final class Class30_Sub2_Sub2 extends Class30_Sub2 {

	@OriginalMember(owner = "client!kt", name = "z", descriptor = "I")
	public final int anInt5243 = (int) (Static105.method2132() / 1000L);

	@OriginalMember(owner = "client!kt", name = "v", descriptor = "S")
	public final short aShort69;

	@OriginalMember(owner = "client!kt", name = "y", descriptor = "Ljava/lang/String;")
	public final String aString54;

	@OriginalMember(owner = "client!kt", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class30_Sub2_Sub2(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aShort69 = (short) arg1;
		this.aString54 = arg0;
	}
}
