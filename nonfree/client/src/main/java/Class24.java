import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ar")
public final class Class24 {

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "[F")
	public static final float[] aFloatArray3 = new float[16384];

	@OriginalMember(owner = "client!ar", name = "f", descriptor = "[F")
	public static final float[] aFloatArray4 = new float[16384];

	@OriginalMember(owner = "client!ar", name = "e", descriptor = "I")
	public final int anInt381;

	@OriginalMember(owner = "client!ar", name = "j", descriptor = "B")
	public final byte aByte22;

	@OriginalMember(owner = "client!ar", name = "l", descriptor = "S")
	public final short aShort16;

	@OriginalMember(owner = "client!ar", name = "d", descriptor = "B")
	public final byte aByte23;

	@OriginalMember(owner = "client!ar", name = "h", descriptor = "S")
	public final short aShort14;

	@OriginalMember(owner = "client!ar", name = "c", descriptor = "Z")
	public final boolean aBoolean53;

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "I")
	public final int anInt383;

	@OriginalMember(owner = "client!ar", name = "m", descriptor = "S")
	public final short aShort15;

	static {
		@Pc(28) double local28 = 3.834951969714103E-4D;
		for (@Pc(30) int local30 = 0; local30 < 16384; local30++) {
			aFloatArray4[local30] = (float) Math.sin(local28 * (double) local30);
			aFloatArray3[local30] = (float) Math.cos((double) local30 * local28);
		}
	}

	@OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(IIIIIIIIIZI)V")
	public Class24(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10) {
		this.anInt381 = arg0;
		this.aByte22 = (byte) arg8;
		this.aShort16 = (short) arg4;
		this.aByte23 = (byte) arg7;
		this.aShort14 = (short) arg5;
		this.aBoolean53 = arg9;
		this.anInt383 = arg10;
		this.aShort15 = (short) arg6;
	}
}
