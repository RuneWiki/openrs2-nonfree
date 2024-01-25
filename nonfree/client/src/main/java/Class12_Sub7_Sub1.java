import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public final class Class12_Sub7_Sub1 extends Class12_Sub7 {

	@OriginalMember(owner = "client!l", name = "y", descriptor = "I")
	public final int anInt6098 = (int) (Static521.method7499() / 1000L);

	@OriginalMember(owner = "client!l", name = "x", descriptor = "Ljava/lang/String;")
	public final String aString66;

	@OriginalMember(owner = "client!l", name = "D", descriptor = "S")
	public final short aShort69;

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class12_Sub7_Sub1(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString66 = arg0;
		this.aShort69 = (short) arg1;
	}
}
