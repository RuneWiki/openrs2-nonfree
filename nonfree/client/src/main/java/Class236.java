import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public final class Class236 {

	@OriginalMember(owner = "client!ob", name = "i", descriptor = "[I")
	public final int[] anIntArray367 = new int[4];

	@OriginalMember(owner = "client!ob", name = "g", descriptor = "[I")
	public final int[] anIntArray366 = new int[4];

	@OriginalMember(owner = "client!ob", name = "h", descriptor = "B")
	public final byte aByte90;

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "B")
	public final byte aByte89;

	@OriginalMember(owner = "client!ob", name = "m", descriptor = "[I")
	public final int[] anIntArray368;

	@OriginalMember(owner = "client!ob", name = "j", descriptor = "S")
	public final short aShort85;

	@OriginalMember(owner = "client!ob", name = "e", descriptor = "S")
	public final short aShort84;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "S")
	public final short aShort83;

	@OriginalMember(owner = "client!ob", name = "f", descriptor = "[S")
	public final short[] aShortArray100;

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "[S")
	public final short[] aShortArray98;

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "[S")
	public final short[] aShortArray99;

	@OriginalMember(owner = "client!ob", name = "l", descriptor = "S")
	public final short aShort86;

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(IIIIIIIIIIIIII)V")
	public Class236(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		this.aByte90 = (byte) arg0;
		this.aByte89 = (byte) arg1;
		this.anIntArray368 = new int[4];
		this.anIntArray368[3] = arg5;
		this.anIntArray368[1] = arg3;
		this.anIntArray368[2] = arg4;
		this.anIntArray368[0] = arg2;
		this.anIntArray366[2] = arg8;
		this.anIntArray366[0] = arg6;
		this.anIntArray366[3] = arg9;
		this.anIntArray366[1] = arg7;
		this.anIntArray367[1] = arg11;
		this.aShort85 = (short) (arg2 >> Static385.anInt6657);
		this.anIntArray367[2] = arg12;
		this.anIntArray367[0] = arg10;
		this.anIntArray367[3] = arg13;
		this.aShort84 = (short) (arg4 >> Static385.anInt6657);
		this.aShort83 = (short) (arg10 >> Static385.anInt6657);
		this.aShortArray100 = new short[4];
		this.aShortArray98 = new short[4];
		this.aShortArray99 = new short[4];
		this.aShort86 = (short) (arg12 >> Static385.anInt6657);
	}
}
