import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public final class Class21_Sub3_Sub2 extends Class21_Sub3 {

	@OriginalMember(owner = "client!ws", name = "m", descriptor = "I")
	public final int anInt10591 = (int) (Static112.method2047() / 1000L);

	@OriginalMember(owner = "client!ws", name = "o", descriptor = "S")
	public final short aShort125;

	@OriginalMember(owner = "client!ws", name = "s", descriptor = "Ljava/lang/String;")
	public final String aString234;

	@OriginalMember(owner = "client!ws", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class21_Sub3_Sub2(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aShort125 = (short) arg1;
		this.aString234 = arg0;
	}
}
