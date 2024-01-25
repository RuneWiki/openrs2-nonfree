import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jfa")
public final class Class180 {

	@OriginalMember(owner = "client!jfa", name = "n", descriptor = "B")
	public final byte aByte48;

	@OriginalMember(owner = "client!jfa", name = "d", descriptor = "[I")
	public final int[] anIntArray255;

	@OriginalMember(owner = "client!jfa", name = "o", descriptor = "[I")
	public final int[] anIntArray258;

	@OriginalMember(owner = "client!jfa", name = "p", descriptor = "B")
	public final byte aByte49;

	@OriginalMember(owner = "client!jfa", name = "j", descriptor = "[I")
	public final int[] anIntArray257;

	@OriginalMember(owner = "client!jfa", name = "q", descriptor = "S")
	public final short aShort54;

	@OriginalMember(owner = "client!jfa", name = "f", descriptor = "S")
	public final short aShort51;

	@OriginalMember(owner = "client!jfa", name = "l", descriptor = "S")
	public final short aShort53;

	@OriginalMember(owner = "client!jfa", name = "k", descriptor = "[S")
	public final short[] aShortArray63;

	@OriginalMember(owner = "client!jfa", name = "h", descriptor = "S")
	public final short aShort52;

	@OriginalMember(owner = "client!jfa", name = "i", descriptor = "[S")
	public final short[] aShortArray62;

	@OriginalMember(owner = "client!jfa", name = "b", descriptor = "[S")
	public final short[] aShortArray61;

	@OriginalMember(owner = "client!jfa", name = "<init>", descriptor = "(IIIIIIIIIIIIII)V")
	public Class180(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		this.aByte48 = (byte) arg0;
		this.anIntArray255 = new int[4];
		this.anIntArray258 = new int[4];
		this.aByte49 = (byte) arg1;
		this.anIntArray257 = new int[4];
		this.anIntArray257[3] = arg5;
		this.anIntArray257[0] = arg2;
		this.anIntArray257[1] = arg3;
		this.anIntArray257[2] = arg4;
		this.anIntArray255[3] = arg9;
		this.anIntArray255[2] = arg8;
		this.anIntArray255[0] = arg6;
		this.anIntArray255[1] = arg7;
		this.anIntArray258[1] = arg11;
		this.anIntArray258[3] = arg13;
		this.aShort54 = (short) (arg2 >> Static138.anInt2287);
		this.anIntArray258[2] = arg12;
		this.anIntArray258[0] = arg10;
		this.aShort51 = (short) (arg4 >> Static138.anInt2287);
		this.aShort53 = (short) (arg10 >> Static138.anInt2287);
		this.aShortArray63 = new short[4];
		this.aShort52 = (short) (arg12 >> Static138.anInt2287);
		this.aShortArray62 = new short[4];
		this.aShortArray61 = new short[4];
	}
}
