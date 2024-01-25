import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public final class Class95 {

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "I")
	public final int anInt2519;

	@OriginalMember(owner = "client!gk", name = "g", descriptor = "S")
	public final short aShort28;

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "B")
	public final byte aByte44;

	@OriginalMember(owner = "client!gk", name = "i", descriptor = "S")
	public final short aShort29;

	@OriginalMember(owner = "client!gk", name = "m", descriptor = "S")
	public final short aShort30;

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "Z")
	public final boolean aBoolean164;

	@OriginalMember(owner = "client!gk", name = "j", descriptor = "B")
	public final byte aByte45;

	@OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(IIIIIIIIIZ)V")
	public Class95(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		this.anInt2519 = arg0;
		this.aShort28 = (short) arg4;
		this.aByte44 = (byte) arg7;
		this.aShort29 = (short) arg5;
		this.aShort30 = (short) arg6;
		this.aBoolean164 = arg9;
		this.aByte45 = (byte) arg8;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIII)Lclient!gk;")
	public Class95 method2134(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class95(arg1, arg2, arg3, arg0, this.aShort28, this.aShort29, this.aShort30, this.aByte44, this.aByte45, this.aBoolean164);
	}
}
