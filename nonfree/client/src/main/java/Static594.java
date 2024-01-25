import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static594 {

	@OriginalMember(owner = "client!u", name = "T", descriptor = "I")
	public static int anInt9606;

	@OriginalMember(owner = "client!u", name = "E", descriptor = "Ljava/util/Random;")
	public static final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!u", name = "F", descriptor = "Z")
	public static boolean aBoolean666 = false;

	@OriginalMember(owner = "client!u", name = "Q", descriptor = "I")
	public static int anInt9604 = 0;

	@OriginalMember(owner = "client!u", name = "g", descriptor = "(I)Z")
	public static boolean method7826() {
		return Static634.anInt6735 == 0 ? Static574.aClass3_Sub12_Sub3_3.method7571() : true;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(BI)I")
	public static int method7829(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(31) double local31 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(38) double local38 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(40) double local40 = local14;
		if (local31 < local14) {
			local40 = local31;
		}
		if (local40 > local38) {
			local40 = local38;
		}
		@Pc(54) double local54 = local14;
		if (local14 < local31) {
			local54 = local31;
		}
		if (local38 > local54) {
			local54 = local38;
		}
		@Pc(68) double local68 = 0.0D;
		@Pc(70) double local70 = 0.0D;
		@Pc(76) double local76 = (local54 + local40) / 2.0D;
		if (local40 != local54) {
			if (local76 < 0.5D) {
				local70 = (local54 - local40) / (local40 + local54);
			}
			if (local76 >= 0.5D) {
				local70 = (local54 - local40) / (2.0D - local54 - local40);
			}
			if (local14 == local54) {
				local68 = (local31 - local38) / (local54 - local40);
			} else if (local54 == local31) {
				local68 = (local38 - local14) / (local54 - local40) + 2.0D;
			} else if (local54 == local38) {
				local68 = (local14 - local31) / (-local40 + local54) + 4.0D;
			}
		}
		local68 /= 6.0D;
		@Pc(163) int local163 = (int) (local68 * 256.0D);
		@Pc(168) int local168 = (int) (local70 * 256.0D);
		if (local168 < 0) {
			local168 = 0;
		} else if (local168 > 255) {
			local168 = 255;
		}
		@Pc(189) int local189 = (int) (local76 * 256.0D);
		if (local189 < 0) {
			local189 = 0;
		} else if (local189 > 255) {
			local189 = 255;
		}
		if (local189 > 243) {
			local168 >>= 0x4;
		} else if (local189 > 217) {
			local168 >>= 0x3;
		} else if (local189 > 192) {
			local168 >>= 0x2;
		} else if (local189 > 179) {
			local168 >>= 0x1;
		}
		return ((local163 >> 2 & 0x3F) << 10) + (local168 >> 5 << 7) + (local189 >> 1);
	}
}
