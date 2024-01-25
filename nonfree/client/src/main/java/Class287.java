import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rfa")
public final class Class287 {

	@OriginalMember(owner = "client!rfa", name = "m", descriptor = "I")
	public final int anInt7746;

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "S")
	public final short aShort111;

	@OriginalMember(owner = "client!rfa", name = "n", descriptor = "S")
	public final short aShort113;

	@OriginalMember(owner = "client!rfa", name = "e", descriptor = "I")
	public final int anInt7741;

	@OriginalMember(owner = "client!rfa", name = "j", descriptor = "S")
	public final short aShort112;

	@OriginalMember(owner = "client!rfa", name = "g", descriptor = "I")
	public final int anInt7743;

	@OriginalMember(owner = "client!rfa", name = "t", descriptor = "B")
	public final byte aByte106;

	@OriginalMember(owner = "client!rfa", name = "u", descriptor = "Z")
	public final boolean aBoolean595;

	@OriginalMember(owner = "client!rfa", name = "f", descriptor = "I")
	public final int anInt7742;

	@OriginalMember(owner = "client!rfa", name = "d", descriptor = "I")
	public final int anInt7740;

	@OriginalMember(owner = "client!rfa", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class287(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.anInt7746 = arg2;
		this.aShort111 = (short) arg5;
		this.aShort113 = (short) arg4;
		this.anInt7741 = arg1;
		this.aShort112 = (short) arg6;
		this.anInt7743 = arg3;
		this.aByte106 = (byte) arg8;
		this.aBoolean595 = arg10;
		this.anInt7742 = arg0;
		this.anInt7740 = arg11;
	}
}
