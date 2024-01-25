import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pi")
public final class Class262 {

	@OriginalMember(owner = "client!pi", name = "p", descriptor = "[I")
	public static final int[] anIntArray420 = new int[16384];

	@OriginalMember(owner = "client!pi", name = "q", descriptor = "[I")
	public static final int[] anIntArray421 = new int[16384];

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "B")
	public final byte aByte112;

	@OriginalMember(owner = "client!pi", name = "m", descriptor = "[I")
	public final int[] anIntArray418;

	@OriginalMember(owner = "client!pi", name = "f", descriptor = "B")
	public final byte aByte113;

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "[I")
	public final int[] anIntArray417;

	@OriginalMember(owner = "client!pi", name = "n", descriptor = "[I")
	public final int[] anIntArray419;

	@OriginalMember(owner = "client!pi", name = "h", descriptor = "S")
	public final short aShort90;

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "S")
	public final short aShort88;

	@OriginalMember(owner = "client!pi", name = "i", descriptor = "S")
	public final short aShort91;

	@OriginalMember(owner = "client!pi", name = "l", descriptor = "[S")
	public final short[] aShortArray94;

	@OriginalMember(owner = "client!pi", name = "e", descriptor = "[S")
	public final short[] aShortArray93;

	@OriginalMember(owner = "client!pi", name = "d", descriptor = "[S")
	public final short[] aShortArray92;

	@OriginalMember(owner = "client!pi", name = "g", descriptor = "S")
	public final short aShort89;

	static {
		@Pc(19) double local19 = 3.834951969714103E-4D;
		for (@Pc(21) int local21 = 0; local21 < 16384; local21++) {
			anIntArray420[local21] = (int) (Math.sin((double) local21 * local19) * 16384.0D);
			anIntArray421[local21] = (int) (Math.cos(local19 * (double) local21) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(IIIIIIIIIIIIII)V")
	public Class262(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		this.aByte112 = (byte) arg0;
		this.anIntArray418 = new int[4];
		this.aByte113 = (byte) arg1;
		this.anIntArray417 = new int[4];
		this.anIntArray419 = new int[4];
		this.anIntArray419[1] = arg3;
		this.anIntArray419[2] = arg4;
		this.anIntArray419[0] = arg2;
		this.anIntArray419[3] = arg5;
		this.anIntArray417[1] = arg7;
		this.anIntArray417[3] = arg9;
		this.anIntArray417[2] = arg8;
		this.anIntArray417[0] = arg6;
		this.anIntArray418[2] = arg12;
		this.aShort90 = (short) (arg2 >> Static392.anInt3635);
		this.anIntArray418[0] = arg10;
		this.anIntArray418[1] = arg11;
		this.anIntArray418[3] = arg13;
		this.aShort88 = (short) (arg4 >> Static392.anInt3635);
		this.aShort91 = (short) (arg10 >> Static392.anInt3635);
		this.aShortArray94 = new short[4];
		this.aShortArray93 = new short[4];
		this.aShortArray92 = new short[4];
		this.aShort89 = (short) (arg12 >> Static392.anInt3635);
	}
}
