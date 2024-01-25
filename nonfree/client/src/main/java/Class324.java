import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public final class Class324 {

	@OriginalMember(owner = "client!tg", name = "e", descriptor = "I")
	public final int anInt8248;

	@OriginalMember(owner = "client!tg", name = "h", descriptor = "S")
	public final short aShort136;

	@OriginalMember(owner = "client!tg", name = "d", descriptor = "I")
	public final int anInt8247;

	@OriginalMember(owner = "client!tg", name = "i", descriptor = "S")
	public final short aShort137;

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "I")
	public final int anInt8245;

	@OriginalMember(owner = "client!tg", name = "j", descriptor = "I")
	public final int anInt8249;

	@OriginalMember(owner = "client!tg", name = "f", descriptor = "S")
	public final short aShort135;

	@OriginalMember(owner = "client!tg", name = "c", descriptor = "I")
	public final int anInt8246;

	@OriginalMember(owner = "client!tg", name = "g", descriptor = "Z")
	public final boolean aBoolean634;

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "B")
	public final byte aByte109;

	@OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class324(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.anInt8248 = arg1;
		this.aShort136 = (short) arg6;
		this.anInt8247 = arg0;
		this.aShort137 = (short) arg5;
		this.anInt8245 = arg2;
		this.anInt8249 = arg3;
		this.aShort135 = (short) arg4;
		this.anInt8246 = arg11;
		this.aBoolean634 = arg10;
		this.aByte109 = (byte) arg8;
	}
}
