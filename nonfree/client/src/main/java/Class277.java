import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pi")
public final class Class277 {

	@OriginalMember(owner = "client!pi", name = "m", descriptor = "[B")
	public static final byte[] aByteArray92;

	@OriginalMember(owner = "client!pi", name = "h", descriptor = "I")
	public final int anInt7980;

	@OriginalMember(owner = "client!pi", name = "d", descriptor = "S")
	public final short aShort85;

	@OriginalMember(owner = "client!pi", name = "e", descriptor = "I")
	public final int anInt7978;

	@OriginalMember(owner = "client!pi", name = "f", descriptor = "I")
	public final int anInt7979;

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "Z")
	public final boolean aBoolean551;

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "S")
	public final short aShort84;

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "I")
	public final int anInt7977;

	@OriginalMember(owner = "client!pi", name = "i", descriptor = "B")
	public final byte aByte117;

	@OriginalMember(owner = "client!pi", name = "l", descriptor = "S")
	public final short aShort86;

	@OriginalMember(owner = "client!pi", name = "k", descriptor = "I")
	public final int anInt7982;

	static {
		@Pc(4) int local4 = 0;
		aByteArray92 = new byte[32896];
		for (@Pc(9) int local9 = 0; local9 < 256; local9++) {
			for (@Pc(12) int local12 = 0; local12 <= local9; local12++) {
				aByteArray92[local4++] = (byte) (int) (255.0D / Math.sqrt((double) ((float) (local12 * local12 + local9 * local9 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	public Class277(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.anInt7980 = arg1;
		this.aShort85 = (short) arg4;
		this.anInt7978 = arg3;
		this.anInt7979 = arg11;
		this.aBoolean551 = arg10;
		this.aShort84 = (short) arg6;
		this.anInt7977 = arg0;
		this.aByte117 = (byte) arg8;
		this.aShort86 = (short) arg5;
		this.anInt7982 = arg2;
	}
}
