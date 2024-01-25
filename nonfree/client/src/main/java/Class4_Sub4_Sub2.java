import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public final class Class4_Sub4_Sub2 extends Class4_Sub4 {

	@OriginalMember(owner = "client!qk", name = "y", descriptor = "I")
	public final int anInt8718 = (int) (Static26.method382() / 1000L);

	@OriginalMember(owner = "client!qk", name = "v", descriptor = "S")
	public final short aShort85;

	@OriginalMember(owner = "client!qk", name = "x", descriptor = "Ljava/lang/String;")
	public final String aString100;

	@OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class4_Sub4_Sub2(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aShort85 = (short) arg1;
		this.aString100 = arg0;
	}
}
