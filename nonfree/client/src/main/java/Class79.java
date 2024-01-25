import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public final class Class79 {

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "B")
	public final byte aByte35;

	@OriginalMember(owner = "client!dr", name = "c", descriptor = "[I")
	public final int[] anIntArray116;

	@OriginalMember(owner = "client!dr", name = "o", descriptor = "[I")
	public final int[] anIntArray117;

	@OriginalMember(owner = "client!dr", name = "q", descriptor = "B")
	public final byte aByte36;

	@OriginalMember(owner = "client!dr", name = "l", descriptor = "[I")
	public final int[] anIntArray118;

	@OriginalMember(owner = "client!dr", name = "i", descriptor = "S")
	public final short aShort17;

	@OriginalMember(owner = "client!dr", name = "g", descriptor = "S")
	public final short aShort19;

	@OriginalMember(owner = "client!dr", name = "d", descriptor = "S")
	public final short aShort16;

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "[S")
	public final short[] aShortArray38;

	@OriginalMember(owner = "client!dr", name = "e", descriptor = "[S")
	public final short[] aShortArray36;

	@OriginalMember(owner = "client!dr", name = "m", descriptor = "[S")
	public final short[] aShortArray37;

	@OriginalMember(owner = "client!dr", name = "f", descriptor = "S")
	public final short aShort18;

	@OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(IIIIIIIIIIIIII)V")
	public Class79(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		this.aByte35 = (byte) arg0;
		this.anIntArray116 = new int[4];
		this.anIntArray117 = new int[4];
		this.aByte36 = (byte) arg1;
		this.anIntArray118 = new int[4];
		this.anIntArray116[3] = arg5;
		this.anIntArray116[0] = arg2;
		this.anIntArray116[1] = arg3;
		this.anIntArray116[2] = arg4;
		this.anIntArray118[3] = arg9;
		this.anIntArray118[0] = arg6;
		this.anIntArray118[2] = arg8;
		this.anIntArray118[1] = arg7;
		this.anIntArray117[0] = arg10;
		this.anIntArray117[1] = arg11;
		this.anIntArray117[3] = arg13;
		this.aShort17 = (short) (arg2 >> Static394.anInt7067);
		this.anIntArray117[2] = arg12;
		this.aShort19 = (short) (arg4 >> Static394.anInt7067);
		this.aShort16 = (short) (arg10 >> Static394.anInt7067);
		this.aShortArray38 = new short[4];
		this.aShortArray36 = new short[4];
		this.aShortArray37 = new short[4];
		this.aShort18 = (short) (arg12 >> Static394.anInt7067);
	}
}
