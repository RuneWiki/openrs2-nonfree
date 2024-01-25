import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public final class Class379 {

	@OriginalMember(owner = "client!vs", name = "h", descriptor = "[I")
	public final int[] anIntArray697 = new int[4];

	@OriginalMember(owner = "client!vs", name = "e", descriptor = "[I")
	public final int[] anIntArray696 = new int[4];

	@OriginalMember(owner = "client!vs", name = "b", descriptor = "B")
	public final byte aByte145;

	@OriginalMember(owner = "client!vs", name = "p", descriptor = "B")
	public final byte aByte146;

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "[I")
	public final int[] anIntArray695;

	@OriginalMember(owner = "client!vs", name = "o", descriptor = "S")
	public final short aShort128;

	@OriginalMember(owner = "client!vs", name = "l", descriptor = "S")
	public final short aShort127;

	@OriginalMember(owner = "client!vs", name = "g", descriptor = "S")
	public final short aShort125;

	@OriginalMember(owner = "client!vs", name = "d", descriptor = "[S")
	public final short[] aShortArray158;

	@OriginalMember(owner = "client!vs", name = "c", descriptor = "[S")
	public final short[] aShortArray157;

	@OriginalMember(owner = "client!vs", name = "j", descriptor = "S")
	public final short aShort126;

	@OriginalMember(owner = "client!vs", name = "i", descriptor = "[S")
	public final short[] aShortArray159;

	@OriginalMember(owner = "client!vs", name = "<init>", descriptor = "(IIIIIIIIIIIIII)V")
	public Class379(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		this.aByte145 = (byte) arg0;
		this.aByte146 = (byte) arg1;
		this.anIntArray695 = new int[4];
		this.anIntArray697[3] = arg5;
		this.anIntArray697[0] = arg2;
		this.anIntArray697[2] = arg4;
		this.anIntArray697[1] = arg3;
		this.anIntArray696[0] = arg6;
		this.anIntArray696[1] = arg7;
		this.anIntArray696[2] = arg8;
		this.anIntArray696[3] = arg9;
		this.anIntArray695[2] = arg12;
		this.aShort128 = (short) (arg2 >> Static185.anInt3178);
		this.anIntArray695[0] = arg10;
		this.anIntArray695[3] = arg13;
		this.anIntArray695[1] = arg11;
		this.aShort127 = (short) (arg4 >> Static185.anInt3178);
		this.aShort125 = (short) (arg10 >> Static185.anInt3178);
		this.aShortArray158 = new short[4];
		this.aShortArray157 = new short[4];
		this.aShort126 = (short) (arg12 >> Static185.anInt3178);
		this.aShortArray159 = new short[4];
	}
}
