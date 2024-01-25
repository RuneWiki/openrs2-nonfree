import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public final class Class333 {

	@OriginalMember(owner = "client!ui", name = "j", descriptor = "[I")
	public final int[] anIntArray561 = new int[4];

	@OriginalMember(owner = "client!ui", name = "f", descriptor = "[I")
	public final int[] anIntArray559 = new int[4];

	@OriginalMember(owner = "client!ui", name = "i", descriptor = "[I")
	public final int[] anIntArray560 = new int[4];

	@OriginalMember(owner = "client!ui", name = "n", descriptor = "B")
	public final byte aByte114;

	@OriginalMember(owner = "client!ui", name = "p", descriptor = "B")
	public final byte aByte115;

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "S")
	public final short aShort110;

	@OriginalMember(owner = "client!ui", name = "o", descriptor = "S")
	public final short aShort111;

	@OriginalMember(owner = "client!ui", name = "t", descriptor = "S")
	public final short aShort113;

	@OriginalMember(owner = "client!ui", name = "r", descriptor = "[S")
	public final short[] aShortArray122;

	@OriginalMember(owner = "client!ui", name = "l", descriptor = "[S")
	public final short[] aShortArray120;

	@OriginalMember(owner = "client!ui", name = "q", descriptor = "S")
	public final short aShort112;

	@OriginalMember(owner = "client!ui", name = "m", descriptor = "[S")
	public final short[] aShortArray121;

	@OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(IIIIIIIIIIIIII)V")
	public Class333(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		this.aByte114 = (byte) arg0;
		this.aByte115 = (byte) arg1;
		this.anIntArray560[2] = arg4;
		this.anIntArray560[0] = arg2;
		this.anIntArray560[1] = arg3;
		this.anIntArray560[3] = arg5;
		this.anIntArray561[3] = arg9;
		this.anIntArray561[2] = arg8;
		this.anIntArray561[1] = arg7;
		this.anIntArray561[0] = arg6;
		this.anIntArray559[3] = arg13;
		this.anIntArray559[1] = arg11;
		this.anIntArray559[2] = arg12;
		this.aShort110 = (short) (arg2 >> Static166.anInt7796);
		this.anIntArray559[0] = arg10;
		this.aShort111 = (short) (arg4 >> Static166.anInt7796);
		this.aShort113 = (short) (arg10 >> Static166.anInt7796);
		this.aShortArray122 = new short[4];
		this.aShortArray120 = new short[4];
		this.aShort112 = (short) (arg12 >> Static166.anInt7796);
		this.aShortArray121 = new short[4];
	}
}
