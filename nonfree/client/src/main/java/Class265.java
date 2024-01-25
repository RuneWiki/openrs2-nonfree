import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public final class Class265 {

	@OriginalMember(owner = "client!ns", name = "h", descriptor = "S")
	public final short aShort97;

	@OriginalMember(owner = "client!ns", name = "q", descriptor = "I")
	public final int anInt7117;

	@OriginalMember(owner = "client!ns", name = "l", descriptor = "S")
	public final short aShort95;

	@OriginalMember(owner = "client!ns", name = "m", descriptor = "S")
	public final short aShort96;

	@OriginalMember(owner = "client!ns", name = "n", descriptor = "I")
	public final int anInt7120;

	@OriginalMember(owner = "client!ns", name = "p", descriptor = "I")
	public final int anInt7122;

	@OriginalMember(owner = "client!ns", name = "f", descriptor = "I")
	public final int anInt7118;

	@OriginalMember(owner = "client!ns", name = "k", descriptor = "I")
	public final int anInt7123;

	@OriginalMember(owner = "client!ns", name = "e", descriptor = "Z")
	public final boolean aBoolean604;

	@OriginalMember(owner = "client!ns", name = "i", descriptor = "B")
	public final byte aByte99;

	@OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class265(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.aShort97 = (short) arg6;
		this.anInt7117 = arg3;
		this.aShort95 = (short) arg4;
		this.aShort96 = (short) arg5;
		this.anInt7120 = arg11;
		this.anInt7122 = arg2;
		this.anInt7118 = arg0;
		this.anInt7123 = arg1;
		this.aBoolean604 = arg10;
		this.aByte99 = (byte) arg8;
	}
}
