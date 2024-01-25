import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eaa")
public final class Class20_Sub1_Sub2 extends Class20_Sub1 {

	@OriginalMember(owner = "client!eaa", name = "w", descriptor = "I")
	public final int anInt2275 = (int) (Static255.method4035() / 1000L);

	@OriginalMember(owner = "client!eaa", name = "u", descriptor = "S")
	public final short aShort26;

	@OriginalMember(owner = "client!eaa", name = "t", descriptor = "Ljava/lang/String;")
	public final String aString24;

	@OriginalMember(owner = "client!eaa", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class20_Sub1_Sub2(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aShort26 = (short) arg1;
		this.aString24 = arg0;
	}
}
