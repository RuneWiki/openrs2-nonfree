import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public final class Class167 {

	@OriginalMember(owner = "client!ia", name = "k", descriptor = "B")
	public final byte aByte65;

	@OriginalMember(owner = "client!ia", name = "h", descriptor = "[I")
	public final int[] anIntArray291;

	@OriginalMember(owner = "client!ia", name = "o", descriptor = "[I")
	public final int[] anIntArray293;

	@OriginalMember(owner = "client!ia", name = "e", descriptor = "B")
	public final byte aByte64;

	@OriginalMember(owner = "client!ia", name = "j", descriptor = "[I")
	public final int[] anIntArray292;

	@OriginalMember(owner = "client!ia", name = "g", descriptor = "S")
	public final short aShort63;

	@OriginalMember(owner = "client!ia", name = "n", descriptor = "S")
	public final short aShort64;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "S")
	public final short aShort61;

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "S")
	public final short aShort62;

	@OriginalMember(owner = "client!ia", name = "l", descriptor = "[S")
	public final short[] aShortArray98;

	@OriginalMember(owner = "client!ia", name = "f", descriptor = "[S")
	public final short[] aShortArray97;

	@OriginalMember(owner = "client!ia", name = "d", descriptor = "[S")
	public final short[] aShortArray96;

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(IIIIIIIIIIIIII)V")
	public Class167(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		this.aByte65 = (byte) arg1;
		this.anIntArray291 = new int[4];
		this.anIntArray293 = new int[4];
		this.aByte64 = (byte) arg0;
		this.anIntArray292 = new int[4];
		this.anIntArray291[1] = arg3;
		this.anIntArray291[2] = arg4;
		this.anIntArray291[3] = arg5;
		this.anIntArray291[0] = arg2;
		this.anIntArray292[3] = arg9;
		this.anIntArray292[2] = arg8;
		this.anIntArray292[1] = arg7;
		this.anIntArray292[0] = arg6;
		this.anIntArray293[1] = arg11;
		this.aShort63 = (short) (arg2 >> Static436.anInt7634);
		this.anIntArray293[3] = arg13;
		this.anIntArray293[2] = arg12;
		this.anIntArray293[0] = arg10;
		this.aShort64 = (short) (arg4 >> Static436.anInt7634);
		this.aShort61 = (short) (arg10 >> Static436.anInt7634);
		this.aShort62 = (short) (arg12 >> Static436.anInt7634);
		this.aShortArray98 = new short[4];
		this.aShortArray97 = new short[4];
		this.aShortArray96 = new short[4];
	}
}
