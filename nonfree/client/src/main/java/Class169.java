import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kia")
public final class Class169 {

	@OriginalMember(owner = "client!kia", name = "k", descriptor = "B")
	public final byte aByte70;

	@OriginalMember(owner = "client!kia", name = "d", descriptor = "[I")
	public final int[] anIntArray277;

	@OriginalMember(owner = "client!kia", name = "e", descriptor = "B")
	public final byte aByte69;

	@OriginalMember(owner = "client!kia", name = "g", descriptor = "[I")
	public final int[] anIntArray278;

	@OriginalMember(owner = "client!kia", name = "i", descriptor = "[I")
	public final int[] anIntArray279;

	@OriginalMember(owner = "client!kia", name = "c", descriptor = "S")
	public final short aShort54;

	@OriginalMember(owner = "client!kia", name = "l", descriptor = "S")
	public final short aShort56;

	@OriginalMember(owner = "client!kia", name = "f", descriptor = "S")
	public final short aShort55;

	@OriginalMember(owner = "client!kia", name = "n", descriptor = "S")
	public final short aShort57;

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "[S")
	public final short[] aShortArray81;

	@OriginalMember(owner = "client!kia", name = "b", descriptor = "[S")
	public final short[] aShortArray82;

	@OriginalMember(owner = "client!kia", name = "m", descriptor = "[S")
	public final short[] aShortArray83;

	@OriginalMember(owner = "client!kia", name = "<init>", descriptor = "(IIIIIIIIIIIIII)V")
	public Class169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		this.aByte70 = (byte) arg0;
		this.anIntArray277 = new int[4];
		this.aByte69 = (byte) arg1;
		this.anIntArray278 = new int[4];
		this.anIntArray279 = new int[4];
		this.anIntArray278[2] = arg4;
		this.anIntArray278[3] = arg5;
		this.anIntArray278[1] = arg3;
		this.anIntArray278[0] = arg2;
		this.anIntArray277[3] = arg9;
		this.anIntArray277[0] = arg6;
		this.anIntArray277[2] = arg8;
		this.anIntArray277[1] = arg7;
		this.anIntArray279[2] = arg12;
		this.anIntArray279[1] = arg11;
		this.anIntArray279[3] = arg13;
		this.aShort54 = (short) (arg2 >> Static606.anInt10280);
		this.anIntArray279[0] = arg10;
		this.aShort56 = (short) (arg4 >> Static606.anInt10280);
		this.aShort55 = (short) (arg10 >> Static606.anInt10280);
		this.aShort57 = (short) (arg12 >> Static606.anInt10280);
		this.aShortArray81 = new short[4];
		this.aShortArray82 = new short[4];
		this.aShortArray83 = new short[4];
	}
}
