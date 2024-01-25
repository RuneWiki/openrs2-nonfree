import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public final class Class91 {

	@OriginalMember(owner = "client!eh", name = "g", descriptor = "[I")
	public final int[] anIntArray173 = new int[4];

	@OriginalMember(owner = "client!eh", name = "p", descriptor = "B")
	public final byte aByte25;

	@OriginalMember(owner = "client!eh", name = "q", descriptor = "[I")
	public final int[] anIntArray175;

	@OriginalMember(owner = "client!eh", name = "i", descriptor = "[I")
	public final int[] anIntArray174;

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "B")
	public final byte aByte24;

	@OriginalMember(owner = "client!eh", name = "r", descriptor = "S")
	public final short aShort24;

	@OriginalMember(owner = "client!eh", name = "t", descriptor = "S")
	public final short aShort26;

	@OriginalMember(owner = "client!eh", name = "n", descriptor = "S")
	public final short aShort23;

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "[S")
	public final short[] aShortArray55;

	@OriginalMember(owner = "client!eh", name = "l", descriptor = "[S")
	public final short[] aShortArray57;

	@OriginalMember(owner = "client!eh", name = "j", descriptor = "[S")
	public final short[] aShortArray56;

	@OriginalMember(owner = "client!eh", name = "s", descriptor = "S")
	public final short aShort25;

	@OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(IIIIIIIIIIIIII)V")
	public Class91(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		this.aByte25 = (byte) arg0;
		this.anIntArray175 = new int[4];
		this.anIntArray174 = new int[4];
		this.aByte24 = (byte) arg1;
		this.anIntArray173[2] = arg4;
		this.anIntArray173[1] = arg3;
		this.anIntArray173[3] = arg5;
		this.anIntArray173[0] = arg2;
		this.anIntArray175[1] = arg7;
		this.anIntArray175[0] = arg6;
		this.anIntArray175[2] = arg8;
		this.anIntArray175[3] = arg9;
		this.anIntArray174[3] = arg13;
		this.anIntArray174[1] = arg11;
		this.anIntArray174[2] = arg12;
		this.anIntArray174[0] = arg10;
		this.aShort24 = (short) (arg2 >> Static562.anInt9207);
		this.aShort26 = (short) (arg4 >> Static562.anInt9207);
		this.aShort23 = (short) (arg10 >> Static562.anInt9207);
		this.aShortArray55 = new short[4];
		this.aShortArray57 = new short[4];
		this.aShortArray56 = new short[4];
		this.aShort25 = (short) (arg12 >> Static562.anInt9207);
	}
}
