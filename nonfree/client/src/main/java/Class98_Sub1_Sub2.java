import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pga")
public final class Class98_Sub1_Sub2 extends Class98_Sub1 {

	@OriginalMember(owner = "client!pga", name = "u", descriptor = "I")
	public final int anInt6945 = (int) (Static8.method201() / 1000L);

	@OriginalMember(owner = "client!pga", name = "t", descriptor = "Ljava/lang/String;")
	public final String aString60;

	@OriginalMember(owner = "client!pga", name = "q", descriptor = "S")
	public final short aShort89;

	@OriginalMember(owner = "client!pga", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class98_Sub1_Sub2(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString60 = arg0;
		this.aShort89 = (short) arg1;
	}
}
