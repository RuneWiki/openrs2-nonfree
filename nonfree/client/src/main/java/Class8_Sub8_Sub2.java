import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public final class Class8_Sub8_Sub2 extends Class8_Sub8 {

	@OriginalMember(owner = "client!qh", name = "v", descriptor = "I")
	public final int anInt8113 = (int) (Static515.method7499(110) / 1000L);

	@OriginalMember(owner = "client!qh", name = "s", descriptor = "Ljava/lang/String;")
	public final String aString106;

	@OriginalMember(owner = "client!qh", name = "t", descriptor = "S")
	public final short aShort98;

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class8_Sub8_Sub2(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString106 = arg0;
		this.aShort98 = (short) arg1;
	}
}
