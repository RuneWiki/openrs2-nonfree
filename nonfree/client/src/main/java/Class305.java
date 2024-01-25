import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public final class Class305 {

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "B")
	public final byte aByte104;

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "Z")
	public final boolean aBoolean617;

	@OriginalMember(owner = "client!sc", name = "k", descriptor = "S")
	public final short aShort129;

	@OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
	public final int anInt7892;

	@OriginalMember(owner = "client!sc", name = "n", descriptor = "S")
	public final short aShort130;

	@OriginalMember(owner = "client!sc", name = "j", descriptor = "I")
	public final int anInt7894;

	@OriginalMember(owner = "client!sc", name = "o", descriptor = "B")
	public final byte aByte105;

	@OriginalMember(owner = "client!sc", name = "g", descriptor = "S")
	public final short aShort128;

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(IIIIIIIIIZI)V")
	public Class305(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10) {
		this.aByte104 = (byte) arg7;
		this.aBoolean617 = arg9;
		this.aShort129 = (short) arg4;
		this.anInt7892 = arg10;
		this.aShort130 = (short) arg5;
		this.anInt7894 = arg0;
		this.aByte105 = (byte) arg8;
		this.aShort128 = (short) arg6;
	}
}
