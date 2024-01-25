import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public final class Class61 {

	@OriginalMember(owner = "client!df", name = "a", descriptor = "B")
	public final byte aByte15;

	@OriginalMember(owner = "client!df", name = "b", descriptor = "I")
	public final int anInt2149;

	@OriginalMember(owner = "client!df", name = "k", descriptor = "Z")
	public final boolean aBoolean150;

	@OriginalMember(owner = "client!df", name = "c", descriptor = "S")
	public final short aShort30;

	@OriginalMember(owner = "client!df", name = "l", descriptor = "I")
	public final int anInt2154;

	@OriginalMember(owner = "client!df", name = "d", descriptor = "I")
	public final int anInt2150;

	@OriginalMember(owner = "client!df", name = "h", descriptor = "I")
	public final int anInt2152;

	@OriginalMember(owner = "client!df", name = "i", descriptor = "I")
	public final int anInt2153;

	@OriginalMember(owner = "client!df", name = "j", descriptor = "S")
	public final short aShort32;

	@OriginalMember(owner = "client!df", name = "g", descriptor = "S")
	public final short aShort31;

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class61(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.aByte15 = (byte) arg8;
		this.anInt2149 = arg3;
		this.aBoolean150 = arg10;
		this.aShort30 = (short) arg5;
		this.anInt2154 = arg0;
		this.anInt2150 = arg11;
		this.anInt2152 = arg1;
		this.anInt2153 = arg2;
		this.aShort32 = (short) arg6;
		this.aShort31 = (short) arg4;
	}
}
