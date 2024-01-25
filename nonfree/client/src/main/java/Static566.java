import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static566 {

	@OriginalMember(owner = "client!sl", name = "m", descriptor = "D")
	public static double aDouble19;

	@OriginalMember(owner = "client!sl", name = "g", descriptor = "I")
	public static int anInt9417 = -1;

	@OriginalMember(owner = "client!sl", name = "e", descriptor = "[Z")
	public static final boolean[] aBooleanArray23 = new boolean[100];

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "Lclient!nha;")
	public static final Class251 aClass251_230 = new Class251(45, 4);

	@OriginalMember(owner = "client!sl", name = "j", descriptor = "[S")
	public static short[] aShortArray119 = new short[256];

	@OriginalMember(owner = "client!sl", name = "i", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_236 = new Class160(129, 4);

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(Ljava/lang/String;I)J")
	public static long method8125(@OriginalArg(0) String arg0) {
		@Pc(5) long local5 = 0L;
		@Pc(8) int local8 = arg0.length();
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			local5 *= 37L;
			@Pc(26) char local26 = arg0.charAt(local17);
			if (local26 >= 'A' && local26 <= 'Z') {
				local5 += (long) (local26 + 1 - 65);
			} else if (local26 >= 'a' && local26 <= 'z') {
				local5 += (long) (local26 + 1 - 97);
			} else if (local26 >= '0' && local26 <= '9') {
				local5 += (long) (local26 + 27 - 48);
			}
			if (local5 >= 177917621779460413L) {
				break;
			}
		}
		while (local5 % 37L == 0L && local5 != 0L) {
			local5 /= 37L;
		}
		return local5;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IBI)I")
	public static int method8126(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = 0;
		while (arg1 > 0) {
			local12 = local12 << 1 | arg0 & 0x1;
			arg0 >>>= 0x1;
			arg1--;
		}
		return local12;
	}

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "(IBI)I")
	public static int method8132(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = 1;
		while (arg1 > 1) {
			if ((arg1 & 0x1) != 0) {
				local5 *= arg0;
			}
			arg1 >>= 0x1;
			arg0 *= arg0;
		}
		if (arg1 == 1) {
			return arg0 * local5;
		} else {
			return local5;
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(BI)I")
	public static int method8133(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}
}
