import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public final class Class255 {

	@OriginalMember(owner = "client!rj", name = "i", descriptor = "I")
	public final int anInt7524;

	@OriginalMember(owner = "client!rj", name = "d", descriptor = "S")
	public final short aShort94;

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "I")
	public final int anInt7520;

	@OriginalMember(owner = "client!rj", name = "l", descriptor = "Z")
	public final boolean aBoolean535;

	@OriginalMember(owner = "client!rj", name = "m", descriptor = "I")
	public final int anInt7525;

	@OriginalMember(owner = "client!rj", name = "k", descriptor = "B")
	public final byte aByte72;

	@OriginalMember(owner = "client!rj", name = "c", descriptor = "I")
	public final int anInt7521;

	@OriginalMember(owner = "client!rj", name = "h", descriptor = "S")
	public final short aShort96;

	@OriginalMember(owner = "client!rj", name = "e", descriptor = "I")
	public final int anInt7522;

	@OriginalMember(owner = "client!rj", name = "g", descriptor = "S")
	public final short aShort95;

	@OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class255(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.anInt7524 = arg11;
		this.aShort94 = (short) arg4;
		this.anInt7520 = arg1;
		this.aBoolean535 = arg10;
		this.anInt7525 = arg0;
		this.aByte72 = (byte) arg8;
		this.anInt7521 = arg3;
		this.aShort96 = (short) arg5;
		this.anInt7522 = arg2;
		this.aShort95 = (short) arg6;
	}
}
