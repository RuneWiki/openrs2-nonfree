import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wha")
public final class Class393 {

	@OriginalMember(owner = "client!wha", name = "i", descriptor = "[I")
	public final int[] anIntArray591 = new int[4];

	@OriginalMember(owner = "client!wha", name = "b", descriptor = "[I")
	public final int[] anIntArray592 = new int[4];

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "B")
	public final byte aByte144;

	@OriginalMember(owner = "client!wha", name = "m", descriptor = "B")
	public final byte aByte145;

	@OriginalMember(owner = "client!wha", name = "j", descriptor = "[I")
	public final int[] anIntArray593;

	@OriginalMember(owner = "client!wha", name = "c", descriptor = "S")
	public final short aShort121;

	@OriginalMember(owner = "client!wha", name = "o", descriptor = "S")
	public final short aShort122;

	@OriginalMember(owner = "client!wha", name = "f", descriptor = "S")
	public final short aShort119;

	@OriginalMember(owner = "client!wha", name = "p", descriptor = "[S")
	public final short[] aShortArray144;

	@OriginalMember(owner = "client!wha", name = "g", descriptor = "[S")
	public final short[] aShortArray145;

	@OriginalMember(owner = "client!wha", name = "h", descriptor = "S")
	public final short aShort120;

	@OriginalMember(owner = "client!wha", name = "l", descriptor = "[S")
	public final short[] aShortArray146;

	@OriginalMember(owner = "client!wha", name = "<init>", descriptor = "(IIIIIIIIIIIIII)V")
	public Class393(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		this.aByte144 = (byte) arg1;
		this.aByte145 = (byte) arg0;
		this.anIntArray593 = new int[4];
		this.anIntArray593[0] = arg2;
		this.anIntArray593[3] = arg5;
		this.anIntArray593[1] = arg3;
		this.anIntArray593[2] = arg4;
		this.anIntArray592[0] = arg6;
		this.anIntArray592[3] = arg9;
		this.anIntArray592[2] = arg8;
		this.anIntArray592[1] = arg7;
		this.anIntArray591[3] = arg13;
		this.aShort121 = (short) (arg2 >> Static110.anInt1858);
		this.anIntArray591[0] = arg10;
		this.anIntArray591[2] = arg12;
		this.anIntArray591[1] = arg11;
		this.aShort122 = (short) (arg4 >> Static110.anInt1858);
		this.aShort119 = (short) (arg10 >> Static110.anInt1858);
		this.aShortArray144 = new short[4];
		this.aShortArray145 = new short[4];
		this.aShort120 = (short) (arg12 >> Static110.anInt1858);
		this.aShortArray146 = new short[4];
	}
}
