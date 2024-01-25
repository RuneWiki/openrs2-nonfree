import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public final class Class250 {

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "B")
	public final byte aByte91;

	@OriginalMember(owner = "client!nh", name = "l", descriptor = "[I")
	public final int[] anIntArray376;

	@OriginalMember(owner = "client!nh", name = "n", descriptor = "B")
	public final byte aByte90;

	@OriginalMember(owner = "client!nh", name = "o", descriptor = "[I")
	public final int[] anIntArray375;

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "[I")
	public final int[] anIntArray377;

	@OriginalMember(owner = "client!nh", name = "i", descriptor = "S")
	public final short aShort65;

	@OriginalMember(owner = "client!nh", name = "g", descriptor = "S")
	public final short aShort64;

	@OriginalMember(owner = "client!nh", name = "d", descriptor = "S")
	public final short aShort63;

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "[S")
	public final short[] aShortArray105;

	@OriginalMember(owner = "client!nh", name = "j", descriptor = "[S")
	public final short[] aShortArray106;

	@OriginalMember(owner = "client!nh", name = "h", descriptor = "S")
	public final short aShort66;

	@OriginalMember(owner = "client!nh", name = "k", descriptor = "[S")
	public final short[] aShortArray104;

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(IIIIIIIIIIIIII)V")
	public Class250(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		this.aByte91 = (byte) arg0;
		this.anIntArray376 = new int[4];
		this.aByte90 = (byte) arg1;
		this.anIntArray375 = new int[4];
		this.anIntArray377 = new int[4];
		this.anIntArray376[0] = arg2;
		this.anIntArray376[2] = arg4;
		this.anIntArray376[1] = arg3;
		this.anIntArray376[3] = arg5;
		this.anIntArray377[3] = arg9;
		this.anIntArray377[1] = arg7;
		this.anIntArray377[0] = arg6;
		this.anIntArray377[2] = arg8;
		this.anIntArray375[3] = arg13;
		this.anIntArray375[0] = arg10;
		this.aShort65 = (short) (arg2 >> Static314.anInt5377);
		this.anIntArray375[1] = arg11;
		this.anIntArray375[2] = arg12;
		this.aShort64 = (short) (arg4 >> Static314.anInt5377);
		this.aShort63 = (short) (arg10 >> Static314.anInt5377);
		this.aShortArray105 = new short[4];
		this.aShortArray106 = new short[4];
		this.aShort66 = (short) (arg12 >> Static314.anInt5377);
		this.aShortArray104 = new short[4];
	}
}
