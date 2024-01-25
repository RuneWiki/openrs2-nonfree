import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public final class Class98 {

	@OriginalMember(owner = "client!et", name = "m", descriptor = "I")
	public final int anInt2884;

	@OriginalMember(owner = "client!et", name = "i", descriptor = "S")
	public final short aShort22;

	@OriginalMember(owner = "client!et", name = "g", descriptor = "B")
	public final byte aByte49;

	@OriginalMember(owner = "client!et", name = "n", descriptor = "S")
	public final short aShort23;

	@OriginalMember(owner = "client!et", name = "o", descriptor = "S")
	public final short aShort24;

	@OriginalMember(owner = "client!et", name = "d", descriptor = "I")
	public final int anInt2880;

	@OriginalMember(owner = "client!et", name = "f", descriptor = "I")
	public final int anInt2881;

	@OriginalMember(owner = "client!et", name = "a", descriptor = "I")
	public final int anInt2878;

	@OriginalMember(owner = "client!et", name = "b", descriptor = "Z")
	public final boolean aBoolean213;

	@OriginalMember(owner = "client!et", name = "c", descriptor = "I")
	public final int anInt2879;

	@OriginalMember(owner = "client!et", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class98(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.anInt2884 = arg0;
		this.aShort22 = (short) arg5;
		this.aByte49 = (byte) arg8;
		this.aShort23 = (short) arg6;
		this.aShort24 = (short) arg4;
		this.anInt2880 = arg3;
		this.anInt2881 = arg2;
		this.anInt2878 = arg11;
		this.aBoolean213 = arg10;
		this.anInt2879 = arg1;
	}
}
