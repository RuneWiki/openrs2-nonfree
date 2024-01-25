import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!av")
public final class Class28 {

	@OriginalMember(owner = "client!av", name = "h", descriptor = "[F")
	public static final float[] aFloatArray2 = new float[16384];

	@OriginalMember(owner = "client!av", name = "e", descriptor = "[F")
	public static final float[] aFloatArray1 = new float[16384];

	@OriginalMember(owner = "client!av", name = "d", descriptor = "S")
	public final short aShort8;

	@OriginalMember(owner = "client!av", name = "a", descriptor = "Z")
	public final boolean aBoolean33;

	@OriginalMember(owner = "client!av", name = "i", descriptor = "S")
	public final short aShort9;

	@OriginalMember(owner = "client!av", name = "k", descriptor = "I")
	public final int anInt638;

	@OriginalMember(owner = "client!av", name = "f", descriptor = "B")
	public final byte aByte16;

	@OriginalMember(owner = "client!av", name = "b", descriptor = "B")
	public final byte aByte15;

	@OriginalMember(owner = "client!av", name = "g", descriptor = "I")
	public final int anInt637;

	@OriginalMember(owner = "client!av", name = "j", descriptor = "S")
	public final short aShort10;

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			aFloatArray2[local9] = (float) Math.sin(local7 * (double) local9);
			aFloatArray1[local9] = (float) Math.cos((double) local9 * local7);
		}
	}

	@OriginalMember(owner = "client!av", name = "<init>", descriptor = "(IIIIIIIIIZI)V")
	public Class28(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10) {
		this.aShort8 = (short) arg6;
		this.aBoolean33 = arg9;
		this.aShort9 = (short) arg5;
		this.anInt638 = arg0;
		this.aByte16 = (byte) arg7;
		this.aByte15 = (byte) arg8;
		this.anInt637 = arg10;
		this.aShort10 = (short) arg4;
	}
}
