import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public final class Class272 {

	@OriginalMember(owner = "client!oq", name = "e", descriptor = "[I")
	public final int[] anIntArray391 = new int[4];

	@OriginalMember(owner = "client!oq", name = "j", descriptor = "B")
	public final byte aByte112;

	@OriginalMember(owner = "client!oq", name = "f", descriptor = "[I")
	public final int[] anIntArray392;

	@OriginalMember(owner = "client!oq", name = "m", descriptor = "B")
	public final byte aByte113;

	@OriginalMember(owner = "client!oq", name = "d", descriptor = "[I")
	public final int[] anIntArray390;

	@OriginalMember(owner = "client!oq", name = "k", descriptor = "S")
	public final short aShort63;

	@OriginalMember(owner = "client!oq", name = "g", descriptor = "S")
	public final short aShort62;

	@OriginalMember(owner = "client!oq", name = "b", descriptor = "S")
	public final short aShort61;

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "S")
	public final short aShort60;

	@OriginalMember(owner = "client!oq", name = "n", descriptor = "[S")
	public final short[] aShortArray93;

	@OriginalMember(owner = "client!oq", name = "c", descriptor = "[S")
	public final short[] aShortArray91;

	@OriginalMember(owner = "client!oq", name = "h", descriptor = "[S")
	public final short[] aShortArray92;

	@OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(IIIIIIIIIIIIII)V")
	public Class272(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		this.aByte112 = (byte) arg1;
		this.anIntArray392 = new int[4];
		this.aByte113 = (byte) arg0;
		this.anIntArray390 = new int[4];
		this.anIntArray392[1] = arg3;
		this.anIntArray392[3] = arg5;
		this.anIntArray392[2] = arg4;
		this.anIntArray392[0] = arg2;
		this.anIntArray390[3] = arg9;
		this.anIntArray390[0] = arg6;
		this.anIntArray390[2] = arg8;
		this.anIntArray390[1] = arg7;
		this.aShort63 = (short) (arg2 >> Static571.anInt9216);
		this.anIntArray391[0] = arg10;
		this.anIntArray391[1] = arg11;
		this.anIntArray391[2] = arg12;
		this.anIntArray391[3] = arg13;
		this.aShort62 = (short) (arg4 >> Static571.anInt9216);
		this.aShort61 = (short) (arg10 >> Static571.anInt9216);
		this.aShort60 = (short) (arg12 >> Static571.anInt9216);
		this.aShortArray93 = new short[4];
		this.aShortArray91 = new short[4];
		this.aShortArray92 = new short[4];
	}
}
