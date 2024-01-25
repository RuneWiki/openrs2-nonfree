import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public final class Class20_Sub6_Sub2 extends Class20_Sub6 {

	@OriginalMember(owner = "client!lm", name = "u", descriptor = "I")
	public final int anInt6133 = (int) (Static32.method595() / 1000L);

	@OriginalMember(owner = "client!lm", name = "z", descriptor = "Ljava/lang/String;")
	public final String aString79;

	@OriginalMember(owner = "client!lm", name = "v", descriptor = "S")
	public final short aShort69;

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class20_Sub6_Sub2(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString79 = arg0;
		this.aShort69 = (short) arg1;
	}
}
