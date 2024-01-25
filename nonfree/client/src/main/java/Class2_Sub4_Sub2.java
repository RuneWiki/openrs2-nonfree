import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public final class Class2_Sub4_Sub2 extends Class2_Sub4 {

	@OriginalMember(owner = "client!rb", name = "s", descriptor = "I")
	public final int anInt8513 = (int) (Static444.method6719() / 1000L);

	@OriginalMember(owner = "client!rb", name = "y", descriptor = "Ljava/lang/String;")
	public final String aString95;

	@OriginalMember(owner = "client!rb", name = "t", descriptor = "S")
	public final short aShort106;

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class2_Sub4_Sub2(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString95 = arg0;
		this.aShort106 = (short) arg1;
	}
}
