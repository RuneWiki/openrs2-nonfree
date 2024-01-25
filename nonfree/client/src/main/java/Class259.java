import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public final class Class259 {

	@OriginalMember(owner = "client!vt", name = "e", descriptor = "B")
	public final byte aByte98;

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "I")
	public final int anInt7044;

	@OriginalMember(owner = "client!vt", name = "h", descriptor = "I")
	public final int anInt7046;

	@OriginalMember(owner = "client!vt", name = "l", descriptor = "S")
	public final short aShort104;

	@OriginalMember(owner = "client!vt", name = "b", descriptor = "B")
	public final byte aByte97;

	@OriginalMember(owner = "client!vt", name = "j", descriptor = "I")
	public final int anInt7048;

	@OriginalMember(owner = "client!vt", name = "f", descriptor = "S")
	public final short aShort103;

	@OriginalMember(owner = "client!vt", name = "i", descriptor = "I")
	public final int anInt7047;

	@OriginalMember(owner = "client!vt", name = "c", descriptor = "S")
	public final short aShort102;

	@OriginalMember(owner = "client!vt", name = "g", descriptor = "Z")
	public final boolean aBoolean510;

	@OriginalMember(owner = "client!vt", name = "d", descriptor = "I")
	public final int anInt7045;

	@OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.aByte98 = (byte) arg7;
		this.anInt7044 = arg2;
		this.anInt7046 = arg1;
		this.aShort104 = (short) arg4;
		this.aByte97 = (byte) arg8;
		this.anInt7048 = arg3;
		this.aShort103 = (short) arg6;
		this.anInt7047 = arg0;
		this.aShort102 = (short) arg5;
		this.aBoolean510 = arg10;
		this.anInt7045 = arg11;
	}
}
