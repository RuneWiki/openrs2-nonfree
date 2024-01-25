import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public final class Class148 {

	@OriginalMember(owner = "client!in", name = "f", descriptor = "S")
	public final short aShort54;

	@OriginalMember(owner = "client!in", name = "c", descriptor = "Z")
	public final boolean aBoolean301;

	@OriginalMember(owner = "client!in", name = "d", descriptor = "S")
	public final short aShort53;

	@OriginalMember(owner = "client!in", name = "g", descriptor = "I")
	public final int anInt4657;

	@OriginalMember(owner = "client!in", name = "i", descriptor = "I")
	public final int anInt4659;

	@OriginalMember(owner = "client!in", name = "a", descriptor = "S")
	public final short aShort52;

	@OriginalMember(owner = "client!in", name = "k", descriptor = "I")
	public final int anInt4661;

	@OriginalMember(owner = "client!in", name = "l", descriptor = "I")
	public final int anInt4662;

	@OriginalMember(owner = "client!in", name = "h", descriptor = "I")
	public final int anInt4658;

	@OriginalMember(owner = "client!in", name = "e", descriptor = "B")
	public final byte aByte44;

	@OriginalMember(owner = "client!in", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.aShort54 = (short) arg5;
		this.aBoolean301 = arg10;
		this.aShort53 = (short) arg4;
		this.anInt4657 = arg3;
		this.anInt4659 = arg11;
		this.aShort52 = (short) arg6;
		this.anInt4661 = arg0;
		this.anInt4662 = arg2;
		this.anInt4658 = arg1;
		this.aByte44 = (byte) arg8;
	}
}
