import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mga")
public final class Class224 {

	@OriginalMember(owner = "client!mga", name = "b", descriptor = "I")
	public final int anInt5516;

	@OriginalMember(owner = "client!mga", name = "g", descriptor = "I")
	public final int anInt5518;

	@OriginalMember(owner = "client!mga", name = "i", descriptor = "S")
	public final short aShort69;

	@OriginalMember(owner = "client!mga", name = "e", descriptor = "S")
	public final short aShort68;

	@OriginalMember(owner = "client!mga", name = "m", descriptor = "I")
	public final int anInt5522;

	@OriginalMember(owner = "client!mga", name = "k", descriptor = "S")
	public final short aShort70;

	@OriginalMember(owner = "client!mga", name = "f", descriptor = "B")
	public final byte aByte62;

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "I")
	public final int anInt5515;

	@OriginalMember(owner = "client!mga", name = "d", descriptor = "Z")
	public final boolean aBoolean434;

	@OriginalMember(owner = "client!mga", name = "h", descriptor = "I")
	public final int anInt5519;

	@OriginalMember(owner = "client!mga", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class224(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.anInt5516 = arg2;
		this.anInt5518 = arg0;
		this.aShort69 = (short) arg5;
		this.aShort68 = (short) arg6;
		this.anInt5522 = arg1;
		this.aShort70 = (short) arg4;
		this.aByte62 = (byte) arg8;
		this.anInt5515 = arg11;
		this.aBoolean434 = arg10;
		this.anInt5519 = arg3;
	}
}
