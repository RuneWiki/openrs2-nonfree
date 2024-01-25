import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public final class Class34 {

	@OriginalMember(owner = "client!bg", name = "h", descriptor = "[I")
	public final int[] anIntArray61 = new int[4];

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "B")
	public final byte aByte31;

	@OriginalMember(owner = "client!bg", name = "w", descriptor = "B")
	public final byte aByte32;

	@OriginalMember(owner = "client!bg", name = "l", descriptor = "[I")
	public final int[] anIntArray62;

	@OriginalMember(owner = "client!bg", name = "e", descriptor = "[I")
	public final int[] anIntArray60;

	@OriginalMember(owner = "client!bg", name = "f", descriptor = "S")
	public final short aShort20;

	@OriginalMember(owner = "client!bg", name = "v", descriptor = "S")
	public final short aShort23;

	@OriginalMember(owner = "client!bg", name = "s", descriptor = "S")
	public final short aShort21;

	@OriginalMember(owner = "client!bg", name = "t", descriptor = "S")
	public final short aShort22;

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "[S")
	public final short[] aShortArray19;

	@OriginalMember(owner = "client!bg", name = "m", descriptor = "[S")
	public final short[] aShortArray20;

	@OriginalMember(owner = "client!bg", name = "n", descriptor = "[S")
	public final short[] aShortArray21;

	@OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(IIIIIIIIIIIIII)V")
	public Class34(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		this.aByte31 = (byte) arg1;
		this.aByte32 = (byte) arg0;
		this.anIntArray62 = new int[4];
		this.anIntArray60 = new int[4];
		this.anIntArray62[2] = arg4;
		this.anIntArray62[0] = arg2;
		this.anIntArray62[1] = arg3;
		this.anIntArray62[3] = arg5;
		this.anIntArray60[2] = arg8;
		this.anIntArray60[3] = arg9;
		this.anIntArray60[0] = arg6;
		this.anIntArray60[1] = arg7;
		this.anIntArray61[3] = arg13;
		this.anIntArray61[0] = arg10;
		this.anIntArray61[2] = arg12;
		this.aShort20 = (short) (arg2 >> Static115.anInt2156);
		this.anIntArray61[1] = arg11;
		this.aShort23 = (short) (arg4 >> Static115.anInt2156);
		this.aShort21 = (short) (arg10 >> Static115.anInt2156);
		this.aShort22 = (short) (arg12 >> Static115.anInt2156);
		this.aShortArray19 = new short[4];
		this.aShortArray20 = new short[4];
		this.aShortArray21 = new short[4];
	}
}
