import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public final class Class268 {

	@OriginalMember(owner = "client!og", name = "p", descriptor = "S")
	public final short aShort74;

	@OriginalMember(owner = "client!og", name = "a", descriptor = "Z")
	public final boolean aBoolean516;

	@OriginalMember(owner = "client!og", name = "d", descriptor = "B")
	public final byte aByte95;

	@OriginalMember(owner = "client!og", name = "l", descriptor = "I")
	public final int anInt7332;

	@OriginalMember(owner = "client!og", name = "e", descriptor = "S")
	public final short aShort73;

	@OriginalMember(owner = "client!og", name = "c", descriptor = "I")
	public final int anInt7329;

	@OriginalMember(owner = "client!og", name = "n", descriptor = "I")
	public final int anInt7330;

	@OriginalMember(owner = "client!og", name = "i", descriptor = "I")
	public final int anInt7326;

	@OriginalMember(owner = "client!og", name = "f", descriptor = "I")
	public final int anInt7331;

	@OriginalMember(owner = "client!og", name = "o", descriptor = "S")
	public final short aShort75;

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class268(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.aShort74 = (short) arg6;
		this.aBoolean516 = arg10;
		this.aByte95 = (byte) arg8;
		this.anInt7332 = arg11;
		this.aShort73 = (short) arg5;
		this.anInt7329 = arg3;
		this.anInt7330 = arg2;
		this.anInt7326 = arg0;
		this.anInt7331 = arg1;
		this.aShort75 = (short) arg4;
	}
}
