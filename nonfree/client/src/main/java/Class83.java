import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!et")
public final class Class83 {

	@OriginalMember(owner = "client!et", name = "g", descriptor = "[F")
	public static final float[] aFloatArray29 = new float[16384];

	@OriginalMember(owner = "client!et", name = "j", descriptor = "[F")
	public static final float[] aFloatArray30 = new float[16384];

	@OriginalMember(owner = "client!et", name = "q", descriptor = "S")
	public final short aShort45;

	@OriginalMember(owner = "client!et", name = "c", descriptor = "S")
	public final short aShort43;

	@OriginalMember(owner = "client!et", name = "e", descriptor = "Z")
	public final boolean aBoolean187;

	@OriginalMember(owner = "client!et", name = "f", descriptor = "S")
	public final short aShort44;

	@OriginalMember(owner = "client!et", name = "d", descriptor = "I")
	public final int anInt2853;

	@OriginalMember(owner = "client!et", name = "l", descriptor = "I")
	public final int anInt2857;

	@OriginalMember(owner = "client!et", name = "k", descriptor = "I")
	public final int anInt2856;

	@OriginalMember(owner = "client!et", name = "a", descriptor = "B")
	public final byte aByte16;

	@OriginalMember(owner = "client!et", name = "h", descriptor = "I")
	public final int anInt2854;

	@OriginalMember(owner = "client!et", name = "i", descriptor = "I")
	public final int anInt2855;

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			aFloatArray29[local9] = (float) Math.sin((double) local9 * local7);
			aFloatArray30[local9] = (float) Math.cos(local7 * (double) local9);
		}
	}

	@OriginalMember(owner = "client!et", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class83(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.aShort45 = (short) arg6;
		this.aShort43 = (short) arg4;
		this.aBoolean187 = arg10;
		this.aShort44 = (short) arg5;
		this.anInt2853 = arg2;
		this.anInt2857 = arg0;
		this.anInt2856 = arg3;
		this.aByte16 = (byte) arg8;
		this.anInt2854 = arg11;
		this.anInt2855 = arg1;
	}
}
