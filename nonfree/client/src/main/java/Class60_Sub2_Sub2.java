import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public final class Class60_Sub2_Sub2 extends Class60_Sub2 {

	@OriginalMember(owner = "client!pr", name = "x", descriptor = "I")
	public final int anInt8052 = (int) (Static549.method7758() / 1000L);

	@OriginalMember(owner = "client!pr", name = "t", descriptor = "S")
	public final short aShort95;

	@OriginalMember(owner = "client!pr", name = "r", descriptor = "Ljava/lang/String;")
	public final String aString90;

	@OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class60_Sub2_Sub2(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aShort95 = (short) arg1;
		this.aString90 = arg0;
	}
}
