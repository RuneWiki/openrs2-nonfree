import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public final class Class299 {

	@OriginalMember(owner = "client!rt", name = "o", descriptor = "I")
	public final int anInt8672;

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "B")
	public final byte aByte101;

	@OriginalMember(owner = "client!rt", name = "i", descriptor = "I")
	public final int anInt8670;

	@OriginalMember(owner = "client!rt", name = "p", descriptor = "I")
	public final int anInt8673;

	@OriginalMember(owner = "client!rt", name = "c", descriptor = "I")
	public final int anInt8667;

	@OriginalMember(owner = "client!rt", name = "r", descriptor = "I")
	public final int anInt8674;

	@OriginalMember(owner = "client!rt", name = "b", descriptor = "Z")
	public final boolean aBoolean580;

	@OriginalMember(owner = "client!rt", name = "g", descriptor = "S")
	public final short aShort107;

	@OriginalMember(owner = "client!rt", name = "n", descriptor = "S")
	public final short aShort108;

	@OriginalMember(owner = "client!rt", name = "q", descriptor = "S")
	public final short aShort109;

	@OriginalMember(owner = "client!rt", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class299(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.anInt8672 = arg11;
		this.aByte101 = (byte) arg8;
		this.anInt8670 = arg2;
		this.anInt8673 = arg3;
		this.anInt8667 = arg1;
		this.anInt8674 = arg0;
		this.aBoolean580 = arg10;
		this.aShort107 = (short) arg6;
		this.aShort108 = (short) arg4;
		this.aShort109 = (short) arg5;
	}
}
