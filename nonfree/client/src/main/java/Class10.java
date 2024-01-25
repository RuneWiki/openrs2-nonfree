import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Class10 {

	@OriginalMember(owner = "client!af", name = "C", descriptor = "[Lclient!ria;")
	private static final Class295[] aClass295Array1 = new Class295[32];

	@OriginalMember(owner = "client!af", name = "e", descriptor = "[I")
	public final int[] anIntArray24 = new int[4];

	@OriginalMember(owner = "client!af", name = "m", descriptor = "[I")
	public final int[] anIntArray26 = new int[4];

	@OriginalMember(owner = "client!af", name = "d", descriptor = "B")
	public final byte aByte1;

	@OriginalMember(owner = "client!af", name = "g", descriptor = "[I")
	public final int[] anIntArray25;

	@OriginalMember(owner = "client!af", name = "i", descriptor = "B")
	public final byte aByte2;

	@OriginalMember(owner = "client!af", name = "f", descriptor = "S")
	public final short aShort1;

	@OriginalMember(owner = "client!af", name = "h", descriptor = "S")
	public final short aShort2;

	@OriginalMember(owner = "client!af", name = "j", descriptor = "S")
	public final short aShort3;

	@OriginalMember(owner = "client!af", name = "b", descriptor = "[S")
	public final short[] aShortArray2;

	@OriginalMember(owner = "client!af", name = "o", descriptor = "S")
	public final short aShort4;

	@OriginalMember(owner = "client!af", name = "l", descriptor = "[S")
	public final short[] aShortArray4;

	@OriginalMember(owner = "client!af", name = "c", descriptor = "[S")
	public final short[] aShortArray3;

	static {
		@Pc(89) Class295[] local89 = Static446.method6623();
		for (@Pc(91) int local91 = 0; local91 < local89.length; local91++) {
			aClass295Array1[local89[local91].anInt8334] = local89[local91];
		}
	}

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "(IIIIIIIIIIIIII)V")
	public Class10(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		this.aByte1 = (byte) arg0;
		this.anIntArray25 = new int[4];
		this.aByte2 = (byte) arg1;
		this.anIntArray25[1] = arg3;
		this.anIntArray25[3] = arg5;
		this.anIntArray25[2] = arg4;
		this.anIntArray25[0] = arg2;
		this.anIntArray26[0] = arg6;
		this.anIntArray26[1] = arg7;
		this.anIntArray26[2] = arg8;
		this.anIntArray26[3] = arg9;
		this.anIntArray24[0] = arg10;
		this.anIntArray24[3] = arg13;
		this.anIntArray24[1] = arg11;
		this.anIntArray24[2] = arg12;
		this.aShort1 = (short) (arg2 >> Static415.anInt7579);
		this.aShort2 = (short) (arg4 >> Static415.anInt7579);
		this.aShort3 = (short) (arg10 >> Static415.anInt7579);
		this.aShortArray2 = new short[4];
		this.aShort4 = (short) (arg12 >> Static415.anInt7579);
		this.aShortArray4 = new short[4];
		this.aShortArray3 = new short[4];
	}
}
