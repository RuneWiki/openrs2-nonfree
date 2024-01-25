import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public final class Class2_Sub6_Sub2 extends Class2_Sub6 {

	@OriginalMember(owner = "client!ma", name = "u", descriptor = "I")
	public final int anInt6138 = (int) (Static566.method7936() / 1000L);

	@OriginalMember(owner = "client!ma", name = "y", descriptor = "S")
	public final short aShort81;

	@OriginalMember(owner = "client!ma", name = "x", descriptor = "Ljava/lang/String;")
	public final String aString79;

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class2_Sub6_Sub2(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aShort81 = (short) arg1;
		this.aString79 = arg0;
	}
}
