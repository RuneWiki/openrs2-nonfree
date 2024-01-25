import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public final class Class314 {

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "Z")
	public final boolean aBoolean579;

	@OriginalMember(owner = "client!rs", name = "j", descriptor = "I")
	public final int anInt8335;

	@OriginalMember(owner = "client!rs", name = "h", descriptor = "I")
	public final int anInt8334;

	@OriginalMember(owner = "client!rs", name = "l", descriptor = "I")
	public final int anInt8337;

	@OriginalMember(owner = "client!rs", name = "m", descriptor = "B")
	public final byte aByte121;

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "S")
	public final short aShort78;

	@OriginalMember(owner = "client!rs", name = "g", descriptor = "S")
	public final short aShort79;

	@OriginalMember(owner = "client!rs", name = "f", descriptor = "I")
	public final int anInt8333;

	@OriginalMember(owner = "client!rs", name = "e", descriptor = "I")
	public final int anInt8332;

	@OriginalMember(owner = "client!rs", name = "i", descriptor = "S")
	public final short aShort80;

	@OriginalMember(owner = "client!rs", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class314(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.aBoolean579 = arg10;
		this.anInt8335 = arg11;
		this.anInt8334 = arg2;
		this.anInt8337 = arg1;
		this.aByte121 = (byte) arg8;
		this.aShort78 = (short) arg6;
		this.aShort79 = (short) arg5;
		this.anInt8333 = arg3;
		this.anInt8332 = arg0;
		this.aShort80 = (short) arg4;
	}
}
