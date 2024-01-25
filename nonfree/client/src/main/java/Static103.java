import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!et", name = "R", descriptor = "I")
	public static int anInt5363;

	@OriginalMember(owner = "client!et", name = "T", descriptor = "[I")
	public static final int[] anIntArray457 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!et", name = "U", descriptor = "I")
	public static int anInt5365 = -1;

	@OriginalMember(owner = "client!et", name = "d", descriptor = "(B)V")
	public static void method4272() {
		@Pc(15) Class213 local15 = null;
		try {
			@Pc(21) Class136 local21 = Static138.aClass194_2.method4405(true, "2");
			while (local21.anInt3418 == 0) {
				Static167.method6157(1L);
			}
			if (local21.anInt3418 == 1) {
				local15 = (Class213) local21.anObject10;
				@Pc(48) byte[] local48 = new byte[(int) local15.method4949()];
				@Pc(63) int local63;
				for (@Pc(50) int local50 = 0; local50 < local48.length; local50 += local63) {
					local63 = local15.method4945(local48, local50, local48.length - local50);
					if (local63 == -1) {
						throw new IOException("EOF");
					}
				}
				Static437.method5914(new Class2_Sub17(local48));
			}
		} catch (@Pc(92) Exception local92) {
		}
		try {
			if (local15 != null) {
				local15.method4946();
			}
		} catch (@Pc(99) Exception local99) {
		}
	}
}
