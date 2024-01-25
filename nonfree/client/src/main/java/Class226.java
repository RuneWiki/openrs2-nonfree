import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public final class Class226 {

	@OriginalMember(owner = "client!nn", name = "c", descriptor = "B")
	public final byte aByte79;

	@OriginalMember(owner = "client!nn", name = "d", descriptor = "[I")
	public final int[] anIntArray424;

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "[I")
	public final int[] anIntArray423;

	@OriginalMember(owner = "client!nn", name = "k", descriptor = "[I")
	public final int[] anIntArray425;

	@OriginalMember(owner = "client!nn", name = "p", descriptor = "B")
	public final byte aByte80;

	@OriginalMember(owner = "client!nn", name = "e", descriptor = "S")
	public final short aShort77;

	@OriginalMember(owner = "client!nn", name = "n", descriptor = "S")
	public final short aShort80;

	@OriginalMember(owner = "client!nn", name = "j", descriptor = "S")
	public final short aShort79;

	@OriginalMember(owner = "client!nn", name = "q", descriptor = "[S")
	public final short[] aShortArray85;

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "[S")
	public final short[] aShortArray83;

	@OriginalMember(owner = "client!nn", name = "g", descriptor = "S")
	public final short aShort78;

	@OriginalMember(owner = "client!nn", name = "i", descriptor = "[S")
	public final short[] aShortArray84;

	@OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(IIIIIIIIIIIIII)V")
	public Class226(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		this.aByte79 = (byte) arg0;
		this.anIntArray424 = new int[4];
		this.anIntArray423 = new int[4];
		this.anIntArray425 = new int[4];
		this.aByte80 = (byte) arg1;
		this.anIntArray425[2] = arg4;
		this.anIntArray425[3] = arg5;
		this.anIntArray425[1] = arg3;
		this.anIntArray425[0] = arg2;
		this.anIntArray424[2] = arg8;
		this.anIntArray424[1] = arg7;
		this.anIntArray424[3] = arg9;
		this.anIntArray424[0] = arg6;
		this.aShort77 = (short) (arg2 >> Static643.anInt10682);
		this.anIntArray423[1] = arg11;
		this.anIntArray423[0] = arg10;
		this.anIntArray423[3] = arg13;
		this.anIntArray423[2] = arg12;
		this.aShort80 = (short) (arg4 >> Static643.anInt10682);
		this.aShort79 = (short) (arg10 >> Static643.anInt10682);
		this.aShortArray85 = new short[4];
		this.aShortArray83 = new short[4];
		this.aShort78 = (short) (arg12 >> Static643.anInt10682);
		this.aShortArray84 = new short[4];
	}
}
