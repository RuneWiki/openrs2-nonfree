import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public final class Class62 {

	@OriginalMember(owner = "client!cu", name = "k", descriptor = "B")
	public final byte aByte40;

	@OriginalMember(owner = "client!cu", name = "j", descriptor = "[I")
	public final int[] anIntArray156;

	@OriginalMember(owner = "client!cu", name = "g", descriptor = "[I")
	public final int[] anIntArray155;

	@OriginalMember(owner = "client!cu", name = "e", descriptor = "B")
	public final byte aByte39;

	@OriginalMember(owner = "client!cu", name = "m", descriptor = "[I")
	public final int[] anIntArray157;

	@OriginalMember(owner = "client!cu", name = "c", descriptor = "S")
	public final short aShort40;

	@OriginalMember(owner = "client!cu", name = "i", descriptor = "S")
	public final short aShort41;

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "S")
	public final short aShort38;

	@OriginalMember(owner = "client!cu", name = "b", descriptor = "S")
	public final short aShort39;

	@OriginalMember(owner = "client!cu", name = "h", descriptor = "[S")
	public final short[] aShortArray31;

	@OriginalMember(owner = "client!cu", name = "d", descriptor = "[S")
	public final short[] aShortArray30;

	@OriginalMember(owner = "client!cu", name = "o", descriptor = "[S")
	public final short[] aShortArray32;

	@OriginalMember(owner = "client!cu", name = "<init>", descriptor = "(IIIIIIIIIIIIII)V")
	public Class62(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		this.aByte40 = (byte) arg0;
		this.anIntArray156 = new int[4];
		this.anIntArray155 = new int[4];
		this.aByte39 = (byte) arg1;
		this.anIntArray157 = new int[4];
		this.anIntArray155[0] = arg2;
		this.anIntArray155[2] = arg4;
		this.anIntArray155[1] = arg3;
		this.anIntArray155[3] = arg5;
		this.anIntArray156[1] = arg7;
		this.anIntArray156[3] = arg9;
		this.anIntArray156[2] = arg8;
		this.anIntArray156[0] = arg6;
		this.anIntArray157[2] = arg12;
		this.anIntArray157[3] = arg13;
		this.anIntArray157[0] = arg10;
		this.aShort40 = (short) (arg2 >> Static326.anInt5713);
		this.anIntArray157[1] = arg11;
		this.aShort41 = (short) (arg4 >> Static326.anInt5713);
		this.aShort38 = (short) (arg10 >> Static326.anInt5713);
		this.aShort39 = (short) (arg12 >> Static326.anInt5713);
		this.aShortArray31 = new short[4];
		this.aShortArray30 = new short[4];
		this.aShortArray32 = new short[4];
	}
}
