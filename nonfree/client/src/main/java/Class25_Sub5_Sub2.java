import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public final class Class25_Sub5_Sub2 extends Class25_Sub5 {

	@OriginalMember(owner = "client!hc", name = "r", descriptor = "I")
	public final int anInt4079 = (int) (Static96.method2000() / 1000L);

	@OriginalMember(owner = "client!hc", name = "s", descriptor = "Ljava/lang/String;")
	public final String aString103;

	@OriginalMember(owner = "client!hc", name = "w", descriptor = "S")
	public final short aShort47;

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class25_Sub5_Sub2(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString103 = arg0;
		this.aShort47 = (short) arg1;
	}
}
