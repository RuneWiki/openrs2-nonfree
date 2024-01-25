import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cu")
public final class Class67 {

	@OriginalMember(owner = "client!cu", name = "i", descriptor = "[F")
	public static final float[] aFloatArray15 = new float[16384];

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "[F")
	public static final float[] aFloatArray14 = new float[16384];

	@OriginalMember(owner = "client!cu", name = "d", descriptor = "I")
	public final int anInt1721;

	@OriginalMember(owner = "client!cu", name = "b", descriptor = "I")
	public final int anInt1719;

	@OriginalMember(owner = "client!cu", name = "c", descriptor = "I")
	public final int anInt1720;

	@OriginalMember(owner = "client!cu", name = "e", descriptor = "Z")
	public final boolean aBoolean137;

	@OriginalMember(owner = "client!cu", name = "g", descriptor = "S")
	public final short aShort19;

	@OriginalMember(owner = "client!cu", name = "k", descriptor = "S")
	public final short aShort20;

	@OriginalMember(owner = "client!cu", name = "h", descriptor = "B")
	public final byte aByte31;

	@OriginalMember(owner = "client!cu", name = "m", descriptor = "S")
	public final short aShort21;

	@OriginalMember(owner = "client!cu", name = "j", descriptor = "I")
	public final int anInt1723;

	@OriginalMember(owner = "client!cu", name = "f", descriptor = "I")
	public final int anInt1722;

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			aFloatArray15[local9] = (float) Math.sin((double) local9 * local7);
			aFloatArray14[local9] = (float) Math.cos(local7 * (double) local9);
		}
	}

	@OriginalMember(owner = "client!cu", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class67(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.anInt1721 = arg3;
		this.anInt1719 = arg0;
		this.anInt1720 = arg2;
		this.aBoolean137 = arg10;
		this.aShort19 = (short) arg6;
		this.aShort20 = (short) arg4;
		this.aByte31 = (byte) arg8;
		this.aShort21 = (short) arg5;
		this.anInt1723 = arg1;
		this.anInt1722 = arg11;
	}
}
