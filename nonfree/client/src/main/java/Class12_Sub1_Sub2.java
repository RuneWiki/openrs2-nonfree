import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ow")
public final class Class12_Sub1_Sub2 extends Class12_Sub1 {

	@OriginalMember(owner = "client!ow", name = "q", descriptor = "I")
	public final int anInt6564 = (int) (Static362.method5133() / 1000L);

	@OriginalMember(owner = "client!ow", name = "u", descriptor = "Ljava/lang/String;")
	public final String aString93;

	@OriginalMember(owner = "client!ow", name = "r", descriptor = "S")
	public final short aShort84;

	@OriginalMember(owner = "client!ow", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class12_Sub1_Sub2(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString93 = arg0;
		this.aShort84 = (short) arg1;
	}
}
