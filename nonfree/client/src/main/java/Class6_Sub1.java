import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ada")
public abstract class Class6_Sub1 extends Class6 {

	@OriginalMember(owner = "client!ada", name = "u", descriptor = "[J")
	public static final long[] aLongArray28 = new long[256];

	@OriginalMember(owner = "client!ada", name = "q", descriptor = "I")
	public int anInt8812;

	@OriginalMember(owner = "client!ada", name = "h", descriptor = "S")
	public short aShort120;

	@OriginalMember(owner = "client!ada", name = "p", descriptor = "B")
	public final byte aByte101;

	@OriginalMember(owner = "client!ada", name = "g", descriptor = "B")
	public byte aByte100;

	@OriginalMember(owner = "client!ada", name = "x", descriptor = "Z")
	public final boolean aBoolean656;

	@OriginalMember(owner = "client!ada", name = "l", descriptor = "S")
	public short aShort122;

	@OriginalMember(owner = "client!ada", name = "n", descriptor = "I")
	public int anInt8811;

	@OriginalMember(owner = "client!ada", name = "r", descriptor = "I")
	public int anInt8813;

	@OriginalMember(owner = "client!ada", name = "w", descriptor = "S")
	public short aShort123;

	@OriginalMember(owner = "client!ada", name = "k", descriptor = "S")
	public short aShort121;

	@OriginalMember(owner = "client!ada", name = "s", descriptor = "I")
	public int anInt8814;

	static {
		for (@Pc(6) int local6 = 0; local6 < 256; local6++) {
			@Pc(10) long local10 = (long) local6;
			for (@Pc(12) int local12 = 0; local12 < 8; local12++) {
				if ((local10 & 0x1L) == 1L) {
					local10 = local10 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local10 >>>= 0x1;
				}
			}
			aLongArray28[local6] = local10;
		}
	}

	@OriginalMember(owner = "client!ada", name = "<init>", descriptor = "(IIIIIIIIZB)V")
	protected Class6_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) byte arg9) {
		this.aShort120 = (short) arg6;
		this.aByte101 = arg9;
		this.aByte100 = (byte) arg0;
		this.aBoolean656 = arg8;
		this.aShort122 = (short) arg5;
		this.anInt8811 = arg1;
		this.anInt8813 = arg3;
		this.aShort123 = (short) arg4;
		this.aShort121 = (short) arg7;
		this.anInt8814 = arg2;
	}

	@OriginalMember(owner = "client!ada", name = "c", descriptor = "(B)V")
	public void method7237() {
	}

	@OriginalMember(owner = "client!ada", name = "e", descriptor = "(B)I")
	public abstract int method7240();
}
