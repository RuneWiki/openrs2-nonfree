import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public final class Class21_Sub1_Sub2 extends Class21_Sub1 {

	@OriginalMember(owner = "client!gm", name = "y", descriptor = "I")
	public final int anInt2423 = (int) (Static110.method1702() / 1000L);

	@OriginalMember(owner = "client!gm", name = "v", descriptor = "S")
	public final short aShort23;

	@OriginalMember(owner = "client!gm", name = "u", descriptor = "Ljava/lang/String;")
	public final String aString76;

	@OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class21_Sub1_Sub2(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aShort23 = (short) arg1;
		this.aString76 = arg0;
	}
}
