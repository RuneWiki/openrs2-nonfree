import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qv")
public final class Class266 {

	@OriginalMember(owner = "client!qv", name = "f", descriptor = "B")
	public final byte aByte84;

	@OriginalMember(owner = "client!qv", name = "e", descriptor = "I")
	public final int anInt7543;

	@OriginalMember(owner = "client!qv", name = "l", descriptor = "I")
	public final int anInt7546;

	@OriginalMember(owner = "client!qv", name = "d", descriptor = "I")
	public final int anInt7542;

	@OriginalMember(owner = "client!qv", name = "h", descriptor = "S")
	public final short aShort105;

	@OriginalMember(owner = "client!qv", name = "k", descriptor = "I")
	public final int anInt7545;

	@OriginalMember(owner = "client!qv", name = "b", descriptor = "S")
	public final short aShort103;

	@OriginalMember(owner = "client!qv", name = "i", descriptor = "Z")
	public final boolean aBoolean521;

	@OriginalMember(owner = "client!qv", name = "g", descriptor = "S")
	public final short aShort104;

	@OriginalMember(owner = "client!qv", name = "j", descriptor = "I")
	public final int anInt7544;

	@OriginalMember(owner = "client!qv", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class266(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.aByte84 = (byte) arg8;
		this.anInt7543 = arg11;
		this.anInt7546 = arg2;
		this.anInt7542 = arg1;
		this.aShort105 = (short) arg6;
		this.anInt7545 = arg3;
		this.aShort103 = (short) arg5;
		this.aBoolean521 = arg10;
		this.aShort104 = (short) arg4;
		this.anInt7544 = arg0;
	}
}
