import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public final class Class327 {

	@OriginalMember(owner = "client!ta", name = "m", descriptor = "[I")
	public final int[] anIntArray596 = new int[4];

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "B")
	public final byte aByte113;

	@OriginalMember(owner = "client!ta", name = "l", descriptor = "[I")
	public final int[] anIntArray595;

	@OriginalMember(owner = "client!ta", name = "f", descriptor = "B")
	public final byte aByte114;

	@OriginalMember(owner = "client!ta", name = "g", descriptor = "[I")
	public final int[] anIntArray594;

	@OriginalMember(owner = "client!ta", name = "k", descriptor = "S")
	public final short aShort116;

	@OriginalMember(owner = "client!ta", name = "d", descriptor = "S")
	public final short aShort114;

	@OriginalMember(owner = "client!ta", name = "e", descriptor = "S")
	public final short aShort115;

	@OriginalMember(owner = "client!ta", name = "h", descriptor = "[S")
	public final short[] aShortArray134;

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "S")
	public final short aShort113;

	@OriginalMember(owner = "client!ta", name = "i", descriptor = "[S")
	public final short[] aShortArray135;

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "[S")
	public final short[] aShortArray133;

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(IIIIIIIIIIIIII)V")
	public Class327(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		this.aByte113 = (byte) arg1;
		this.anIntArray595 = new int[4];
		this.aByte114 = (byte) arg0;
		this.anIntArray594 = new int[4];
		this.anIntArray595[2] = arg4;
		this.anIntArray595[3] = arg5;
		this.anIntArray595[1] = arg3;
		this.anIntArray595[0] = arg2;
		this.anIntArray596[3] = arg9;
		this.anIntArray596[0] = arg6;
		this.anIntArray596[1] = arg7;
		this.anIntArray596[2] = arg8;
		this.anIntArray594[2] = arg12;
		this.aShort116 = (short) (arg2 >> Static609.anInt9827);
		this.anIntArray594[1] = arg11;
		this.anIntArray594[3] = arg13;
		this.anIntArray594[0] = arg10;
		this.aShort114 = (short) (arg4 >> Static609.anInt9827);
		this.aShort115 = (short) (arg10 >> Static609.anInt9827);
		this.aShortArray134 = new short[4];
		this.aShort113 = (short) (arg12 >> Static609.anInt9827);
		this.aShortArray135 = new short[4];
		this.aShortArray133 = new short[4];
	}
}
