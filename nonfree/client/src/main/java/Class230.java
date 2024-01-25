import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public final class Class230 {

	@OriginalMember(owner = "client!lt", name = "e", descriptor = "[I")
	public final int[] anIntArray356 = new int[4];

	@OriginalMember(owner = "client!lt", name = "g", descriptor = "B")
	public final byte aByte89;

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "B")
	public final byte aByte90;

	@OriginalMember(owner = "client!lt", name = "d", descriptor = "[I")
	public final int[] anIntArray355;

	@OriginalMember(owner = "client!lt", name = "q", descriptor = "[I")
	public final int[] anIntArray354;

	@OriginalMember(owner = "client!lt", name = "j", descriptor = "S")
	public final short aShort65;

	@OriginalMember(owner = "client!lt", name = "o", descriptor = "S")
	public final short aShort64;

	@OriginalMember(owner = "client!lt", name = "c", descriptor = "S")
	public final short aShort66;

	@OriginalMember(owner = "client!lt", name = "k", descriptor = "S")
	public final short aShort67;

	@OriginalMember(owner = "client!lt", name = "m", descriptor = "[S")
	public final short[] aShortArray56;

	@OriginalMember(owner = "client!lt", name = "p", descriptor = "[S")
	public final short[] aShortArray57;

	@OriginalMember(owner = "client!lt", name = "l", descriptor = "[S")
	public final short[] aShortArray58;

	@OriginalMember(owner = "client!lt", name = "<init>", descriptor = "(IIIIIIIIIIIIII)V")
	public Class230(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		this.aByte89 = (byte) arg0;
		this.aByte90 = (byte) arg1;
		this.anIntArray355 = new int[4];
		this.anIntArray354 = new int[4];
		this.anIntArray356[2] = arg4;
		this.anIntArray356[3] = arg5;
		this.anIntArray356[0] = arg2;
		this.anIntArray356[1] = arg3;
		this.anIntArray354[1] = arg7;
		this.anIntArray354[2] = arg8;
		this.anIntArray354[0] = arg6;
		this.anIntArray354[3] = arg9;
		this.anIntArray355[1] = arg11;
		this.anIntArray355[3] = arg13;
		this.aShort65 = (short) (arg2 >> Static594.anInt9440);
		this.anIntArray355[0] = arg10;
		this.anIntArray355[2] = arg12;
		this.aShort64 = (short) (arg4 >> Static594.anInt9440);
		this.aShort66 = (short) (arg10 >> Static594.anInt9440);
		this.aShort67 = (short) (arg12 >> Static594.anInt9440);
		this.aShortArray56 = new short[4];
		this.aShortArray57 = new short[4];
		this.aShortArray58 = new short[4];
	}
}
