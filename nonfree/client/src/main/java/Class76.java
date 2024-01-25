import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public final class Class76 {

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "S")
	public final short aShort23;

	@OriginalMember(owner = "client!ds", name = "b", descriptor = "S")
	public final short aShort24;

	@OriginalMember(owner = "client!ds", name = "h", descriptor = "B")
	public final byte aByte30;

	@OriginalMember(owner = "client!ds", name = "d", descriptor = "I")
	public final int anInt2369;

	@OriginalMember(owner = "client!ds", name = "e", descriptor = "I")
	public final int anInt2370;

	@OriginalMember(owner = "client!ds", name = "f", descriptor = "I")
	public final int anInt2371;

	@OriginalMember(owner = "client!ds", name = "j", descriptor = "I")
	public final int anInt2373;

	@OriginalMember(owner = "client!ds", name = "m", descriptor = "S")
	public final short aShort25;

	@OriginalMember(owner = "client!ds", name = "l", descriptor = "Z")
	public final boolean aBoolean205;

	@OriginalMember(owner = "client!ds", name = "i", descriptor = "I")
	public final int anInt2372;

	@OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class76(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.aShort23 = (short) arg4;
		this.aShort24 = (short) arg6;
		this.aByte30 = (byte) arg8;
		this.anInt2369 = arg3;
		this.anInt2370 = arg11;
		this.anInt2371 = arg2;
		this.anInt2373 = arg0;
		this.aShort25 = (short) arg5;
		this.aBoolean205 = arg10;
		this.anInt2372 = arg1;
	}
}
