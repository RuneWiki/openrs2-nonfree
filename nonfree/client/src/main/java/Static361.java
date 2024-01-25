import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static361 {

	@OriginalMember(owner = "client!va", name = "q", descriptor = "J")
	public static long aLong121;

	@OriginalMember(owner = "client!va", name = "j", descriptor = "[B")
	public static final byte[] aByteArray57 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!va", name = "o", descriptor = "Lclient!ec;")
	public static final Class62 aClass62_143 = new Class62("flash2:", "blinken2:", "clignotant2:", "flash2:");

	@OriginalMember(owner = "client!va", name = "s", descriptor = "Z")
	public static boolean aBoolean293 = false;

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Lclient!ab;IBI)V")
	public static void method3589(@OriginalArg(0) Class3 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.aByte2 == 0) {
			arg0.anInt114 = arg0.anInt41;
		} else if (arg0.aByte2 == 1) {
			arg0.anInt114 = (arg1 - arg0.anInt64) / 2 + arg0.anInt41;
		} else if (arg0.aByte2 == 2) {
			arg0.anInt114 = arg1 - arg0.anInt64 - arg0.anInt41;
		} else if (arg0.aByte2 == 3) {
			arg0.anInt114 = arg0.anInt41 * arg1 >> 14;
		} else if (arg0.aByte2 == 4) {
			arg0.anInt114 = (arg1 - arg0.anInt64) / 2 + (arg1 * arg0.anInt41 >> 14);
		} else {
			arg0.anInt114 = arg1 - arg0.anInt64 - (arg0.anInt41 * arg1 >> 14);
		}
		if (arg0.aByte4 == 0) {
			arg0.anInt50 = arg0.anInt40;
		} else if (arg0.aByte4 == 1) {
			arg0.anInt50 = (arg2 - arg0.anInt116) / 2 + arg0.anInt40;
		} else if (arg0.aByte4 == 2) {
			arg0.anInt50 = arg2 - arg0.anInt40 - arg0.anInt116;
		} else if (arg0.aByte4 == 3) {
			arg0.anInt50 = arg0.anInt40 * arg2 >> 14;
		} else if (arg0.aByte4 == 4) {
			arg0.anInt50 = (arg2 - arg0.anInt116) / 2 + (arg0.anInt40 * arg2 >> 14);
		} else {
			arg0.anInt50 = arg2 - arg0.anInt116 - (arg2 * arg0.anInt40 >> 14);
		}
		if (!Static119.aBoolean188) {
			return;
		}
		if (Static51.method778(arg0).anInt4220 == 0 && arg0.anInt91 != 0) {
			return;
		}
		if (arg0.anInt50 < 0) {
			arg0.anInt50 = 0;
		} else if (arg2 < arg0.anInt116 + arg0.anInt50) {
			arg0.anInt50 = arg2 - arg0.anInt116;
		}
		if (arg0.anInt114 < 0) {
			arg0.anInt114 = 0;
			return;
		}
		if (arg1 < arg0.anInt114 + arg0.anInt64) {
			arg0.anInt114 = arg1 - arg0.anInt64;
			return;
		}
	}
}
