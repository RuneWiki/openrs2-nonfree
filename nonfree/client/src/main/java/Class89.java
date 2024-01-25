import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public final class Class89 {

	@OriginalMember(owner = "client!en", name = "a", descriptor = "S")
	public final short aShort31;

	@OriginalMember(owner = "client!en", name = "k", descriptor = "I")
	public final int anInt2516;

	@OriginalMember(owner = "client!en", name = "d", descriptor = "S")
	public final short aShort32;

	@OriginalMember(owner = "client!en", name = "b", descriptor = "I")
	public final int anInt2510;

	@OriginalMember(owner = "client!en", name = "h", descriptor = "I")
	public final int anInt2515;

	@OriginalMember(owner = "client!en", name = "e", descriptor = "I")
	public final int anInt2512;

	@OriginalMember(owner = "client!en", name = "i", descriptor = "Z")
	public final boolean aBoolean188;

	@OriginalMember(owner = "client!en", name = "j", descriptor = "S")
	public final short aShort33;

	@OriginalMember(owner = "client!en", name = "m", descriptor = "B")
	public final byte aByte37;

	@OriginalMember(owner = "client!en", name = "c", descriptor = "I")
	public final int anInt2511;

	@OriginalMember(owner = "client!en", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class89(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.aShort31 = (short) arg4;
		this.anInt2516 = arg0;
		this.aShort32 = (short) arg5;
		this.anInt2510 = arg3;
		this.anInt2515 = arg1;
		this.anInt2512 = arg11;
		this.aBoolean188 = arg10;
		this.aShort33 = (short) arg6;
		this.aByte37 = (byte) arg8;
		this.anInt2511 = arg2;
	}
}
