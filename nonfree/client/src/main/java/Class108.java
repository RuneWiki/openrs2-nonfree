import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fca")
public final class Class108 {

	@OriginalMember(owner = "client!fca", name = "n", descriptor = "B")
	public final byte aByte56;

	@OriginalMember(owner = "client!fca", name = "c", descriptor = "[I")
	public final int[] anIntArray195;

	@OriginalMember(owner = "client!fca", name = "g", descriptor = "B")
	public final byte aByte57;

	@OriginalMember(owner = "client!fca", name = "m", descriptor = "[I")
	public final int[] anIntArray194;

	@OriginalMember(owner = "client!fca", name = "k", descriptor = "[I")
	public final int[] anIntArray196;

	@OriginalMember(owner = "client!fca", name = "j", descriptor = "S")
	public final short aShort45;

	@OriginalMember(owner = "client!fca", name = "i", descriptor = "S")
	public final short aShort48;

	@OriginalMember(owner = "client!fca", name = "b", descriptor = "S")
	public final short aShort46;

	@OriginalMember(owner = "client!fca", name = "l", descriptor = "[S")
	public final short[] aShortArray16;

	@OriginalMember(owner = "client!fca", name = "f", descriptor = "[S")
	public final short[] aShortArray18;

	@OriginalMember(owner = "client!fca", name = "h", descriptor = "S")
	public final short aShort47;

	@OriginalMember(owner = "client!fca", name = "d", descriptor = "[S")
	public final short[] aShortArray17;

	@OriginalMember(owner = "client!fca", name = "<init>", descriptor = "(IIIIIIIIIIIIII)V")
	public Class108(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		this.aByte56 = (byte) arg1;
		this.anIntArray195 = new int[4];
		this.aByte57 = (byte) arg0;
		this.anIntArray194 = new int[4];
		this.anIntArray196 = new int[4];
		this.anIntArray194[1] = arg3;
		this.anIntArray194[2] = arg4;
		this.anIntArray194[0] = arg2;
		this.anIntArray194[3] = arg5;
		this.anIntArray196[1] = arg7;
		this.anIntArray196[2] = arg8;
		this.anIntArray196[0] = arg6;
		this.anIntArray196[3] = arg9;
		this.anIntArray195[3] = arg13;
		this.anIntArray195[1] = arg11;
		this.anIntArray195[0] = arg10;
		this.aShort45 = (short) (arg2 >> Static626.anInt9669);
		this.anIntArray195[2] = arg12;
		this.aShort48 = (short) (arg4 >> Static626.anInt9669);
		this.aShort46 = (short) (arg10 >> Static626.anInt9669);
		this.aShortArray16 = new short[4];
		this.aShortArray18 = new short[4];
		this.aShort47 = (short) (arg12 >> Static626.anInt9669);
		this.aShortArray17 = new short[4];
	}
}
