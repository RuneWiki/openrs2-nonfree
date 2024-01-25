import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public final class Class80 {

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "Lclient!tg;")
	public Interface9 anInterface9_2;

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "B")
	public final byte aByte34;

	@OriginalMember(owner = "client!ff", name = "f", descriptor = "B")
	public byte aByte35;

	@OriginalMember(owner = "client!ff", name = "e", descriptor = "S")
	public final short aShort41;

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(Lclient!tg;III)V")
	public Class80(@OriginalArg(0) Interface9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInterface9_2 = arg0;
		this.aByte34 = (byte) arg2;
		this.aByte35 = (byte) arg3;
		this.aShort41 = (short) arg1;
	}
}
