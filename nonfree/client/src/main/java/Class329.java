import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sw")
public final class Class329 {

	@OriginalMember(owner = "client!sw", name = "l", descriptor = "I")
	public final int anInt9365;

	@OriginalMember(owner = "client!sw", name = "b", descriptor = "S")
	public final short aShort103;

	@OriginalMember(owner = "client!sw", name = "c", descriptor = "I")
	public final int anInt9371;

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "I")
	public final int anInt9367;

	@OriginalMember(owner = "client!sw", name = "i", descriptor = "S")
	public final short aShort102;

	@OriginalMember(owner = "client!sw", name = "f", descriptor = "S")
	public final short aShort101;

	@OriginalMember(owner = "client!sw", name = "j", descriptor = "I")
	public final int anInt9366;

	@OriginalMember(owner = "client!sw", name = "e", descriptor = "Z")
	public final boolean aBoolean719;

	@OriginalMember(owner = "client!sw", name = "h", descriptor = "B")
	public final byte aByte131;

	@OriginalMember(owner = "client!sw", name = "m", descriptor = "I")
	public final int anInt9368;

	@OriginalMember(owner = "client!sw", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class329(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.anInt9365 = arg3;
		this.aShort103 = (short) arg4;
		this.anInt9371 = arg0;
		this.anInt9367 = arg2;
		this.aShort102 = (short) arg5;
		this.aShort101 = (short) arg6;
		this.anInt9366 = arg1;
		this.aBoolean719 = arg10;
		this.aByte131 = (byte) arg8;
		this.anInt9368 = arg11;
	}
}
