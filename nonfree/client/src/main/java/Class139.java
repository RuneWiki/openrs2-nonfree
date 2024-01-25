import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public final class Class139 {

	@OriginalMember(owner = "client!gs", name = "f", descriptor = "S")
	public final short aShort53;

	@OriginalMember(owner = "client!gs", name = "d", descriptor = "I")
	public final int anInt4271;

	@OriginalMember(owner = "client!gs", name = "n", descriptor = "Z")
	public final boolean aBoolean352;

	@OriginalMember(owner = "client!gs", name = "o", descriptor = "I")
	public final int anInt4277;

	@OriginalMember(owner = "client!gs", name = "c", descriptor = "S")
	public final short aShort51;

	@OriginalMember(owner = "client!gs", name = "m", descriptor = "S")
	public final short aShort52;

	@OriginalMember(owner = "client!gs", name = "g", descriptor = "B")
	public final byte aByte74;

	@OriginalMember(owner = "client!gs", name = "e", descriptor = "I")
	public final int anInt4276;

	@OriginalMember(owner = "client!gs", name = "j", descriptor = "I")
	public final int anInt4274;

	@OriginalMember(owner = "client!gs", name = "i", descriptor = "I")
	public final int anInt4273;

	@OriginalMember(owner = "client!gs", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.aShort53 = (short) arg5;
		this.anInt4271 = arg3;
		this.aBoolean352 = arg10;
		this.anInt4277 = arg1;
		this.aShort51 = (short) arg6;
		this.aShort52 = (short) arg4;
		this.aByte74 = (byte) arg8;
		this.anInt4276 = arg0;
		this.anInt4274 = arg11;
		this.anInt4273 = arg2;
	}
}
