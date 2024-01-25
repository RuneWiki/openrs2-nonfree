import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public final class Class41_Sub3_Sub1 extends Class41_Sub3 {

	@OriginalMember(owner = "client!gd", name = "x", descriptor = "I")
	public final int anInt2851 = (int) (Static250.method3737() / 1000L);

	@OriginalMember(owner = "client!gd", name = "y", descriptor = "Ljava/lang/String;")
	public final String aString25;

	@OriginalMember(owner = "client!gd", name = "A", descriptor = "S")
	public final short aShort51;

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class41_Sub3_Sub1(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString25 = arg0;
		this.aShort51 = (short) arg1;
	}
}
