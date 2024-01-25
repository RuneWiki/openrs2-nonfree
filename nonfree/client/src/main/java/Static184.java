import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!gh", name = "e", descriptor = "Ljava/util/Hashtable;")
	public static final Hashtable aHashtable2 = new Hashtable();

	@OriginalMember(owner = "client!gh", name = "i", descriptor = "I")
	public static int anInt3672 = 0;

	@OriginalMember(owner = "client!gh", name = "m", descriptor = "Lclient!jv;")
	public static final Class191 aClass191_1 = new Class191();

	@OriginalMember(owner = "client!gh", name = "n", descriptor = "[I")
	public static final int[] anIntArray237 = new int[256];

	@OriginalMember(owner = "client!gh", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString32 = null;

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)I")
	public static int method3143(@OriginalArg(1) int arg0) {
		@Pc(12) double local12 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(21) double local21 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(28) double local28 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(30) double local30 = local12;
		if (local21 < local12) {
			local30 = local21;
		}
		if (local28 < local30) {
			local30 = local28;
		}
		@Pc(44) double local44 = local12;
		if (local12 < local21) {
			local44 = local21;
		}
		if (local28 > local44) {
			local44 = local28;
		}
		@Pc(58) double local58 = 0.0D;
		@Pc(60) double local60 = 0.0D;
		@Pc(66) double local66 = (local44 + local30) / 2.0D;
		if (local44 != local30) {
			if (local66 < 0.5D) {
				local60 = (local44 - local30) / (local44 + local30);
			}
			if (local44 == local12) {
				local58 = (local21 - local28) / (local44 - local30);
			} else if (local44 == local21) {
				local58 = (local28 - local12) / (local44 - local30) + 2.0D;
			} else if (local44 == local28) {
				local58 = (local12 - local21) / (local44 - local30) + 4.0D;
			}
			if (local66 >= 0.5D) {
				local60 = (local44 - local30) / ((2.0D - local44) - local30);
			}
		}
		local58 /= 6.0D;
		@Pc(152) int local152 = (int) ((double) 256 * local58);
		@Pc(157) int local157 = (int) (local60 * 256.0D);
		if (local157 < 0) {
			local157 = 0;
		} else if (local157 > 255) {
			local157 = 255;
		}
		@Pc(172) int local172 = (int) (local66 * 256.0D);
		if (local172 < 0) {
			local172 = 0;
		} else if (local172 > 255) {
			local172 = 255;
		}
		if (local172 > 243) {
			local157 >>= 0x4;
		} else if (local172 > 217) {
			local157 >>= 0x3;
		} else if (local172 > 192) {
			local157 >>= 0x2;
		} else if (local172 > 179) {
			local157 >>= 0x1;
		}
		return (local172 >> 1) + ((local152 >> 2 & 0x3F) << 10) + (local157 >> 5 << 7);
	}

	@OriginalMember(owner = "client!gh", name = "d", descriptor = "(I)Lclient!iu;")
	public static Class16_Sub4 method3144() {
		@Pc(13) Class16_Sub4 local13 = (Class16_Sub4) Static433.aClass19_8.method557();
		if (local13 == null) {
			return new Class16_Sub4();
		} else {
			Static528.anInt3397--;
			return local13;
		}
	}
}
