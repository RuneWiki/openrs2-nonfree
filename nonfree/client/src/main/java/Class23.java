import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public final class Class23 {

	@OriginalMember(owner = "client!av", name = "n", descriptor = "Z")
	public final boolean aBoolean16;

	@OriginalMember(owner = "client!av", name = "c", descriptor = "S")
	public final short aShort1;

	@OriginalMember(owner = "client!av", name = "j", descriptor = "I")
	public final int anInt412;

	@OriginalMember(owner = "client!av", name = "o", descriptor = "I")
	public final int anInt415;

	@OriginalMember(owner = "client!av", name = "b", descriptor = "I")
	public final int anInt408;

	@OriginalMember(owner = "client!av", name = "h", descriptor = "I")
	public final int anInt410;

	@OriginalMember(owner = "client!av", name = "g", descriptor = "S")
	public final short aShort2;

	@OriginalMember(owner = "client!av", name = "l", descriptor = "S")
	public final short aShort3;

	@OriginalMember(owner = "client!av", name = "m", descriptor = "I")
	public final int anInt414;

	@OriginalMember(owner = "client!av", name = "e", descriptor = "B")
	public final byte aByte3;

	@OriginalMember(owner = "client!av", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class23(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.aBoolean16 = arg10;
		this.aShort1 = (short) arg5;
		this.anInt412 = arg0;
		this.anInt415 = arg1;
		this.anInt408 = arg3;
		this.anInt410 = arg2;
		this.aShort2 = (short) arg6;
		this.aShort3 = (short) arg4;
		this.anInt414 = arg11;
		this.aByte3 = (byte) arg8;
	}
}
