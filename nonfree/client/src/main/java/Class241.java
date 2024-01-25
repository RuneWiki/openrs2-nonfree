import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public final class Class241 {

	@OriginalMember(owner = "client!oe", name = "d", descriptor = "B")
	public final byte aByte84;

	@OriginalMember(owner = "client!oe", name = "m", descriptor = "B")
	public final byte aByte85;

	@OriginalMember(owner = "client!oe", name = "i", descriptor = "[I")
	public final int[] anIntArray508;

	@OriginalMember(owner = "client!oe", name = "r", descriptor = "[I")
	public final int[] anIntArray509;

	@OriginalMember(owner = "client!oe", name = "e", descriptor = "[I")
	public final int[] anIntArray507;

	@OriginalMember(owner = "client!oe", name = "k", descriptor = "S")
	public final short aShort90;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "S")
	public final short aShort87;

	@OriginalMember(owner = "client!oe", name = "j", descriptor = "S")
	public final short aShort89;

	@OriginalMember(owner = "client!oe", name = "f", descriptor = "S")
	public final short aShort88;

	@OriginalMember(owner = "client!oe", name = "o", descriptor = "[S")
	public final short[] aShortArray218;

	@OriginalMember(owner = "client!oe", name = "h", descriptor = "[S")
	public final short[] aShortArray216;

	@OriginalMember(owner = "client!oe", name = "n", descriptor = "[S")
	public final short[] aShortArray217;

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(IIIIIIIIIIIIII)V")
	public Class241(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		this.aByte84 = (byte) arg1;
		this.aByte85 = (byte) arg0;
		this.anIntArray508 = new int[4];
		this.anIntArray509 = new int[4];
		this.anIntArray507 = new int[4];
		this.anIntArray507[1] = arg3;
		this.anIntArray507[2] = arg4;
		this.anIntArray507[3] = arg5;
		this.anIntArray507[0] = arg2;
		this.anIntArray508[1] = arg7;
		this.anIntArray508[0] = arg6;
		this.anIntArray508[3] = arg9;
		this.anIntArray508[2] = arg8;
		this.aShort90 = (short) (arg2 >> Static458.anInt7508);
		this.anIntArray509[0] = arg10;
		this.anIntArray509[2] = arg12;
		this.anIntArray509[3] = arg13;
		this.anIntArray509[1] = arg11;
		this.aShort87 = (short) (arg4 >> Static458.anInt7508);
		this.aShort89 = (short) (arg10 >> Static458.anInt7508);
		this.aShort88 = (short) (arg12 >> Static458.anInt7508);
		this.aShortArray218 = new short[4];
		this.aShortArray216 = new short[4];
		this.aShortArray217 = new short[4];
	}
}
