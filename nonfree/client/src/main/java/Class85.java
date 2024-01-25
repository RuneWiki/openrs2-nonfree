import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eia")
public final class Class85 {

	@OriginalMember(owner = "client!eia", name = "k", descriptor = "B")
	public final byte aByte34;

	@OriginalMember(owner = "client!eia", name = "f", descriptor = "S")
	public final short aShort29;

	@OriginalMember(owner = "client!eia", name = "h", descriptor = "Z")
	public final boolean aBoolean138;

	@OriginalMember(owner = "client!eia", name = "b", descriptor = "I")
	public final int anInt2286;

	@OriginalMember(owner = "client!eia", name = "j", descriptor = "I")
	public final int anInt2290;

	@OriginalMember(owner = "client!eia", name = "i", descriptor = "I")
	public final int anInt2289;

	@OriginalMember(owner = "client!eia", name = "l", descriptor = "S")
	public final short aShort30;

	@OriginalMember(owner = "client!eia", name = "d", descriptor = "S")
	public final short aShort28;

	@OriginalMember(owner = "client!eia", name = "g", descriptor = "I")
	public final int anInt2288;

	@OriginalMember(owner = "client!eia", name = "c", descriptor = "I")
	public final int anInt2287;

	@OriginalMember(owner = "client!eia", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class85(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.aByte34 = (byte) arg8;
		this.aShort29 = (short) arg4;
		this.aBoolean138 = arg10;
		this.anInt2286 = arg2;
		this.anInt2290 = arg0;
		this.anInt2289 = arg1;
		this.aShort30 = (short) arg6;
		this.aShort28 = (short) arg5;
		this.anInt2288 = arg3;
		this.anInt2287 = arg11;
	}
}
