import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public final class Class3_Sub2_Sub1 extends Class3_Sub2 {

	@OriginalMember(owner = "client!ev", name = "q", descriptor = "I")
	public final int anInt3406 = (int) (Static277.method5091() / 1000L);

	@OriginalMember(owner = "client!ev", name = "m", descriptor = "Ljava/lang/String;")
	public final String aString28;

	@OriginalMember(owner = "client!ev", name = "p", descriptor = "S")
	public final short aShort33;

	@OriginalMember(owner = "client!ev", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class3_Sub2_Sub1(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString28 = arg0;
		this.aShort33 = (short) arg1;
	}
}
