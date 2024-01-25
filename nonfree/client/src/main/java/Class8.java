import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ada")
public final class Class8 {

	@OriginalMember(owner = "client!ada", name = "j", descriptor = "S")
	public final short aShort2;

	@OriginalMember(owner = "client!ada", name = "l", descriptor = "S")
	public final short aShort3;

	@OriginalMember(owner = "client!ada", name = "e", descriptor = "I")
	public final int anInt724;

	@OriginalMember(owner = "client!ada", name = "i", descriptor = "B")
	public final byte aByte2;

	@OriginalMember(owner = "client!ada", name = "n", descriptor = "I")
	public final int anInt728;

	@OriginalMember(owner = "client!ada", name = "m", descriptor = "Z")
	public final boolean aBoolean77;

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "S")
	public final short aShort1;

	@OriginalMember(owner = "client!ada", name = "c", descriptor = "B")
	public final byte aByte1;

	@OriginalMember(owner = "client!ada", name = "<init>", descriptor = "(IIIIIIIIIZI)V")
	public Class8(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10) {
		this.aShort2 = (short) arg6;
		this.aShort3 = (short) arg4;
		this.anInt724 = arg10;
		this.aByte2 = (byte) arg7;
		this.anInt728 = arg0;
		this.aBoolean77 = arg9;
		this.aShort1 = (short) arg5;
		this.aByte1 = (byte) arg8;
	}
}
