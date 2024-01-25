import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public final class Class5_Sub1_Sub2 extends Class5_Sub1 {

	@OriginalMember(owner = "client!io", name = "s", descriptor = "I")
	public final int anInt4745 = (int) (Static174.method3502() / 1000L);

	@OriginalMember(owner = "client!io", name = "m", descriptor = "S")
	public final short aShort43;

	@OriginalMember(owner = "client!io", name = "l", descriptor = "Ljava/lang/String;")
	public final String aString53;

	@OriginalMember(owner = "client!io", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class5_Sub1_Sub2(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aShort43 = (short) arg1;
		this.aString53 = arg0;
	}
}
