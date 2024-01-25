import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!gca", name = "b", descriptor = "[[B")
	public static byte[][] aByteArrayArray9;

	@OriginalMember(owner = "client!gca", name = "c", descriptor = "I")
	public static int anInt4126 = 0;

	@OriginalMember(owner = "client!gca", name = "e", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!gca", name = "f", descriptor = "[I")
	public static final int[] anIntArray226 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(II)V")
	public static void method3555(@OriginalArg(0) int arg0) {
		Static610.method8289();
		@Pc(11) int local11 = Static90.aClass335_1.method8003(arg0).anInt5594;
		if (local11 == 0) {
			return;
		}
		@Pc(19) int local19 = Static514.aClass166_1.anIntArray337[arg0];
		if (local11 == 6) {
			Static205.anInt4772 = local19;
		}
		if (local11 == 5) {
			Static639.anInt10496 = local19;
		}
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(III)V")
	public static void method3556(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static263.method4883(arg1)) {
			Static360.method5865(arg0, Static85.aClass108ArrayArray2[arg1]);
		}
	}
}
