import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public final class Class23_Sub1_Sub1 extends Class23_Sub1 {

	@OriginalMember(owner = "client!ap", name = "q", descriptor = "I")
	public final int anInt754 = (int) (Static131.method2268() / 1000L);

	@OriginalMember(owner = "client!ap", name = "t", descriptor = "S")
	public final short aShort5;

	@OriginalMember(owner = "client!ap", name = "v", descriptor = "Ljava/lang/String;")
	public final String aString7;

	@OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class23_Sub1_Sub1(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aShort5 = (short) arg1;
		this.aString7 = arg0;
	}
}
