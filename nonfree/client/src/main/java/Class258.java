import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public final class Class258 {

	@OriginalMember(owner = "client!vh", name = "h", descriptor = "I")
	public final int anInt7258;

	@OriginalMember(owner = "client!vh", name = "f", descriptor = "I")
	public final int anInt7256;

	@OriginalMember(owner = "client!vh", name = "s", descriptor = "S")
	public final short aShort104;

	@OriginalMember(owner = "client!vh", name = "m", descriptor = "I")
	public final int anInt7262;

	@OriginalMember(owner = "client!vh", name = "k", descriptor = "S")
	public final short aShort103;

	@OriginalMember(owner = "client!vh", name = "n", descriptor = "I")
	public final int anInt7263;

	@OriginalMember(owner = "client!vh", name = "c", descriptor = "S")
	public final short aShort102;

	@OriginalMember(owner = "client!vh", name = "r", descriptor = "B")
	public final byte aByte99;

	@OriginalMember(owner = "client!vh", name = "o", descriptor = "B")
	public final byte aByte98;

	@OriginalMember(owner = "client!vh", name = "g", descriptor = "I")
	public final int anInt7257;

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "Z")
	public final boolean aBoolean494;

	@OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class258(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.anInt7258 = arg1;
		this.anInt7256 = arg3;
		this.aShort104 = (short) arg5;
		this.anInt7262 = arg2;
		this.aShort103 = (short) arg4;
		this.anInt7263 = arg11;
		this.aShort102 = (short) arg6;
		this.aByte99 = (byte) arg8;
		this.aByte98 = (byte) arg7;
		this.anInt7257 = arg0;
		this.aBoolean494 = arg10;
	}
}
