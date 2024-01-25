import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public final class Class67 {

	@OriginalMember(owner = "client!ep", name = "d", descriptor = "I")
	public final int anInt2191;

	@OriginalMember(owner = "client!ep", name = "m", descriptor = "S")
	public final short aShort46;

	@OriginalMember(owner = "client!ep", name = "c", descriptor = "S")
	public final short aShort44;

	@OriginalMember(owner = "client!ep", name = "k", descriptor = "I")
	public final int anInt2194;

	@OriginalMember(owner = "client!ep", name = "e", descriptor = "I")
	public final int anInt2192;

	@OriginalMember(owner = "client!ep", name = "j", descriptor = "B")
	public final byte aByte38;

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "Z")
	public final boolean aBoolean176;

	@OriginalMember(owner = "client!ep", name = "l", descriptor = "B")
	public final byte aByte39;

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "I")
	public final int anInt2190;

	@OriginalMember(owner = "client!ep", name = "f", descriptor = "S")
	public final short aShort45;

	@OriginalMember(owner = "client!ep", name = "g", descriptor = "I")
	public final int anInt2193;

	@OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class67(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.anInt2191 = arg2;
		this.aShort46 = (short) arg6;
		this.aShort44 = (short) arg4;
		this.anInt2194 = arg3;
		this.anInt2192 = arg0;
		this.aByte38 = (byte) arg8;
		this.aBoolean176 = arg10;
		this.aByte39 = (byte) arg7;
		this.anInt2190 = arg11;
		this.aShort45 = (short) arg5;
		this.anInt2193 = arg1;
	}
}
