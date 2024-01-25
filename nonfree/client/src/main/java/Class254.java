import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nv")
public final class Class254 {

	@OriginalMember(owner = "client!nv", name = "n", descriptor = "Z")
	public final boolean aBoolean457;

	@OriginalMember(owner = "client!nv", name = "o", descriptor = "I")
	public final int anInt6374;

	@OriginalMember(owner = "client!nv", name = "m", descriptor = "I")
	public final int anInt6373;

	@OriginalMember(owner = "client!nv", name = "d", descriptor = "B")
	public final byte aByte99;

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "I")
	public final int anInt6366;

	@OriginalMember(owner = "client!nv", name = "h", descriptor = "S")
	public final short aShort91;

	@OriginalMember(owner = "client!nv", name = "c", descriptor = "S")
	public final short aShort90;

	@OriginalMember(owner = "client!nv", name = "i", descriptor = "I")
	public final int anInt6370;

	@OriginalMember(owner = "client!nv", name = "l", descriptor = "I")
	public final int anInt6372;

	@OriginalMember(owner = "client!nv", name = "j", descriptor = "S")
	public final short aShort92;

	@OriginalMember(owner = "client!nv", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class254(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.aBoolean457 = arg10;
		this.anInt6374 = arg11;
		this.anInt6373 = arg0;
		this.aByte99 = (byte) arg8;
		this.anInt6366 = arg2;
		this.aShort91 = (short) arg5;
		this.aShort90 = (short) arg4;
		this.anInt6370 = arg1;
		this.anInt6372 = arg3;
		this.aShort92 = (short) arg6;
	}
}
