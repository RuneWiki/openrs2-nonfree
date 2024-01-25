import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fu")
public abstract class Class11_Sub1 extends Class11 {

	@OriginalMember(owner = "client!fu", name = "k", descriptor = "[B")
	public static final byte[] aByteArray83;

	@OriginalMember(owner = "client!fu", name = "n", descriptor = "I")
	public int anInt7348;

	@OriginalMember(owner = "client!fu", name = "s", descriptor = "S")
	public short aShort80;

	@OriginalMember(owner = "client!fu", name = "l", descriptor = "I")
	public int anInt7347;

	@OriginalMember(owner = "client!fu", name = "m", descriptor = "S")
	public short aShort78;

	@OriginalMember(owner = "client!fu", name = "r", descriptor = "I")
	public int anInt7351;

	@OriginalMember(owner = "client!fu", name = "j", descriptor = "S")
	public short aShort77;

	@OriginalMember(owner = "client!fu", name = "u", descriptor = "B")
	public final byte aByte78;

	@OriginalMember(owner = "client!fu", name = "t", descriptor = "Z")
	public final boolean aBoolean542;

	@OriginalMember(owner = "client!fu", name = "p", descriptor = "S")
	public short aShort79;

	@OriginalMember(owner = "client!fu", name = "q", descriptor = "I")
	public int anInt7350;

	@OriginalMember(owner = "client!fu", name = "i", descriptor = "B")
	public byte aByte77;

	static {
		@Pc(3) int local3 = 0;
		aByteArray83 = new byte[32896];
		for (@Pc(8) int local8 = 0; local8 < 256; local8++) {
			for (@Pc(11) int local11 = 0; local11 <= local8; local11++) {
				aByteArray83[local3++] = (byte) (255.0D / Math.sqrt((double) ((float) (local11 * local11 + local8 * local8 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(IIIIIIIIZB)V")
	protected Class11_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) byte arg9) {
		this.aShort80 = (short) arg6;
		this.anInt7347 = arg1;
		this.aShort78 = (short) arg4;
		this.anInt7351 = arg3;
		this.aShort77 = (short) arg7;
		this.aByte78 = arg9;
		this.aBoolean542 = arg8;
		this.aShort79 = (short) arg5;
		this.anInt7350 = arg2;
		this.aByte77 = (byte) arg0;
	}

	@OriginalMember(owner = "client!fu", name = "e", descriptor = "(I)I")
	public abstract int method6199();

	@OriginalMember(owner = "client!fu", name = "f", descriptor = "(I)V")
	public void method6201() {
	}
}
